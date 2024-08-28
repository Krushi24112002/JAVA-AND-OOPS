// SortedMap

import java.util.SortedMap;
import java.util.TreeMap;

public class DifferentSortedMapOperations {

  public static void main(String[] args) {
    SortedMap<String, Integer> s1 = new TreeMap<>();

    // put() :- This method is used to associate the specified value with the specified key in this SortedMap.
    s1.put("One", 1);
    s1.put("Three", 3);
    s1.put("Two", 2);
    s1.put("Five", 5);
    s1.put("Four", 4);

    // Print Key = Value Pairs
    System.out.println("Key : Value " + "= " + s1);

    // Iterating the SortedMap
    // Method 1 Using for each loop
    for (SortedMap.Entry<String, Integer> e : s1.entrySet()) {
      // Print All Entry (key:Value)
      System.out.println("Print All Entry With Key : Value " + e);
    }

    // KeySet() :- Only Print List Of All Keys
    System.out.println("KeySet() " + s1.keySet());

    // values() :- Only Print List Of All Values.
    System.out.println("values() " + s1.values());

    // isEmpty() :- This method is used to check if a SortedMap is having any entry for key and value pairs. If no mapping exists, then this returns true.
    System.out.println("isEmpty() " + s1.isEmpty());

    // size() :- This method is used to return the number of key/value pairs available in the SortedMap.
    System.out.println("size of Key:value Pairs = " + s1.size());

    // containsKey() :- This method is used to check whether a particular key is being mapped into the Map or not.
    // It takes the key element as a parameter and returns True if that element is mapped in the map.
    System.out.println("containsKey() " + s1.containsKey("Five"));

    // containsValue() :- This method is used to check whether a particular value is being mapped by a single or more than one key in the Map.
    // It takes the value as a parameter and returns True if that value is mapped by any of the key in the map.
    System.out.println("containsValue() " + s1.containsValue(4));

    // hashCode() :- This method is used to generate a hashCode for the given SortedMap containing keys and values.
    System.out.println("Key:Value Pair hashCode Is = " + s1.hashCode());

    // remove() :- In order to remove an element from the SortedMap, we can use the remove() method.
    // This method takes the key value and removes the mapping for a key from this map if it is present in the map.
    s1.remove("Two", 2);

    // After Removing One Pair
    System.out.println("After Removing One Pair " + s1);

    // clear() :- This method is used to clear and remove all of the elements or mappings from a specified SortedMap collection.
    s1.clear();
    System.out.println(s1);
  }
}
