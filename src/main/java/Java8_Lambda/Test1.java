package Java8_Lambda;

import java.util.Arrays;

/**
 * Created by root on 16-2-18.
 */

public class Test1 {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6).forEach( e -> System.out.print(e));
    }
}
