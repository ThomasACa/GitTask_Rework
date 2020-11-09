public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        myMethodTwo();
    }

    static int myMethod(int x) {
        return 5 + x;
    }
    static void myMethodTwo() {
        System.out.println("Hello there!");
    }


}
