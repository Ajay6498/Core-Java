import java.util.Arrays;
import java.util.List;

public class LambdaEx {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,5,4,8,6,7,9);
        list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
    }
    
}
