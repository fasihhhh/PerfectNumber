import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double num = sc.nextInt();
        double sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0)
            {
                sum +=i;
                // System.out.println(sum);
            }
        }
        if(sum==num){
            System.out.println("PERFECT NUMBER");
        }
        else{
            System.out.println("NOT A PERFECT NUMBER");
        }
    }
}
