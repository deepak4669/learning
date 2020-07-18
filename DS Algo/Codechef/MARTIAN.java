import java.util.*;
import java.io.*;
public class MARTIAN
{
  static int[][] dp;
  static int[][] y;
  static int[][] b;
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    while(true)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(n==0&&m==0) break;
      dp=new int[n][m];
      y=new int[n][m];
      b=new int[n][m];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          y[i][j]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          b[i][j]=sc.nextInt();
      }
      int ans=solve(n-1,m-1);
      System.out.println(ans);
    }
  }
  public static int solve(int i,int j)
  {
    if(i<0||j<0) return 0;
    if(i==0&&j==0) return y[i][j]>b[i][j]?y[i][j]:b[i][j];
    else if(dp[i][j]!=0) return dp[i][j];
    else{
      int col=0;
      for(int p=0;p<=i;p++)
        col+=b[p][j];
      int ans1=col+solve(i,j-1);
      int row=0;
      for(int p=0;p<=j;p++)
        row+=y[i][p];
      int ans2=row+solve(i-1,j);
      int ans=Math.max(ans1,ans2);
      dp[i][j]=ans;
      return ans;
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
      