import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Convert_number_to_reversed_array_of_digits
 * Rank: 8 kyu
 * Description:
 *      Convert number to reversed array of digits
 *
 *      Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 *      Example(Input => Output):
 *
 *      35231 => [1,3,2,5,3]
 *      0 => [0]
 * @Author: Evance
 * @Create: 2024/1/10-下午 06:21
 */

//答案1
//將long轉String轉char數組，再new新的int數組倒著放進int數組。
public class Convert_number_to_reversed_array_of_digits {
    public class Kata {
        public static int[] digitize(long n) {
            String longString = Long.toString(n);
            char[] chars = longString.toCharArray();
            int[] intArray = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                intArray[i] = Character.getNumericValue(chars[chars.length-1-i]);
            }return intArray;
        }
    }
}

//答案2
//將long轉String轉char List，用Collections反轉，再new新的int數組放進去。
//public class Convert_number_to_reversed_array_of_digits {
//    public class Kata {
//        public static int[] digitize(long n) {
//            String longString = Long.toString(n);
//            char[] chars = longString.toCharArray();
//
//            List<Character> charList = new ArrayList<>();
//            for (char i : chars) {
//                charList.add(i);
//            }
//            Collections.reverse(charList);
//            int[] result = new int[charList.size()];
//            for (int i = 0; i < charList.size(); i++) {
//                result[i] = Character.getNumericValue(charList.get(i));
//            }
//            return result;
//        }
//    }
//}

//其他人的答案1
//public class Kata {
//    public static int[] digitize(long n) {
//        return new StringBuilder().append(n)
//                .reverse()
//                .chars()
//                .map(Character::getNumericValue)
//                .toArray();
//    }
//}
//其他人的答案2
//import java.lang.Math;
//public class Kata {
//    public static int[] digitize(long n) {
//        String s = String.valueOf(n);
//        int length = s.length();
//        int[] array = new int[length];
//        for ( int i = 0; i < length; i++){
//            array[i] = (int) (s.charAt(length - i - 1)) - 48;
//        }
//        return array;
//    }
//}