import java.io.*;
import java.util.*;

public class Statistic{

public Statistic()throws FileNotFoundException{
}

Scanner input = new Scanner(new File("statistic.txt"));
ArrayList<String> stats = new ArrayList<String>();

   public void statistic(){
   
    int count =0;
    int numall =0;
    int countclean=0;
    int countmaximus=0;

    while(input.hasNext()){

    String foo = input.next();
    stats.add(foo);

      String foo1 = input.next();
      if(foo1.equals("clean")){
        countclean++;
      }else if(foo1.equals("maximus")){
        countmaximus++;
      }

      int num = input.nextInt();
      numall = numall + num;
      count++;
    }

    Set<String> unique = new HashSet<String>(stats);
    for (String key : unique) {
      System.out.println(key + ": " + Collections.frequency(stats, key));
    }
      System.out.println();
      System.out.println("average price:\t"+numall/count);
      System.out.println("Clean:\t\t\t"+countclean);
      System.out.println("Maximus:\t\t\t"+countmaximus);
}


}