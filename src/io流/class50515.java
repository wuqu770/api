package io流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class class50515 {
    public static void main(String[] args) throws Exception {
        long beginTime = System.currentTimeMillis();
        //先创建文件输入流-----读文件用
        FileInputStream in =new FileInputStream("D:\\天翼云盘下载\\1.txt");
        OutputStream out =new FileOutputStream("D:\\天翼云盘下载\\2.txt");
        int len;
        byte[] buff =new byte[500];
        while ((len=in.read(buff)) !=-1){//没次读取，没读完的时间循环，读不到内容，len=1
            out.write(buff,0,len);
        }
        long enTime= System.currentTimeMillis();
        in.close();//释放资源
        out.close();//释放资源
        System.out.println("所消耗的时间："+(enTime-beginTime)+"毫秒");//167毫秒
    }
}
