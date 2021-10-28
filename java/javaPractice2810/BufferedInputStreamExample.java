package javaPractice2810;
import java.io.*;  
public class BufferedInputStreamExample {   
	 public static void main(String args[]){    
	  try{    
	    FileInputStream fin=new FileInputStream("C:\\Users\\dsindhuja\\OneDrive - DXC Production\\Documents\\\\testOut.txt");    
	    BufferedInputStreamExample bin=new BufferedInputStreamExample(fin);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fin.close();    
	  }catch(Exception e){System.out.println(e);}    
	 }   
}
