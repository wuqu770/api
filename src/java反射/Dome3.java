package java反射;

import java.io.FileWriter;
import java.lang.reflect.*;

public class Dome3 {
    public static void main(String[] args) throws Exception {
        Class c =Class.forName("java反射.Dog");
        System.out.println("----------得到所有的构造方法---------");
        Constructor constructor[] =c.getConstructors();//得到构造方法的数组
        for (Constructor constructor1 :constructor){//输出
            System.out.println(constructor1);
        }
        System.out.println("-------------用反射创建对象--调用有参构造方法-----------");
        //System.out.println("--------------------");
        Dog dog=(Dog) constructor[1].newInstance("旺财2");
        System.out.println(dog);
        System.out.println("---------获取所有的方法");
        Method[] methods =c.getMethods();
        for (Method method: methods){
            System.out.println("方法名："+ method.getName());
        }
        for (Method m : methods){
            System.out.println("方法名："+m.getName());
        }
        System.out.println("----- 获取所有的属性-------");
        Field[] fields =c.getDeclaredFields();
        for (Field f : fields){
            Class<?> type =f.getType();
            int mo = f.getModifiers();
            String priv = Modifier.toString(mo);
            System.out.println("本类属性："+priv+" "+type.getName()+"---"+f.getName());
        }

    }
}
