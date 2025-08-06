import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Table");
        int n = sc.nextInt();
        int i = 1;

        do { 
            System.out.println(n+"*"+i+"="+i*n);
            i++;
        } while (i<=10);
    }
}
