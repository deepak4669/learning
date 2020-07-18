import java.util.*;
import java.io.*;
public class FOODIE
{
  public static void main(String[] args)throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[][] A=new int[2][k+1];
      for(int i=1;i<=n;i++)
      {
        int v=sc.nextInt();
        int w=0;
        for(int j=1;j<=v;j++)
        {
          w+=sc.nextInt();
        }
        if(i%2!=0)
        {
          for(int x=1;x<=k;x++)
          {
            if(w>x)
            {
              A[1][x]=A[0][x];
            }
            else
            {
              A[1][x]=(A[0][x]>(A[0][x-w]+v))?A[0][x]:(A[0][x-w]+v);
            }
          }
        }
        else
        {
          for(int x=1;x<=k;x++)
          {
            if(w>x)
            {
              A[0][x]=A[1][x];
            }
            else
            {
              A[0][x]=max(A[1][x],A[1][x-w]+v);
            }
          }
        }
      }
      if(n%2==0)
      {
        System.out.println("Hey stupid robber, you can get "+A[0][k]+".");
      }
      else
      {
        System.out.println("Hey stupid robber, you can get "+A[1][k]+".");
      }
    }
  }
  public static int max(int x,int y)
  {
    if(x>y) return x;
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
            
                       
  