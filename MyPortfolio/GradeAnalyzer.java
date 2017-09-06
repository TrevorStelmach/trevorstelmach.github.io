//This program analyzes grades stored in an Array List and can return the highest, lowest, and average grades.
import java.util.ArrayList;

public class GradeAnalyzer{
  
  public GradeAnalyzer(){
    
  }
  
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1){
      System.out.println("Error! The ArrayList is empty.");
      return 0;
    }
    else{
      int sum = 0;
      for(int grade: grades){
        sum += grade;
      }
      int average = sum / grades.size();
      System.out.println("The average grade is: " + average);
      return average;
    }
  }
  
  public int lowestGrade(ArrayList<Integer> list){
    int lowest = list.get(0);
    for(int grade: list){
      if (lowest > grade){
        lowest = grade;
      }
    }
    System.out.println("The lowest grade is: " + lowest);
    return lowest;
  }
  
  public int highestGrade(ArrayList<Integer> list){
    int highest = list.get(0);
    for(int grade: list){
      if (highest < grade){
        highest = grade;
      }
    }
    System.out.println("The highest grade is: " + highest);
    return highest;
  }
  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.lowestGrade(myClassroom);
    myAnalyzer.highestGrade(myClassroom);
  }
}