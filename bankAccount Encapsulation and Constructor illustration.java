
package main;

/**
 *
 * @author Abdur-Rahmaan Janhangeer
 * subject : Encapsulation and Constructor illustration
 * output and some explanations included at the end
 */
class bankAccount {
   
     public String bankName = "Bank of Unidentified Something";
     private double balance = 100.0;
     private String name;
     
     bankAccount(){
     this.name="no name";
     System.out.println("Bank name : "+bankName);
     System.out.println("Dealing with Mr. : "+name);
     }
     bankAccount(String n){
     this.name=n;
     System.out.println("Bank name : "+bankName);
     System.out.println("Dealing with Mr. "+name);
     }
     //constructor part end
     
     public void getBalance (){
         System.out.println("The balance is : "+balance);
         
    }//getBalance end
     
     public void setBalance(double s){
         System.out.println("Your input : " + s);
     this.balance = balance + s;
     if(balance <= 0){
         System.out.println("You owe : "+ (s - balance)+", to the bank");
         balance = 0;
     }
     System.out.println("The balance is now : "+balance);
     
     }//setBalance end 
     
     public void setName(String n){
     this.name = n;
     
     }//setName end
    
     public void getName(){
     System.out.print(name);
     
     }//getName end
}
public class Javacode {

 
    public static void main(String[] args) {
        
      bankAccount user1 = new bankAccount("ARJ");
      user1.getBalance();
      user1.setBalance(-200);
       
        
    }//args end
    
}

/**
 * output with NetBeans IDE 8.1 :
 * 
 *Bank name : Bank of Unidentified Something
 *Dealing with Mr. ARJ
 *The balance is : 100.0
 *Your input : -200.0
 *You owe : -100.0, to the bank
 *The balance is now : 0.0
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */

/**
 * lines 16-25: constructors being defined.
 * if the name is not included, the name is set to no name
 * 
 * line 27: method for printing out the balance
 * 
 * line 32: method to make a deposit or withdrawal. 
 * Positive numbers are used to denote deposits while negative numbers denote withdrawal
 * 
 * line 43: method to set the name
 * 
 * line 48: method to print the name
 * 
 * line 58: A new object of type bankAccount is being instantiated with name ARJ
 * 
 * line 59: The method to print the balance is called
 * 
 * line 60: A withdrawal is made
 */
