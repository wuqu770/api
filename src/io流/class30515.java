package io流;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class class30515 {
    public static void main(String[] args) throws Exception {
        //父类引用-----指向子类对象、多态
        OutputStream out = null;
        try {

            out = new FileOutputStream("D:\\天翼云盘下载\\1.txt",true);
            String str = "\n454645646柳\nsal;dkaowda州职业技术---ssss";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }
            System.out.println(str);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
