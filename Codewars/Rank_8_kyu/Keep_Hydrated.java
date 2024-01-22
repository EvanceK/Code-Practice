package Rank8kyu;

/**
 * ClassName: Keep_Hydrated
 * ClassName: Rank8kyu
 * Description:
 *      Nathan loves cycling.
 *      Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 *      You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 *
 *      For example:
 *      time = 3 ----> litres = 1
 *      time = 6.7---> litres = 3
 *      time = 11.8--> litres = 5
 *
 * @Author: Evance
 * @Create: 2024/1/22-下午 07:56
 */
public class Keep_Hydrated {
    public class KeepHydrated  {
        public int Liters(double time) {
            int Liters = (int) (time * 0.5);
            return Liters;
        }
    }
}
// 其他人的答案1
//public class KeepHydrated  {
//
//    public int Liters(double time)  {
//        return (int)(time / 2);
//    }
//}