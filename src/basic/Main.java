package basic;
import java.util.*;

public class Main {
    private static final User EXISTED_USER = new User("existed", " ");
    private static final User NOT_EXISTED_USER = new User("not existed", "");

    public static void main(String[] args) {
        new TestAuthorization().testLogin();

        OrderTest orderTest = new OrderTest();
        orderTest.testCreateOrder();
        orderTest.testListOrder();

        List<String> strings  = Arrays.asList("два", "один", "три");

        Map<String, Integer> digestMap = new HashMap<>();
        digestMap.put("one", 1);
        digestMap.put("два", 2);
        digestMap.put("три", 3);

        strings.forEach(str -> System.out.println(digestMap.get(str)));

    }

}
