// This program computes simple mathematical functions(add, subtract, multiply, divide, modulo)
public class Calculator{
  
    static Calculator myCalculator = new Calculator();
    public Calculator(){
      
    }
    public int add(int a, int b){
      return a + b;
    }
    
    public int subtract(int a, int b){
      return a - b;
    }
    
    public int multiply(int a, int b){
      return a * b;
    }
    
    public int divide(int a, int b){
      if (b == 0){
      	System.out.println("Error! Dividing by 0 is not allowed");
        return 0;
      }
      else
      	return a / b;
    }
    
    public int modulo(int a, int b){
      if (b == 0){
        System.out.println("Error! Dividing by 0 is not allowed");
        return 0;
      }
      else {
        return a % b;
      }
    }
    public static void main(String[] args){
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
  }
