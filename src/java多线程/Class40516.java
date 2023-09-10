package java多线程;

public class Class40516 {
    public static void main(String[] args) {
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
    }
}
class  TicketWindow extends  Thread{
    private  int tickets =100;
    public  void  run(){
        while (true){
            if (tickets>0){
                Thread thread =Thread.currentThread();//获取当前线程
                String name =thread.getName();
                System.out.println(name +"正在发售第"+tickets+"张车票");
                tickets--;//票减一
            }
        }
    }
}
