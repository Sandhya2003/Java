package com.src.main;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileHandling {
public static void main(String[] args) throws Exception
{ FileOutputStream fos=new FileOutputStream("OOPs.txt");
DataOutputStream dos=new DataOutputStream(fos);
dos.writeUTF("Java");
FileInputStream fis=new FileInputStream("OOPs.txt");
DataInputStream dis=new DataInputStream(fis);
String str=dis.readUTF();
System.out.println(str);


	
}
}

      
