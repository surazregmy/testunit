import java.util.stream.IntStream;

public class ExtraMain {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 1).limit(10).forEach(infinitein -> System.out.println(infinitein));
    }
}
