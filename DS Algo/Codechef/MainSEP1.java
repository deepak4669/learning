import java.util.*;
import java.io.*;

public class MainSEP1
{
  public static void main(String[] args) throws IOException
  {
    PrintWriter out=new PrintWriter(System.out);
    Reader sc=new Reader();
    int t=sc.nextInt();
    
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      int[] odd=new int[n];
      int[] even=new int[n];
      int o=0;
      int e=0;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]%2==0)
          even[e++]=a[i];
        else
          odd[o++]=a[i];
      }
      
      
      int ans2=0;
      Arrays.sort(even,0,e);
      Arrays.sort(odd,0,o);
        
      for(int i=0;i<e;i++)
      {
        for(int j=i+1;j<e;j++)
        {
          int x=(even[i]^even[j]);
          if(x%2==0&&x!=2&&x!=0)
            ans2++;
        }
      }
      for(int i=0;i<o;i++)
      {
        for(int j=i+1;j<o;j++)
        {
          int x=(odd[i]^odd[j]);
          if(x%2==0&&x!=2&&x!=0)
            ans2++;
        }
      }
      
            
      
      
      
      int count=0;
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          int x=a[i]^a[j];
          if(x%2==0&&(x!=2)&&(x!=0))
          {
            assert (a[i]%2==0)&&(a[j]%2==0)||(a[i]%2!=0)&&(a[j]%2!=0);
            count++;
          }
        }
      }
      //out.println(ans2);
      //out.println(count);
      assert count==ans2;
      out.println(ans2);
      out.flush();
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
          