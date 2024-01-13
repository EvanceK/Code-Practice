package Rank7kyu;

import java.util.List;

/**
 * ClassName: Testing_1_2_3
 * ClassName: Rank7kyu
 * Description:
 *  Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 *
 *  Write a function which takes a list of strings and returns each line prepended by the correct number.
 *
 *  The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 *
 *   Examples: (Input --> Output)
 *
 *      [] --> []
 *      ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 * @Author: Evance
 * @Create: 2024/1/13-下午 07:55
 */
public class Testing_1_2_3 {
    public class LineNumbering {
        public static List<String> number(List<String> lines) {

            for (int i = 0; i < lines.size(); i++) {
                String set1 = lines.set(i, (i + 1) + ": " + lines.get(i));
            }
            return lines;
        }
    }
}
//其他人的答案1
//import java.util.*;
//
//class LineNumbering {
//
//    static List<String> number(List<String> lines) {
//        ArrayList<String> result = new ArrayList();
//        int i = 0;
//        for (String s : lines) {
//            result.add(++i + ": " + s);
//        }
//        return result;
//    }
//
//}
//其他人的答案2
//import java.util.List;
//        import java.util.stream.Collectors;
//        import java.util.stream.IntStream;
//
//class LineNumbering {
//    static List<String> number(List<String> lines) {
//        if (lines.size() == 0) return lines;
//        return IntStream.range(0, lines.size())
//                .mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
//                .collect(Collectors.toList());
//    }
//}