import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.io.*;
public class Main507B
{
  static boolean[] a;
  static PrintWriter out=new PrintWriter(System.out);
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int n=sc.nextInt();
    int k=sc.nextInt();
    boolean flag=false;
    a=new boolean[n+1];
    
    int x=(int)Math.ceil((double)n/(2*k+1));
    int ans[]=new int[x];
    int p=0;
    //System.out.println(x);
    for(int i=1;i<=n;i++)
    {
      Arrays.fill(a,false);
      int t=x;
      int j=i;
      while(t-->0)
      {
        process(j,k);
        if(check())
        {
          for(int l=0;l<x;l++)
            ans[l]=i+l*2*k+l;
          flag=true;
          break;
        }
        j=j+2*k+1;
      }
      if(flag)
        break;
    }
    if(flag)
    {
      out.println(x);
      for(int i=0;i<x;i++)
        out.print(ans[i]+" ");
    }
    out.flush();
  }
  public static void process(int i, int k)
  {
    int st=i-k;
    if(i-k<=0)
      st=1;
    int lo=i+k;
    if(i+k>a.length-1)
      lo=a.length-1;
    for(int l=st;l<=lo;l++)
      a[l]=!a[l];
  }
  public static boolean check()
  {
    for(int i=1;i<=a.length-1;i++)
      if(!a[i]) return false;
    return true;
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
      
        
      
      
      