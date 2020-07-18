import java.util.Scanner;
public class Main279B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max=0;
    int time=t;
    int lo=0;
    //int count=0;
    for(int i=0;i<n;i++)
    {
      time-=a[i];
      if(time<0)
      {
        while(time<0)
        {
          time+=a[lo];
          lo++;
        }
        //lo--;
      }
      if(i-lo+1>max) max=i-lo+1;
    }
    //if(count>max) max=count;
    System.out.println(max);
  }
}
      
        
      
      
    