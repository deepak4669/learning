public class Euler85A
{
  public static void main(String[] args)
  {
//    Scanner sc=new Scanner(System.in);
    int x=8000000;
    int ans=0;
    int ansi=0;
    int ansj=0;
    
    int diff=100000000;  
    for(int i=1;i<=2001;i++)
    {
      for(int j=1;j<=2001;j++)
      {
        if(Math.abs(x-i*j*(i+1)*(j+1))<diff)
        {
          diff=Math.abs(x-i*j*(i+1)*(j+1));
          ans=i*j;
          ansi=i;
          ansj=j;
        }
      }
    }
    System.out.println(ansi);
    System.out.println(ansj);
      
    System.out.println(ans);
  }
}