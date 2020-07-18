import java.util.*;
import java.io.*;
public class PROBLEMS
{
  static class Count implements Comparable<Count>{
    int index;
    int value;
    public Count(int index,int value)
    {
      this.index=index;
      this.value=value;
    }
    public int compareTo(Count that)
    {
      if(this.value>that.value) return +1;
      if(this.value<that.value) return -1;
      if(this.index>that.index) return +1;
      else return -1;
    }
  }     
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=1;
    while(t-->0)
    {
      int p=sc.nextInt();
      int s=sc.nextInt();
      
      int[][] sci=new int[p][s];
      int[][] nsc=new int[p][s];
      
      
      int k=0;
      for(int i=0;i<2*p;i++)
      {
        if(i%2==0)
        {
          for(int j=0;j<s;j++)
          {
            sci[k][j]=sc.nextInt();
          }
        }
        else
        {
          for(int j=0;j<s;j++)
          {
            nsc[k][j]=sc.nextInt();
          }
          k++;
        }
      }
      Count[] count=new Count[p+1];
      count[0]=new Count(0,0);
      for(int i=0;i<p;i++)        
      {
        int[] array=new int[sci[i].length];
        array=Arrays.copyOf(sci[i],sci[i].length);
        Arrays.sort(sci[i]);
        int f=0;
        for(int j=0;j<s-1;j++)
        {
          int index=search(array,sci[i][j]);
          array[index]=-1000;
          int index2=search(array,sci[i][j+1]);
          if(nsc[i][index]>nsc[i][index2])
            f++;
        }
        count[i+1]=new Count(i+1,f);
      }
      Arrays.sort(count);
      for(int i=1;i<=p;i++)
      {
        System.out.println(count[i].index);
      }
      
      
          
    }
  }
    public static int search(int[] a, int key)
    {
      for(int i=0;i<a.length;i++)
        if(a[i]==key) return i;
      return -1;
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
      
        
        
        
        
        
        
        
      
      