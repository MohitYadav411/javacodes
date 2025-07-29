public class swapping {
    public static void main(String[] args) {
        int a = 10, b = 30,temp;

        System.out.println("Before swapping");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
