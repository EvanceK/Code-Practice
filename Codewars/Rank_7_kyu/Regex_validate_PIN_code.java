package Rank7kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: Regex_validate_PIN_code
 * ClassName: Rank7kyu
 * Description:
 *      ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but
 *      exactly 4 digits or exactly 6 digits.
 *      If the function is passed a valid PIN string, return true, else return false.
 *      Examples (Input --> Output)
 *
 *      "1234"   -->  true
 *      "12345"  -->  false
 *      "a234"   -->  false
 * @Author: Evance
 * @Create: 2024/1/22-下午 07:14
 */
public class Regex_validate_PIN_code {
    public class Solution {
        public static boolean validatePin(String pin) {
            boolean confirm = false;
            String regex = "[^0-9]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pin);
            if (matcher.find()){
            }else if (pin.length()==4 || pin.length()==6 ){
                confirm = true;
            }
            return confirm;
        }
    }
}

//其他人的答案1
//        import java.util.regex.*;
//
//public class Solution {
//
//    public static boolean validatePin(String pin) {
//        return pin.matches("\\d{4}|\\d{6}");
//    }
//
//}
//其他人的答案2
//public class Solution {
//
//    public static boolean validatePin(String pin) {
//        return pin.matches("[0-9]{4}|[0-9]{6}");
//    }
//
//}