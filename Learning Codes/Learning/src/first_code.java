import java.util.Scanner;

public class first_code {

public static void main(String[] args) {
        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        int x=A.length()+B.length();
//        System.out.println(x);
//        int z=A.compareTo(B);
//        if(z<1){
//        	System.out.println("No");
//        }
//        else {
//			System.out.println("Yes");
//		}
//        String C=A.substring(0,1).toUpperCase()+A.substring(1);
//        String D=B.substring(0,1).toUpperCase()+B.substring(1);
//        System.out.println(C+" "+D);
        /* Enter your code here. Print output to STDOUT. */
	
//	Scanner in = new Scanner(System.in);
//    String S = in.next();
//    int start = in.nextInt();
//    int end = in.nextInt();
//    String a=S.substring(start, end);
//    
//    System.out.println(a);
	
	Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String R=new StringBuffer(A).reverse().toString();
    if(A.equals(R)){
    	System.out.println("Yes");
    }else {
		System.out.println("No");
	}
        
    }

}
