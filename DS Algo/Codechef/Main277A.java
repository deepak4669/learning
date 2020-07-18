import java.util.Scanner;
import java.util.Vector;
public class Main277A
{
  public static class UnionFind
  {
    private int[] id;
    private int[] sz;
    private int disjoint;
    public UnionFind(int N)
    {
      id=new int[N];
      sz=new int[N];
      disjoint=N;
      for(int i=0;i<N;i++)
        id[i]=i;
    }
    public int find(int p)
    {
      if(p!=id[p])
      {
        id[p]=find(id[p]);
      }
      return id[p];
    }
    public boolean connected(int p,int q)
    {
      return find(p)==find(q);
    }
    public void union(int p,int q)
    {
      int i=find(p);
      int j=find(q);
      
      if(i==j) return ;
      if(sz[i]>sz[j]){
        id[i]=j;
        sz[j]+=sz[i];
      }
      else
      {
        id[j]=i;
        sz[i]+=sz[j];
      }
      disjoint--;
    }
    public int sets()
    {
      return disjoint;
    }
  }
       
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    Vector<Integer>[] a=(Vector<Integer>[]) new Vector[m+1];
    for(int i=0;i<m+1;i++)
      a[i]=new Vector<Integer>();
    for(int i=1;i<=n;i++)
    {
      int val=sc.nextInt();
      for(int j=0;j<val;j++)
      {
        int x=sc.nextInt();
        a[x].add(i);
      }
    }
    UnionFind uf=new UnionFind(n);
    boolean flag=false;
    
    for(int i=1;i<=m;i++)
    {
      if(a[i].size()!=0)
      {
        flag=true;
        int v=a[i].get(0);
        for(int w:a[i])
        {
          //flag=true;
          //System.out.println(v+" "+w);
          uf.union(v-1,w-1);
        }
      }
    }
    if(!flag)
      System.out.println(uf.sets());
    else
      System.out.println(uf.sets()-1);
  }
}
    
    
        
    
    