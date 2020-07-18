import java.util.Scanner;
public class Main24
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
      {
        array[j]=sc.nextInt();
      }
      res[i]=ans(array);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static int ans(int[] array)
  {
    int k=0;
    while(!isEqual(array))
    {
      int i=max(array);
      
      for(int j=0;j<array.length;j++)
      {
        if(j!=i) array[j]++;
      }
      
      k++;
    }
    return k;
  }
  public static boolean isEqual(int[] array)
  {
    for(int i=0;i<(array.length-1);i++)
    {
      if(array[i]!=array[i+1]) return false;
    }
    return true;
  }
  public static int max(int[] array)
  {
    int max=0;
    for(int i=0;i<array.length;i++)
    {
      if(array[i]>array[max])
        max=i;
    }
    return max;
  }
}
  
      