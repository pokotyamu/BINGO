 
package java2dtest;

import java.util.ArrayList;
import java.util.Random;

class Bingo {

    ArrayList<BingoBall> bingonumsB = new ArrayList();
    ArrayList<BingoBall> bingonumsI = new ArrayList();
    ArrayList<BingoBall> bingonumsN = new ArrayList();
    ArrayList<BingoBall> bingonumsG = new ArrayList();
    ArrayList<BingoBall> bingonumsO = new ArrayList();
    ArrayList allbingonum = new ArrayList();
    
    
    public Bingo(){
        this.newgame();
        
    }

    Bingo(labSmap2 vison) {
        this.newgame();
    }
    
    private void newgame() {
        //クリアー
        bingonumsB.clear();
        bingonumsI.clear();
        bingonumsN.clear();
        bingonumsG.clear();
        bingonumsO.clear();
 
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
            
            bingonumsB.add(ballb.setBall(i));
            bingonumsI.add(balli.setBall(i+15));
            bingonumsN.add(balln.setBall(i+30));
            bingonumsG.add(ballg.setBall(i+45));
            bingonumsO.add(ballo.setBall(i+60));
        }
        allbingonum.add(bingonumsB);
        allbingonum.add(bingonumsI);
        allbingonum.add(bingonumsN);
        allbingonum.add(bingonumsG);
        allbingonum.add(bingonumsO);
     }

    BingoBall getBall(String bingocode) {
        BingoBall bingoball = new BingoBall(0);
        int index = 0;
        ArrayList tempnums =  new ArrayList();
        ArrayList tempnums2 =  new ArrayList();
        boolean getflag=true;
        Random rnd = new Random();
        int bingoseed = 0;
        int ballseed = 0;
        while(getflag){
            switch (bingocode){
                case "0":
                    bingoseed = rnd.nextInt(allbingonum.size());
                    tempnums = (ArrayList) allbingonum.get(bingoseed);
                    //空か判定して、空だったらやりなおし
                    while(tempnums.isEmpty()){
                        bingoseed = rnd.nextInt(allbingonum.size());
                        tempnums = (ArrayList) allbingonum.get(bingoseed);
                    }
                    //空じゃないので、確実にボールを取れる
                    ballseed = rnd.nextInt(tempnums.size());
                    bingoball = (BingoBall) tempnums.get(ballseed);
                    tempnums.remove(ballseed);                    
                    allbingonum.set(bingoseed, tempnums);                    
                    getflag= false;
                    
                    break;
                case "1":
                    tempnums = (ArrayList) allbingonum.get(0);
                    //emptyだったら、全体からボールを取る
                    if(tempnums.isEmpty()){
                        bingocode = "0";
                    }else{
                        ballseed = rnd.nextInt(tempnums.size());
                        bingoball = (BingoBall) tempnums.get(ballseed);
                        tempnums.remove(ballseed);
                        allbingonum.set(0, tempnums);                    
                        getflag = false;
                    }
                    break;
                    
                case "2":
                     tempnums = (ArrayList) allbingonum.get(1);
                    //emptyだったら、全体からボールを取る
                    if(tempnums.isEmpty()){
                        bingocode = "0";
                    }else{
                        ballseed = rnd.nextInt(tempnums.size());
                        bingoball = (BingoBall) tempnums.get(ballseed);
                        tempnums.remove(ballseed);
                        allbingonum.set(1, tempnums);                    
                        getflag = false;
                    }
                    break;
                case "3":
                     tempnums = (ArrayList) allbingonum.get(2);
                    //emptyだったら、全体からボールを取る
                    if(tempnums.isEmpty()){
                        bingocode = "0";
                    }else{
                        ballseed = rnd.nextInt(tempnums.size());
                        bingoball = (BingoBall) tempnums.get(ballseed);
                        tempnums.remove(ballseed);
                        allbingonum.set(2, tempnums);                    
                        getflag = false;
                    }
                    break;
                case "4":
                     tempnums = (ArrayList) allbingonum.get(3);
                    //emptyだったら、全体からボールを取る
                    if(tempnums.isEmpty()){
                        bingocode = "0";
                    }else{
                        ballseed = rnd.nextInt(tempnums.size());
                        bingoball = (BingoBall) tempnums.get(ballseed);
                        tempnums.remove(ballseed);
                        System.out.println("code1 "+bingoball.getName()+"の"+bingoball.getNum());
                        allbingonum.set(3, tempnums);                    
                        getflag = false;
                    }
                    break;
                case "5":
                     tempnums = (ArrayList) allbingonum.get(4);
                    //emptyだったら、全体からボールを取る
                    if(tempnums.isEmpty()){
                        bingocode = "0";
                    }else{
                        ballseed = rnd.nextInt(tempnums.size());
                        bingoball = (BingoBall) tempnums.get(ballseed);
                        tempnums.remove(ballseed);
                        allbingonum.set(4, tempnums);                    
                        getflag = false;
                    }
                    break;
            }
        }
        return bingoball;        
    }
}
