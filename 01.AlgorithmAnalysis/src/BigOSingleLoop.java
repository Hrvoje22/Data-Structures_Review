public class BigOSingleLoop {
    public static void main(String[] args) {
        int numberOfOperations=0;
        int n=1000000;// size of  Data
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);
        // Task 1 Single Loop................... O(n)
        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Number of operations: "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");

        numberOfOperations=0;
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Number of operations with nested loop : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................

        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops...................
        // Task 4 End...................

        // Task 5 Logarithmic Complexity...................

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();

        for (int i = 1; i < n; i*=2) {
            numberOfOperations += 1;
        }

        endTime = System.currentTimeMillis();

        System.out.println( "Number of operations with Logarithmic : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");

       // Task 5 End...................*/
    }
}


