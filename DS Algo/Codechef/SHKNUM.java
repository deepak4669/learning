import java.util.*;
import java.io.*;
public class SHKNUM
{
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      //int ans=9;
      if(test(n)){ System.out.println(0);
        
      }
      else{
        int k=Integer.bitCount(n);
        if(n==1) System.out.println(2);
        
        else if(k==1)
          System.out.println(1);
        else{
        int x=n;
        int bit=0;
        int d=n;
        while(x>0&&k>2)
        {
          if(x%2==1&&k>2)
          {
            k--;
            d&=~(1<<bit);
            
          }
          x/=2;
          bit++;
        }
        //System.out.println(d);
        //System.out.println(bit);
        while((d&(1<<bit))!=(1<<bit)) bit++;
        //System.out.println(d);
        //System.out.println(bit);
        int e=d;
        //e&=~(1<<bit);
        e+=1<<(bit);
        if(Integer.bitCount(e)!=2)
          e++;
             
        //System.out.println(bit);
        int ans =Math.min(n-d,e-n);
        assert k==2;
        System.out.println(ans);
        }
      }
        
            
            
            
            
        
      
       
    }
  }        
  
  public static boolean test(int n)
  {
    
      return Integer.bitCount(n)==2;
    
    
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