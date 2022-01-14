import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList 
{
  public static void main(String[] args) {
    List <String> myList = new ArrayList <String>();
    myList.add("Zebra");
    myList.add("Orange");
    myList.add("Carrot");
    myList.add("Goat");
    myList.add("Ice");
    myList.add("Ball");
    myList.add("Apple");
    myList.add("Rose");
    myList.add("Umbrella");
    myList.add("7");

    System.out.println("");

    System.out.println("The unsorted List is:");

    for (String myStr : myList) {
        System.out.print(" " + myStr);
    }
    System.out.println("");


    Collections.sort(myList);

    System.out.println("\nThe Sorted List is");

    for (String myStr : myList) {
        System.out.print(" " + myStr);
    }
    System.out.println("\n\n");
  }
}