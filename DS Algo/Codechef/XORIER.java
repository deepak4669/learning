import java.util.*;
import java.io.*;

public class XORIER
{
  public static void main(String[] args) throws IOException
  {
    //PrintWriter out=new PrintWriter(System.out);
    Reader sc=new Reader();
    int t=sc.nextInt();
    
    
    
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      HashMap<Integer,Long> map1=new HashMap<Integer,Long>();
      HashMap<Integer,Long> map2=new HashMap<Integer,Long>();
      int[] oddArr=new int[n];
      int[] evenArr=new int[n];      
      long o=0;
      long e=0;
      for(int i=0;i<n;i++)
      {
        int x=sc.nextInt();
        if(x%2==0)
        {
          evenArr[(int)e++]=x;
          if(map1.containsKey(x))
          {
            map1.put(x,map1.get(x)+1);
          }
          else{
            map1.put(x,(long)1);
          }
          
          
          
        }
        else
        {
          oddArr[(int)o++]=x;
          if(map2.containsKey(x))
            map2.put(x,map2.get(x)+1);
          else
            map2.put(x,(long)1);
        }
      }
      
      //Collections.sort(odd);
      //Collections.sort(even);
      long twos=0;
      long zeros=0;
      Arrays.sort(oddArr,0,(int)o);
      Arrays.sort(evenArr,0,(int)e);
      HashMap<Integer,Integer> map3=new HashMap<Integer,Integer>(); 
      for(int i=0;i<o-1;i++)
      {
        if((oddArr[i]^oddArr[i+1])==2)
          twos+=map2.get(oddArr[i])*map2.get(oddArr[i+1]);
        else if(map2.get(oddArr[i])>1)
        {
          if(!map3.containsKey(oddArr[i]))
          {
            zeros+=(map2.get(oddArr[i])*(map2.get(oddArr[i])-1))/2;
            map3.put(oddArr[i],1);
          }
          //i+=map2.get(oddArr[i])-2;
        }
      }
      map3.clear();
      for(int i=0;i<e-1;i++)
      {
        if((evenArr[i]^evenArr[i+1])==2)
          twos+=map1.get(evenArr[i])*map1.get(evenArr[i+1]);
        else if(map1.get(evenArr[i])>1)
        {
          if(!map3.containsKey(evenArr[i]))
          {
            zeros+=(map1.get(evenArr[i])*(map1.get(evenArr[i])-1))/2;
            map3.put(evenArr[i],1);
          }
          //i+=map1.get(evenArr[i])-2;
        }
      }
      //e=even.size();
      //o=odd.size();
      //o=(long)(o);
      //e=(long)(e);
      long ans=(long)((e)*(e-1))/2+(long)((o)*(o-1))/2-zeros-twos;
      //System.out.println((long)((e)*(e-1))/2);
      //System.out.println((long)((o)*(o-1))/2);
      //System.out.println(zeros);
      //System.out.println(twos);
      /*
      int ans2=0;
      for(int i=0;i<o;i++)
      {
        for(int j=i+1;j<o;j++)
        {
          int x=oddArr[i]^oddArr[j];
          if(x%2==0&&x!=2&&x!=0)
            ans2++;
        }
      }
      for(int i=0;i<e;i++)
      {
        for(int j=i+1;j<e;j++)
        {
          int x=evenArr[i]^evenArr[j];
          if(x%2==0&&x!=2&&x!=0)
            ans2++;
        }
      }
      */
      
      
      
      
      
          
        
       //System.out.println(ans);
      //assert ans2==ans;
        System.out.println(ans);
      //out.println(ans);
      //out.println(ans2);
      //out.flush();
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
          