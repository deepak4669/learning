import java.util.*;
import java.io.*;

public class BSHUFFLE
{
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    PrintWriter out=new PrintWriter(System.out);
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    
    int n=sc.nextInt();
    int a[]=new int[n+1];
    
    for(int i=1;i<=n;i++)
      a[i]=i;
    
    Random rand=new Random();
    
    int iter=600000;
    while(iter-->0)
    {
      for(int i=1;i<=n;i++)
      {
        int j=(int)(Math.random()*i+1);
        exch(a,i,j);
      }
      String s="";
      for(int i=1;i<=n;i++)
      {
        s+=a[i]+"";
      }
      //String t=s.
      if(!map.containsKey(s))
      {
        map.put(s,1);
      }
      else
      {
        map.put(s,map.get(s)+1);
        //if(map.get(s)>max) max=map.get(s);
      }
    }
    int max=0;
    int min=100000000;
    String p1=new String();
    String p2=new String();
    for(Map.Entry<String, Integer> entry: map.entrySet())
    {
      //p1=new String();
      //p2=new String();
      System.out.println(entry.getKey()+" "+entry.getValue());
      if(entry.getValue()>max)
      {
        //p1=new String();
        p1=entry.getKey();
        max=entry.getValue();
      }
      if(entry.getValue()<min)
      {
        //p2=new String();
        p2=entry.getKey();
        min=entry.getValue();
      }
      //System.out.println(p1);
      //System.out.println(p2);
    }
    char[] ch1=p1.toCharArray();
    char[] ch2=p2.toCharArray();
    for(int i=0;i<n;i++)
    {
      System.out.print(ch1[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++)
    {
      System.out.print(ch2[i]+" ");
    }
    System.out.println(max);
    System.out.println(min);
    
      
    //out.flush();
  }
  public static void exch(int[] a, int i, int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
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
      
      
      
      
    
    
    
    
    