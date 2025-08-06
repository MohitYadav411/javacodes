import java.util.Scanner;

public class whiletable2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Number ");
        int num = scn.nextInt();
        int i = 1;

        while(i<=10){
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
    }
}
