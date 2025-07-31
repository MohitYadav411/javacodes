public class load {
    void voice(){
        System.out.println("Meow");
    }

    int voice(int a){
        System.out.println("Bhau bhau");
        return 0;
    }

    public static void main(String[] args) {
        load v=new load();
        v.voice();
        v.voice(2);
    }   
}
