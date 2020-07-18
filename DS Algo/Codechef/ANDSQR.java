import java.util.*;
import java.io.*;

public class ANDSQR
{
  static int[] A;
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    while(t-->0)
    {
      int N=sc.nextInt();
      int Q=sc.nextInt();
      A=new int[N];
      for(int i=0;i<N;i++)
        A[i]=sc.nextInt();
      for(int i=0;i<Q;i++)
      {
        int lo=sc.nextInt();
        int ro=sc.nextInt();
        System.out.println(solve(lo-1,ro-1));
      }
    }
  }
  public static int solve(int lo,int ro)
  {
   int a=0;
   int cnt=0;
   for(int i=lo;i<=ro;i++)
   {
     a=A[i];
     for(int j=i;j<=ro;j++)
     {
       
       a=(a&A[j]);
       //System.out.println(a);
       if(perfect(a))
       {
         //System.out.println(a);
         cnt++;
       }
       //else
       //  break;
     }
   }
   return cnt;
  }
         
       
  
  public static boolean perfect(int n)
  {
    int m=(int)Math.sqrt(n);
    if(m*m==n) return true;
    else
      return false;
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
      
      