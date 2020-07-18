import java.util.*;
import java.io.*;
public class ABCDEF
{
  public static void main(String[] args) throws IOException
  {
    (new ABCDEF()).run();
  }
  public void run()throws IOException{
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    Reader sc=new Reader();
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int[] RHS=new int[n*n*n];
    int[] LHS=new int[n*n*n];
    int l=0;
    int r=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<n;k++)
        {
          
          LHS[l++]=a[i]*a[j]+a[k];
          if(a[k]!=0)
          {
            if(map.containsKey((a[i]+a[j])*a[k]))
              map.put((a[i]+a[j])*a[k],map.get((a[i]+a[j])*a[k])+1);
            else
              map.put((a[i]+a[j])*a[k],1);
            
               
                 
          }
          
          
        }
      }
    }
    int count=0;
    
    for(int i=0;i<l;i++)
    {
      if(map.containsKey(LHS[i]))
           count+=map.get(LHS[i]);
              
    }        
    System.out.println(count);
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
    
          
          
    
                     