// Exception
/*
Exception -> Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time

# Major reasons why an exception Occurs # 

1) Invalid user input
2) Device failure
3) Loss of network connection
4) Physical limitations (out of disk memory)
5) Code errors
6) Opening an unavailable file

// Errors

Errors -> Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory,
          memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.
          Errors are usually beyond the control of the programmer, and we should not try to handle errors.


Errors :-  An Error indicates a serious problem that a reasonable application should not try to catch.
Exception :- Exception indicates conditions that a reasonable application might try to catch.

# Types Of Exception # 

1) User Defined Exception
2) Built In Exception -> 1. Checked Exception 2. UnChecked Exception

# A.Built In Exception # 

-> Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

# Checked Exceptions(This Exception Find In Compile Time) # 
Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.

-> List Of Checked Exceptions :-

1. ClassNotFoundException
2. InterruptedException
3. IOException
4. InstantiationException
5. SQLException
6. FileNotFoundException

Unchecked Exceptions(This Exception Find In Run Time) :- 
The unchecked exceptions are just opposite to the checked exceptions.The compiler will not check these exceptions at compile time.
In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.

-> List Of UnChecked Exceptions :-

1. ArthmeticException
2. ClassCastExcetion
3. NullPointerException
4. ArraylNdexOutOfBoundsException
5. ArrayStoreException
6. IllegalThreadStateException


# User Define Exception # 

-> Sometimes, the built-in exceptions in Java are not able to describe a certain situation.
   In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’. 
 */
