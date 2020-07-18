import java.util.*;
punlic BinaryIndexedTree
{
  public class FenwickTree
  {
    int[] bit;//Binary Indexed Tree
    int n;
    
    public FenwickTree(int[] a)
    {
      int N=a.length;
      bit=new int[N];
      this.n=N;
      for(int i=0;i<N;i++)
        add(i,a[i]);
    }
    
    public int sum(int r)
    {
      int ret=0;
      for(;r>=0;r=(r&(r+1))-1)
        ret+=bit[r];
      return ret;
    }
    void add(int idx, int delta)
    {
      for(;idx<n;idx=(idx|(idx+1)))
        bit[idx]+=delta;
    }
    public int sum(int l, int r)
    {
      return sum(r)-sum(l-1);
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    