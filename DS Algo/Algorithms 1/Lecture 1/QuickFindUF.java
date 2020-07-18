public class QuickFindUF//Find Operation is constant time but the union query is linear.
{
  private int[] id;
  public QuickFindUF(int N)
  {
    id=new int[N];
    for(int i=0;i<N;i++)
      id[i]=i;
  }
  
  public boolean connected(int p, int q)
  {
    return id[p]==id[q];
  }
  
  public void union(int p,int q)
  {
    int pid=id[p];//We need to create these
    int qid=id[q];
    if(pid==qid) return;
    for(int i=0;i<id.length;i++)
    {
      if(id[i]==pid) id[i]=qid;//if(id[i]==id[p]) id[i]=id[q]; is wrong since value of id[p] changes;
    }
  }
}
       