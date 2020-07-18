public class Euler72
{
  public static void main(String[] args)
  {
    int n=1000000;
    int[] count=new int[n+1];
    count[0]=0;
    count[1]=1;
    long ans=0;
    for(int i=2;i<=n;i++)
    {
      count[i]=totient(i);
      ans+=count[i];
//      System.out.println(count[i]);
      
    }
    System.out.println(ans);
  }
  public static int totient(int n)
  {
    int result=n;
    for(int i=2;i*i<=n;i++)
    {
      if(n%i==0)
      {
        while(n%i==0)
          n/=i;
        result-=result/i;
      }
    }
    if(n>1)
      result-=result/n;
    return result;
  }
}
        
    
    