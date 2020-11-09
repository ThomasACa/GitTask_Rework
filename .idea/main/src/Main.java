public class Main {
    public static void main(String[] args) {
        System.out.println("Task 6 make changes to your existing class");
        System.out.println(myMethod(3));
        myMethodTwo();
        myMethodThree();
        myMethodFour(3);
    }

    static int myMethod(int x) {
        return 5 + x;
    }
    static void myMethodTwo() {
        System.out.println("Hello there!");   
    }

    static void myMethodThree() {
        System.out.println("My Method Three");
    }
    static int myMethodFour(int x) {
        return 5 + x;
    }
}
