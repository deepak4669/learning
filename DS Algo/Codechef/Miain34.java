import java.util.Scanner;
import java.util.Stack;
public class Miain34
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int[] array=new int[n];
      for(int j=0;j<n;j++)
        array[j]=sc.nextInt();
      res[i]=result(array);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static int result(int[] array)
  {
    int n=array.length;
    int d=number(array);
    System.out.println(d);
    for(int i=n-1;i>=1;i--)
    {
      //int a=number(array);
      int t=array[i];
      array[i]=array[i-1];
      array[i-1]=t;
      int b=number(array);
      System.out.println(b);
      if(b>d){
        ;
      int r=array[i];
      array[i]=array[i-1];
      array[i-1]=r;
    }
    return -1;
  }
  public static int number(int[] a)
  {
    int k=0;
    for(int i=0;i<a.length;i++)
      k=((k*10)+a[i]);
    return k;
  }
}
  
      
      
      