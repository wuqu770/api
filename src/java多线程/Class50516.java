package java多线程;

public class Class50516 {
    public static void main(String[] args) {
    TicketWindow2 tw =new TicketWindow2();//创建一个对象，只有一份数据
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
    }
}
class TicketWindow2 implements Runnable{
    private int  tickets =10;
    @Override
    public  void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tickets > 0) {
                Thread thread = Thread.currentThread();//获取当前线程
                String name = thread.getName();
                System.out.println(name + "正在发售第" + tickets-- + "张车票");
                //tickets--;//票减一
            }
        }
    }}