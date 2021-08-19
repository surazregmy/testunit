public class Test1 {
    public static Double addValues(Double[] values) {
        Double sum = 0.0;
        for (Double d : values) {
            if (d == null) {
                return null;
            }
            sum = sum + d;
        }
        return sum;
    }
}
