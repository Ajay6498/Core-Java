import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[6];
        System.out.println("Please enter numbers in array");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("Enter a number that we need to check in array");
        int no = input.nextInt();
        boolean t = false;
        for (int i = 0; i < num.length; i++) {

            if (num[i] == no) {
                t = true;
                break;
            }

        }
        System.out.println(Arrays.toString(num));
        System.out.println(t);

    }

}
