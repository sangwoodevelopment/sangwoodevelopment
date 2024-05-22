package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_9012 {
	public static String checkVPS(String inputdata) {
		String result = "YES";
		Stack<Character> stack = new Stack<>();
		for(char c:inputdata.toCharArray()) {
			if(c=='(') {
				stack.push(c);
			}else {
				if(stack.empty()) {
					result = "NO";
				}else {
					stack.pop();
				}
			}
		}
		if(!stack.empty()) {
			result = "NO";
		}
		return result;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); 
		for(int i=0; i<count; i++) {
			System.out.println(checkVPS(br.readLine()));
		}
	}

}
