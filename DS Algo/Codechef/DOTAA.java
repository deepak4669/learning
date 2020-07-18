import java.util.*;
import java.io.*;

public class DOTAA
{
  public static void main(String[] args) throws IOException
  {
    new DOTAA().run();
  }
  public void run() throws IOException
  {
    Parser sc=new Parser(System.in);
    PrintWriter out=new PrintWriter(System.out);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int value=sc.nextInt();
      
      int sum=0;
      for(int i=0;i<n;i++)
        sum+=(sc.nextInt()-1)/value;
      
      if(sum<m)
        out.println("NO");
      else
        out.println("YES");
      out.flush();
    }
  }
   static class Parser {
        final private int BUFFER_SIZE = 65536;  // 2^16, a good compromise for some problems
        private InputStream din;    // Underlying input stream
        private byte[] buffer;      // Self-maintained buffer
        private int bufferPointer;  // Current read position in the buffer
        private int bytesRead;      // Effective bytes in the buffer read from the input stream

        public Parser(InputStream in) {
            din = in;
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        /**
         * Read the next integer from the input stream.
         * @return The next integer.
         * @throws IOException
         */
        public int nextInt() throws IOException {
            int result = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            while (c >= '0' && c <= '9') {
                result = result * 10 + c - '0';
                c = read();
            }
            if (neg) return -result;
            return result;
        }

        /**
         * Read the next byte of data from the input stream.
         * @return the next byte of data, or -1 if the end of the stream is reached.
         * @throws IOException if an I/O error occurs.
         */
        public byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        /**
         * Read data from the input stream into the buffer
         * @throws IOException if an I/O error occurs.
         */
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
    }
}
        
        