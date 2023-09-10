package java多线程;

public class Class80518 {
    public static void main(String[] args) {
        SaleThread saleThread = new SaleThread();
        new Thread(saleThread, "线程1").start();
        new Thread(saleThread, "线程2").start();
        new Thread(saleThread, "线程3").start();
        new Thread(saleThread, "线程4").start();
        new Thread(saleThread, "线程5").start();
    }

    static class SaleThread implements Runnable {
        private int tickets = 10;//10张票
        Object lock = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {//对代码上锁，只有一个线程能使用这个代码块，其他线程阻塞状态，在外面等
                    try {
                        Thread.sleep(15);//线程休眠10秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "-------卖出的票" + tickets--);
                    } else {
                        System.out.println(Thread.currentThread().getName()+"退出");
                        break;
                    }
                }
            }
        }
    }
}