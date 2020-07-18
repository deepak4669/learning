import java.util.*;
import java.io.*;
public class BITMAP2
{
  static int[][] distance;
  public static class multiSet
  {
    int i;
    int j;
    public multiSet(int x, int y)
    {
      this.i=x;
      this.j=y;
    }
    
  }
  public static Stack<multiSet> adj(multiSet v)
  {
    Stack<multiSet> stack=new Stack<multiSet>();
    stack.push(new multiSet(v.i-1,v.j));
    stack.push(new multiSet(v.i+1,v.j));
    stack.push(new multiSet(v.i,v.j-1));
    stack.push(new multiSet(v.i,v.j+1));
    return stack;
  }
  public static boolean isValid(multiSet v, int n, int m)
  {
    return 0<=v.i&&v.i<n&&0<=v.j&&v.j<m?true:false;
  }
     
  
  public static void main(String[] args) throws IOException
  {
    Reader sc=new Reader();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      String[] s=new String[n];
      Stack<multiSet> q=new Stack<multiSet>();
      distance=new int[n][m];
      for(int i=0;i<n;i++)
        s[i]=sc.readLine();
      boolean[][] marked=new boolean[n][m];
      int k=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(s[i].charAt(j)=='0')
            distance[i][j]=1000000000;
          else if(s[i].charAt(j)=='1'){           
            distance[i][j]=0;
            q.push(new multiSet(i,j));
            
          }
        }
      }
      while(!q.isEmpty())
      {
        
        multiSet v=q.pop();
        //System.out.println(v.i+" "+v.j);
        if(s[v.i].charAt(v.j)=='1')
        {
          marked=new boolean[n][m];
          k=1;
        }
        for(multiSet g:adj(v))
        {
          if(isValid(g,n,m)&&!marked[g.i][g.j]&&s[g.i].charAt(g.j)!='1')
          {
            
            q.add(g);
            marked[g.i][g.j]=true;
            if(distance[g.i][g.j]>k) distance[g.i][g.j]=k;
          }
              }
        k++;
      }
      
      
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          System.out.print(distance[i][j]);
        }
        System.out.println();
      }
      
            
      
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
      
          
    