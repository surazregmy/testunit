import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FTTest {
    public static void main(String[] args) {


        //function interface Lambda expression

        FileInterface fileInterface2 = (a, b) ->
                System.out.println(a + b);
        fileInterface2.print(30, 80);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach(n -> System.out.println(n));

        System.out.println("after predicate");
        Predicate<Integer> lessthanfour = number -> number < 4;

        list.stream().filter(lessthanfour).forEach(
                n -> System.out.println(n)
        );
        list.stream().filter(lessthanfour);
    }
}
