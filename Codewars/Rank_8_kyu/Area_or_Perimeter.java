package Rank7kyu;

/**
 * ClassName: Area_or_Perimeter
 * ClassName: Rank7kyu
 * Description:You are given the length and width of a 4-sided polygon.
 * The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 *
 * Example(Input1, Input2 --> Output):
 *
 * 6, 10 --> 32
 * 3, 3 --> 9
 *
 * Note: for the purposes of this kata you will assume that it is a square
 * if its length and width are equal, otherwise it is a rectangle.
 *
 * @Author: Evance
 * @Create: 2024/1/13-下午 08:42
 */
public class Area_or_Perimeter {
    public class Solution {
        public static int areaOrPerimeter (int l, int w) {
            int result = (l == w ) ? (l*l) : (2*l+2*w);
            return result;
        }
    }
}
//其他人的答案1
//public class Solution {
//    public static int areaOrPerimeter (int l, int w) {
//        return l == w ? l * w : (l + w) * 2;
//    }
//}
//其他人的答案2
//public class Solution {
//    public static int areaOrPerimeter (int x, int y) {
//        if(x==y){
//            return x*y;
//        }return (x+y)*2;
//    }
//}