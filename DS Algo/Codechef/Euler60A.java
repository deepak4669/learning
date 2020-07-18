import java.util.*;
public class Euler60A
{
  static boolean[] prime;
  static Vector<Integer> primes;
  static Vector<Integer> v;
  static Vector<Integer> vf;
  static void sieve()
  {
    int n=1000000;
    prime=new boolean[n+1];
    primes=new Vector<Integer>();
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    
    int m=(int)Math.sqrt(n);
    for(int i=1;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=n;j+=i)
        {
          prime[j]=false;
        }
      }
    }
    for(int i=1;i<=n;i++)
    {
      if(prime[i])
        primes.add(i);
    }
    
  }
  
  public static boolean check(Vector<Integer> g)
  {
    boolean flag=true;
    for(int i=0;i<g.size();i++)
    {
      for(int j=i+1;j<g.size();j++)
      {
        int a=Integer.parseInt(g.elementAt(i)+""+g.elementAt(j));
        int b=Integer.parseInt(g.elementAt(j)+""+g.elementAt(i));
        try{
          if(!prime[a]||!prime[b])
          flag=false;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          flag=false;
        }
      }
    }
    return flag;
  }
  public static boolean find(String a,String b)
  {
    int len=a.length();
    int upper=5-len;
    int ub=(int)Math.pow(10,upper);
    
    boolean flag=false;
    v=new Vector<Integer>();
    v.add(Integer.parseInt(a));
//    System.out.println(a);
    for(int i:primes)
    {
      if(i>=ub)
        break;
      String p=a+""+i;
      String q=i+""+a;
      if(prime[Integer.parseInt(p)]&&prime[Integer.parseInt(q)])
      {
        v.add(i);
      }
    }
    if(v.size()<5)
      flag=false;
    else
    {
      for(int i=0;i<v.size();i++)
      {
        for(int j=i+1;j<v.size();j++)
        {
          for(int k=j+1;k<v.size();k++)
          {
            for(int l=k+1;l<v.size();l++)
            {
              for(int m=l+1;m<v.size();m++)
              {
                vf=new Vector<Integer>();
                vf.add(v.elementAt(i));
                vf.add(v.elementAt(j));
                vf.add(v.elementAt(k));
                vf.add(v.elementAt(l));
                vf.add(v.elementAt(m));
                if(check(vf))
                  flag=true;
                if(flag)
                  break;
              }
              if(flag) break;
            }
            if(flag) break;
          }
          if(flag) break;
        }
        if(flag) break;
      }
                  
      
    }
    return flag;
  }
          
          
          
          
    
      
  
  public static void main(String[] args)
  {
    sieve();
    boolean flag=false;
    for(int i: primes)
    {
      String s=i+"";
      for(int j=0;j<s.length()-1;j++)
      {
        String a=s.substring(0,j+1);
        String b=s.substring(j+1,s.length());
        String c=b+""+a;
        int n_a=Integer.parseInt(a);
        int n_b=Integer.parseInt(b);
        int n_c=Integer.parseInt(c);
        
        if(prime[n_a]&&prime[n_b]&&prime[n_c])
        {
          flag=find(a,b);
        }
        if(flag)
          break;
      }
      if(flag)
        break;
    }
    if(flag)
    {
      int sum=0;
      for(int w:vf)
      {
        sum+=w;
        System.out.println(w);
      }
      System.out.println(sum);
    }
    
  }
}
    