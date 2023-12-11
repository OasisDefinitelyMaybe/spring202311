package exam03;

public class Ex04 {
    public static void main(String[] args) {
        A a = new C();
        B b = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);

        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof C);
    }
}
