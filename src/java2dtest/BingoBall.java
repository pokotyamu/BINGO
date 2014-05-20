
package java2dtest;

public class BingoBall {
    private int num;
    private String name;
    
    
    public BingoBall(int num){
        this.num = num;
        if(num > 60){
            this.name = "O";
        }else if(num > 45){
            this.name = "G";
        }else if(num > 30){
            this.name = "N";
        }else if(num > 15){
            this.name = "I";
        }else
            this.name = "B";
    }

    int getNum(){
        return num;
    }
    
    String getName(){
        return name;
    }

    BingoBall setBall(int i) {
        this.num = i;
        if(num > 60){
            this.name = "O";
        }else if(num > 45){
            this.name = "G";
        }else if(num > 30){
            this.name = "N";
        }else if(num > 15){
            this.name = "I";
        }else
            this.name = "B";
        return this;
    }
}
