import java.util.*;
import java.io.*;
public class BRCKTS
{
  static char[] array;  
  public static class SegmentTree{
    public Node[] heap;     
    private int getsize(int N){
      int size=1;
      for(;size<N;size<<=1);
      return size<<1;}      
    public SegmentTree(char[] a){
      int size = getsize(a.length);
      //System.out.println(size);
      heap=new Node[size];
      build(a,1,0,a.length-1);}
    private void build(char[] a,int v,int lo, int hi){      
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
    public boolean rsq(int from,int to){
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
      public int unmatchedLeft,unmatchedRight;      
      public void assignValue(char x){
        if(x=='(')
        {
          unmatchedLeft=1;
          unmatchedRight=0;
        }
        else if(x==')')
        {
          unmatchedLeft=0;
          unmatchedRight=1;
        }
      }
      public void merge(Node left, Node right){
        int matches=Math.min(left.unmatchedLeft,right.unmatchedRight);
        unmatchedLeft=left.unmatchedLeft+right.unmatchedLeft-matches;
        unmatchedRight=left.unmatchedRight+right.unmatchedRight-matches;
      }
      public boolean getvalue()
      {
        return unmatchedLeft==0&&unmatchedRight==0;
      }
    }
    public void update(int index){
      char value;
      if(array[index-1]=='(') {
        array[index-1]=')';
        value=')';
      }
      else{
        value='(';
        array[index-1]='(';
      }
      update(1,0,array.length-1,index-1,value);}
    private void update(int v,int lo,int hi,int index,char value){
      if(lo==hi){
        heap[v].assignValue(value);
        return;
      }            
      int left=2*v;
      int right=left+1;
      int mid=(lo+hi)/2;
      if(index<=mid)
        update(left,lo,mid,index,value);
      else
        update(right,mid+1,hi,index,value);
      heap[v].merge(heap[left],heap[right]);}
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=10;
    int kg=0;
    while(t-->0)
    {
      int n=sc.nextInt();
      String s=sc.next();
      array=new char[n];
      array=s.toCharArray();
      SegmentTree tree=new SegmentTree(array);
      int m=sc.nextInt();
      kg++;
      System.out.println("Test "+kg+":");
      for(int i=0;i<m;i++)
      {
        int k=sc.nextInt();
        if(k==0)
          System.out.println((tree.rsq(1,n)?"YES":"NO"));
        else tree.update(k);
      }
    }
  }
}
  
    