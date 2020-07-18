import java.io.*;
import java.util.*;
public class BUGLIFE
{
  static Vector<Integer>[] adj;
  static boolean color[];
  static boolean marked[];
  static boolean isBipartite;
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    int k=0;
    while(t-->0)
    {
      int n=sc.nextInt();
      adj=(Vector<Integer>[]) new Vector[n];
      marked=new boolean[n];
      color=new boolean[n];
      isBipartite=true;
      for(int i=0;i<n;i++)
        adj[i]=new Vector<Integer>();
      int m=sc.nextInt();
      for(int i=0;i<m;i++)
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        a-=1;
        b-=1;
        adj[a].add(b);
        adj[b].add(a);
        
      }
      for(int i=0;i<n;i++)
      {
        if(!marked[i])
        {
          dfs(adj,i);
        }
      }
      if(!isBipartite){
        System.out.println("Scenario #"+(k+1)+":");
        System.out.println("Suspicious bugs found!");
      }
      else
      {
        System.out.println("Scenario #"+(k+1)+":");
        System.out.println("No suspicious bugs found!");
      }
      k++;
    }
  }
  public static void dfs(Vector<Integer>[] adj,int s)
  {
    marked[s]=true;
    for(int w:adj[s])
    {
      if(!marked[w])
      {
        color[w]=!color[s];
        dfs(adj,w);
      }
      else if(color[s]==color[w])
      {
        isBipartite=false;
      }
    }
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
        
        
      