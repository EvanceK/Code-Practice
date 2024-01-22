package Rank8kyu;

import java.util.Arrays;

/**
 * ClassName: Invert_values
 * ClassName: Rank8kyu
 * Description:
 *
 * @Author: Evance
 * @Create: 2024/1/22-下午 08:04
 */
public class Invert_values {
    public class Kata {
        public static int[] invert(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array [i]= - array [i];
            }
            return array;
        }
    }
}

//其他人的答案
//import java.util.Arrays;
//
//public class Kata {
//    public static int[] invert(int[] array) {
//        return Arrays.stream(array).map(i -> -i).toArray();
//    }
//}