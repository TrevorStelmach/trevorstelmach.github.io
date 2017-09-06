// This program creates a droid, and provides many functions for the droid to perform.
public class Droid{
  
  int batteryLevel;
  
  public Droid(){
    batteryLevel = 100;
  }
  
  void activate(){
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
  void chargeBattery(int hours){
    System.out.println("Droid charging...");
    batteryLevel = batteryLevel + hours;
    
    if(batteryLevel > 100){
      batteryLevel = 100;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
    else{
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }
  
  int checkBatteryLevel(){
    System.out.println("Battery level is: " + batteryLevel + " percent.");
    return batteryLevel;
  }
  
  void hover(int feet){
    if(feet > 2){
      System.out.println("Error! I cannot hover above 2 feet.");
    }
    else{
      System.out.println("Hovering...");
      batteryLevel -= 20;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }
  
  public static void main(String[] args){
    Droid droid = new Droid();
    droid.activate();
    droid.chargeBattery(5);
    droid.hover(2);
  }
}