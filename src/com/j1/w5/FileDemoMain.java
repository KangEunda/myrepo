/*
 * @author ked
 * @since 160404
 * demo how to use file decorator
 * 
 */

package com.j1.w5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileDemoMain {
  public static void main(String[] args) throws Exception {
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      String cwd = new File(".").getCanonicalPath();
      System.out.println("cwd is " + cwd);
      
      File readme = new File (cwd,"HelloWorld.java");
      System.out.println("readme is " + readme);
      
      InputStream isReadme = new FileInputStream(readme);
    try{
      //File readme = null;
      int i;
      char c;

      while((i=isReadme.read()) !=-1) {
        c = (char)i;
        System.out.print(c);
      }
    }catch(Exception e) {
      e.printStackTrace();
    }finally{
      if(isReadme != null)
        isReadme.close();
    }
  }
}