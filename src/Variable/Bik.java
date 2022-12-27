package Variable;

public class Bik{
    public static void main(String [] args){
        Runable r = new Runable1();
        Thread t = new Thread(r);
        t.start();
        Runable r2 = new Runable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}


class Runable1 implements Runable{
    public void run(){
        System.out.println("Display even number for one thread");
        for(int i=0; i<=9; i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}


class Runable2 implements Runable{
    public void run(){
        System.out.println("Display odd number for another thread");
        for(int i=0; i<=9; i++){
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}


