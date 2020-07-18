import java.util.Scanner;
import java.util.Arrays;
public class Main990B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      b[i]=a[i]+k;
    }
    Arrays.sort(a);
    int count=0;
    for(int i=1;i<n;i++)
    {
      //boolean flag=false;
      //System.out.println(count);
      if(b[i-1]>=a[i]&&a[i]>a[i-1])
      {
        count++;
        //flag=true;
      }
      if(i<n-1&&a[i]==a[i-1])
      {
      int p=i-1;
      while(p!=n-1&&a[i-1]==a[++p]);
      if(p<n&&b[i-1]>=a[p]&&a[p]>a[i-1])
      {
        System.out.println(p-i+1);
        count+=(p-i+1);
        //i-=1;
        i=p;
      }
      
      
      }
    }
    System.out.println(count);
    System.out.println(n-count);
  }
}
      
      
        
      
      