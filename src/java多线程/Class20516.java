package java多线程;

public class Class20516 {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo=new MyThreadTwo();
        myThreadTwo.start();//开启线程，自动执行run方法
        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main方法（）方法在运行");
        }
    }
}
class MyThreadTwo extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我的多线程在运行");
        }
    }
}
