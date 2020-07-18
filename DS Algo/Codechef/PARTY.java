import java.io.*;
import java.util.*;
public class PARTY
{
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    while(true)
    {
      int b=sc.nextInt();
      int n=sc.nextInt();
      if(n==0&&b==0) break;
      
      //int[][] cost=new int[n+1][b+1];
      int[][] A=new int[n+1][b+1];
      
      int[] v=new int[n+1];
      int[] w=new int[n+1];
                      
      int[][] cost=new int[n+1][b+1];
      for(int i=1;i<=n;i++)
      {
        
        w[i]=sc.nextInt();
        v[i]=sc.nextInt();
        for(int x=0;x<=b;x++)
        {
          if(w[i]>x)
          {
            A[i][x]=A[i-1][x];
            cost[i][x]=cost[i-1][x];
          }
          else 
          {
            if(A[i-1][x]<A[i-1][x-w[i]]+v[i])
            {
              A[i][x]=A[i-1][x-w[i]]+v[i];
              cost[i][x]=cost[i-1][x-w[i]]+w[i];
            }
            else if (A[i-1][x]>A[i-1][x-w[i]]+v[i])
            {
              A[i][x]=A[i-1][x];
              cost[i][x]=cost[i-1][x];
            }
            else
            {
              A[i][x]=A[i-1][x];
              cost[i][x]=min(cost[i-1][x-w[i]]+w[i],cost[i-1][x]);
            }


           
          }
        }
      }
      
        
      System.out.println(cost[n][b]+" "+A[n][b]);
    }
  }
  public static int min(int x,int y)
  {
    if(x<y) return x;
    else return y;
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