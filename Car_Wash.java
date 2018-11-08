import java.io.*;
import java.util.*;

public class Car_Wash{



public static void main(String[] args)throws FileNotFoundException, InterruptedException{


    Scanner input = new Scanner(new File("users.txt"));
    ArrayList<Customer> listOfUsers = new ArrayList<Customer>();  
    
    while(input.hasNext()){
      String foo = input.next();
      int foo1 = input.nextInt();
      
      listOfUsers.add(new Customer(foo,foo1));
    }

   

   while (2 != 1){
   
    PrintStream output = new PrintStream("users.txt");
   for(Customer d : listOfUsers){
      output.println(d.getName() + " " + d.getCredit());
   }
   
   
   Menu menu = new Menu();
   menu.entryMenu(listOfUsers);
      
   }

}

}