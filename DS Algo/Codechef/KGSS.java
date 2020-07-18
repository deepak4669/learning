import java.util.*;
import java.io.*;
public class KGSS
{
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
      return result.getvalue();}
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
      public int maxSum,secondMax;      
      public void assignValue(int x){
        maxSum=x;
        secondMax=-1;
      }
      public void merge(Node left, Node right){
        maxSum=Math.max(left.maxSum,right.maxSum);
        secondMax=Math.min(Math.max(left.maxSum,right.secondMax),Math.max(left.secondMax,right.maxSum));
      }
      public int getvalue(){
        return maxSum+secondMax;
      }
    }
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
  
  public static void main(String[] args)throws IOException
  {
    Reader sc=new Reader();
    int n=sc.nextInt();
    array=new int[n];
    for(int i=0;i<n;i++)
      array[i]=sc.nextInt();
    int m=sc.nextInt();
    SegmentTree tree=new SegmentTree(array);
    while(m>0)
    {
      char s=sc.nextChar();
      //System.out.println(s);
      if(s=='Q')
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(tree.rsq(a,b));
      }
      else
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        tree.update(a,b);
      }
      m--;
    }
  }
  
static class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    public Reader(){
        din=new DataInputStream(System.in);
        buffer=new byte[BUFFER_SIZE];
        bufferPointer=bytesRead=0;
    }

    public Reader(String file_name) throws IOException{
        din=new DataInputStream(new FileInputStream(file_name));
        buffer=new byte[BUFFER_SIZE];
        bufferPointer=bytesRead=0;
    }

    public String readLine() throws IOException{
        byte[] buf=new byte[64]; // line length
        int cnt=0,c;
        while((c=read())!=-1){
            if(c=='\n')break;
            buf[cnt++]=(byte)c;
        }
        return new String(buf,0,cnt);
    }

    public int nextInt() throws IOException{
        int ret=0;byte c=read();
        while(c<=' ')c=read();
        boolean neg=(c=='-');
        if(neg)c=read();
        do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');
        if(neg)return -ret;
        return ret;
    } 

    public long nextLong() throws IOException{
        long ret=0;byte c=read();
        while(c<=' ')c=read();
        boolean neg=(c=='-');
        if(neg)c=read();
        do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');
        if(neg)return -ret;
        return ret;
    }

    public double nextDouble() throws IOException{
        double ret=0,div=1;byte c=read();
        while(c<=' ')c=read();
        boolean neg=(c=='-');
        if(neg)c = read();
        do {ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');
        if(c=='.')while((c=read())>='0'&&c<='9')
            ret+=(c-'0')/(div*=10);
        if(neg)return -ret;
        return ret;
    }
    
    public char nextChar() throws IOException{
        byte c=read();
        while(c<=' ')c=read();
        return (char)c;
    }
    
    private void fillBuffer() throws IOException{
        bytesRead=din.read(buffer,bufferPointer=0,BUFFER_SIZE);
        if(bytesRead==-1)buffer[0]=-1;
    }
    
    private byte read() throws IOException{
        if(bufferPointer==bytesRead)fillBuffer();
        return buffer[bufferPointer++];
    }
    
    public void close() throws IOException{
        if(din==null) return;
        din.close();
    }
}

}
                         
                          
  
   