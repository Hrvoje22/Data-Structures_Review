import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimalSolution {

    public static void main(String[] args) {

        int[] array = new int[]{2,3,9,7,11};

        System.out.println(Arrays.toString(twoSumOptimalSolution(array,9)));


    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {

        //Complexity of the solution is 0(n) but I have space complexity of O(n) because of creation of new HashMap

        //create hashmap

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{map.get(potentialMatch),i};
            else map.put(array[i],i);
        }

        return new int[]{};
    }
}
