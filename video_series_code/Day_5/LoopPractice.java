package video_series_code.Day_5;

public class LoopPractice {

    public static void practiceWhileLoop(){
        int x=0;
        while(x<5){
            System.out.println(x);
            x++;
        }
    }

    public static void practiceDoWhileLoop(){
        int x=0;
        do{
            System.out.println(x);
            x++;
        }while(x<10);
    }

    public static void practiceForLoop(){
        for(int x=0; x<20;x++){
            System.out.println(x);
            if(x==10){
                break;
            }
        }
    }

    public static void main (String[] args){
        practiceForLoop();
    }
}
