public class BIT
{
  int[] BIT;
  int[] a;
  int n;
  public BIT(int[] a, int n)
  {
    this.n=n;
    
    this.a=new int[n+1];
    this.BIT=new int[n+1];
    for(int i=1;i<=n;i++)
    {
      this.a[i]=a[i-1];
      update(i,a[i-1]);
    }
  }
  public void update(int x, int val)
  {
    for(;x<=n;x+=(x&-x))
    {
      //System.out.println(x);
      BIT[x]+=val;
    }
  }
  public int query(int x)
  {
    int sum=0;
    for(;x>0;x-=(x&-x))
      sum+=this.BIT[x];
    return sum;
  }
  public static void main(String[] args)
  {
    int[] a={-2,0,4,5,6,4,2};
    BIT x=new BIT(a,7);
    System.out.println(x.query(2)+""+x.query(4));
  }
    
}
      
          
    
        
      