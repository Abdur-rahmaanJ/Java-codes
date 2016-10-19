
package main;

import java.util.ArrayList;//ArrayList is a sort of array and is found in java.util package

/**
 *
 * @author Abdur-Rahmaan Janhangeer
 * subject : countries ArrayList illustration
 * output and some explanations included at the end
 */


public class Javacode { 
  public static void main(String[ ] args) { 
      
 /*initialising the arraylist countries . ArrayLists can also contain objects*/
ArrayList<String> countries = new ArrayList<>();

/* .add() used to add items to the ArrayList */
countries.add("Land of Great Wilderness");
countries.add("Land of The Walking Glory");
countries.add("Land of W");

/* .isEmpty() checks is ArrayList is empty */
boolean emptyCheck = countries.isEmpty();

/* .size() tells the size of the ArrayList */
int size = countries.size();

System.out.println("The ArrayList is empty? "+emptyCheck);
System.out.println("The ArrayList has "+size+" items");

/* .indexOf() returns the index of an item */
int index = countries.indexOf("Land of W");

/* .contains() checks if specified item in ArrayList */
boolean isin = countries.contains("Land of W");

/* .get() returns the item with the index specified in the brackets */
String firstItem = countries.get(0);

System.out.println("The items in the ArrayList : \n"+countries);
System.out.println("Is \"Land of W\" in the ArrayList? "+isin);
System.out.println("Position of the item \"Land of W\" in the list : "+(index+1));
System.out.println("The first item of the list is : "+firstItem);

  } 
}


/**
output with NetBeans IDE 8.1 :

The ArrayList is empty? false
The ArrayList has 3 items
The items in the ArrayList : 
[Land of Great Wilderness, Land of The Walking Glory, Land of W]
Is "Land of W" in the ArrayList? true
Position of the item "Land of W" in the list : 3
The first item of the list is : Land of Great Wilderness
BUILD SUCCESSFUL (total time: 12 seconds)
 */



