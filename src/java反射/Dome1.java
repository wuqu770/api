package java反射;

public class Dome1 {
    public static void main(String[] args) {
        Class<?> c1 =null;
        Class<?> c2 =null;
        Class<?> c3 =null;
        try {
            c1 =Class.forName("java反射.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        c2=new Dome1().getClass();
        c3=Dome1.class;
        System.out.println("类名称："+c1.getName());
        System.out.println("类名称："+c2.getName());
        System.out.println("类名称："+c3.getName());
    }
}
