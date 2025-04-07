import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("print three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c= in.nextInt();

        // find the largest number
//        int max = a;
//
//         if (b > max) {
//             max = b;
//         }
//        if (c > max){
//            max=c;
//        }
        int max = Math.max(c,Math.max(a,b));



        System.out.println("maximum number is"+" "+ max);

    }
}
