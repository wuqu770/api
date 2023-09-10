package io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class class40515 {
    public static void main(String[] args) throws Exception {
        long beginTime = System.currentTimeMillis();
        //先创建文件输入流-----读文件用
        FileInputStream in =new FileInputStream("D:\\天翼云盘下载\\1.txt");
        OutputStream out =new FileOutputStream("D:\\天翼云盘下载\\2.txt");
        int len;
        while ((len=in.read()) !=-1){//没次读取，没读完的时间循环，读不到内容，len=1
            out.write(len);
        }
        long enTime= System.currentTimeMillis();
        System.out.println("所消耗的时间："+(enTime-beginTime)+"毫秒");//161秒
    }
}
