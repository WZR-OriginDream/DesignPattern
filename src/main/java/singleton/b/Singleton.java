package singleton.b;

/**
 * @Author:wzr
 * @Description:懒汉式-线程安全
 * @Create:2023/9/23 - 9:22
 * @Version:v1.0
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void getMessage() {
        System.out.println("b success");
    }
}
