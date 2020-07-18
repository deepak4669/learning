import java.util.*;
import java.io.*;
public class GCDEX
{
  static PrintWriter out=new PrintWriter(System.out);
  static int N=1000010;
  static int[] phi=new int[N];
  static int[] res=new int[N];
  static long[] ans=new long[N];
  static void calculate_phi()
  {
    for(int i=1;i<N;i++)
    {
      phi[i]=i;
    }
    for(int i=2;i<N;i++)
    {
      if(phi[i]==i)
      {
        for(int j=i;j<N;j+=i){
          phi[j]/=i;
          phi[j]*=(i-1);
        }
      }
    }
    ans[0]=0;
    for(int i=1;i<N;i++)
    {
      for(int j=i;j<N;j+=i)
      {
        res[j]=(res[j])+i*phi[j/i];
      }
      ans[i]=ans[i-1]+(res[i]-i);
    }
    //for(int i=0;i<N;i++) res[i]-=i;
    
    //for(int i=1;i<N;i++)
      
    
  }
  
  public static void main(String[] args) throws IOException
  {
    //Scanner  sc=new Scanner(System.in);
    calculate_phi();
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Reader sc=new Reader();
    String s=sc.readLine();
    
    //String s=""+n;
    while(isStringInt(s))
    {
      //int n=sc.nextInt();
      int n=Integer.parseInt(s);
      if(n==0) break;
      out.println(ans[n]);
      out.flush();
      s=sc.readLine();
    }
  }
  public static boolean isStringInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
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
  
  