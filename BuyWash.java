import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class BuyWash{

public BuyWash()throws FileNotFoundException{}

   int[] washes = {100,200,400,1000};
   String[] washTypes ={"clean","Maximus","Exclusive","Ultimate"};
   
   File file = new File("statistic.txt");
   PrintStream output = new PrintStream(new FileOutputStream(file,true));
 
   Scanner input = new Scanner(System.in);

   public void wash(int type, String name, ArrayList<Customer> listOfUsers)throws FileNotFoundException{
      
      switch (type) {
         case 1:
         
            for(Customer d : listOfUsers){
               if(d.getName() != null && d.getName().contains(name)){
                  if(washes[type-1]<=d.getCredit()){
                     d.deductCredit(washes[type-1]);
                     output.println(name+" "+washTypes[type-1]+" "+washes[type-1]);
                     receipt(name, type, listOfUsers);
                  }else if (washes[type-1]>d.getCredit()){
                     System.out.println("not enough funds!");    
                  }       
               }
             }
            break;
    

         case 2:
         
            for(Customer d : listOfUsers){
               if(d.getName() != null && d.getName().contains(name)){
                  if(washes[type-1]<=d.getCredit()){
                     d.deductCredit(washes[type-1]);
                     output.println(name+" "+washTypes[type-1]+" "+washes[type-1]);
                     receipt(name, type, listOfUsers);
                }else if (washes[type-1]>d.getCredit()){
                  System.out.println("not enough funds!"); 
               
                }
              }            
            }
            break;
      case 3:
         
            for(Customer d : listOfUsers){
               if(d.getName() != null && d.getName().contains(name)){
                  if(washes[type-1]<=d.getCredit()){
                     d.deductCredit(washes[type-1]);
                     output.println(name+" "+washTypes[type-1]+" "+washes[type-1]);
                     receipt(name, type, listOfUsers);
                  }else if (washes[type-1]>d.getCredit()){
                     System.out.println("not enough funds!");    
                  }       
               }
             }
            break;
    case 4:
         
            for(Customer d : listOfUsers){
               if(d.getName() != null && d.getName().contains(name)){
                  if(washes[type-1]<=d.getCredit()){
                     d.deductCredit(washes[type-1]);
                     output.println(name+" "+washTypes[type-1]+" "+washes[type-1]);
                     receipt(name, type, listOfUsers);
                  }else if (washes[type-1]>d.getCredit()){
                     System.out.println("not enough funds!");    
                  }       
               }
             }
            break;
      }
      }
    
    public void receipt(String name,int type, ArrayList<Customer> listOfUsers)throws FileNotFoundException{
    System.out.println("Want Receipt?");
    String answer = input.next();
    
    if (answer.equals("yes")){
    File receipt = new File("receipt.txt");
    PrintStream receipt_output = new PrintStream(receipt);
       for(Customer d : listOfUsers){
          if(d.getName() != null && d.getName().contains(name)){
            receipt_output.println("username: " + name + "   " + "Type: " + washTypes[type-1] + "   " + "Price: " + washes[type-1] + "   " + "Credit left: " + d.getCredit());
            JOptionPane.showMessageDialog(null, "username: " + name + "   " + "Type: " + washTypes[type-1] + "   " + "Price: " + washes[type-1] + "   " + "Credit left: " + d.getCredit());
          }
       }
    }else if (answer.equals("no")){
      System.out.println("Returning to menu");
    }else{ 
    System.out.println("Wrong input");
    }
   }
  
}