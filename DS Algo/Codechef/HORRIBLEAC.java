import java.util.*;
import java.io.*;

public class HORRIBLEAC
{
  public static class SegmentTree{
     private Node[] heap;
     private int[] array;
     private int size;
     
     public SegmentTree(int[] array){
       
       this.array=Arrays.copyOf(array,array.length);
       size=(int) (2*Math.pow(2.0,Math.floor((Math.log((double)array.length)/Math.log(2.0))+1)));
       heap=new Node[size];
       build(1,0,array.length-1);
     }
     
     public int size(){
       return array.length;
     }
     
     private void build(int v,int from, int to)
     {
       heap[v]=new Node();
       heap[v].from=from;
       heap[v].to=to;
       //System.out.println(heap[v].from+" "+heap[v].to);
       
       if(from==to){
         heap[v].sum=array[from];
         return;
       }
       else{
         int mid=(from+to)/2;
         build(2*v,from,mid);
         build(2*v+1,mid+1,to);
         heap[v].sum=heap[2*v].sum+heap[2*v+1].sum;
       }
     }
     public long rsq(int from,int to){
       Node result=new Node();
       result= rsq(1,from,to);
       return result.sum;
     }
     private Node rsq(int v, int from, int to)
     {
       Node result=new Node();
       Node n=heap[v];
       //long result;
       if(from==n.from&&to==n.to){
         result.from=n.from;
         result.to=n.to;
         //result.pendingVal=n.pendingVal;
         result.sum=n.sum+n.pendingVal*(n.size());
         return result;
       }
       int mid=(heap[v].from+heap[v].to)/2;
       if(from>mid)
       {
         result=rsq(2*v+1,from,to);
       }
       else if(to<=mid)
       {
         result=rsq(2*v,from,to);
       }
       else{
         Node leftresult=rsq(2*v,from,mid);
         Node rightresult=rsq(2*v+1,mid+1,to);
         result.from=leftresult.from;
         result.to=rightresult.to;
         result.sum=leftresult.sum+leftresult.size()*leftresult.pendingVal+rightresult.sum+rightresult.size()*rightresult.pendingVal;
         result.sum+=result.pendingVal*result.size();
         
       }
       if(n.pendingVal!=0)
       {
         result.pendingVal+=n.pendingVal;
         result.sum+=(to-from+1)*result.pendingVal;
         result.pendingVal=0;
       }
       return result;
     }
                   
     public void update(int from,int to, long value)
     {
       update(1,from,to,value);
     }
     private void update(int v, int from, int to, long value)
     {
       
       if(heap[v].from==from&&heap[v].to==to){
         heap[v].pendingVal+=value;
         return;
       }
       int mid=(heap[v].from+heap[v].to)/2;
       if(from>mid) update(2*v+1,from,to,value);
       else if(to<=mid) update(2*v,from,to,value);
       else{
         update(2*v,from,mid,value);
         update(2*v+1,mid+1,to,value);
       }
       heap[v].sum=heap[2*v].sum+heap[2*v+1].sum+heap[2*v].pendingVal*heap[2*v].size()+heap[2*v+1].pendingVal*heap[2*v+1].size();                
     }
    
      class Node{
       long sum;
       int from;
       int to;
       long pendingVal=0;
       
       //int pendingVal=0;
       int size(){
         return to-from+1;
       }
     }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int q=sc.nextInt();
      int[] a=new int[n];
      SegmentTree tree=new SegmentTree(a);
      for(int i=0;i<q;i++)
      {
        int r=sc.nextInt();
        
        if(r==0)
        {
          int s=sc.nextInt();
          int p=sc.nextInt();
          long u=sc.nextLong();
          tree.update(s-1,p-1,u);
        }
        else{
          int s=sc.nextInt();
          int p=sc.nextInt();
          System.out.println(tree.rsq(s-1,p-1));
        }
      }
    }
  }
  
}
                             
                           
      

    
         
     
     
       