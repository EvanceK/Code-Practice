package Rank7kyu;

import java.util.TreeSet;

/**
 * ClassName: Form_The_Minimum
 * ClassName: Rank7kyu
 * Description:
 *          Input >> Output Examples
 *          minValue ({1, 3, 1})  ==> return (13)
 *          Explanation:
 *          (13) is the minimum number could be formed from {1, 3, 1} , Without duplications
 *
 * @Author: Evance
 * @Create: 2024/1/23-下午 07:46
 */
public class Form_The_Minimum {

    public class Minimum{

        public static int minValue(int[] values){

            //TreeSet 在添加元素時，會自動去除重複且按自然順序排列
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int value : values) {
                treeSet.add(value);
            }
            //TreeSet放回int 數組
            int[] array = new int[treeSet.size()];
            int i = 0;
            for (Integer num : treeSet) {
                array[i++] = num;
            }
            //int 數組使用 StringBuilder 拼接

            StringBuilder sb = new StringBuilder();
            for (int val : array) {
                sb.append(val);
            }
            //StringBuilder轉String轉int
            return Integer.parseInt(sb.toString());
        }

    }

}


//其他人的答案1
//import java.util.stream.Collectors;
//        import java.util.*;
//public class Minimum{
//
//    public static int minValue(int[] values){
//        String s = Arrays.stream(values)
//                .sorted()
//                .distinct()
//                .mapToObj(Integer::toString)
//                .collect(Collectors.joining(""));
//        return Integer.valueOf(s);
//    }
//
//}
//其他人的答案2
//import java.util.Arrays;
//
//public class Minimum{
//
//    public static int minValue(int[] values) {
//        return Arrays.stream(values)
//                .distinct()
//                .sorted()
//                .reduce(0, (a, b) -> 10 * a + b);
//    }
//}