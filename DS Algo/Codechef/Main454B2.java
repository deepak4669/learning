import java.util.Scanner;
public class Main454B2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int maxid=0;
    int maxid2=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]>a[maxid]) maxid=i;
      if(a[i]>=a[maxid2]) maxid2=i;
    }
    boolean flag=true;
    int ans=0;
    //System.out.println(maxid+" "+maxid2);
    if(maxid==maxid2)
    {
      if(maxid==0)
      {
        //System.out.println("f");
        for(int i=maxid+1;i<n-1;i++)
        {
          if(a[i]>a[i+1])
          {
          //  System.out.println("f");
            flag=false;
            break;
          }
        }
        if(flag)
          ans=n-1;
      }
      else if(maxid==n-1)
      {
        for(int i=0;i<n-1;i++)
        {
          if(a[i+1]<a[i])
          {
            flag=false;
            break;
          }
        }
        if(flag) ans=0;
      }
      else
      {
        for(int i=maxid+1;i<n-1;i++)
        {
          if(a[i]>a[i+1])
          {
            flag=false;
            break;
          }
        }
        if(a[n-1]<a[0])
        {
          for(int i=0;i<maxid;i++)
          {
            if(a[i]>a[i+1])
            {
              flag=false;
              break;
            }
          }
          if(flag) ans=(n-1)-maxid;
        }
        else
        {
          flag=false;
        }
      }
    }
    else if(maxid==0&&maxid2==n-1)
    {
      for(int i=1;i<maxid2;i++)
      {
        if(a[i+1]<a[i])
        {
          flag=false;
          break;
        }
      }
      if(flag)
        ans=(n-1)-0;
    }
    else 
    {
      for(int i=maxid2+1;i<n-1;i++)
      {
        if(a[i+1]<a[i])
        {
          flag=false;
          break;
        }
      }
      if(a[n-1]<=a[0])
      {
        for(int i=0;i<maxid;i++)
        {
          if(a[i]>a[i+1])
          {
            flag=false;
            break;
          }
        }
        if(flag)
        {
          ans=n-1-maxid2;
        }
      }
      else
        flag=false;
    }
    if(!flag)
    {
      System.out.println(-1);
    }
    else
      System.out.println(ans);
  }
}
      
             
        
    
    
  