public class Sum {
    public static int addSubtractPairwise(int[] arg) {
        int sum = 0;
        boolean isOdd = isOdd(arg.length);
        for (int i = 0; i < arg.length; i = i + 4) {
            boolean islast = arg.length < 4;
            int firstPairMul = arg[i] * (isOdd && islast ? 1 : arg[i + 1]);
            int secondPairMul = arg[i + 2] * (isOdd && islast ? 1 : arg[i + 3]);
            sum = sum + firstPairMul - secondPairMul;
        }
        return sum;
    }

    public static boolean isOdd(int integer) {
        return integer % 2 == 1;
    }

    public static void main(String[] args) {
        int sum = addSubtractPairwise(new int[]{4, 5, 3});
        System.out.println("Sum is " + sum);
    }
}
