import java.util.*;
public class EULER60
{
  static int n=1000000;
  static boolean marked[];
  static Vector<Integer> prime;
  public static void sieve()
  {
    marked=new boolean[n+1];
    prime=new Vector<Integer>();
    Arrays.fill(marked,true);
    marked[0]=false;
    marked[1]=false;
    int m=(int)Math.sqrt(n);
    for(int i=2;i<=m;i++)
    {
      if(marked[i])
      {
        
        for(int j=i*i;j<=n;j+=i)
        {
          marked[j]=false;
        }
      }
    }
    for(int i=1;i<=n;i++)
    {
      if(marked[i])
        prime.add(i);
    }
      
  }
  public static void main(String[] args)
  {
    sieve();
    System.out.println(prime.size());
    Vector<Integer> sol=new Vector<Integer>();
    Vector<Integer> sol2=new Vector<Integer>();
    for(int i:prime)
    {
      String s=i+"";
      Vector<Integer> prefix=new Vector<Integer>();
      Vector<Integer> suffix=new Vector<Integer>();
      for(int j:prime)
      {
        
        String t=j+"";
        if(t.length()>=s.length()&&!s.equals(t))
        {
          if(t.substring(0,s.length()).equals(s))
          {
            if(marked[Integer.parseInt(t.substring(s.length(),t.length()))])
              prefix.add(Integer.parseInt(t.substring(s.length(),t.length())));
          }
          else if(t.substring(t.length()-s.length()).equals(s))
          {
            if(marked[Integer.parseInt(t.substring(0,t.length()-s.length()))])
              suffix.add(Integer.parseInt(t.substring(0,t.length()-s.length())));
          }
        }
      }
      if(prefix.size()==4&&suffix.size()==4)
      {
        boolean flag=true;
        Collections.sort(prefix);
        Collections.sort(suffix);
        for(int j=0;j<4;j++)          
        {
          if(prefix.elementAt(j)!=suffix.elementAt(j))
          {
            flag=false;
            break;
          }
        }
        
        if(flag)
        {
          boolean flag2=true;
          sol=new Vector<Integer>();
          for(int j:prefix)
          {
            sol.add(j);
          }
          sol.add(i);
          for(int k=0;k<5;k++)
          {
            for(int j=k+1;j<5;j++)
            {
              String st=sol.elementAt(k)+""+sol.elementAt(j);
              String tt=sol.elementAt(j)+""+sol.elementAt(k);
              if(marked[Integer.parseInt(st)]&&marked[Integer.parseInt(tt)])
                continue;//System.out.println("P");
              else
                flag2=false;//System.out.println("OOOOO");
            }
          }
          if(flag2)
          break;
          else
            sol=new Vector<Integer>();
        }
          
          
      }
    }
    int ans=0;
    for(int j:sol)
    {
      ans+=j;
      System.out.println(j);
    }
    
    
    
    //for(int k:sol2)
    //{
    //  System.out.println(k);
    //}
    
    
    System.out.println(ans);
  
    
      
          
        
        
            
            
          
            
  }
}
  
  