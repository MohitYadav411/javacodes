import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Subject 1");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks of subject 3");
        int sub3 = sc.nextInt();
        
        int total = sub1 + sub2 + sub3;
        System.out.println("Total "+total);

        int grade = total/3;
        System.out.println("Grade "+grade);

        if(grade>35){
            if(grade>=75){
                System.out.println("Pass with good marks");
            }
            else{
                System.out.println("Pass");
            }
        }

        else{
            System.out.println("Fail");
        }
    }
}
