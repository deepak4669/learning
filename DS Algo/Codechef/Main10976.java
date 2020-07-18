import java.util.Scanner;
import java.util.Vector;
public class Main10976
{
  public static void main(String[] args)
  {
   
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt())
    {
      int k=sc.nextInt();
      int count=0;
      Vector<Integer> x=new Vector<Integer>();
      Vector<Integer> y=new Vector<Integer>();
      
      
      for(int i=k+1;i<=2*k;i++)
      {
        if((i*k)%(i-k)==0)
        {
          x.add((i*k)/(i-k));
          y.add(i);
          count++;
          
        }
      }
      System.out.println(count);
      for(int i=0;i<count;i++)
      {
        System.out.println("1/"+k+" = 1/"+x.elementAt(i)+" + 1/"+y.elementAt(i));
      }
    }
  }
}
        
      
      
  