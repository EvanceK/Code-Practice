public class Simple_multiplication {

//    Description:
//    Rank:8 kyu
//    This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

    public class Sid {
        public static int simpleMultiplication(int n) {
            if (n % 2==0){return n*8;
            }else return n*9;
        }
    }
}
//其他人的答案1
//public class Sid {
//    public static int simpleMultiplication (int n) {
//        return n % 2 == 0 ? n * 8 : n * 9;
//    }
//}
//其他人的答案2
//public class Sid {
//    public static int simpleMultiplication(int n) {
//        return n * (n % 2 + 8);
//    }
//}