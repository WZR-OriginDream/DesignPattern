package singleton.e;

/**
 * @Author:wzr
 * @Description:TODO
 * @Create:2023/9/23 - 9:26
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.getMessage();
    }
}
