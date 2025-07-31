public class demo{
    int x,y;
    
    void show(int x,int y){
        this. x=x;
        this. y=y;
    }

    void print(){
        System.out.println(x);
        System.out.println(y);
    }

public static void main(String[] args){
        demo t=new demo();

        t.show(20,50);
        t.print();
    }
}
