package io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class class0515 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流 int char
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\天翼云盘下载\\1.txt");
            int b = 0;
            while (true) {
                b = in.read();//地读取一个资源，保存到一个D盘
                if (b == -1) {
                    break;
                }
                System.out.print((char) b);
            }
        } finally {
            if (in != null) {
                System.out.println("释放资源");
                in.close();//释放资源
            }
        }
    }
}
