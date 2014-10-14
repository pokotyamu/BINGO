 
package Bingo;

import java.util.ArrayList;
import java.util.Random;

class Bingo {

    ArrayList<BingoBall> bingosetb= new ArrayList();
    ArrayList<BingoBall> bingoseti = new ArrayList();
    ArrayList<BingoBall> bingosetn = new ArrayList();
    ArrayList<BingoBall> bingosetg = new ArrayList();
    ArrayList<BingoBall> bingoseto = new ArrayList();
    ArrayList allbingonum = new ArrayList();
    
    
    public Bingo(){
        this.newgame();
    }

    Bingo(View vison) {
        this.newgame();
    }
    
    private void newgame() {
        //クリアー
        bingosetb.clear();
        bingoseti.clear();
        bingosetn.clear();
        bingosetg.clear();
        bingoseto.clear();
 
        BingoBall ballb;
        BingoBall balli;
        BingoBall balln;
        BingoBall ballg;
        BingoBall ballo;
        
        for(int i = 1; i < 16; i++){
            ballb = new BingoBall(0);
            balli = new BingoBall(0);
            balln = new BingoBall(0);
            ballg = new BingoBall(0);
            ballo = new BingoBall(0);
            
            bingosetb.add(ballb.setBall(i));
            bingoseti.add(balli.setBall(i+15));
            bingosetn.add(balln.setBall(i+30));
            bingosetg.add(ballg.setBall(i+45));
            bingoseto.add(ballo.setBall(i+60));
        }
        allbingonum.add(bingosetb);
        allbingonum.add(bingoseti);
        allbingonum.add(bingosetn);
        allbingonum.add(bingosetg);
        allbingonum.add(bingoseto);
     }

    BingoBall getBall(String bingocode) {
        BingoBall bingoball = new BingoBall(0);
        while(!bingoball.isHit()){
            switch (bingocode){
                case "0":
                    bingoball = this.getAllSetBall();                    
                    break;
                case "1":
                    bingoball = this.getBall(0);
                    break;
                case "2":
                    bingoball = this.getBall(1);
                    break;
                case "3":
                    bingoball = this.getBall(2);
                    break;
                case "4":
                    bingoball = this.getBall(3);
                    break;
                case "5":
                    bingoball = this.getBall(4);
                    break;
            }
        }
        return bingoball;        
    }

    private BingoBall getBall(int index) {
        BingoBall ball;
        ArrayList tempnums = (ArrayList) allbingonum.get(index);
        Random rnd = new Random();
        if(tempnums.isEmpty()){
            return new BingoBall(-1);
        }else{
            int ballseed = rnd.nextInt(tempnums.size());
            ball = (BingoBall) tempnums.get(ballseed);
            tempnums.remove(ballseed);
            allbingonum.set(index, tempnums);                    
            ball.setHit(true);
        }
        return ball;
    }

    private BingoBall getAllSetBall() {
        Random rnd = new Random();
        int bingoseed = rnd.nextInt(allbingonum.size());
        ArrayList tempnums = (ArrayList) allbingonum.get(bingoseed);
        //空か判定して、空だったらやりなおし
        while(tempnums.isEmpty()){
            bingoseed = rnd.nextInt(allbingonum.size());
            tempnums = (ArrayList) allbingonum.get(bingoseed);
        }
        //空じゃないので、確実にボールを取れる
        int ballseed = rnd.nextInt(tempnums.size());
        BingoBall ball = (BingoBall) tempnums.get(ballseed);
        tempnums.remove(ballseed);                    
        allbingonum.set(bingoseed, tempnums);                    
        ball.setHit(true);
        return ball;
    }
}
