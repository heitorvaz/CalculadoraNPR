package calculadorahumberto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NPR {
		public static void main(String[] args) throws IOException {
		Pilha p = new Pilha();
		int x1, x2;
		char c;
		System.out.println(" Siga esse exemplo(expressao em notaçao polonesa reversa):\n 4 2 + 3 * 3 6 * + ");
		System.out.print("Informe sua expressao:\n ");
		
		String s = lerString(); 
		
		for (int i=0; i<s.length(); i++) {
			c = s.charAt(i); // ler caracter por caracter
		if (Character.isDigit(c)){ // checar se o caracter é numero 
		p.push(Character.digit(c,10)); }// transformar char em int e add na pilha 
		
		else if(c=='+') { 
			x1 = p.top(); p.pop(); 
			x2 = p.top(); p.pop(); 
			p.push(x2+x1);
			} 
		else if(c=='*') { 
			x1 = p.top(); p.pop(); 
			x2 = p.top(); p.pop(); 
			p.push(x2*x1); 
			}
	 else if(c=='-') {
		 x1 = p.top(); p.pop();
		 x2 = p.top(); p.pop();
		 p.push(x2-x1); 
		 }
	 else if(c=='/') {
		 x1 = p.top(); p.pop(); 
		 x2 = p.top(); p.pop(); 
		 p.push(x2/x1); 
		 }
	 else if(c=='^') { 
		 x1 = p.top(); p.pop();
		 x2 = p.top(); p.pop(); 
		 p.push((int) Math.pow(x2,x1)); 
		 }
	 }
		System.out.println("Resposta = " + p.top());
		p.pop(); 
		} 
		
		public static String lerString() throws IOException { // ler a string 
			InputStreamReader isr = new InputStreamReader(System.in); 
			BufferedReader br = new BufferedReader(isr); 
			return br.readLine(); } 
	}




