//This program is a Library tool that prints out the books that are read, and unread in the Library HashSet
import java.util.HashMap;

public class Library{
  
  public Library(){
    
  }
  
  void getFinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1){
      System.out.println("Error! HashMap is empty.");
    }
    else {
      System.out.println("Finished books: ");
      for(String book: library.keySet()){
        if(library.get(book) == true){
          System.out.println(book);
        }
      }
    }
  }
  
  void getUnfinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1){
      System.out.println("Error! HashMap is empty.");
    }
    else {
      System.out.println("Unfinished books:");
      for(String book: library.keySet()){
        if(library.get(book) == false){
          System.out.println(book);
        }
      }
    }
  }
  
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}