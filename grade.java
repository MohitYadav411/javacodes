import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of subject A");
        int suba = sc.nextInt();

        System.out.println("Enter Number of subject B");
        int subb = sc.nextInt();

        System.out.println("Enter Number of subject C");
        int subc = sc.nextInt();

        int total = suba + subb + subc;
        System.out.println("Total is "+total);

        int grade = total/3;
        System.out.println(grade);

        if(grade>=75){
            System.out.println("Distinct");
        }
        else if(grade<75 && grade>=60){
            System.out.println("1st Class");
        }
        else if(grade<60 && grade>=35){
            System.out.println("2nd Class");
        }
        else{
            System.out.println("Fail");
        }
    }
}