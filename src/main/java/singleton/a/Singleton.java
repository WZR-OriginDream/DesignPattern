package singleton.a;

/**
 * @Author:wzr
 * @Description:懒汉式-线程不安全
 * @Create:2023/9/23 - 9:22
 * @Version:v1.0
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void getMessage() {
        System.out.println("a success");
    }
}
