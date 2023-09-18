import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[6];
        System.out.println("Please enter numbers in array");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("Enter a number that we need to check in array");
        int no = input.nextInt();
         
        for (int i = 0; i < num.length; i++) {

            if (num[i] == no) {
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
            }

        }
        System.out.println(Arrays.toString(num));
 
    }

}
