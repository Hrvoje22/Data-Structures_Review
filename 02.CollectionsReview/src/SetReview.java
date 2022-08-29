import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set

        Set<Student> set = new LinkedHashSet<>();

        // 2 add element

        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4,"Mary"));

        System.out.println(set);
        System.out.println(firstRepeatingChar("Java Developer"));




    }
    public static Character firstRepeatingChar(String str){
        //Time complexity of this code is O(n)

        //create a hashset
        Set<Character> chars = new HashSet<>(); //in here I have Space Complexity of O(n)

        //iterate over the char array and add chars into hashSet

        for (Character ch : str.toCharArray()){
            if(!chars.add(ch)){ //if it's false
                return ch;
            }
        }

       return null;
    }
}