package java多线程;

public class class10516 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.run();
        while (true){
            System.out.println("main方法在运行");
        }

    }
}
class MyThread {
    public void run(){
        while (true){
            System.out.println("我的多线程在运行");
        }
    }
}
