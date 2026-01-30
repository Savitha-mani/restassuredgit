package javaprograms;

import java.util.Stack;

public class validparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="({}))";
		
		Stack<Character> stack=new Stack<Character>();
		for(char c:s.toCharArray()) {
			if(c=='(') {
				stack.push(')');
				
			}else if(c=='{') {
				stack.push('}');
			}else if(c=='[') {
				stack.push(']');
				}else {
					if(stack.isEmpty() || stack.pop()!=c) {
						System.out.println("Invalid Paranthesis");
						return;
					}
				}
				}
		
		
		if(stack.isEmpty()) {
			System.out.println("Valid Paranthesis");

		}
		else {
			System.out.println("Invalid Paranthesis");
		}
			}
		}


