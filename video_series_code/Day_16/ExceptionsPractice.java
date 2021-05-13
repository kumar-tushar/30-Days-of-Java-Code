package video_series_code.Day_16;

public class ExceptionsPractice {

    public static void main(String[] args){

        try{
            int[] c = new int[5];
            System.out.println(c[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finished");
        }
    }
}
