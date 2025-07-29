public class sum {
    int add(int a, int b) {
        int c = a+b;
        return c;
    }

    void sub() {
        int a=40, b=15;
        int c= a-b;
        System.out.println(c);
    }


    public static void main(String[] args) {
        sum f = new sum();
        System.out.println(f.add(20, 20));
        f.sub();
    }

}