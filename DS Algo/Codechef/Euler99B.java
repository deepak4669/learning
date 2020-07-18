import java.util.*;
import java.io.*;
import java.lang.*;

public class Euler99B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=1000;
    double max=0.0;
    int index=0;
    
    for(int i=0;i<n;i++)
    {
//      System.out.println(i);
      String s=sc.next();
      
      String[] numbers=s.split(",");
      int a=Integer.parseInt(numbers[0]);
      int b=Integer.parseInt(numbers[1]);
      double curr=b*(double)Math.log(a);
      if(curr>max)
      {
        max=curr;
        index=i+1;
      }
    }
    System.out.println(index);
  }
}
      