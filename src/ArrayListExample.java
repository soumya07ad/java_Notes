import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
//        list.add(787);
//        list.add(876);
//        list.add(785);
//        list.add(874);
//        list.add(873);
//        list.add(871);
//        list.add(872);
//        //System.out.println(list.contains(45678));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
        //input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //get item any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
