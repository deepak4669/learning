import java.io.*;
import java.util.Scanner;
public class INVCNT
{
  
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    
    while(t-->0)
    {
      int n=sc.nextInt();
      long[] a=new long[n];
      long[] aux=new long[n];
      for(int i=0;i<n;i++)
      { 
        a[i]=sc.nextInt();
        aux[i]=a[i];
        
      }
      long ans=count(a,aux,0,a.length-1);
      System.out.println(ans);
    }
  }
  public static long count(long[] a,long[] aux,int lo,int hi)
  {
    int n=hi-lo+1;
    long x,y,z;
    if(n==1) return 0;
    
    else
    {
      int mid=lo+(hi-lo)/2;      
      x=count(aux,a,lo,mid);
      y=count(aux,a,mid+1,hi);
      z=countSplit(a,aux,lo,mid,hi);
    }
        
  return x+y+z;
  }
  public static long countSplit(long[] a,long[] aux,int lo,int mid,int hi)
  {  
    long count=0;
    int i=lo,j=mid+1;
    
    for(int k=lo;k<=hi;k++)
    {
      if(i>mid)
      {
        aux[k]=a[j++];
      }
      else if(j>hi)
      {
        aux[k]=a[i++];
      }
      else if(a[j]<a[i]){
        aux[k]=a[j++];
        count+=(mid-i+1);
      }
      else
      {
        aux[k]=a[i++];
      }
    }
    
    return count;
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
        
    
      
    