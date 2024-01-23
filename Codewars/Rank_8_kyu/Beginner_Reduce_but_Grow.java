package Rank8kyu;

import java.util.stream.IntStream;

/**
 * ClassName: Beginner_Reduce_but_Grow
 * ClassName: Rank8kyu
 * Description:
 *      Given a non-empty array of integers, return the result of multiplying
 *      the values together in order. Example:
 *
 *      [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 * @Author: Evance
 * @Create: 2024/1/23-下午 07:09
 */
public class Beginner_Reduce_but_Grow {
    public class Kata{
        public static int grow(int[] x){
            int result = 1;
            for (int i = 0; i < x.length; i++) {
                result*= x[i];
            }
            return result;
        }
    }
}
//其他人的答案1
//public class Kata{
//
//    public static int grow(int[] x){
//        int result = 1;
//        for (int a : x) {
//            result *= a;
//        }
//        return result;
//    }
//}
//其他人的答案2
//import java.util.stream.IntStream;
//
//public class Kata{
//    public static int grow(int[] x){
//        return IntStream.of(x).reduce(1, (a, b) -> a * b);
//    }
//}