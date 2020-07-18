public class WeightedQuickUnionUF
{
  private int[] id;//Constructor takes linear time
  private int[] sz;//Union and Find operation takes lgN
  
  public WeightedQuickUnionUF(int N)
  {
    id=new int[N];
    sz=new int[N];
    for(int i=0;i<N;i++)
    {
      id[i]=i;
    }
  }
  
  private int root(int i)
  {
    while(i!=id[i])
    {
      id[i]=id[id[i]];//Path Compression
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
    else{ id[j]=i;sz[j]+=sz[i];
    }
  }
}
      