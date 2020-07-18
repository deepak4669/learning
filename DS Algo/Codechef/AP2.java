import java.io.*;
import java.util.*;

public class AP2
{  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    Reader2 in = new Reader2();
    int t=sc.nextInt();
    while(t>0)
    {
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int n=(2*c)/(a+b);
      int d=((b-a)/5);
      //System.out.println(d);
      int a1=a-2*d;
      //System.out.println(a1);
      System.out.println(n);
      for(int i=0;i<n;i++)
      {
        System.out.print(a1+" ");
        a1+=d;
      }
      System.out.println();
      t-=1;
    }
  }
}
  class Reader2 {
  final private int   BUFFER_SIZE = 1 << 16;
  private DataInputStream din;
  private byte []   buffer;
  private int     bufferPointer, bytesRead;
  public Reader2() {
   din = new DataInputStream (System.in);
   buffer = new byte[BUFFER_SIZE];
   bufferPointer = bytesRead = 0;
  }
  public int nextInt () throws IOException {
   int ret = 0;
   byte c = read ();
   while (c <= ' ')
    c = read ();
   boolean neg = (c == '-');
   if (neg) c = read ();
   do {
    ret = ret * 10 + c - '0';
   } while ((c = read ()) >= '0' && c <= '9');
   if (neg) return -ret;
   return ret;
  }
  private void fillBuffer () throws IOException {
   bytesRead = din.read (buffer, bufferPointer = 0, BUFFER_SIZE);
   if (bytesRead == -1) buffer[0] = -1;
  }
  private byte read () throws IOException {
   if (bufferPointer == bytesRead) fillBuffer ();
   return buffer[bufferPointer++];
  }
 }

    