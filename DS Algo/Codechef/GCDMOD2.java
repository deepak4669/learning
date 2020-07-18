import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class GCDMOD2
{
 
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    PrintWriter out=new PrintWriter(System.out);
    int t=sc.nextInt();
    while(t-->0)
    {
      long a=sc.nextLong();
      long b=sc.nextLong();
      long  N=sc.nextLong();
      BigInteger A=BigInteger.valueOf(a);
      BigInteger B=BigInteger.valueOf(b);
      BigInteger w=A.subtract(B).abs();
      BigInteger f=new BigInteger("1000000007");
      if(w.equals(BigInteger.ZERO))
      {
        out.println((mod_exp(A,N,f).add(mod_exp(B,N,f))).mod(f));
        continue;
      }
      BigInteger v=(mod_exp(A,N,w).add(mod_exp(B,N,w)));
      
      //System.out.println(w);
      
      BigInteger r=(v.mod(w));
      //BigInteger lcm=v.add(r);
      
      BigInteger ans=r.gcd(w).mod(f);
      
      out.println(ans);
      out.flush();
      
    }
  }
  public static BigInteger gcd(BigInteger a,BigInteger b)
  {
    if(a.equals(BigInteger.ZERO)) return b;
    else return gcd(b.mod(a),a);
  }
  public static BigInteger mod_exp(BigInteger A,long N,BigInteger w)
  {
    BigInteger result=BigInteger.ONE;
    A=A.mod(w);
    
    while(N>0)
    {
      if((N&1)==1)
        result=(result.multiply(A)).mod(w);
      N=N>>1;
      A=A.multiply(A).mod(w);
    }
    return result;
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