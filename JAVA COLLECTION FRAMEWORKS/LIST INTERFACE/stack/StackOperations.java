// Stack Diffrent Operations

import java.util.*;

public class StackOperations {

  public static void main(String[] args) {
    Stack<String> Animals = new Stack<>();

    // 1. Adding Elements :- In order to add an element to the stack, we can use the push() method.
    // This push() operation place the element at the top of the stack.

    Animals.push("Lion");
    Animals.push("Dog");
    Animals.push("Horse");
    Animals.push("Cat");

    System.out.println("Animals = " + Animals);

    // 2.Accessing the Element :- To retrieve or fetch the first element of the Stack
    // or the element present at the top of the Stack,we can use peek() method.
    // The element retrieved does not get deleted or removed from the Stack.

    System.out.println(
      "First Peek Animal As Per LIFO Rule = " + Animals.peek()
    );

    // 3.Removing Elements :- To pop an element from the stack, we can use the pop() method.
    // The element is popped from the top of the stack and is removed from the same.

    System.out.println("Print Pop Animal = " + Animals.pop());

    System.out.println(
      "After Performoing pop operation in stack peek Animal is Change = " +
      Animals.peek()
    );

    System.out.println("Print Pop Animal = " + Animals.pop());

    System.out.println("Animals = " + Animals);

    // 4. empty() :- It returns true if nothing is on the top of the stack. Else, returns false.
    System.out.println("empty() Method = " + Animals.empty());

    // 5. search() :- It determines whether an object exists in the stack.
    // If the element is found, It returns the position of the element from the top of the stack. Else, it returns -1.
    System.out.println("Search Animal = " + Animals.search("Dog"));
    System.out.println("Search Animal = " + Animals.search("Lion"));
    System.out.println("Search Animal = " + Animals.search("Cat"));

    System.out.println("Size Of Animal Stack = " + Animals.size());
  }
}
