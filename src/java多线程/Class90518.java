package java多线程;

public class Class90518 {
    private int tickets = 10;

    public static void main(String[] args) {
        SaleThread saleThread = new SaleThread();
        new Thread(saleThread, "线程1").start();
        new Thread(saleThread, "线程2").start();
        new Thread(saleThread, "线程3").start();
        new Thread(saleThread, "线程4").start();
        new Thread(saleThread, "线程5").start();
    }
}

class SaleThread implements Runnable {
    private int tickets = 10;//10张票
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            saleThread1();
            if (tickets <= 0) {
                System.out.println(Thread.currentThread().getName() + "退出" );
                break;
            }
        }

    }


    private synchronized void saleThread1() {
        try {
            Thread.sleep(10);//线程休眠10秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "-------卖出的票" + tickets--);
        }
    }
}

