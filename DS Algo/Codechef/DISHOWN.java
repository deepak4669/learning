import java.util.*;
public class DISHOWN
{  
  public static class  QuickUnionUF//this takes linear time in worst case in all things.
{
  private int[] id;
  
  
  public QuickUnionUF(int N)
  {
    id=new int[N];
    
    for(int i=0;i<N;i++) id[i]=i;
  }
  
  private int root(int p)
  {
    if(p!=id[p])
    {
      id[p]=root(id[p]);
    }
    return id[p];
  }
  
  public boolean connected(int p,int q)
  {
    return root(p)==root(q);
  }
  
  public void union(int p,int q)
  {
    int i=root(p);
    int j=root(q);
    id[i]=j; 
    
  }
}
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder();
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      QuickUnionUF u=new QuickUnionUF(n);
      int[] s=new int[n];
      for(int j=0;j<n;j++)
        s[j]=sc.nextInt();
      int q=sc.nextInt();
      for(int j=0;j<q;j++)
      {
        int a=sc.nextInt();
        if(a==0)
        {
          int b=sc.nextInt();
          int c=sc.nextInt();
          b-=1;
          c-=1;
          
          if(u.connected(b,c)){
            sb.append("Invalid query!"+'\n');
            continue;
          }
          if(s[u.root(b)]>s[u.root(c)]) u.union(c,b);
          else if(s[u.root(b)]<s[u.root(c)]) u.union(b,c);
        }
        else
        {
          int d=sc.nextInt();
          int ans=u.root(--d)+1;
          sb.append(ans+""+'\n');
        }
      }
    }
    System.out.print(sb.toString());
  }
}
    