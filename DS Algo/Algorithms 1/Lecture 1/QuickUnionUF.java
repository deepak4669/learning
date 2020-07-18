public class QuickUnionUF//this takes linear time in worst case in all things.
{
  private int[] id;
  private int[] sz;
  
  public QuickUnionUF(int N)
  {
    id=new int[N];
    sz=new int[N];
    for(int i=0;i<N;i++) id[i]=i;
  }
  
  private int root(int i)
  {
    while(id[i]!=i)
    {
      i=id[i];
    }
    return i;
  }
  
  public boolean connected(int p,int q)
  {
    return root(p)==root(q);
  }
  
  public void union(int p,int q)
  {
    int i=root(p);
    int j=root(q);
    if(sz[i]>sz[j]){ id[i]=j; sz[i]+=sz[j];}
    else { id[j]=i; sz[j]+=sz[i];}
  }
}