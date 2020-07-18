import java.util.*;
import java.io.*;
public class PRMDIV2
{
  static int[] S=new int[1000001];
  static Vector<Integer>[] good=(Vector<Integer>[]) new Vector[1000001];
  /*public static void start()
  {
    for(int i=0;i<1000001;i++)
      good[i]=new Vector<Integer>();
  }*/
  public static void calculateSum()
  {
    S[0]=0;
    S[1]=0;
    for(int i=2;i<=1000000;i++)
    {
      if(S[i]==0)
      {
        int j=i;
        while(j<=1000000)
        {
          S[j]+=i;
          j+=i;
        }
      }
    }
  }
  public static void calculateGood()
  {
    for(int i=1;i<=1000000;i++)
    {
      int j=i;
      good[i]=new Vector<Integer>();
      while(j<=1000000)
      {
        if(S[i]!=0&&(S[j]%S[i]==0))
          good[i].add(j);
        j+=i;
      }
    }
  }
      
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    //start();
    calculateSum();
    calculateGood();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      int[] freq=new int[1000001];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        freq[a[i]]++;
      }
      int ans=0;
      for(int i=2;i<=1000000;i++)
      {
        if(freq[i]>0)
        {
          int v=0;
          for(int j:good[i])
          {
            v+=freq[j];
          }
          ans+=v*freq[i];
        }
      }
      ans-=n;
      System.out.println(ans);
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
      
    