import java.io.*;
import java.util.*;

public class Customer{

   String name;
   int credit;

   public Customer(String name, int credit){
      this.name=name;
      this.credit=credit;
   }

   public void setName(String name){
      this.name=name;
   }
   
   public String getName(){
      return name;
   }

   public void addCredit(int credit){
      this.credit=this.credit + credit;
   }
   
   public void deductCredit(int credit){
      this.credit=this.credit - credit;
   }

   public int getCredit(){
      return credit;
   }
}