public class Test{
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void show() {
                System.out.println("GUGA");
            }
        };

        a.show();

        a = new B();
        a.show();

        a = new C();
        a.show();
    }
}

abstract class A{
   abstract void show();
}

class B extends A{
    void show(){
        System.out.println("Inside B");
    }
}

class C extends A{
    void show(){
        System.out.println("Inside C");
    }
}