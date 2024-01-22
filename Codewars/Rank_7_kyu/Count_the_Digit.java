package Rank7kyu;

import java.util.stream.IntStream;

import static java.lang.String.valueOf;

/**
 * ClassName: Count_the_Digit
 * ClassName: Rank7kyu
 * Description:
 *      Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
 *      Square all numbers k (0 <= k <= n) between 0 and n.
 *      Count the numbers of digits d used in the writing of all the k**2.
 *      Implement the function taking n and d as parameters and returning this count.
 *      Examples:n = 10, d = 1
 *          the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
 *          We are using the digit 1 in: 1, 16, 81, 100. The total count is then 4.
 *
 *          The function, when given n = 25 and d = 1 as argument, should return 11 since
 *          the k*k that contain the digit 1 are:
 *          1, 16, 81, 100, 121, 144, 169, 196, 361, 441.
 *          So there are 11 digits 1 for the squares of numbers between 0 and 25.
 *
 *          Note that 121 has twice the digit 1.
 *
 * @Author: Evance
 * @Create: 2024/1/22-下午 08:10
 */
public class Count_the_Digit {
    public class CountDig {

        public static int nbDig(int n, int d) {
            int count = 0;
            StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i <= n; i++) {
                        stringBuilder.append(i*i);
                    }
                    for (int j = 0; j < stringBuilder.length(); j++) {
                        if (Character.forDigit(d,10) == stringBuilder.charAt(j)) {
                            count++;
                            // int 轉 char
                            // Character.forDigit(int digit, int radix) 方法。
                            // 這個方法將指定的數字（digit）轉換為在指定基數（radix）中的字符表示。
                            //stringBuilder.charAt(j))
                        }
                    }
            return count;
        }

    }

}

//其他人的答案1
//public class CountDig {
//
//    public static int nbDig(int n, int d) {
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += countOfDigit((int) Math.pow(i, 2), d);
//        }
//        return sum;
//    }
//
//    public static int countOfDigit(int n, int d) {
//        int count = 0;
//        do {
//            if (n % 10 == d)
//                count ++;
//            n /= 10;
//        } while (n > 0);
//        return count;
//    }
//}
//其他人的答案2
//import java.util.stream.IntStream;
//
//public class CountDig {
//
//    public static int nbDig(int n, int d) {
//
//        return (int) IntStream
//                .rangeClosed(0, n)
//                .map(i -> i * i)
//                .flatMap(i -> String.valueOf(i).chars())
//                .mapToObj(i -> (char)i)
//                .mapToInt(Character::getNumericValue)
//                .filter(i -> i == d)
//                .count();
//    }
//}