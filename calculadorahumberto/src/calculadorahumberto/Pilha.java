package calculadorahumberto;

public class Pilha { 
		private No topo;
		public Pilha() {topo = null; }
		public boolean empty() { return (topo == null);}
		public int top() { return topo.item; }
		public void pop() { if (!empty()) topo = topo.anterior; }
		public void push(int valor) {
			No novo = new No(); 
			novo.item = valor;
			novo.anterior = topo;
			topo = novo; 
			}
		}
