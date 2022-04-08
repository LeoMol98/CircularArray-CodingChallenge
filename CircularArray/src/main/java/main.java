import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Object[] parmArr = new Object[]{"ZeroIndex", "FirstIndex", "SecondIndex", "ThirdIndex"};
        CircularArray<Object> cir = new CircularArray<>(parmArr);

        System.out.println(Arrays.toString(cir.arr));

        cir.rotateForward(12);
        System.out.println(cir.getIndex(cir.head));
        System.out.println(cir.head);


        cir.addIndex(4);


        cir.rotateBackwards(12);
        System.out.println(cir.arr[cir.head]);
        System.out.println(cir.head);

        System.out.println(Arrays.toString(cir.arr));


    }
}
