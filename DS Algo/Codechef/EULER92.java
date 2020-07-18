import java.util.Scanner;
public class EULER92
{
  //static int p,q,r;
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      long ans=-1;
      //a=new int[n+1];
      for(int i=1;i<n;i++)
      {
        long value=find(i,n);
        if(value!=-1)
        {
          if(value>ans) ans=value;
        }
      }
      System.out.println(ans);
      //System.out.println(p+""+q+""+r);
    }
  }
  public static long find(int a,int n)
  {
    int lo=a;
    int hi=n;
    while(lo<=hi)
    {
      int mid=(lo+hi)/2;
      int c=n-a-mid;
      if(a*a+mid*mid>c*c){
        hi=mid-1;
      }
      else if(mid*mid+a*a<c*c)
      {
        lo=mid+1;
      }
      else{
       
        //p=a;
        //q=mid;
        //r=c;
        return mid*a*c;
      }
    }
    return -1;
  }
}
        
        