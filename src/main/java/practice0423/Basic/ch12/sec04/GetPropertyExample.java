package practice0423.Basic.ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        String home = System.getProperty("user.home");

        Properties p = System.getProperties();
        Set k = p.keySet();

        System.out.println(os);
        System.out.println(user);
        System.out.println(home);
        for (Object o : k) {
            String key = (String) o;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
