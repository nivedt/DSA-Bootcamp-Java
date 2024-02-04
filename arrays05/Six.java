package arrays05;

import java.util.ArrayList;
import java.util.List;

public class Six {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;

    }

//    // Previously Tried
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> list = new ArrayList<>();
//        int max = 0;
//
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] > max) max = candies[i];
//        }
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] + extraCandies >= max) list.add(true);
//            else list.add(false);
//        }
////        Object[] objects = list.toArray();
////        System.out.println(Arrays.toString(objects));
//        return list;
//    }
}
