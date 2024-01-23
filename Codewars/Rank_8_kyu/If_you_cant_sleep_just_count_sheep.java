package Rank8kyu;

/**
 * ClassName: If_you_cant_sleep_just_count_sheep
 * ClassName: Rank8kyu
 * Description:
 *          If you can't sleep, just count sheep!!
 *          Task:
 *          Given a non-negative integer, 3 for example, return a string with a murmur:
 *          "1 sheep...2 sheep...3 sheep...".
 *          Input will always be valid, i.e. no negative integers.
 * @Author: Evance
 * @Create: 2024/1/23-下午 07:15
 */
public class If_you_cant_sleep_just_count_sheep {
    class Kata {
        public static String countingSheep(int num) {
            String result="";
            for (int i = 1; i <= num; i++) {
                result += i+" sheep...";
            }
            return result;
        }
    }
}
//其他人的答案1
//class Kata {
//    public static String countingSheep(int num) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//            stringBuilder.append(i).append(" sheep...");
//        }
//        return stringBuilder.toString();
//    }
//}
//其他人的答案2
//import java.util.stream.Collectors;
//        import java.util.stream.IntStream;
//
//public class Kata {
//    public static String countingSheep(int num) {
//        return IntStream.rangeClosed(1, num)
//                .mapToObj(i -> i + " sheep...")
//                .collect(Collectors.joining());
//    }
//}