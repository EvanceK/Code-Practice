package Rank8kyu;

import java.util.*;

public class Sum_without_highest_and_lowest_number {
//    Rank:8 kyu
//    Description:
//    Task
//
//    Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//
//    The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//
//    Mind the input validation.
//    Example
//    { 6, 2, 1, 8, 10 } => 16
//    { 1, 1, 11, 2, 3 } => 6
//
//    Input validation
//
//    If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0


    public class Kata
    {
        public static int sum(int[] numbers)
        {
            if (numbers == null || numbers.length == 0) {
                return 0;
            }
            List<Integer> numbersList = new ArrayList<>();
            for (int num : numbers) {
                numbersList.add(num);
            }
            Collections.sort(numbersList);

            if (numbersList.size() >= 2) {
                numbersList.remove(0);
                numbersList.remove(numbersList.size()-1);
            }else return 0;

            int sum = 0;
            for (int i = 0; i<numbersList.size(); i++){
                sum+=numbersList.get(i);
            }
            return sum;
        }
    }
}

//其他人的答案1
//import java.util.Arrays;
//
//public class Kata
//{
//    public static int sum(int[] numbers) {
//        if(numbers == null || numbers.length <= 2) return 0;
//        int sum = 0;
//        Arrays.sort(numbers);
//        for(int i = 1; i < numbers.length-1; i++){
//            sum += numbers[i];
//        }
//        return sum;
//    }
//}
//
//其他人的答案2
//import java.util.Arrays;
//
//public class Kata
//{
//    public static int sum(int[] numbers)
//    {
//        if(numbers == null || numbers.length < 2) return 0;
//        Arrays.sort(numbers);
//        return Arrays.stream(numbers).skip(1).limit(numbers.length-2).sum();
//    }
//}