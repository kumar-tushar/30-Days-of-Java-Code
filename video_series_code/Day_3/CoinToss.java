package video_series_code.Day_3;

import java.util.Random;

public class CoinToss {
    
    public void TossACoin(){
        Random num=new Random();
        int toss=Math.abs(num.nextInt())%2;
        if(toss==0){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");

        }
    }

    public static void main(String[] args) {
        CoinToss game=new CoinToss();
        game.TossACoin();
        
    }
}
