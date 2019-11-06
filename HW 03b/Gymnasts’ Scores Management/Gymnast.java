import java.util.ArrayList;
public class Gymnast{
   private String firstName;
   private String lastName;
   private ArrayList<Double> scores;
   
   Gymnast(){
      firstName = "John";
      lastName = "Doe";
      scores = new ArrayList<Double>();
   }// end no-arg constructor
   
   Gymnast(String firstName, String lastName, ArrayList<Double> scores){
      this.firstName = firstName;
      this.lastName = lastName;
      this.scores = scores;
   }// end constructor
   
   public String getFirstName(){
      return firstName;
   }// end getter
   
   public void setFirstName(String FirstName){
      this.firstName = FirstName;
   }// end setter
   
   public String getLastName(){
      return lastName;
   }// end getter
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }// end setter
   
   public ArrayList<Double> getScores(){
      return scores;
   }// end getter
   
   public void setScores(ArrayList<Double> scores){
      this.scores = scores;
   }// end setter
   
   public void addScore(double score){
      scores.add(score);
   }// end addScore
   
   /*public calculateTotalScore(){
      
   }// end calculateTotalScore */
   
   public String display(){
      return "Name: " + firstName + " " + lastName + "\nScore1: " + scores.get(0);
   }// end display

}// end class