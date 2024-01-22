package Rank8kyu;

/**
 * ClassName: String_repeat
 * ClassName: Rank8kyu
 * Description:
 *      Write a function that accepts an integer n and a string s as parameters,
 *      and returns a string of s repeated exactly n times.
 *      Examples (input -> output)
 *
 *      6, "I"     -> "IIIIII"
 *      5, "Hello" -> "HelloHelloHelloHelloHello"
 * @Author: Evance
 * @Create: 2024/1/22-下午 07:41
 */
public class String_repeat {
    public class Solution {
        public static String repeatStr(final int repeat, final String string) {
            StringBuilder repeatStr = new StringBuilder();
            for(int i = 0; i < repeat;i++){
                repeatStr.append(string);
            }
            return repeatStr.toString();
        }
    }
}

//其他人的答案
//class Solution {
//    static String repeatStr(int repeat, String string) {
//        return string.repeat(repeat);
//    }
//}
//其他人的答案2
//public class Solution {
//    public static String repeatStr(final int repeat, final String string) {
//        String s = "";
//        for (int i = 0; i < repeat; i++) s += string;
//        return s;
//    }
//}