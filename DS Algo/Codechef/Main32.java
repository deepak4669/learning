import java.util.Scanner;
import java.util.Arrays;
public class Main32
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[] res=new String[t];
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[] array=new int[b];
      for(int j=0;j<b;j++)
        array[j]=sc.nextInt();
      res[i]=ans(array,a);
    }
    for(int i=0;i<t;i++)
    {
      System.out.print("Scenario #");
      System.out.print(i+1);
      System.out.println(":");
      
      System.out.println(res[i]);
    }
  }
  public static String ans(int[] array,int a)
  {
    int sum=0;
    for(int i=0;i<array.length;i++)
    {
      sum+=array[i];
    }
    if(sum<a) return "impossible";
    int i=0;
    int j=array.length-1;
    sum=0;
    Arrays.sort(array);
    while(sum<a)
    {
      sum+=array[j--];
      i++;
    }
    return String.valueOf(i);
  }
}
      
        