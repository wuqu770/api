package java多线程;

public class Class70518 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new EmergencyThread(), "插队线程一");
        thread.start();//开启线程
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + "输入" + i);
            if (i == 2) {
                thread.join();//调用join方法
            }
            Thread.sleep(500);
        }
    }

     static class EmergencyThread implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + "输入" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
