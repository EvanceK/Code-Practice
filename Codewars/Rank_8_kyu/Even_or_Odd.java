package Rank8kyu;

public class Even_or_Odd {
//    Rank:8 kyu
//    Description:
//    Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

    public class Kata {
        public static String evenOrOdd(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }
}

//其他人的答案1
//public class EvenOrOdd {
//    public static String even_or_odd(int number) {
//        return (number % 2) != 0 ? "Odd" : "Even";
//    }
//}
//
//其他人的答案2
//public class Kata {
//    public static String evenOrOdd(int number) {
//        return (number % 2 == 0) ? "Even" : "Odd";
//    }
//}