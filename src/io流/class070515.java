package io流;

import java.io.FileWriter;
import java.io.IOException;

public class class070515 {
    public static void main(String[] args) throws Exception {
        FileWriter writer =new FileWriter("D:\\天翼云盘下载\\55.txt");
        String str ="小黑子----简直无敌";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
        System.out.println(str);
    }

}
