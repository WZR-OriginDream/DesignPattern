package singleton.d;

/**
 * @Author:wzr
 * @Description:双检锁式
 * @Create:2023/9/23 - 9:22
 * @Version:v1.0
 */
public class Singleton {
    private volatile static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public void getMessage() {
        System.out.println("d success");
    }
}
