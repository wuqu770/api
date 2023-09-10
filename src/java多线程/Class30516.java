package java多线程;

public class Class30516 {
    public static void main(String[] args) {
         MyThreadThere myThreadThere=new MyThreadThere();
        Thread thread=new Thread(myThreadThere);//创建线程对象
        thread.start();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main方法正在运行");
        }
    }
}
class MyThreadThere implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我的多线程3----run正在执行");
        }
    }
}
