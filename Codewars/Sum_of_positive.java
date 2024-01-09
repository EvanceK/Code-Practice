import java.util.*;
public class Sum_of_positive
{
//  Rank:8 kyu
//  Description:
//
//        You get an array of numbers, return the sum of all of the positives ones.
//
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//        Note: if there is nothing to sum, the sum is default to 0.

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
// 將int型數組放入List中，刪除最小和最大的數，使用一般for循環加總
        List<Integer> numbersList = new ArrayList<>();
        for (int num : numbers) {
            numbersList.add(num);
        }
//        使用collections.sort排序
        Collections.sort(numbersList);
//        刪除最小和最大的數
        if (numbersList.size() >= 2) {
            numbersList.remove(0);
            numbersList.remove(numbersList.size()-1);
        }else return 0;
//          使用一般for循環加總
        int sum = 0;
        for (int i = 0; i<numbersList.size(); i++){
            sum+=numbersList.get(i);
        }
        return sum;
    }
}

//其他人的答案1
//import java.util.Arrays;
//public class Positive{
//    public static int sum(int[] arr){
//        return Arrays.stream(arr).filter(v -> v > 0).sum();
//    }
//}
//其他人的答案2
//public class Positive{
//    public static int sum(int[] arr){
//        int result = 0;
//        for (int i : arr) {
//            if (i > 0) {
//                result += i;
//            }
//        }
//        return result;
//    }
//}