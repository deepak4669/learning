import java.util.*;
import java.io.*;
//267630EY
public class EULER62
{
  static PrintWriter out=new PrintWriter(System.out);
  static class pair
  {
    String a;
    String b;
    public pair(String a,String b)
    {
      this.a=a;
      this.b=b;
    }
    public boolean equals(pair that)
    {
      if(that.a.equals(this.a))
        return true;
      else return false;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    
    long startTime=System.nanoTime();
    
    Scanner sc=new Scanner(System.in);
    Vector<String>[] g=(Vector<String>[]) new Vector[20];
    //String son=9223372036854775807+"";
    long con=Long.MAX_VALUE;
    long p=1;
    for(int i=0;i<20;i++)
      g[i]=new Vector<String>();
    
    while(Math.pow(p,3)<=con)
    {
      long t=(long)Math.pow(p,3);
      String s=t+"";
      char[] s_ch=s.toCharArray();
      //Arrays.sort(s_ch);
      String s2=new String(s_ch);
      g[s2.length()].add(s2);
      p++;
    }
    String ans="";
    boolean flag=false;
    
    long intermediate_time=System.nanoTime();
    
    for(int i=0;i<20;i++)
    {
      HashMap<pair,Integer> map=new HashMap<pair,Integer>();
      //System.out.print(i+":");
      for(int k=0;k<g[i].size();k++)
      {
        //System.out.print(h);
        String h=g[i].elementAt(k);
        char[] s_ch=h.toCharArray();
        Arrays.sort(s_ch);
        String s3=new String(s_ch);
        //Arrays.sort(s3);
        pair p2=new pair(s3,h);
        boolean contains=false;
        for(pair key:map.keySet())
        {
          if(key.a.equals(s3))
          {
            contains=true;
            map.put(key,map.get(key)+1);
            break;
          }
        }
        if(!contains)
          map.put(p2,1);
      }
      for(pair key: map.keySet())
      {
        //if(map.get(key)>2)
        //{
          
        //}
        if(map.get(key)==5)
        {
          System.out.println(key.a+" "+key.b);
          ans=key.b;
          flag=true;
          break;
        }
      }
      if(flag) break;
      //System.out.println();
    }
    out.println(ans);
    out.flush();
          
    long endTime=System.nanoTime();
    //long totalTime=endTime-startTime;
    double time1=(double)(intermediate_time-startTime)*(.000000009);
    double time2=(double)(endTime-intermediate_time)*(.000000009);
    out.println(time1+" "+time2);
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

