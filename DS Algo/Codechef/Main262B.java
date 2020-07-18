import java.util.Scanner;
public class Main262B{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    int neg=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]<0) neg++;
    }
    if(neg==0)
    {
      if(k%2==0)
      {
        int ans=0;
        for(int i=0;i<n;i++)
          ans+=a[i];
        System.out.println(ans);
      }
      else
      {
        int ans=-a[0];
        for(int i=1;i<n;i++)
          ans+=a[i];
        System.out.println(ans);
      }
    }
    else
    {
      if(neg==k)
      {
        int sum=0;
        for(int i=0;i<n;i++)
          sum+=Math.abs(a[i]);
        System.out.println(sum);
      }
      else if(neg>k)
      {
        int sum=0;
        for(int i=0;i<k;i++)
          sum+=Math.abs(a[i]);
        for(int i=k;i<n;i++)
          sum+=(a[i]);
        System.out.println(sum);
      }
      else if(neg<k)
      {
        if((k-neg)%2==0)
        {
          int sum=0;
          for(int i=0;i<n;i++)
            sum+=Math.abs(a[i]);
          System.out.println(sum);
        }
        else
        {
          int min=min(a);
          int sum=0;
          for(int i=0;i<n;i++)
          {
            if(i==min) continue;
            sum+=Math.abs(a[i]);
          }
          sum=sum+(-Math.abs(a[min]));
          System.out.println(sum);
          
          
          
        }
      }
    }
  }
  public static int min(int[] a)
  {
    int min=0;
    for(int i=0;i<a.length;i++)
    {
      if(Math.abs(a[i])<Math.abs(a[min])) min=i;
    }
    return min;
    
    
  }
}
          
        
        
                      
  