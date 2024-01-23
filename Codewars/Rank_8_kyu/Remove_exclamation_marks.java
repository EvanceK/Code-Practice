package Rank8kyu;

/**
 * ClassName: Remove_exclamation_marks
 * ClassName: Rank8kyu
 * Description:
 *      Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 * @Author: Evance
 * @Create: 2024/1/23-下午 07:01
 */
public class Remove_exclamation_marks {
    class Solution {
        static String removeExclamationMarks(String s) {
            String result = s.replaceAll("!", "");
            return result;
        }
    }

}
//其他人的答案1
//import java.util.stream.*;
//class Solution {
//    static String removeExclamationMarks(String s) {
//        return Stream.of(s.split(""))
//                .filter(l -> !l.equals("!"))
//                .collect(Collectors.joining(""));
//    }
//}
//其他人的答案2
//class Solution {
//    static String removeExclamationMarks(String s) {
//        return (s == null) ? null : s.replace("!", "");
//    }
//}