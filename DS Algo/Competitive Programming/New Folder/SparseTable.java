//Sparse Table

public class SparseTable
{
  public int n;
  public long[][] st;
  public int k;
  
  public SparseTable(int[] a)
  {
    this.n=a.length;
    this.k=25;
    st=new long[this.n][k+1];
    for(int i=0;i<n;i++)
      st[i][0]=a[i];
    
    for(int j=1;j<=k;j++)
    {
      for(int i=0;(i+(1<<j))<=n;i++)
      {
        st[i][j]=st[i][j-1]+st[i+(i<<(j-1))][j-1];
      }
    }
  }
  public long query(int l, int r)
  {
    long sum=0;
    for(int j=k;j>=0;j--)
    {
      if((1<<j)<=(r-l+1))
      {
        sum+=st[l][j];
        l+=1<<j;
      }
    }
    return sum;
  }
  
      
      
    
  
  
  public static void main(String[] args)
  {
  }
}
  