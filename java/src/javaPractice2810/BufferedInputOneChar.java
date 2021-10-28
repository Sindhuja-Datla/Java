package javaPractice2810;
import java.io.*;  
public class BufferedInputOneChar {   
	 public static void main(String args[]){    
	  try{    
	    FileInputStream fin=new FileInputStream("C:\\Users\\dsindhuja\\OneDrive - DXC Production\\Documents\\\\testOut.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fin.close();    
	  }catch(Exception e){System.out.println(e);}    
	 }   
}
