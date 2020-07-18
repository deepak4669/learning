import java.util.*;
public class EULER51
{
  static int N=1000000;
  static boolean prime[];
  static Vector<Integer> primes=new Vector<Integer>();
  static void sieve()
  {
    prime=new boolean[N+1];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(N);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=N;j+=i)
        {
          prime[j]=false;
        }
      }
    }
    for(int i=1;i<=N;i++)
    {
      if(prime[i]&&(contains(i,0)||contains(i,1)||contains(i,2)))
      {
        primes.add(i);
      }
    }
  }
  static boolean contains(int p,int q)
  {
    String s=""+p;
    String t=q+"";
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==t.charAt(0))
        return true;
    }
    return false;
  }
  static boolean check(int n)
  {
    String s=n+"";
      
    int[] a=new int[s.length()];
   
    for(int i=0;i<s.length();i++)
    {
      a[i]=Integer.parseInt(s.substring(i,i+1));
      
    }
    /*
    for(int i=0;i<s.length();i++)
      System.out.print(a[i]);
    System.out.println();
    */
    if(contains(n,0))
    {
      //System.out.println(0);
      int x=is(a,0,1)+is(a,0,2)+is(a,0,3)+is(a,0,4)+is(a,0,5)+is(a,0,6)+is(a,0,7)+is(a,0,8)+is(a,0,9);
      //System.out.println(x);
      if(x>=7)
        return true;
    }
    if(contains(n,1))
    {
      //System.out.println(1);
      int x=is(a,1,2)+is(a,1,3)+is(a,1,4)+is(a,1,5)+is(a,1,6)+is(a,1,7)+is(a,1,8)+is(a,1,9);//+is(a,1,0);
      //System.out.println(x);
      if(x>=7) return true;
    }
    if(contains(n,2))
    {
      //System.out.println(2);
      int x=is(a,2,3)+is(a,2,4)+is(a,2,5)+is(a,2,6)+is(a,2,7)+is(a,2,8)+is(a,2,9);//+is(a,2,1)+is(a,2,0);
      if(x>=7)
        return true;
    }
    return false;
  }
  static int is(int[] a,int r,int y)
  {
    //System.out.println(a.toString());
    int[] b=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
      //System.out.print(a[i]+"");
      b[i]=a[i];
      if(a[i]==r)
        b[i]=y;
    }
    //System.out.println();
    int number=0;
    int t=1;
    for(int i=a.length-1;i>=0;i--)
    {
      number+=b[i]*t;
      t*=10;
      
    }
    if(prime[number])
      return 1;
    else
      return 0;
  }
    
      
      
         
        
    
  
  public static void main(String[] args)
  {
    sieve();
    int ans=-1;
    
    for(int j:primes)
    {
      //System.out.println(j+"n0");
      if(check(j))
      {
        //System.out.println(j+"no ");
        ans=j;
        break;
      }
    }
    
    //System.out.println
    System.out.println(ans);
  }
}
    