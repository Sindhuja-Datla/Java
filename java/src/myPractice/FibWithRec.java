package myPractice;
  class FibWithRec{
     static int n1=0,n2=1,n3=0;
     static void FibFun(int count) {
	
	 if(count>0) {
		 int n3=n1+n2;
		n1=n2;
		n2=n3;
		 System.out.print(" "+n3);
		 FibFun(count-1);
	  }
     }
   public static void main(String args[]) {
    int count=14;
    System.out.print(n1+" "+n2);
    FibFun(count-2);
    }
  }
