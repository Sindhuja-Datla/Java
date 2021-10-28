package javaPractice2810;
	import java.io.FileInputStream;  
	public class FileInputStreamOneChar {  
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\dsindhuja\\OneDrive - DXC Production\\Documents\\testOut.txt");    
	            int i=fin.read();   
	            System.out.print((char)i);    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }  

