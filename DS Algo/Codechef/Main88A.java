import java.util.*;
import java.io.*;

class Main88A
{
  static HashMap<String, Integer> map=new HashMap<String,Integer>();
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String x=sc.next();
    String y=sc.next();
    String z=sc.next();
    
    map.put("C",1);map.put("C#",2);
    map.put("D",3);map.put("D#",4);
    map.put("E",5);//map.put("E#",6);
    //map.put("D",7);map.put("D#",8);
    map.put("F",6);map.put("F#",7);
    map.put("G",8);map.put("G#",9);
    map.put("A",10);map.put("B",11);
    map.put("H",12);
    if(dist(x,y)==4&&dist(y,z)==3)
      out.println("major");
    else if(dist(x,y)==3&&dist(y,z)==4)
      out.println("minor");
    else if(dist(x,z)==4&&dist(z,y)==3)
      out.println("major");
    else if(dist(x,z)==3&&dist(z,y)==4)
      out.println("minor");
    else if(dist(y,x)==3&&dist(x,z)==4)
      out.println("minor");
    else if(dist(y,x)==4&&dist(x,z)==3)
      out.println("major");
    else if(dist(y,z)==3&&dist(z,x)==4)
      out.println("minor");
    else if(dist(y,z)==4&&dist(z,x)==3)
      out.println("major");
    else if(dist(z,x)==3&&dist(x,y)==4)
      out.println("minor");
    else if(dist(z,x)==4&&dist(x,y)==3)
      out.println("major");
    else if(dist(z,y)==3&&dist(y,x)==4)
      out.println("minor");
    else if(dist(z,y)==4&&dist(y,x)==3)
      out.println("major");
    else
      out.println("strange");
    //out.println(dist(y,x)+" "+dist(x,z));
    out.flush();
        
    
  }
  static int dist(String x,String y)
  {
    if(map.get(x)>map.get(y))
      return map.get(y)+(map.get("H")-map.get(x));
    else
      return map.get(y)-map.get(x);
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

