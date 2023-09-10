package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("电话", "telephone");
        map.put("很好", "nice");
        map.put("密码", "password");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入您要翻译的单词。");
            String srt = sc.next();
            boolean ss = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equals(srt)) {
                    System.out.println(srt + "中文翻译是:" + entry.getValue());
                    ss = true;
                    break;
                } else if (entry.getValue().equals(srt)) {
                    System.out.println(srt + "的英文翻译是:" + entry.getKey());
                    ss = true;
                    break;
                }
            }
            if (ss == false) {
                System.out.println("无法翻译");
                flag = false;
            }
        }
    }
}
