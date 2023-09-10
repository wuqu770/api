package dainyin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    ArrayList<Movie> movieArrayList = new ArrayList<>();
    ArrayList<Ticket> ticketArrayList = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    String seatNo;
    Movie movie;

    public Cinema() {
        init();
    }

    public void start() {
        //开始售票
        String str="y";
        System.out.println();
        while ( str.equals("y") ) {
            showMovie();
            choiseSeat();
            buyTicket();
            System.out.println("继续买票请输入y");
            str=s.next();
        }
    }

    public void init() {
        //movieArrayList.add("功夫","周星驰","周星驰","喜剧",78,"9月11","5号厅");
        movieArrayList.add(new Movie("天气之子", "新海诚", "新海诚", "爱情", 88, "10：00-12:00", "5号厅", "2D"));
        movieArrayList.add(new Movie("星游记", "曾伟京", "陶典", "冒险", 66, "7：00-9：00", "5号厅", "3D"));
        movieArrayList.add(new Movie("你的名字", "新海诚", "善木准二", "爱情", 45, "17：00-20：00", "3号厅", "3D"));

    }

    public void showMovie() {
        //展示电影
        System.out.println("序号\t\t电影名称\t\t导演\t\t演员");
        for (int i = 0; i < movieArrayList.size(); i++) {
            Movie movie = movieArrayList.get(i);
            System.out.println((i + 1) + "\t\t" + movie.getMovie() + "\t\t" + movie.getDirector() + "\t" + movie.getActor());
        }
    }

    public void choiseSeat() {
        System.out.println("请选择电影的序号：");
        int n = s.nextInt();
        movie = movieArrayList.get(n - 1);
        System.out.println("您选择的电影" + movie.getMovie() + "在" + movie.getRoom() + "放映，时间是" + movie.getShowTime());
        //根据挺类型打印座位，比如vip 5行7列
        printSeat(8, 7);//5行七列
        System.out.println("请选择座位：");
        seatNo = s.next();

    } //选择座位

    public void printSeat(int row, int cal) {
        System.out.println("\t\t\t\t\t\t屏幕");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= cal; j++) {
                if (chenkTicket(movie.getRoom(), movie.getShowTime(), i + "-" + j)) {
                    System.out.print(i + "-" + j + "\t\t");
                } else {
                    System.out.print("已售\t\t");
                }

            }
            System.out.println();
        }
    }

    public void buyTicket() {
        //买票
        if (chenkTicket(movie.getRoom(), movie.getShowTime(), seatNo)) {
            System.out.println("正在出票");
            String ticketSrt = "************************************";
            ticketSrt=ticketSrt+"\n"+"\t小黑子电影院（全票价）";
            ticketSrt=ticketSrt+"\n"+"----------------------------------------";
            ticketSrt=ticketSrt+"\n"+"电影名：\t\t"+movie.getMovie();
            ticketSrt=ticketSrt+"\n"+"时间\t\t"+movie.getShowTime();
            ticketSrt=ticketSrt+"\n"+"放映厅\t\t"+movie.getRoom();
            ticketSrt=ticketSrt+"\n"+"座位号\t\t"+seatNo;
            ticketSrt=ticketSrt+"\n"+"价格\t\t"+movie.getPrice();
            ticketSrt=ticketSrt+"\n"+"****************************************";
            System.out.println(ticketSrt);
            //票写入文件
            FileWriter writer =null;
            try {
                writer =new FileWriter("D:\\天翼云盘下载\\票.txt");
                writer.write(ticketSrt);
                writer.write("\r\n");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            ticketArrayList.add(new Ticket(movie.getMovie(), movie.getShowTime(), movie.getRoom(), seatNo));
        } else {

            System.out.println("票以被卖出");
        }


    }

    public boolean chenkTicket(String room, String showTime, String seat) {
        boolean result = true;
        for (Ticket ticket : ticketArrayList) {
            if (ticket.getRoom().equals(room) && ticket.getShowTime().equals(showTime) && ticket.getSeatNo().equals(seat)) {
                result = false;
            }
        }

        return result;
    }

}
