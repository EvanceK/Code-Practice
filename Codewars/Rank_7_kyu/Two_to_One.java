package Rank7kyu;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: Two_to_One
 * ClassName: Rank_7_kyu
 * Description:
 *
 * @Author: Evance
 * @Create: 2024/1/12-下午 07:41
 */
public class Two_to_One {
    //答案一
    public static String longest(String s1, String s2) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(s1).append(s2);
        String s = strBuilder.toString();

        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();// HashSet在檢查重複時添加進去時是無序的，
        for (char c : chars) {
            set.add(c);
        }
        String ans = set.stream()
                .map(String::valueOf)
                .sorted()//因此在此排序
                .collect(Collectors.joining());
        return ans;
    }
}
//答案2
//    public static String longest(String s1, String s2) {
//        StringBuilder strBuilder = new StringBuilder();
//        strBuilder.append(s1).append(s2);
//        String s = strBuilder.toString();
//
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);在此排序
//        Set<Character> set = new LinkedHashSet<>();// LinkedHashSet是有序的添加，
//        for (char c : chars) {
//            set.add(c);
//        }
//        String ans = set.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//        return ans;
//    }
//}


//其他人的答案1
//    public class TwoToOne {
//
//        public static String longest (String s1, String s2) {
//            String s = s1 + s2;
//            return s.chars()
//                    .distinct()
//                    .sorted()
//                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//        }
//    }
//其他人的答案2
//import java.util.stream.*;
//
//public class TwoToOne {
//
//    public static String longest (String s1, String s2) {
//        return Stream.of(s1.concat(s2).split(""))
//                .sorted()
//                .distinct()
//                .collect(Collectors.joining());
//    }
//}
//其他人的答案3
//import java.util.*;
//public class TwoToOne {
//
//    public static String longest (String s1, String s2) {
//        TreeSet<Character> set = new TreeSet<>();
//
//        //Combine both strings into a single String
//        String s1s2 = s1 + s2;
//        //Create a StringBuilder that we will us to create our result String
//        StringBuilder sb = new StringBuilder();
//
//        //Add all characters to TreeSet. Now they are ordered and only 1 occurence of each
//        for(int i = 0; i < s1s2.length(); i++)
//            set.add(s1s2.charAt(i));
//
//        //Build our StringBuilder by interating over the Set
//        for(Character c : set)
//            sb.append(c);
//
//        //Return the result as a String
//        return new String(sb);
//
//
//    }
//}
//其他人的答案4
//public class TwoToOne {
//
//    public static String longest (String s1, String s2) {
//        String all = "abcdefghijklmnopqrstuvwxyz";
//        return all.replaceAll("[^" + s1+s2 + "]", "");
//    }
//}