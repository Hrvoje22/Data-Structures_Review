public class SinglyLinkedListApp {

    public static void main(String[] args) {


        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());


        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.printNode();
        myList.deleteById(9);
        myList.printNode();
        System.out.println("Index of 0: " + myList.indexOf(0));
        myList.add(4);
        myList.printNode();
        myList.addFirst(16);
        myList.printNode();

        System.out.println(myList.getKthItemFromLast(5));


    }
}
