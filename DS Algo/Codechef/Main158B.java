import java.util.Scanner;
import java.util.Arrays;
public class Main158B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    Arrays.sort(a);
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]>=3) count++;
      else
      {
        int sum=0;
        int k=i;
        while((sum+a[k])<=4)
        {
          sum+=a[k++];
        }
        count++;
        i=k-1;
      }
    }
    System.out.println(count);
  }
}
    
          