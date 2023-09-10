package fanxing0511;

public class test {
    public static void main(String[] args) {
    Box box =new Box<>();
    box.setT("1111111111");
        System.out.println(box.getT());
        Box<String> box1=new Box<>();
       // box.setT(new String(1001,"小明",19,""));
        Box<Integer>box2 =new Box<>();
        box2.setT(1111);
        System.out.println(box2.getT());
    }

}
