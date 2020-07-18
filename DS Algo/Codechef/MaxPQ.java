public class MaxPQ<Key extends Comparable<Key>>
{
  private Key[] pq;
  private int N;
  
  public MaxPQ(int capacity)
  {
    pq=(Key[]) new Comparable[capacity+1];}
  
  public boolean isEmpty()
  {
    return N==0;
  }
  public void insert(Key key)
  {
    pq[++N]=key;
    swim(N);
  }
  public Key delMax()
  {
    Key max=pq[1];
    exch(1,N--);
    sink(1);
    pq[N+1]=null;
    return max;
  }
  private void swim(int k)
  {
    while(less(k/2,k)&&k>1)
    {
      exch(k/2,k);
      k=k/2;
    }
  }
  private void sink(int k)
  {
    while(2*k<=N)
    {
      int j=2*k;
      if(less(j,j+1)&&j<N) j++;
      if(!(less(k,j))) break;
      exch(j,k);
      k=j;
    }
  }
  private boolean less(int i,int j)
  {
    return pq[i].compareTo(pq[j])<0;
  }
  private void exch(int i,int j)
  {
    key t=pq[i];
    pq[i]=pq[j];
    pq[j]=t;
  }
}
         