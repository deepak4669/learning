public class EASYPROB
{
  public static void main(String[] args)
  {
    int n=16385;
    System.out.println(solve(n));
  }
  public static String solve(int n)
  {
    if(n==0) return "";
    else if(n==1) return "2(0)";
    else if(n==2) return "2";
    else
    {
      if(n%2!=0) {String s=solve(n-1);
        String r=solve(1);
        return s+"+"+r;
      }
      else{
        int k=isPower(n);
        if(n-Math.pow(2,k)==0) return "2("+solve(k)+")";
        else
          
        return "2("+solve(k)+")"+"+"+solve(n-(int)Math.pow(2,k));
      }
    }
  }
  public static int isPower(int n)
  {
    int count=0;
    while(n>1)
    {
      //if(n%2!=0) return -1;
      //else{
        n/=2;
        count++;
      
    }
    return count;
  }
}
    
