import java.util.*;
import java.io.*;

public class Menu{

   public Menu()throws FileNotFoundException{
   }

   //attri
   private Scanner input = new Scanner(System.in);
   private String name;
   private int credit = 0;
   private String answer;
  
   //objects
   WashCard washcard = new WashCard();
   Statistic stats = new Statistic();
   BuyWash buywash = new BuyWash();
   
   //methods
   public void entryMenu(ArrayList<Customer> listOfUsers)throws FileNotFoundException, InterruptedException{
      System.out.println("Do you have a washcard?  [yes/no?]      For statistics input Employe pincode [****]");
      answer = input.nextLine(); 
   
      if(answer.equals("no") || answer.equals("NO")){
         entryUser(listOfUsers);
      }
      else if(answer.equals("yes") || answer.equals("YES")){
         System.out.println("Insert Washcard... [Type Username]");
         name = input.nextLine();
         washmenu(name,listOfUsers);
      }else if(answer.equals("1234")){
         System.out.println("Welcome Owner this is the overall statistic of the Carwash");
         stats.statistic(); 
      }
   }
     
   public void washmenu(String name,ArrayList<Customer> listOfUsers)throws FileNotFoundException, InterruptedException{
      int i = 0;
      
      for(Customer d : listOfUsers){
         if(d.getName() != null && d.getName().contains(name)){
            i=1;
         }
      }
        
      if(i==1){ 
         System.out.println("Welcome. Choose on of the following:");
         System.out.println("");
         System.out.println("[Buy Wash]       [Check Balance]     [Refill Card]     [Exit]");
        
         answer = input.nextLine();
         washes(answer,listOfUsers);
        
      }else {System.out.println("Wrong user name");
         i=0;
      }     
   }
      
   public void washes(String answer,ArrayList<Customer> listOfUsers)throws FileNotFoundException, InterruptedException{   
         
      if(answer.equals("buy wash") || answer.equals("BUY WASH")){
         System.out.println("[1] clean - 100cred     [2]  Maximus - 200cred     [3] Exclusive - 400cred     [4] Ultimate - 1000cred");
         int type=input.nextInt();
         buywash.wash(type, name, listOfUsers);
      }
      else if(answer.equals("check balance") || answer.equals("CHECK BALANCE")){
         washcard.balance(name, listOfUsers);
      }
      else if(answer.equals("refill card") || answer.equals("REFILL CARD")){
         System.out.println("how much do you want?");
         credit = input.nextInt();
            
         System.out.println("Insert credit card");
         Thread.sleep(1000);
         System.out.println(".");
         Thread.sleep(1000);
         System.out.println(".");
         Thread.sleep(1000);
         System.out.println("Thank you");
            
         washcard.recharge(name, credit, listOfUsers);      
      }
      else if(answer.equals("exit") || answer.equals("EXIT")){
         System.exit(0);
      }else{
         System.out.println("Error, Wrong Input");
      }
   }   
   //ask user for information     
   public void entryUser(ArrayList<Customer> listOfUsers)throws InterruptedException{
      System.out.println("input your username");
      name = input.nextLine();  
      
      int i=1;
      
      for(Customer d : listOfUsers){
        if(d.getName() != null && d.getName().contains(name)){  
           System.out.println("User already exists");      
           i=0; 
         }      
       }
      
      if(i==1){
      
      System.out.println("input amount of credit you want on wash card  [200-1000]");
      
      credit = input.nextInt();
      
      System.out.println("Insert credit card");
      Thread.sleep(1000);
      System.out.println(".");
      Thread.sleep(1000);
      System.out.println(".");
      Thread.sleep(1000);
      System.out.println("Thank you");
      
   
      if(credit < 1000 && credit > 200){
         washcard.createUser(name, credit, listOfUsers);
      }else{System.out.println("Wrong credit amount");
      }
      
      }
      
   }
}