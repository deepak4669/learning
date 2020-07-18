import java.util.*;
import java.io.*;
//heads true
//tails false
public class FLIPCOIN
{
  static boolean[] array;
  public static void main(String[] args)throws IOException
  {
    Reader sc=new Reader();
    int n=sc.nextInt();
    int q=sc.nextInt();
    array=new boolean[n];
    SegmentTree tree=new SegmentTree(array);
    for(int i=0;i<q;i++)
    {
      int a=sc.nextInt();
      if(a==1)
      {
        int b=sc.nextInt();
        int c=sc.nextInt();
        //System.out.println(tree.query(1,b,c).pendingUpdate);
        System.out.println(tree.query(b,c));
      }
      else{
        int b=sc.nextInt();
        int c=sc.nextInt();
        tree.update(b,c);
      }
    }
  }
  
  public static class SegmentTree{
    
    public Node[] heap;
    
    
    public int getSize(int n)
    {
      int size=1;
      for(;size<n;size<<=1);
      return size<<1;
    }
    
    public SegmentTree(boolean[] a)
    {
      int size=getSize(a.length);
      heap=new Node[size];
      build(a,1,0,a.length-1);
    }
    public void build(boolean[] a,int v,int from,int to)
    {
      heap[v]=new Node();
      heap[v].from=from;
      heap[v].to=to;
      if(from==to)
      {
        heap[v].count=0;
        return;
      }
      int mid=(from+to)/2;
      int left=2*v;
      int right=left+1;
      build(a,left,from,mid);
      build(a,right,mid+1,to);
      heap[v].count=heap[2*v].count+heap[2*v+1].count;
    }
    
    public int query(int from, int to)
    {
      Node result=new Node();
      result=query(1,from,to);
      return result.count;
    }
    
    public Node query(int v, int from,int to)
    {
      Node result=new Node();
      
      if(heap[v].from==from&&heap[v].to==to)
      {
        result.from=heap[v].from;
        result.to=heap[v].to;
        result.pendingVal=heap[v].pendingVal;
        result.count=heap[v].count;
        if(result.pendingVal){
          //System.out.println("l");
          result.applyPendingUpdate();
        }
        return result;
      }
      int mid=(heap[v].from+heap[v].to)/2;
      int left=2*v;
      int right=left+1;
      
      
      if(from>mid)
        result=query(right,from,to);
      else if(to<=mid)
        result=query(left,from,to);
      else{
        Node leftResult=query(left,from,mid);
        Node rightResult=query(right,mid+1,to);
        result.from=leftResult.from;
        result.to=rightResult.to;
        result.merge(leftResult,rightResult);
        //result.count=result.pendingVal?result.size()-result.count:result.count;
      }
      if(heap[v].pendingVal)
      {
        result.addUpdate();
        result.applyPendingUpdate();
      }
      return result;
    }
    public void update(int from, int to)
    {
      update(1,from,to);
    }
    public void update(int v,int from,int to)
    {
      if(heap[v].from==from&&heap[v].to==to){
        heap[v].addUpdate();
        return;
      }
      
      int mid=(heap[v].from+heap[v].to)/2;
      int left=2*v;
      int right=left+1;
      
      if(from>mid)
        update(right,from,to);
      else if(to<=mid)
        update(left,from,to);
      else{
        update(left,from,mid);
        update(right,mid+1,to);
      }
      heap[v].merge(heap[2*v],heap[2*v+1]);
    }
    
    public class Node{
      public int from,to;
      public int count=0;
      public boolean pendingVal=false;
      public int size(){
        return to-from+1;
      }
      void merge(Node left,Node right)
      {
        count=(left.pendingVal?(left.size()-left.count):left.count)+(right.pendingVal?(right.size()-right.count):right.count);
      }
      void applyPendingUpdate(){
        count=this.size()-count;
        pendingVal=false;
      }
      void addUpdate(){
        pendingVal=!pendingVal;
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
          
          
      
        
      
    
    