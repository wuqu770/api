package java多线程;

public class class100518 {
    public static void main(String[] args) {
        DeadLockThread d1 = new DeadLockThread(true);
        DeadLockThread d2 = new DeadLockThread(false);
        new Thread(d1, "日本人").start();
        new Thread(d2, "美国人").start();
    }
}

class DeadLockThread implements Runnable {
    static Object chopsticks = new Object();//筷子的锁的对象
    static Object kniFeAndFork = new Object();//刀叉的锁的对象
    private boolean flag;//true ----- 先使用筷子，再使用刀叉  false -----先使用刀叉，再使用筷子
    //true---日本人----先使用筷子，在使用刀叉
    //false --美国人----先使用刀叉，在使用筷子

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == true) {
            while (true) {

                synchronized (chopsticks) {//筷子锁，执行完整的代码才会释放筷子锁
                        
                    System.out.println(Thread.currentThread().getName() + "----正在使用筷子，锁上筷子，准备使用刀叉，等待刀叉解锁");
                    synchronized (kniFeAndFork) {//刀叉锁
                        System.out.println(Thread.currentThread().getName() + "----正在使用刀叉，锁上刀叉");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (kniFeAndFork) {//刀叉锁
                    System.out.println(Thread.currentThread().getName() + "----正在使用刀叉，锁上刀叉，准备使用筷子，等待筷子解锁");
                    synchronized (chopsticks) {//筷子锁
                        System.out.println(Thread.currentThread().getName() + "----正在使用筷子，锁上筷子");
                    }
                }
            }
        }
    }
}