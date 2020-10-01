import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     // create a scanner for user input
Scanner input = new Scanner(System.in); 
    // ask the user if the animal has feathers
 System.out.println("Does the animal have feathers?");
 String featherAnswer = input.nextLine();


 // check to see the feather status
 if(featherAnswer.equals("yes")){
//see if the animal can swim
System.out.println("Can the animal swim? (yes/no)");
String swimAnswer = input.nextLine();
if(swimAnswer.equals("yes")){

}
System.out.println("This is a duck");
 } else
// check to see the feather status
 if(featherAnswer.equals("no")){
//see if the animal can swim
System.out.println("Does the animal have legs? (yes/no)");
String legsAnswer = input.nextLine();
if(legsAnswer.equals("yes")){
System.out.println("This is a lizard");
 }
 }
  }
}
