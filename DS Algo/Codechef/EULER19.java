import java.util.Scanner;
public class EULER19
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      long y1=sc.nextLong();
      long m1=sc.nextLong();
      long d1=sc.nextLong();
      long y2=sc.nextLong();
      long m2=sc.nextLong();
      long d2=sc.nextLong();
      int count=0;
      
      if(y1==y2)
      {
        if(d1==1)
        {
          for(long j=m1;j<=m2;j++)
          {
            if(dayOfWeak(1,j,y1)==0)
              count++;
          }
        }
        else
        {
          for(long j=m1+1;j<=m2;j++)
          {
            if(dayOfWeak(1,j,y1)==0)
              count++;
          }
        }
      }
      else{
      if(d1==1)
      {
        for(long j=m1;j<=12;j++)
          if(dayOfWeak(1,j,y1)==0)
          count++;
      }
      else{
        for(long j=m1+1;j<=12;j++)
          if(dayOfWeak(1,j,y1)==0)
          count++;
      }
      
      for(long i=y1+1;i<=y2-1;i++)
      {
        for(long j=1;j<=12;j++)
        {
        if(dayOfWeak(1,j,i)==0)
          count++;
        }
      }
      for(int j=1;j<=m2;j++)
        if(dayOfWeak(1,j,y2)==0)
        count++;
      }
      System.out.println(count);
    }
  }
  
  public static long dayOfWeak(long d, long m,long y)
  {
    long[] t={0,3,2,5,0,3,5,1,4,6,2,4};
    y-=(m<3)?1:0;
    return (y+y/4-y/100+y/400+t[(int)m-1]+d)%7;
  }
}