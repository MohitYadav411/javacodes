class cat{
    void voice(){
        System.out.println("Meow Meow");
    }
}

class dog extends cat{
    void voice(){
        System.out.println("Bhau bhau");
    }
}

public class ride {
    public static void main(String[] args) {
        dog d=new dog();
        d.voice();
        cat c=new cat();
        c.voice();
    }
}
