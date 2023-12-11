package exam03;

public class Ex03 {
    public static void main(String[] args) {
        A a1 = new C();

        A a2 = new D();

      //  D d1 = new C();

        if(a2 instanceof C) {
        C c1 = (C)a2;
    }
  }
}