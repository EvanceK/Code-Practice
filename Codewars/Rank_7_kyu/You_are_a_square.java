package Rank7kyu;

/**
 * ClassName: You_are_a_square
 * ClassName: Rank_7_kyu
 * Description:
 *  Examples
 *
 *      -1  =>  false
 *       0  =>  true
 *       3  =>  false
 *       4  =>  true
 *      25  =>  true
 *      26  =>  false
 *
 * @Author: Evance
 * @Create: 2024/1/12-下午 02:56
 */
public class You_are_a_square {
    public class Square {
        public static boolean isSquare(int n) {
            boolean result = false;
            if (n < 0) {
                result = false;
            }
            for (int i = 0; i <= n; i++) {
                if (i * i == n) {
                    result = true;
                    break;
                }
            }
            return result;
        }
    }
}

//其他人的答案1
//public class Square {
//    public static boolean isSquare(int n) {
//        return Math.sqrt(n)%1 == 0;
//    }
//}
//其他人的答案2
//public class Square {
//    public static boolean isSquare(int n) {
//        if (n < 0) return false;
//        int sqrt = (int) Math.sqrt(n);
//        return sqrt*sqrt ==  n;
//    }
//}
//其他人的答案3
//public class Square {
//    public static boolean isSquare(int n) {
//
//        return Math.sqrt(n)%1 == 0 ? true : false;
//    }
//}