package Variable;

class Fibonacci{
    public static void main(String [] args){
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}


class Runnable1 implements Runnable{
    public void run(){
        System.out.println("Display even number for one thread");
        for(int i=0; i<=9; i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}


class Runnable2 implements Runnable{
    public void run(){
        System.out.println("Display odd number for another thread");
        for(int i=0; i<=9; i++){
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}


