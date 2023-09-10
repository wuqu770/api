package io流;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

public class class1 {
    public static void main(String[] args) throws IOException {
        //File f = new File("D:\\天翼云盘下载\\1.txt");
        File f = new File("D:\\天翼云盘下载");
        File f1 = new File("src\\Hello.java");
        System.out.println(f.exists());
        //System.out.println(f.delete());
        //System.out.println(f1.exists());
        if (!f.exists()) {
            System.out.println("1文文件不存在，创建新文件");
            f.createNewFile();
        } else {
            System.out.println("文件存在");
        }
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        if (f.isFile()) {
            System.out.println("他是个文件");
        }
        if (f.isDirectory()) {
            System.out.println("他是个目录");
        }
       /* System.out.println(f.length());
        String[] str2 = f.list();
        for (String s : str2) {
            System.out.println(s);
        }*/

    }
}
