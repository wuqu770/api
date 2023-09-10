package java多线程;

import sun.net.www.protocol.http.HttpURLConnection;

public class Zuoye0516 {
    private  int wuguiDistance=0;//乌龟还差多少距离
    private  int tuziDistance=0;//兔子还差多少距离
    //乌龟线程 ----内部类
    class Wugui extends Thread{
        public void run(){
            while (true){

                try {
                    Thread.sleep(10);//进程睡眠1秒，暂停1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if ( tuziDistance>=800){
                    System.out.println("兔子跑完，此时乌龟跑了："+wuguiDistance);
                        break;
                    }
                if (tuziDistance>=800){
                    System.out.println("乌龟跑完了，进程结束");
                    break;
                }
                    wuguiDistance++;
                    System.out.println("此时乌龟跑了："+wuguiDistance+"米");
                }
            }
        }
    class Tuzi extends Thread{
        public void run(){
            while (true){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ( wuguiDistance >=800){
                    System.out.println("乌龟跑完，此时兔子跑了："+tuziDistance);
                    break;
                }
                if(tuziDistance>=800){
                    System.out.println("兔子跑完了，进程结束");
                    break;
                }
                if(tuziDistance==600){
                    System.out.println("兔子跑了600米，胜利在望，先休息一下");
                    try {
                        Thread.sleep(1200); //进程睡眠10毫秒，暂停1秒  alt+回车
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                tuziDistance=tuziDistance+2;
                System.out.println("此时兔子跑了："+tuziDistance+"米");
            }
        }
    }

    public static void main(String[] args) {
        Zuoye0516 zuoye0516 =new Zuoye0516();

        Tuzi tuzi=zuoye0516.new Tuzi();
        tuzi.start();
        Wugui wugui =zuoye0516.new Wugui();
        wugui.start();
    }
}
