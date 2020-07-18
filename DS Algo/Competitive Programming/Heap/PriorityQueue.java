public class PriorityQueue
{
  
  public class MaxPQ
  {
    public int[] pq;
    public int N;
    
    public MaxPQ(int n)
    {
      this.N=0;
      pq=new int[n+1];
      Arrays.fill(pq,10000000);
      
    }
    public void swim(int k)
    {
      while(k>1&&less(k,k/2))
      {
        exch(k,k/2);
        k/=2;
      }
    }
    public void exch(int i,int j)
    {
      int temp=pq[i];
      pq[i]=temp;
      pq[j]=temp;
    }
    public  boolean less(int i,int j)
    {
      return pq[i]<pq[j];
    }
    public void insert(int x)
    {
      pq[++N]=x;
      swim(N);
    }
    public void sink(int k)
    {
      while(2*k<=N)
      {
        int j=2*k;
        if(j<N&&less(j+1,j)) j++;
        if(!less(j,k)) break;
        exch(k,j);
        k=j;
      }
    }
    public int delMax()
    {
      int max=pq[1];
      exch(1,N--);
      sink(1);
      return max;
    }
  }
}
              
      
         