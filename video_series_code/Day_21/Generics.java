package video_series_code.Day_21;

public class Generics {

    public static <T extends Comparable<T>> T findMax(T a, T b){
        int n=a.compareTo(b);
        System.out.println(n);
        if(n<0)
            return b;
        else
            return a;

    }

    public static void main(String[] args) {

        System.out.println(findMax(2,5));
        System.out.println();
        System.out.println(findMax(3,3));
        System.out.println();
        System.out.println(findMax(13,2));
        System.out.println();
        System.out.println(findMax('A','D'));//A(1)-D(4)=-3
        System.out.println();
        System.out.println(findMax("Hi", "Hello"));//i(9)-e(5)=4
    }
}
