public class operators{
    public static void main(String[] args){
        int a=20, b=25;

        //assingment operator
        System.out.println(a+=b);
        System.out.println(a+=b);

        int c=20,d=30;
        //conditional/ternary operator
        System.out.println(c>d?d:c);

        //logical operator
        System.out.println(a>b && a>c);
        System.out.println(!(b>c));

        //arithmetic operator
        System.out.println(a+b);
        System.out.println(b-c);
        System.out.println(c*d);
    }
}