import java.util.Scanner;
public class TaskThree{
  public static void main(String[]args){
    Scanner inputscore = new Scanner(System.in);
    
   
    double average = 1;
    int total = 1;
    int scorecounter = 1;
for(scorecounter=1; scorecounter<=10; scorecounter++){
  System.out.print("Kindly enter a score: ");
  int score = inputscore.nextInt();
  
    total+= score;
    average = (double)total/scorecounter;

}
System.out.printf("%s%d%n","the sum is:",total);
System.out.printf("%s%f%n","the average  is:",average);
  }
}
