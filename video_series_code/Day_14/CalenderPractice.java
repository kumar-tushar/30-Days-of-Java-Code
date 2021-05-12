package video_series_code.Day_14;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderPractice {

    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
