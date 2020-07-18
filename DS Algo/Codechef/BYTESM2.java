import java.util.*;
import java.io.*;
public class BYTESM2
{
  static int[][] dp;
  public static void main(String[] args)throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    while(t-->0)
    {
      
      int n=sc.nextInt();
      int m=sc.nextInt();
      dp=new int[n][m];
      int[][] a=new int[n][m];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          a[i][j]=sc.nextInt();
      }
      int max=0;
      for(int i=0;i<m;i++)
      {
        int value=solve(a,0,i,n,m);
        if(value>max) max=value;
      }
      System.out.println(max);
    }
  }
  public static int solve(int[][] a,int i,int j,int n,int m){
    if(i>=n) return 0;
    if(dp[i][j]!=0) return dp[i][j];
    else{
      
      int ans;
      if(j==0)        
        ans=a[i][j]+Math.max(solve(a,i+1,j+1,n,m),solve(a,i+1,j,n,m));
      else if(j==(m-1))
        ans=a[i][j]+Math.max(solve(a,i+1,j,n,m),solve(a,i+1,j-1,n,m));
      else
        ans=a[i][j]+Math.max(solve(a,i+1,j+1,n,m),Math.max(solve(a,i+1,j,n,m),solve(a,i+1,j-1,n,m)));
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
    
  
    
                       