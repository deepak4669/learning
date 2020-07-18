import java.util.*;
import java.io.*;
//267630EY
public class EULER59
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    Vector<Integer> v=new Vector<Integer>();
    boolean flag=false;
    for(int i=0;i<s.length()-2;i++)
    {
      if(s.charAt(i)==',') continue;
      else
      {
        if(s.charAt(i+1)==',')
        {
          v.add(Integer.parseInt(s.substring(i,i+1)));
          i+=1;
        }
        else if(s.charAt(i+2)==',')
        {
          v.add(Integer.parseInt(s.substring(i,i+2)));
          i+=2;
        }
        else
          v.add(Integer.parseInt(s.substring(i,i+2)));
      }
    }
    v.add(Integer.parseInt(s.substring(s.length()-2,s.length())));
    System.out.println(v.size());
    for(int i=0;i<v.size();i++)
      System.out.println(v.elementAt(i));
    
    int ans=0;
    
    for(int x=97;x<=122;x++)
    {
      for(int y=97;y<=122;y++)
      {
        for(int z=97;z<=122;z++)
        {
          HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
          for(int i=0;i<v.size();i+=3)
          {
            int p=x^v.elementAt(i);
            if(map.containsKey(p))
              map.put(p,map.get(p)+1);
            else
              map.put(p,1);
          }
          for(int i=1;i<v.size();i+=3)
          {
            int p=x^v.elementAt(i);
            if(map.containsKey(p))
              map.put(p,map.get(p)+1);
            else
              map.put(p,1);
          }
          for(int i=2;i<v.size();i+=3)
          {
            int p=x^v.elementAt(i);
            if(map.containsKey(p))
              map.put(p,map.get(p)+1);
            else
              map.put(p,1);
          }
          int max=0;
          int maxId=0;
          for(Integer p:map.keySet())
          {
            if(map.get(p)>max)
            {
              max=map.get(p);
              maxId=p;
            }
          }
          if(maxId==32)
          {
            for(Integer p:map.keySet())
            {
              ans+=p*map.get(p);
            }
            flag=true;
            break;
          }
        }
        if(flag) break;
      }
      if(flag) break;
    }
    out.println(ans);
    out.flush();
              
              
                
      
    
    
    
   
    
    
    
    
  }
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
        {
      br=new BufferedReader(new InputStreamReader(is));
    }
        public int nextInt() throws IOException
        {
          if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
          tk=new StringTokenizer(br.readLine());
          return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
              return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
          if(tk.hasMoreTokens())
            return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
          tk=new StringTokenizer("");
          return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
              return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
              return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
          long a[]=new long[n];
            for(int i=0;i<n;i++)
              a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
          int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
          long a[]=new long[n+1];
          for(int i=1;i<=n;i++)
                a[i]=nextLong();
          return a;
        }
  }
}

