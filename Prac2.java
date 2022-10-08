import java.util.*;
import java.io.*;
//21ce037  Utsav Gundaraniya
// When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give example. 
public class Prac2 {
    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Initially assigning null as we have not read
        // anything
        FileReader sourceStream = null;

        // Try block to check for exceptions
        try {

            // Reading from file
            sourceStream = new FileReader(
                    "/Users/mayanksolanki/Desktop/demo.rtf");


            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);

           
            System.out.println("Program successfully executed");
        }
        finally {
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
