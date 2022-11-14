package sunsetViews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViewsWest {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"west").forEach(System.out::println);
    }


    //This solution works for both west and east
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        //this part is for East by default
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int step=1;
        //this part is for west

        if(direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step=-1;
        }

        while(i>=0 && i< buildings.length){

            while(!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }

        //now I have a stack with teh buildings indices that can see the sunset

        if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);

        return new ArrayList<Integer>(stack);
    }
}
