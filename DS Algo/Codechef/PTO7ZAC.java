import java.util.*;
import java.io.*;
public class PTO7ZAC
{
  static Vector<Integer>[] adj;
  static boolean[] marked;
  static int[] pow;
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int n=sc.nextInt();
    adj=(Vector<Integer>[]) new Vector[n];
    for(int i=0;i<n;i++)
      adj[i]=new Vector<Integer>();
    for(int i=0;i<n-1;i++)
    {
      int v=sc.nextInt();
      int w=sc.nextInt();
      --v;
      --w;
      adj[v].add(w);
      adj[w].add(v);
    }
    marked=new boolean[n];
    pow=new int[n];
    pow[0]=0;
    dfs(0,pow[0]);
    int maxv=max(pow);
    marked=new boolean[n];
    pow=new int[n];
    dfs(maxv,0);
    System.out.println(pow[max(pow)]);
  }
   public static void dfs(int v,int prev)
  {
    marked[v]=true;
    
    for(int w:adj[v])
    {
      if(!marked[w])
      {
        pow[w]=pow[v]+1;
        dfs(w,pow[w]);
      }
    }
  }
   public static int max(int[] a)
   {
     int max=0;
     for(int i=0;i<a.length;i++)
     {
       if(a[max]<a[i]) max=i;
     }
     return max;
   }
   static class Reader {
  final private int BUFFER_SIZE = 1 << 16;
  private DataInputStream din;
  private byte [] buffer;
  private int bufferPointer, bytesRead;
  
  public Reader () {
   din = new DataInputStream (System.in);
   buffer = new byte[BUFFER_SIZE];
   bufferPointer = bytesRead = 0;
  }
  
  public Reader (String file_name) throws IOException {
   din = new DataInputStream (new FileInputStream (file_name));
   buffer = new byte[BUFFER_SIZE];
   bufferPointer = bytesRead = 0;
  }
  
  public String readLine () throws IOException {
   byte [] buf = new byte[1024];
   int cnt = 0, c;
   while ((c = read ()) != -1) {
    if (c == '\n')
     break;
    buf[cnt++] = (byte) c;
   }
   return new String (buf, 0, cnt);
  }
  
  public int nextInt () throws IOException {
   int ret = 0;
   byte c = read ();
   while (c <= ' ')
    c = read ();
   boolean neg = (c == '-');
   if (neg)
    c = read ();
   do {
    ret = ret * 10 + c - '0';
   } while ((c = read ()) >= '0' && c <= '9');
   if (neg)
    return -ret;
   return ret;
  }
  
  public long nextLong () throws IOException {
   long ret = 0;
   byte c = read ();
   while (c <= ' ')
    c = read ();
   boolean neg = (c == '-');
   if (neg)
    c = read ();
   do {
    ret = ret * 10 + c - '0';
   } while ((c = read ()) >= '0' && c <= '9');
   if (neg)
    return -ret;
   return ret;
  }
  
  public double nextDouble () throws IOException {
   double ret = 0, div = 1;
   byte c = read ();
   while (c <= ' ')
    c = read ();
   boolean neg = (c == '-');
   if (neg)
    c = read ();
   do {
    ret = ret * 10 + c - '0';
   } while ((c = read ()) >= '0' && c <= '9');
   if (c == '.')
    while ((c = read ()) >= '0' && c <= '9')
     ret += (c - '0') / (div *= 10);
   if (neg)
    return -ret;
   return ret;
  }
  
  private void fillBuffer () throws IOException {
   bytesRead = din.read (buffer, bufferPointer = 0, BUFFER_SIZE);
   if (bytesRead == -1)
    buffer[0] = -1;
  }
  
  private byte read () throws IOException {
   if (bufferPointer == bytesRead)
    fillBuffer ();
   return buffer[bufferPointer++];
  }
  
  public void close () throws IOException {
   if (din == null)
    return;
   din.close ();
  }
 }
}
    