/*
 * @author ked
 * @since 160404
 * demo how to use file decorator
 */

package com.j1.w5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;

public class FileDemoMain2 {
    public static void main(String[] args) throws Exception {
        File readme=null;
        InputStream isReadme = null;
        InputStreamReader isrReadme = null;
        BufferedReader brReadme=null;
        int i;
        char c;
        String st;
        StringBuffer sbuffer = new StringBuffer();
      
        File myhome=new File(System.getProperty("user.home"));
        System.out.println("myhome is "+myhome);

        String cwd=new File( "." ).getCanonicalPath();
        System.out.println("current working dir is "+cwd);

        readme=new File(cwd,"hello.txt");
        System.out.println("readme file is "+readme);

        isReadme=new FileInputStream(readme);
        System.out.println("Characters printed:");
        
        try{
            while((i=isReadme.read())!=-1) {
                c=(char)i;
                System.out.print(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(isReadme != null)
                isReadme.close();
        }

        try{
            isReadme=new FileInputStream(readme);
            isrReadme=new InputStreamReader(isReadme,"UTF8");
            brReadme= new BufferedReader(isrReadme);

            while((st=brReadme.readLine())!=null) {
                System.out.println("--"+st);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(brReadme != null)
                brReadme.close();
        }
    }
}