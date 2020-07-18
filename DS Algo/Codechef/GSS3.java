import java.io.*;
import java.util.*;
public class GSS3{
  static int[] array;  
  public static class SegmentTree{
    public Node[] heap;     
    private int getsize(int N){
      int size=1;
      for(;size<N;size<<=1);
      return size<<1;}      
    public SegmentTree(int[] a){
      int size = getsize(a.length);
      heap=new Node[size];
      build(a,1,0,a.length-1);}
    private void build(int[] a,int v,int lo, int hi){      
      heap[v]=new Node();
      if(lo==hi){
        heap[v].assignValue(a[lo]);
        return;}                   
      int left=2*v;
      int right=left+1;
      int mid=((lo+hi)/2);
      build(a,left,lo,mid);
      build(a,right,mid+1,hi);
      heap[v].merge(heap[2*v],heap[2*v+1]);}
    public int rsq(int from,int to){
      Node result= rsq(1,0,array.length-1,from-1,to-1);
      return result.maxSum;}
    private Node rsq(int v,int lo,int hi,int from, int to){
      if(lo==from&&hi==to)
        return heap[v];      
      int mid=(lo+hi)/2;
      if(from>mid)return rsq(2*v+1,mid+1,hi,from,to);        
      if(to<=mid)return rsq(2*v,lo,mid,from,to);        
      Node leftResult=rsq(2*v,lo,mid,from,mid);
      Node rightResult=rsq(2*v+1,mid+1,hi,mid+1,to);
      Node result=new Node();
      result.merge(leftResult,rightResult);
      return result;}        
    public class Node{
      public int maxSum,prefixMaxSum,suffixMaxSum,totalSum;      
      public void assignValue(int x){
        maxSum=prefixMaxSum=suffixMaxSum=totalSum=x;}
      public void merge(Node left, Node right){
        totalSum=left.totalSum+right.totalSum;
        prefixMaxSum=Math.max(left.prefixMaxSum,left.totalSum+right.prefixMaxSum);
        suffixMaxSum=Math.max(right.suffixMaxSum,left.suffixMaxSum+right.totalSum);
        maxSum=Math.max(prefixMaxSum,Math.max(suffixMaxSum,Math.max(left.maxSum,Math.max(right.maxSum,left.suffixMaxSum+right.prefixMaxSum))));}}
    public void update(int index, int value){
      update(1,0,array.length-1,index-1,value);}
    private void update(int v,int lo,int hi,int index,int value){
      if(lo==hi){
        heap[v].assignValue(value);return;}            
      int left=2*v;
      int right=left+1;
      int mid=(lo+hi)/2;
      if(index<=mid)
        update(left,lo,mid,index,value);
      else
        update(right,mid+1,hi,index,value);
      heap[v].merge(heap[left],heap[right]);}}
    public static void main(String[] args) //throws IOException
    {
    final InputReader sc=new InputReader(System.in);
    PrintWriter out=new PrintWriter(System.out,true);
    int n=sc.readInt();
    array=new int[n];
    for(int i=0;i<n;i++)
      array[i]=sc.readInt();
    int m=sc.readInt();
    SegmentTree tree=new SegmentTree(array);   
    for(int i=0;i<m;i++)
    {
      int x=sc.readInt();
      int y=sc.readInt();
      int z=sc.readInt();
      if(x==0) tree.update(y,z);
      else 
      out.println(tree.rsq(y,z));
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

    
        