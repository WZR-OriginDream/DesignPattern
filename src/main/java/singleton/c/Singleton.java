package singleton.c;

/**
 * @Author:wzr
 * @Description:饿汉式
 * @Create:2023/9/23 - 9:22
 * @Version:v1.0
 */
public class Singleton {
    private static Singleton INSTANCE=new Singleton();

    private Singleton() {
    }

    public static  Singleton getInstance() {
        return INSTANCE;
    }

    public void getMessage() {
        System.out.println("c success");
    }
}
