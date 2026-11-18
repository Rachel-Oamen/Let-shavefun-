import java.util.Scanner;
public class TaskOne{
  public static void main(String[]args){
    Scanner inputscore = new Scanner(System.in);
    
    int total = 0;
    int scorecounter = 1;
for(scorecounter=1; scorecounter<=10; scorecounter++){
  System.out.print("Kindly enter a score: ");
  int score = inputscore.nextInt();

   total+= score;
}
System.out.printf("%s%d%n","the sum is:",total);
  }
}
  
