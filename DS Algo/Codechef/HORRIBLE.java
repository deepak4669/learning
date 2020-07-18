import java.util.*;
import java.io.*;

public class HORRIBLE
{
  static long[] array;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int c=sc.nextInt();
      
      array=new long[n];
      SegmentTree tree=new SegmentTree(array);
      //tree.update(1,0,7,80);
      //tree.heap[1].applyPendingUpdate();
      //System.out.println(tree.heap[8].total);
      while(c>0)
      {
        int a=sc.nextInt();
        if(a==0)
        {
          int p=sc.nextInt();
          int q=sc.nextInt();
          long v=sc.nextLong();
          tree.update(1,p-1,q-1,v);          
        }
        else{
          int p=sc.nextInt();
          int q=sc.nextInt();
          System.out.println(tree.query(p,q));
        }
        c--;
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
      int mid=(lo+hi)/2;
      int left=2*v;
      int right=left+1;
      build(a,left,lo,mid);
      build(a,right,mid+1,hi);
      heap[v].merge(heap[left],heap[right]);
    }
    public long query(int from,int to)
    {
      Node result=query(1,from-1,to-1);
      return result.getValue();
    }
    public Node query(int v,int start,int end)
    {
      if(heap[v].from==start&&heap[v].to==end){
        Node result=heap[v];
        if(result.hasPendingUpdate())
          result.applyPendingUpdate();
        return result;
      }
      int mid=(heap[v].from+heap[v].to)>>1;
      int left=v<<1;
      int right=left+1;
      Node result=new Node();
      if(start>mid)
        result=query(right,start,end);
      else if(end<=mid)
        result=query(left,start,end);
      else{
        Node leftchild=query(left,start,mid);
        Node rightchild=query(right,mid+1,end);
        result.from=leftchild.from;
        result.to=rightchild.to;
        result.merge(leftchild,rightchild);
      }
      if(heap[v].hasPendingUpdate())
      {
        result.addUpdate(heap[v].getPendingUpdate());
        result.applyPendingUpdate();
      }
      return result;
    }
    
    public void update(int v,int start, int end, long value)
    {
      if(heap[v].from==start&&heap[v].to==end)
      {
        heap[v].addUpdate(value);
        return;
      }
      
      int mid=(heap[v].from+heap[v].to)>>1;
      int left=v<<1;
      int right=left+1;
      if(start>mid)
        update(right,start,end,value);
      else if(end<=mid)
        update(left,start,end,value);
      else{
        update(left,start,mid,value);
        update(right,mid+1,end,value);
      }
      heap[v].merge(heap[left],heap[right]);
    }
    
    public class Node{
      int from,to;
      long total,pendingVal;
      
      public Node(){
        total=0;
        pendingVal=0;
      }
      
      void assignValue(long value)
      {
        total=value;
      }
      
      void merge(Node left,Node right)
      {
        total=left.total+right.total;
        if(left.pendingVal>0)
          total+=left.pendingVal*(left.to-left.from+1);
        if(right.pendingVal>0)
          total+=right.pendingVal*(right.to-right.from+1);
      }
      
      public long getValue()
      {
        return total;
      }
      
      public boolean hasPendingUpdate()
      {
        return pendingVal!=0;
      }
      public void applyPendingUpdate(){
        total+=(to-from+1)*pendingVal;
        pendingVal=0;
      }
      public void addUpdate(long value)
      {
        pendingVal+=value;
      }
      public long getPendingUpdate()
      {
        return pendingVal;
      }
    }
  }
}
      
        
        
          
          
          
      