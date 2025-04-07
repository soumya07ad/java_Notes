import java.util.Scanner;

public class Countnumbs {
    public static void main(String[] args) {
        System.out.print("print the number" + " ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n=n/10; // n/=10
        }
        System.out.println(count);
    }
}
