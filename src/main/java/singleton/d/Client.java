package singleton.d;

/**
 * @Author:wzr
 * @Description:
 * @Create:2023/9/23 - 9:26
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.getMessage();
    }
}
