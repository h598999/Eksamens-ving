import java.util.Stack;

public class Test {
	
	
		public static void main(String[] args) {
		    Stack<Integer> stabel = new Stack<Integer>();


		    for (int i = 1; i <= 5; i++) {
		            stabel.push(i);
		    }


		    for (int i = 1; i <= 4; i++) {
		           stabel.pop();
		      }

		    System.out.println(stabel.pop());
		    
		 System.out.println(f(4,2));
		
	}
		
		public static int f(int n, int k) {
	        if (k == 1) {
	            return n;
	        } else if(n == k) {
	            return 1;
	        } else {
	            return f(n - 1, k) + f(n - 1, k - 1);
	        }
	    }

}
