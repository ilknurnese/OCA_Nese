package main.Java.Q006;

import java.io.IOException;

public class Q006 {

//    Given the code fragment:
//
//   4.  class X{
//   5.      public void printFileContent()  {
//   6.          /*code goes here */
//   7.          throw new IOException();
//   8.      }
//   9. }
//   10. public class Test {
//   11.    public static void main(String[] args)  {
//   12.         X xobj = new X();
//   13.         xobj.printFileContent();
//   14.     }
//   15.   }
//

}


    /*

    Which two modifications should you make so that the code compiles successfully? choose two.
    A. Replace line 13 with:

    try {
    xobj.printFileContent();
    }
    catch (Exception e) {}
    catch (IOException e) {}

    B. Replace line 7 with throw IOException (Exception raised);
    C. Replace line 11 with public static void main(String[] args) throws Exception{
    D. At line 14, insert throw IOException();
    E. Replace line 5 with public void printFileContent() throws IOException {



    */

