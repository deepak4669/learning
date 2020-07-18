import java.util.*;
import java.io.*;
public class TABGAME
{
  static HashMap<Integer,String> map=new HashMap<Integer,String>();
  public static void main(String[] args) throws IOException
  {
    PrintWriter out=new PrintWriter(System.out);
    Reader sc=new Reader();
    //Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    while(p-->0)
    {
      String s=sc.readLine();
      String t=sc.readLine();
      int n=t.length();
      int m=s.length();
      char ans[]=new char[m+1];
      for(int i=1;i<=n;i++)
      {
        String st=new String();
        st="";
        ans=new char[m+1];
        for(int j=1;j<=m;j++)
        {
          if(i-1==0&&j-1==0)
          {
            //System.out.println(s.charAt(i-1)+" "+t.charAt(i-1));
            if(s.charAt(0)=='0'||t.charAt(0)=='0')
            {
              //System.out.println("s");
              
              ans[j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[j]='B';
            st+=ans[j];
          }
          else if(i-1==0)
          {
            assert (j-1)!=0;
            if(s.charAt(j-1)=='0'||ans[j-1]=='B')
              ans[j]='A';
            else
              ans[j]='B';
            st+=ans[j];
          }
          else if(j-1==0)
          {
            assert (i-1)!=0;
            if(t.charAt(i-1)=='0'||map.get(i-1).charAt(j-1)=='B')
            {
              ans[j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[j]='B';
            st+=ans[j];
          }
          else
          {
            if(map.get(i-1).charAt(j-1)=='B'||ans[j-1]=='B')
              ans[j]='A';
            else
              ans[j]='B';
            st+=ans[j];
          }
          
        }
        map.put(i,st);
      }
      int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
        int x=sc.nextInt();
        int y=sc.nextInt();
        //System.out.println(x+" "+y);
        out.print(map.get(x).charAt(y-1)=='A'?1:0);
      }
      out.println();
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
   byte [] buf = new byte[1000000];
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
        
          
              