package io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;

public class class060515 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("D:\\天翼云盘下载\\1.txt");
        int ch;
        while ((ch= reader.read()) !=-1){//如果读到内容就一直循环
            System.out.print((char) ch);
        }
        reader.close();
    }
}
