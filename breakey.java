public class breakey {
    public static void main(String[] args) {
        int a = 1;
        while(a<=10){
            if(a==6){
                System.out.println("Hello World");
                a++;
                break;
            }
            System.out.println(a);
            a++;
        }
    }
}
