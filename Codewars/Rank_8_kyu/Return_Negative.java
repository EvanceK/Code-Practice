/**
 * ClassName: Return_Negative
 * ClassName: PACKAGE_NAME
 * Description:
 * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 * Examples
 *
 * Kata.makeNegative(1);  // return -1
 * Kata.makeNegative(-5); // return -5
 * Kata.makeNegative(0);  // return 0
 *
 * Notes
 *
 *     The number can be negative already, in which case no change is required.
 *     Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 *  * Rank:8 kyu
 *
 * @Author: Evance
 * @Create: 2024/1/12-下午 02:38
 */
public class Return_Negative {
    public class Kata {

        public static int makeNegative(final int x) {
            int result = (x > 0) ? x * -1 : x;
            return result;
        }
    }
}
//其他人的答案1
//import static java.lang.Math.abs;
//
//public class Kata {
//
//    public static int makeNegative(final int x) {
//        return -abs(x);
//    }
//
//}

//其他人的答案2
//public class Kata {
//    public static int makeNegative(final int x) {
//        return x > 0 ? -x : x;
//    }
//}