import java.util.*;
import java.io.*;

public class GSS4{
  
  static long[] array;
  
  public static class SegmentTree
  {
    public Node[] heap;
    
    public int getSize(int n)
    {
      int size=1;
      for(;size<n;size<<=1);
      return size<<1;
    }
    
    public SegmentTree(long[] array)
    {
      int size=getSize(array.length);
      heap=new Node[size];
      build(array,1,0,array.length-1);
    }
    
    public void build(long[] a, int v,int lo, int hi)
    {
      heap[v]=new Node();
      heap[v].from=lo;
      heap[v].to=hi;
      if(lo==hi)
      {
        heap[v].assignValue(a[lo]);
        return;
      }
      int left=2*v;
      int right=left+1;
      int mid=(lo+hi)/2;
      build(a,left,lo,mid);
      build(a,right,mid+1,hi);
      heap[v].merge(heap[left],heap[right]);
    }
    
    public long query(int from, int to)
    {
      Node result=query(1,0,array.length-1,from-1,to-1);
      return result.getValue();
    }
    
    private Node query(int v,int lo, int hi,int from, int to)
    {
      if(lo==from&&hi==to)
      {
        return heap[v];
      }
      int mid=(lo+hi)/2;
      if(from>mid)
        return query(2*v+1,mid+1,hi,from,to);
      if(to<=mid)
        return query(2*v,lo,mid,from,to);
      
      Node leftValue=query(2*v,lo,mid,from,mid);
      Node rightValue=query(2*v+1,mid+1,hi,mid+1,to);
      Node result=new Node();
      result.merge(leftValue,rightValue);
      return result;
    }
    
    private class Node{
      
      int from,to;
      long total;
      boolean pendingVal;
      
      public Node(){
        total=0;
        pendingVal=false;
      }      
      public void assignValue(long value)
      {
        total=value;
      }      
      public void merge(Node left, Node right)
      {
        total=left.total+right.total;
      }
      public long getValue()
      {
        return total;
      }
      
      public boolean isPropagationRequired(){
        return total>to-from+1;
      }
      public void applyPendingUpdate(){
        total=(long)Math.sqrt(total);
        pendingVal=false;
      }
      public void addUpdate(){
        pendingVal=true;
      }
      public boolean getPendingUpdate(){
        return true;
      }
      
      public void clearPendingUpdate(){
        pendingVal=false;
      }
    }
    public void update(int v,int start,int end)
    {
      if(heap[v].from==start&&heap[v].to==end){
        lazyUpdate(v);
        return;
      }
      
      int mid=(heap[v].from+heap[v].to)>>1;
      int left=v<<1;
      int right=left+1;
      
      if(start>mid)
      {
        update(right,start,end);
      }
      else if(end<=mid)
      {
        update(left,start,end);
      }
      else {
        update(left,start,mid);
        update(right,mid+1,end);
      }
      heap[v].merge(heap[left],heap[right]);
    }
    
    public void lazyUpdate(int v)
    {
      heap[v].addUpdate();
      if(!heap[v].isPropagationRequired())
        return;
      if(heap[v].from==heap[v].to)
      {
        heap[v].applyPendingUpdate();
        return;
      }
      heap[v].clearPendingUpdate();
      int mid=(heap[v].from+heap[v].to)>>2;
      int left=v<<1;
      int right=left+1;
      lazyUpdate(left);
      lazyUpdate(right);
      heap[v].merge(heap[left],heap[right]);
    }
  }
  public static void main(String[] args) throws IOException
  {
    InputReader sc=new InputReader(System.in);
    int k=0;
    String line=sc.readString();
    while(line!=null)
    {
      int n=Integer.parseInt(line);
      array=new long[n];
      for(int i=0;i<n;i++)
        array[i]=sc.readLong();
      int m=sc.readInt();
      SegmentTree tree=new SegmentTree(array);
      System.out.println("Case #"+(++k)+":");
      while(m>0)
      {
        int i=sc.readInt();
        int x=sc.readInt();
        int y=sc.readInt();
        if(x>y){
          int temp=x;
          x=y;
          y=temp;}
        if(i==0)
        {
          tree.update(1,x-1,y-1);
        }
        else
        {
          System.out.println(tree.query(x,y));
        }
        m--;
      }
      line=sc.readString();
      
      
    }
  }
    public static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];

    private int curChar;

    private int numChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new RuntimeException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public String readString() {
        final StringBuilder stringBuilder = new StringBuilder();
        int c = read();
        while (isSpaceChar(c))
            c = read();
        do {
            stringBuilder.append(c);
            c = read();
        } while (!isSpaceChar(c));
        return stringBuilder.toString();
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long readLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 }
}
          
    
      
    
      