// enum KeyWord
/*

-> An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
-> To create an enum, use the enum keyword,and separate the constants with a comma. Note that they should be in uppercase letters:
-> An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
-> Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
-> enu through add  constructor, add instance variables and methods, and even implement interfaces.

#NOTE :- Declaration of enum in Java:
-> Enum declaration can be done outside a Class or inside a Class but not inside a Method.

 */

enum Color {
    RED,
    BLUE,
    WHITE,
    BLACK,
    YELLOW,
    PINK
}

public class enumKeywordInformation {

    public static void main(String[] args) {

        Color obj = Color.YELLOW;
        System.out.println("My Favourite Color Is " + obj);
    }
}