package video_series_code.Day_20;

import static video_series_code.Day_20.HairColor.*;

public class Person {

    HairColor hairColor=RED;

    public static void main(String[] args) {
        Person peterParker=new Person();
        Person spiderMan=peterParker;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);


    }
}
