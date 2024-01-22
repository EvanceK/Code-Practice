package Rank8kyu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: altERnaTIng_cAsE_To_ALTerNAtiNG_CaSe
 * ClassName: Rank8kyu
 * Description:
 *
 * @Author: Evance
 * @Create: 2024/1/14-上午 10:13
 */
public class altERnaTIng_cAsE_To_ALTerNAtiNG_CaSe {
    public class StringUtils {

        public static String toAlternativeString(String string) {
            for (int i = 0; i < string.length(); i++) {
                if (Character.isUpperCase(string.indexOf(i))) {
                    Character.toLowerCase(string.indexOf(i));
                } else if (Character.isLowerCase(string.indexOf(i))) {
                    Character.toUpperCase(string.indexOf(i));
                }
            }
            return string;
        }
    }
}

