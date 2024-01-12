/**
 * ClassName: Are_You_Playing_Banjo
 * Rank: 8 kyu
 * Description:
 *    Create a function which answers the question "Are you playing banjo?".
 *    If your name starts with the letter "R" or lower case "r", you are playing banjo!
 *
 *    The function takes a name as its only argument, and returns one of the following strings:
 *
 *    name + " plays banjo"
 *    name + " does not play banjo"
 *
 *      Names given are always valid strings.
 * @Author: Evance
 * @Create: 2024/1/10-下午 05:38
 */
public class Are_You_Playing_Banjo {
    public class Banjo {
        public static String areYouPlayingBanjo(String name) {
            if (name.toUpperCase().startsWith("R", 0)) {
                return name + " plays banjo";
                }return name + " does not play banjo";
        }
    }
}

//其他人的答案1
//public class Banjo {
//    public static String areYouPlayingBanjo(String name) {
//        return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
//    }
//}
//其他人的答案2
//public class Banjo {
//    public static String areYouPlayingBanjo(String name) {
//        // Program me!
//        return (name.substring(0,1).toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo");
//    }
//}