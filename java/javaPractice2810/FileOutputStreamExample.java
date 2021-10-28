package javaPractice2810;
	import java.io.FileOutputStream;  
	public class FileOutputStreamExample { 
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("C:\\Users\\dsindhuja\\OneDrive - DXC Production\\Documents\\\\testOut.txt");    
	             String s="Hi Sindhu.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  

