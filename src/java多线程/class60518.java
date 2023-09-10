package java多线程;

public class class60518 extends Thread{
    public class60518(String name){
        super(name);

    }
    public  void run(){
        for (int i=0;i<6;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
            if (i==3){
                System.out.println(Thread.currentThread().getName()+"让步");
                Thread.yield();//线程运行到此，做出让步
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new class60518("线程A");
        Thread t2 = new class60518("线程B");
        //开启两个线程
        t1.start();
        t2.start();

    }

}
