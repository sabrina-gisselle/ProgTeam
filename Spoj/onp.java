import java.util.*;

class ONP {

	public static void main(String arg[]){
		Scanner kb = new Scanner(System.in);
		int num = Integer.parseInt(kb.nextLine());
		String[] inputs = new String[num];
		//kb.nextLine();
		for(int i = 0; i < num; ++i){
			inputs[i] = kb.nextLine();
		}
		for(int i = 0; i < num; ++i){
			Stack<Character> stackChar = new Stack<Character>();

			Queue<Character> queueChar = new LinkedList<Character>();

			for(int j = 0; j<inputs[i].length(); ++j){
				char cur = inputs[i].charAt(j);
				if(cur != ')'){
					if (Character.isLetter(cur)){
						queueChar.add(cur);
					}else {
						stackChar.push(cur);
					}
				}else if(cur == ')'){
					while(queueChar.peek() != null){
						System.out.print(queueChar.remove());
					}
					boolean temp = true;
					while(!stackChar.empty() && temp){
						if(stackChar.peek() == '('){
							stackChar.pop();

							temp = false;
							break;
						}else{
							System.out.print(stackChar.pop());
						}
					}
					
				}

			}
			System.out.println();
		}
		


		

	}
	
}