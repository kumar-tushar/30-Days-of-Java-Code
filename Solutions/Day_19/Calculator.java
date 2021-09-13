package Solutions.Day_19;

public class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0)
                sum+=i;
        }
        System.out.println("I implemented: AdvancedArithmetic");
        return sum;
    }
}