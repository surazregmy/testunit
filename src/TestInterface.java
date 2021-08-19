public interface TestInterface {
    public static void test() {
        System.out.println("This is static method in Java functional interface");
    }

    public static void untest() {
        System.out.println("This is static method in Java functional interface");
    }

    default int test(int a, int b) {
        System.out.println("Sum");
        return a + b;
    }

    default int test1(int a, int b) {
        System.out.println("Hello this is default override");
        return 11;
    }

    public void print();
}
