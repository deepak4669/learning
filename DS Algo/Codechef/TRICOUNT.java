import java.util.*;
import java.io.*;
public class TRICOUNT{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0){
      long n=Long.parseLong(br.readLine());
      System.out.println((n*(n+2)*(2*n+1))/8);
    }}}
    
      
  