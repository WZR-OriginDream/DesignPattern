package singleton.e;

/**
 * @Author:wzr
 * @Description:静态内部类
 * @Create:2023/9/23 - 9:22
 * @Version:v1.0
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void getMessage() {
        System.out.println("e success");
    }
}
