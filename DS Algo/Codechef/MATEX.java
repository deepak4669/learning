import java.util.*;
import java.io.*;
public class MATEX
{
  static int n;
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    n=sc.nextInt();
    long[][] M=new long[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        M[i][j]=sc.nextInt();
      }
    }
    int t=838383;
    while(t-->0){
    int i=sc.nextInt();
    int j=sc.nextInt();
    long N=sc.nextInt();
    long[][] ans=mult(M,N);
    System.out.println(ans[i-1][j-1]);}
  }
  public static long[][] mult(long[][] A,long N)
  {
    long[][] result=new long[A[0].length][A[0].length];
    for(int i=0;i<A[0].length;i++)
    {
      for(int j=0;j<A[0].length;j++)
      {
        if(i==j)
          result[i][j]=1;
      }
    }
              
    while(N>0)
    {
      if(N%2==1)
        result=multiplication(result,A);
      A=multiplication(A,A);
      N/=2;
    }
    return result;
  }
  public static long[][] multiplication(long[][] A, long[][] B)
  {
    long[][] C=new long[A[0].length][A[0].length];
    for(int i=0;i<A[0].length;i++)
    {
      for(int j=0;j<A[0].length;j++)
      {
        for(int k=0;k<A[0].length;k++)
        {
          C[i][j]=(C[i][j]+A[i][k]*B[k][j])%1000000007;
        }
      }
    }
    return C;
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
                     
    
    