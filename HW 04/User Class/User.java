import java.util.*;
public class User{
  private String firstName;
  private String lastName;
  private int age;
  private String userID;
  private String phoneNum;
  
  User(){
    firstName = "";
    lastName = "";
    age = 21;
    userID = "";
    phoneNum = "";
  }// end no-arg constructor
  
  User(String firstName, String lastName, int age, String userID, String phoneNum){
    if(age < 0 || age > 99){
      throw ArithmeticExpression("Age must be between 0 and 99.");
    }
    if(userID.length < 8 //add at least one number here){
      throw ArithmeticExpression("Invalid user ID.");
    }
    if(phoneNum.length > 10){
      throw ArithmeticExpression("Phone number cannot be longer than 10 digits.");
    }
  }// end constructor
  
  public String getFirstName(){
    return firstName;
  }// end getter
  
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }// end setter
  
  public String getLastName(){
    return lastName;
  }// end getter
  
  public void setLastName(String lastName){
    this.lastName = lastName;
  }// end setter
  
  public int getAge(){
  if(age < 0 || age > 99){
      throw ArithmeticExpression("Age must be between 0 and 99.");
    }
    return age;
  }// end getter
  
  public void setAge(int age){
  if(age < 0 || age > 99){
      throw ArithmeticExpression("Age must be between 0 and 99.");
    }
    this.age = age;
  }// end setter
  
  public String getUserID(){
  if(userID.length < 8 //add at least one number here){
      throw ArithmeticExpression("Invalid user ID.");
    }
    return userID;
  }// end getter
  
  public void setUserID(String userID){
  if(userID.length < 8 //add at least one number here){
      throw ArithmeticExpression("Invalid user ID.");
    }
    this.userID = userID;
  }// end setter
  
  public String getPhoneNum(){
  if(phoneNum.length > 10){
      throw ArithmeticExpression("Phone number cannot be longer than 10 digits.");
    }
    return phoneNum;
  }// end getter
  
  public void setPhoneNum(String phoneNum){
  if(phoneNum.length > 10){
      throw ArithmeticExpression("Phone number cannot be longer than 10 digits.");
    }
    this.phoneNum = phoneNum;
  }// end setter
  
  public boolean isValidUserID(Sting userID){
  if(userID.length < 8 //add at least one number here){
      return true;
    }else{
    throw ArithmeticExpression("Invalid user ID.");
    return false;
    }
  }// end isValidUserID
  
  public void deconstructPhone(){
    //fix this
  }// end deconstructPhone
  
  public String display()[
    return "Name: " + firstName + " " + lastName +
    "\nAge: " + age + "\nUserID: " + userID +
    "\nPhone Number: " + phoneNum +
    "\nArea Code: " + "" +
    "\nPhone: " + phonenum + "\n";
  }// end display
  
  public static void main(String args[]){
    User user1 = new User();
    user1.setFirstName("Sarah");
    user1.setLastName("Holt");
    user1.setUserID("sarahholt26!");
    user1.setPhoneNum("9548926728");
    System.out.println(user1.display());
    User user2 = new User("Kevin", "James", 25, "kjames2552", "8019023100");
    System.out.println(user2.display());
    User user2 = new User("Dante", "Couto", 25, "dantetezza", "95000");
    System.out.println(user3.display());
  }// end main
  
}// end class