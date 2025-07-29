public class Inherit {
    class P {
        void par() {
            System.out.println("Hello");
        }
    }

    class C extends P {
        void ch() {
            System.out.println("World");
        }
    }

    public static void main(String[] args) {
        Inherit inh = new Inherit();
        C c1 = inh.new C();
        c1.par();
        c1.ch();
    }
}