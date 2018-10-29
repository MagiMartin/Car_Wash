import java.io.*;
import java.util.*;

public class WashCard{

   public void recharge(String name, int credit, ArrayList<Customer> listOfUsers){
   
      for(Customer d : listOfUsers){
        if(d.getName() != null && d.getName().contains(name)){
           d.addCredit(credit);         
         }
      }
   }

   public void deduct(String name, int credit, ArrayList<Customer> listOfUsers){
   
      for(Customer d : listOfUsers){
        if(d.getName() != null && d.getName().contains(name)){
           d.deductCredit(credit);      
         }
      }
   }

   public void balance(String name, ArrayList<Customer> listOfUsers){
   
      for(Customer d : listOfUsers){
        if(d.getName() != null && d.getName().contains(name)){  
           System.out.println(d.getCredit());        
         }
      }
   }

   public void createUser(String name,int credit, ArrayList<Customer> listOfUsers){
      
      listOfUsers.add(new Customer(name,credit));
      
   }

}