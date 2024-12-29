package piploy;

import java.util.ArrayList;

public class mypilot {

		@SuppressWarnings("unused")
		public static void main(String[] args) {
			var joao = "joao";
			//primitive types
			
			byte jk = 100;
			short je = 10000;
			int pe = 100000;
			long jua = 1000000L;//just changes memory
			float go = 10.5f;//simple precision
			double gone = 20.5;//double precision
			String jonh = "joao";
			String jogo;
			char c = 'c';
			boolean k = false; 
			boolean l = jonh.isBlank();//if is empty
			
			//vectors
			
			int colecao[] = {1,2,3,4};//vector 
			int tam = colecao.length;//
			int[] meusint = new int[5];//create a empty array with length 5
			
			//Array lists
			
			ArrayList<String> nomes = new ArrayList<>();// empty array list 
			nomes.add("joao");//add
			nomes.add("gui");
			nomes.add("emanuel");
			
			if(jonh.equals("joao")){//if variable is equal to
				System.out.println("verdadeiro");
			}
			else {
				System.out.println("falso");
			}
			
			System.out.println(colecao[0]);
			System.out.println(tam);
			
			System.out.println(nomes.get(0));//read a determinate valor in array list
			nomes.remove(0);//remove in local
			System.out.println(nomes.get(0));
			
			//loops
			for(int i = 0; i<nomes.size();i++) {
				System.out.println(nomes.get(i));
			}
			for(String nome: nomes) {//running the array list
				System.out.println(nome);
			}
			for(int num: colecao) {
				System.out.println(num);
			}
			int i = 0;
			
			while(i<nomes.size()) {
				System.out.println(nomes.get(i));
				i++;
			}
			i = 0;
			do {
				System.out.println(nomes.get(i));
				i++;
			}while(i<nomes.size()-1);
			
			//casting
			double result = 0.0;
			int resul2 = (int)result;
			double tree = resul2;
			String teste = "10";
			int conver = Integer.parseInt(teste);//convert
			String ver = String.valueOf(conver);
			
			
			
			
		

	}

}
