import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0}); // first stop //10 got in //0 got off
        busStops.add(new int[] {3,5});  // second stop
        busStops.add(new int[] {2,5});  // third stop

        System.out.println(countPassengers(busStops));


    }


    public static int countPassengers(ArrayList<int[]> stops){

        int numOfPeople = 0;

        // O(n) complexity - single loop with size n

        for (int i = 0; i < stops.size(); i++) {
            numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }

        return numOfPeople;
    }

}
