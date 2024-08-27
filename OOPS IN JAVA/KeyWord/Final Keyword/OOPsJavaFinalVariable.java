// Java Final KeyWord
// The final keyword in java is used to restrict the user. Java final keyword can be used with the following.
// 1.Variable
// 2.Method(Function)
// 3.Class

// 1. Final Variable -> Stop Value Change
// 2. Final Method -> Prevent Method Overriding
// 3. Final Class -> Prevent Inheritance

// 1. Java Final variable
// NOTE: once the variable is declared as final then its value can not be changed.

// Creating Class
class Audi {

  // Creating Final Variable
  final int SpeedLimit = 80;

  // Crating Class Print Function
  void run() {
    SpeedLimit = 100;
    System.out.println(SpeedLimit);
  }
}

public class OOPsJavaFinalVariable {

  public static void main(String[] args) {
    // Creating Class Object
    Audi MyCar = new Audi();
    MyCar.run();
  }
}
// NOTE : This Program Error Because final Variable Can not Be Change.
