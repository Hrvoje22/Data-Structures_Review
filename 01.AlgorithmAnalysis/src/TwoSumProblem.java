import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {

        int[] array = new int[]{2,8,2,7,11};

        System.out.println(Arrays.toString(twoSumSolution(array,9)));

    }

    //BruteForceSolution of Two Sum Problem:

    public static int[] twoSumSolution(int[] array, int targetValue){


        //O*(n^2) complexity
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) { //starting with 1, so we avoid using the same element twice
                if(i!=j){
                if(array[i] + array[j]==targetValue) return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }



}
