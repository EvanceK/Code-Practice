public class Remove_String_Spaces {

//    Description:
//    Rank:8 kyu
//    Write a function that removes the spaces from the string, then return the resultant string.
//
// Examples:
//
//    Input -> Output
//      "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
//      "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
//      "8aaaaa dddd r     " -> "8aaaaaddddr"

    public class Kata {
        public static String noSpace(final String x) {
            String y = x.replaceAll(" ", "");
            return y;
        }
    }
}

//其他人的答案1
//class Kata {
//    static String noSpace(final String x) {
//        return x.replace(" ", "");
//    }
//}
//其他人的答案2
//class Kata {
//    static String noSpace(final String x) {
//        return x.replaceAll("\\s+","");
//    }
//}
//其他人的答案3
//public class Kata {
//    public static String noSpace(final String x) {
//        return String.join("", x.split(" "));
//    }
//}