package test;

import java.io.*;
public class ReadFile
{  public static void main(String[] args)
   {  int b;
      byte tom[ ]=new byte[25];
      try
      {     File f=new File("ReadFile.java");
      		//f.createNewFile();
            FileInputStream in=new FileInputStream(f); //1. 创建输入流
            while((b = in.read(tom, 0, 25))!=-1)            //2. 使用输入流读
            {      String s = new String(tom, 0, b);
                   System.out.print(s);
            }
            in.close();                                                   //3. 关闭输入流
      }
      catch(IOException e)
      {  System.out.println("File read Error"+e);
      }
   }
} 
