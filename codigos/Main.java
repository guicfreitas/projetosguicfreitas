import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class Main{
		
	public static void main(String[] args) throws IOException{
		Matriz mat1,mat2;
		
		long inicio, fim, resultado,det,det2,det3;
		long inicioNano, fimNano, resultadoNano;
		det=0;
		det2=0;
		det3=0;

		FileWriter arquivo = new FileWriter("Result.txt",true);
		PrintWriter gravarArq = new PrintWriter(arquivo);
		
		Vetor vet = new Vetor(6);
		vet.setElemento(0,3);
		vet.setElemento(1,5);
		vet.setElemento(2,7);
		vet.setElemento(3,9);
		vet.setElemento(4,11);
		vet.setElemento(5,13);

		mat1 = new Matriz(3,3);
			
		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();
			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 3x3: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 3x3: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 3x3: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}
			mat1 = new Matriz(5,5);
			

		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();
			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 5x5: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 5x5: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 5x5: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}

			mat1 = new Matriz(7,7);
			
		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();

			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 7x7: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 7x7: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 7x7: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}

			mat1 = new Matriz(9,9);
			

		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();
			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 9x9: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 9x9: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 9x9: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}

			mat1 = new Matriz(11,11);
			

		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();
			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 11x11: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 11x11: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 11x11: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}
			mat1 = new Matriz(13,13);
			
		for(int cont=0;cont<3;cont++){
			mat1.inicializaRandomico(9);
			mat1.imprime();

			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det= mat1.determinante();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det);

			gravarArq.printf("+--Resultado Nao Otimizado--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 13x13: %d %n",det);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			
			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det2= mat1.detOtimizado();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;
			
			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det2);

			gravarArq.printf("+--Resultado da Primeira Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 13x13: %d %n",det2);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);


			inicio = System.currentTimeMillis();
			inicioNano = System.nanoTime();
			det3= mat1.detOtimizado2();
			fim = System.currentTimeMillis();
			fimNano = System.nanoTime();
			resultadoNano = fimNano - inicioNano;
			resultado = fim - inicio;

			
			System.out.println("Milisegundos: "+resultado);
			System.out.println("Nanosegundos: "+resultadoNano);
			System.out.println("Resultado Determinante: "+det3);

			gravarArq.printf("+--Resultado da Segunda Otimizacao--+%n%n");
			gravarArq.printf("Determinante da matriz de ordem: 13x13: %d %n",det3);
			gravarArq.printf("Tempo em Nanosegundos: %d %n",resultadoNano);
			gravarArq.printf("Tempo em Milisegundos: %d %n %n",resultado);

		}

		gravarArq.printf("+--FIM DA EXECUCAO--+%n%n");
		arquivo.close();



	}

}
