import java.util.*;
import java.io.*;
public class Main5072
{
  static PrintWriter out=new PrintWriter(System.out);
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ans=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int i=0;
    int j=n-1;
    boolean flag=true;
    
    while(j>i)
    {
      if(arr[i]==arr[j]&&arr[i]!=2&&(arr[i]==1||arr[i]==0))
      {
        i++;
        j--;
      }
      else if(arr[i]==arr[j]&&arr[i]==2)
      {
        ans+=2*Math.min(a,b);
        i++;
        j--;
      }
      else if(arr[i]!=arr[j]&&(arr[i]!=2&&arr[j]!=2)||(arr[i]!=0&&arr[i]!=1&&arr[i]!=2)||((arr[j]!=0&&arr[j]!=1)&&arr[j]!=2))
      {
        flag=false;
        break;
      }
      else if(arr[i]==2)
      {
        if(arr[j]==1)
        {
          ans+=b;
        }
        else
          ans+=a;
        i++;
        j--;
      }
      else if(arr[j]==2)
      {
        if(arr[i]==1)
          ans+=b;
        else
          ans+=a;
        i++;
        j--;
      }
    }
    if(arr[i]==2&&i==j) ans+=Math.min(a,b);
    if(flag) System.out.println(ans);
    else System.out.println(-1);
    
        
    
    
    
    
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
    