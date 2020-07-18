import java.util.Scanner;
public class Super
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String r="";
    char[] array=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
      char ch=array[i];
      int index=find(s,ch,i);
      if(index==-1&&array[i]!='!')
        r+=ch;
      else if(index!=-1)
        array[index]='!';
    }
    if(r.equals("")) System.out.println("Empty String");
    else
      System.out.println(r);
  }
  public static int find(String s,char ch,int k)
  {
    for(int i=k+1;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c==ch) return i;
    }
    return -1;
  }
}
      