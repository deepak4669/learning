import java.util.Scanner;
import java.util.HashMap;
public class EULER14
{
  static long[] dp;
  static long[] dp2;
  static HashMap<Long,Long> map=new HashMap<Long,Long>();
  public static void main(String[] args)
  {
    dp2=new long[5000001];
    dp=new long[5000001];
    Scanner sc=new Scanner(System.in);
    preprocess();
    int t=sc.nextInt();
    while(t-->0)
    {      
      int n=sc.nextInt();
      System.out.println(dp[n]);
    }
  }
  public static void preprocess()
  {
   //for(int i=1;i<=500000;i++)
    //{
    //  dp2[i]=count(i);
    //}     
    dp[1]=1;
    for(int i=2;i<=500000;i++)
    {
      long value=count(i);
      if(value>=count(dp[i-1]))
        dp[i]=i;
      else
        dp[i]=dp[i-1];
    }
  }
      
        
  public static long count(long a)
  {
    if(a==1) return 1;
    else if(a==2) return 2;
    else if(map.containsKey(a)) return map.get(a);
    else{
    
    long ans;
    if(a%2==0){
      ans=1+count(a/2);
    }
    else{
      ans=1+count(3*a+1);
    }
    map.put(a,ans);
    return ans;
    }
  }
  
}

