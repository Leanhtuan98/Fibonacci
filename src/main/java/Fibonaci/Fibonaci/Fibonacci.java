package Fibonaci.Fibonaci;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public  class Fibonacci implements RequestHandler<Integer, Integer> {

	 public Integer handleRequest(Integer input, Context context) {
	        int n = input;
	        int fib = fibonacci(n);
	        return fib;
	    }

	    private int fibonacci(int n) {
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        } else {
	            int fib = 0;
	            int a1 = 1;
	            int a2 = 0;
	            for (int i = 2; i <= n; i++) {
	                fib = a1 + a2;
	                a2 = a1;
	                a1 = fib;
	            }
	            return fib;
	        }
	    }
	}
		





