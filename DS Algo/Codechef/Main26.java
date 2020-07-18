import java.util.Scanner;
public class Main26
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int res[]=new int[t];
    
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      
      int[] array=new int[n];
      for(int j=0;j<n;j++)
        array[j]=sc.nextInt();
      res[i]=ans(k,array);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static int ans(int k,int[] array)
  {
    int res=0;
    for(int i=0;i<array.length;i++)
    {
      array[i]+=k;
      if(array[i]%7==0) res++;
    }
    return res;
  }
}
        
      