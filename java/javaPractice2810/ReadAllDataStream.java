package javaPractice2810;
 import java.io.FileInputStream;  

   public class ReadAllDataStream {
	     public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("C:\\\\Users\\\\dsindhuja\\\\OneDrive - DXC Production\\\\Documents\\\\testOut.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }  

