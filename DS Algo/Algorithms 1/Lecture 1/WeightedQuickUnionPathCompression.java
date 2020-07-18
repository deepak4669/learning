public class WeightedQuickUnionPathCompression
{
  private int[] id;
  private int[] sz;
  
  public WeightedQuickUnionPathCompression(int N)
  {
    id=new int[N];
    sz=new int[N];
    for(int i=0;i<N;i++)
      id[i]=i;
  }
  
  public int find(int p)
  {
    int root=p;
    while(root!=id[root])
    {
      root=id[root];
    }
    while(p!=root)
    {
      int newp=id[p];
      id[p]=root;
      p=newp;
    }
    return root;
  }
  public int find_recursicve(int p)
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
    if(i==j) return;
    if(sz[i]>sz[j]) { id[i]=j; sz[i]+=sz[j];}
    else{
      id[j]=id[i]; sz[j]+=sz[i];
    }
  }
}
       