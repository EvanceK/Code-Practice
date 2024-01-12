/**
 * ClassName: Beginner_Series_Cockroach
 * Description:
 * The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).
 * For example:
 * 1.08 --> 30
 * Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
 *
 * Rank: 8 kyu
 * @Author: Evance
 * @Create: 2024/1/12-下午 02:34
 */
public class Beginner_Series_Cockroach {
    public class Cockroach {
        public int cockroachSpeed(double x) {
            double result;
            if (x == 0) {
                result = 0;
            } else {
                result = ((x * 100000) / 3600);// km/hr --> cm/sec
            }
            return (int) result;
        }
    }
}

//其他人的答案1
//public class Cockroach{
//    public int cockroachSpeed(double kph){
//        int secondsInHour = 3600;
//        int cmInKm = 100000;
//        int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
//        return centimetresPerSecond;
//    }
//}
//其他人的答案2
//public class Cockroach{
//    public int cockroachSpeed(double x){
//        return (int)(x / 0.036);
//    }
//}