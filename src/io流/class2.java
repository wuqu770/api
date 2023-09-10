package io流;

import java.io.File;
import java.io.FilenameFilter;

public class class2 {

    public static void main(String[] args) {
        File file = new File("D:\\天翼云盘下载");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                if (currFile.isFile() && name.endsWith(".java")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        if (file.exists() && file.isDirectory()) {
            String[] aaa = file.list(filter);
            for (String name1 : aaa) {
                System.out.println(name1);
            }
        }
    }
}


