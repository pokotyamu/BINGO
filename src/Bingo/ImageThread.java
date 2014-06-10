
package Bingo;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

class ImageThread extends Thread{
    View vison;
    ImageIcon ima;
    ArrayList images;
    String bingocode;
    BingoBall bingoball;
    Bingo bingo;
    static final int IMAGESIZE = 51;
    
    ImageThread(View vison) {
        this.vison = vison;
        images =  new ArrayList();
        
        File f = new File("");
        String url = f.getAbsolutePath();
        
        for(int i =1;i < 52; i++){
            images.add(new ImageIcon(url + "/src/image/"+i+".JPG"));
        }
        
        this.bingo = vison.bin;
    }

    @Override
    public void run(){
        ImageIcon temp;
        int r = 0;
        for(int index = 0; index < 60; index++){
            Random ran = new Random();
            r = ran.nextInt(IMAGESIZE);
            
            vison.paintlab((ImageIcon)images.get(r));
            
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImageThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(ImageThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        temp = (ImageIcon)images.get(r);
        bingoball = bingo.getBall(bingocode);
        vison.paintTxt(temp.getImage(),""+bingoball.getNum());
        vison.appendNownum(bingoball);
    }    

    void setBingocode(String num) {
        this.bingocode = num;
    }
}
