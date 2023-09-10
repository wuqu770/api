package java反射;

public class Dome2 {
    public static void main(String[] args) throws Exception {
        //以前创建对象: Dog dog = new Dog();
        //现在 ：用反射来创建对象，并强转为 Dog 狗类
        Class c =Class.forName("java反射.Dog");
        System.out.println(c);
        Dog dog = null;
        dog = (Dog)c.newInstance();
        dog.setName("旺财");
        System.out.println(dog);
    }
}
