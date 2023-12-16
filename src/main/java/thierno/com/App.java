package thierno.com;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Test Message");

        // DataType

        /***
         * byte
         * short
         * int
         * long
         * 
         * flot
         * double
         * 
         * char
         * 
         * boolean
         * 
         * String
         * 
         */

        byte age = 20;
        short calculation = 60;
        int getAge = 19;
        long lng = 56l;

        float ab = 42.5f;
        double db = 89.9;

        char check = 's';

        int x; // Variable declaration
        System.out.println(ab);
        x = 89; // Initialization
        System.out.println(x);

        int _test = 80;
        int $test1 = 80;

        int a = 90;

        int x1 = 90;
        int y = 80;
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = x1 > y;

        System.out.println("b3 = " + b3);

        char ch = 'a';
        System.out.println("cha = " + ch);
        char ch1 = 65;
        System.out.println("ch1 = " + ch1);
        char ch2 = 90;
        System.out.println("ch1 = " + ch2);

        String s = "Hello";
        System.out.println("s = " + s);

        String name;
        name = "Test";
        System.out.println("name = " + name);

        MyObject obj;
        obj = new MyObject();
        System.out.println("obj = " + obj);

        User user1 = new User();
        System.out.println("user1 = " + user1);
        user1.name = "John";
        user1.age = 22;
        System.out.println("user1 = " + user1.name);
        System.out.println("user1 = " + user1.age);
    }
}

class User {
    String name;
    int age;
}

class MyObject {
    int x;
    float f;
    double d;
    long h;
}
