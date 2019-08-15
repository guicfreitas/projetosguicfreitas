import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
class Matriz{
	private long[][] mat;
	private int tamLinha;
	private int tamColuna;

	Matriz(){
		mat = new long[6][6];
		this.setTamanhoLinha(6);	
		this.setTamanhoColuna(6);
	}

	Matriz(int numLinhas, int numColunas){
		mat = new long[numLinhas][numColunas];
		this.setTamanhoLinha(numLinhas);	
		this.setTamanhoColuna(numColunas);
	}


	public long getValor(int indiceI,int indiceJ){
		return mat[indiceI][indiceJ];
	}	
	
	public void setValor(int indiceI,int indiceJ, long novoValor){
		mat[indiceI][indiceJ] = novoValor;
	}

	public int getTamanhoLinha(){
		return tamLinha;
	}	
	
	public int getTamanhoColuna(){
		return tamColuna;
	}	

	private void setTamanhoLinha(int novoValor){
		tamLinha = novoValor;
	}

	private void setTamanhoColuna(int novoValor){
		tamColuna = novoValor;
	}

	public void imprime(){
		int conti,contj;	
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			System.out.println();
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){
				System.out.print(this.getValor(conti,contj) + " ");
			}
		}
		System.out.println();	
	}

	public void inicializaManual(){
		Scanner read = new Scanner(System.in);
		for(int contI=0;contI<this.getTamanhoLinha();contI++){
			for(int contJ=0;contJ<this.getTamanhoColuna();contJ++){
				this.setValor(contI,contJ,read.nextLong());
			}
		}
	}

	public void inicializaRandomico(int max_rand){
		int conti,contj;
		long  novoValor;
		Random gerador = new Random();
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){
				novoValor = gerador.nextInt(max_rand);
				this.setValor(conti,contj,novoValor);
			}
		}
	}

	// caso matriz nao quadrada, retorna -1
	public int retorneOrdem(){
		int numL, numC, ordem;

		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		ordem = -1;
		if(numL == numC){
			ordem = numL;
		}

		return ordem;
	}	

	private long detOrdem1(Matriz mat){
		return mat.getValor(0,0);
	}
	
	private long detOrdem2(Matriz mat){
		long diagonalP, diagonalI;

		diagonalP = mat.getValor(0,0) * mat.getValor(1,1);		
		diagonalI = mat.getValor(1,0) * mat.getValor(0,1);		

		return (diagonalP - diagonalI);
	}
	

	private int calculaSinal(int indiceL, int indiceC){
		int sinal;

		sinal = -1;

		if( ((indiceL + indiceC)% 2) == 0 ){
			sinal = 1;
		}

		return sinal;		
	}

	public void copiaMatrizMaiorParaMenor(Matriz maior,Matriz menor,int isqn,int jsqn){
		int contAi,contAj,contBi,contBj,numL,numC;
		long temp;
		numL = menor.getTamanhoLinha();
		numC = menor.getTamanhoColuna();

		contAi = 0;
		for(contBi = 0; contBi < numL; contBi++){
			if(contAi == isqn){
				contAi++;
			}
			contAj = 0;
			for(contBj = 0; contBj < numC; contBj++){
				if(contAj == jsqn){
					contAj++;
				}
				temp = maior.getValor(contAi,contAj);
				menor.setValor(contBi,contBj,temp);
				contAj++;
			}
			contAi++;
		}
	}
		private long detOrdemN(Matriz mat){
		int sinal,contC,numL,numC;
		long cofator,detTemp,resposta;
		Matriz matmenor;
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		
		resposta = 0;
		for(contC = 0; contC < mat.getTamanhoColuna(); contC++){
			cofator = mat.getValor(0,contC);
			sinal = this.calculaSinal(0,contC);
			matmenor = new Matriz(numL-1,numC-1);
			this.copiaMatrizMaiorParaMenor(mat,matmenor,0,contC);
			detTemp = matmenor.determinante();
			resposta = resposta + (cofator * sinal * detTemp);
		}
		return (resposta);
	}
	public long determinante(){
		int ordem;
		long det;

		ordem = this.retorneOrdem();
		det = 0;

		if(ordem > 0){
			switch (ordem) {
			    case 1:  det = this.detOrdem1(this);
				     break;
			    case 2:  det = this.detOrdem2(this);;
				     break;
			    default: det = this.detOrdemN(this);;
				     break;
			}
			
		}
		else{
			System.out.println("Matriz nao eh quadrada!! retornando 0");
		}

		return det;
	}

	//metodos implementados:

	public long detOrdem3(Matriz mat){
		long diagonaPrin,diagonaSecun,det;
		diagonaPrin=(mat.getValor(0,0)*mat.getValor(1,1)*mat.getValor(2,2))+(mat.getValor(0,1)*mat.getValor(1,2)*mat.getValor(2,0))+(mat.getValor(0,2)*mat.getValor(1,0)*mat.getValor(2,1));
		diagonaSecun=(mat.getValor(0,2)*mat.getValor(1,1)*mat.getValor(2,0))+(mat.getValor(0,0)*mat.getValor(1,2)*mat.getValor(2,1))+(mat.getValor(0,1)*mat.getValor(1,0)*mat.getValor(2,2));
		
		det=diagonaPrin-diagonaSecun;
		return det;
	}
	//verificao da linha com mais zero
	public int verificaZero(){
		int somaZero,maiorLinha,zerosPorLinhasTemp;
		zerosPorLinhasTemp=0;
		maiorLinha=0;
		
		
		
			
			for(int contI=0;contI<this.getTamanhoLinha();contI++){
				somaZero=0;
				for(int contJ=0;contJ<this.getTamanhoColuna();contJ++){
					if(this.getValor(contI,contJ)==0){

						somaZero=somaZero+1;
						
						if(somaZero>zerosPorLinhasTemp){
							zerosPorLinhasTemp=somaZero;
							maiorLinha=contI;
						}
					}
				}
				
				
			}

			 
		return maiorLinha;	

	}


	//otimizacao dos zeros
	private long detOrdemNOtim(Matriz mat){
		int sinal,contC,numL,numC,linhaComZero;
		long cofator,detTemp,resposta;
		Matriz matmenor;
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		linhaComZero=this.verificaZero();
		
		resposta = 0;
		for(contC = 0; contC < mat.getTamanhoColuna(); contC++){
			cofator = mat.getValor(linhaComZero,contC);
			if(cofator!=0){
				
				sinal = this.calculaSinal(linhaComZero,contC);
				matmenor = new Matriz(numL-1,numC-1);
				this.copiaMatrizMaiorParaMenor(mat,matmenor,linhaComZero,contC);
				detTemp = matmenor.detOtimizado();
				resposta = resposta + (cofator * sinal * detTemp);
			}
		}
		return (resposta);
	}

	public void troca(int linha1,int coluna1,int linha2,int coluna2){
		long temp=this.getValor(linha1,coluna1);
		this.setValor(linha1,coluna1,this.getValor(linha2,coluna2));
		this.setValor(linha2,coluna2,temp);
	}
	
	
	public int trocaLinha(Matriz mat){
		int result,linhaSemZero;
		result=0;
		linhaSemZero=0;
			for (int contJ=0;contJ<mat.getTamanhoColuna();contJ++){
				for(int contI=0;contI<mat.getTamanhoLinha();contI++){
					if(mat.getValor(contI,contJ)!=0){
						linhaSemZero=contI;

					}

				}
			}	
		

		for(int contDiago=0;contDiago<mat.getTamanhoColuna();contDiago++){
			if(mat.getValor(contDiago,contDiago)==0 && (linhaSemZero!=contDiago)){
							
							for(int cont=0;cont<mat.getTamanhoColuna();cont++){
								this.troca(contDiago,cont,linhaSemZero,cont);
								
							}
								
							result++;						
						}
		}
		
		return result;
	}
	
	//Calculo de determinante por eliminacao de Gauss
	private long detOrdemNOtim2(Matriz mat){
		int diagonaPrin,contFator,sinal,result,contJ,contI,sinalFinal;
		long detLong;
		double fator,det,fatorX,fatorY,valorTemp,valorTempCasoZero;
		det=1;
		result=0;
		contFator=0;
		sinal=0;
		sinal=trocaLinha(mat);
		contI=0;
		contJ=0;
		sinalFinal=0;
		Vetor linhaSZero = new Vetor(mat.getTamanhoLinha());

		MatrizDouble matTemp = new MatrizDouble(mat.getTamanhoLinha(),mat.getTamanhoColuna());
		matTemp.transformaDouble(mat);
		

		for(contJ=0;contJ<matTemp.getTamanhoColuna();contJ++){
						
			for(contI=0;contI<matTemp.getTamanhoLinha();contI++){
				if(matTemp.getValor(contI,contJ)!=0){
					linhaSZero.setElemento(contJ,contI);
				}
				if(contI==contJ){
						if(matTemp.getValor(contI,contJ)==0 && (contI!=matTemp.getTamanhoLinha()-1 && contJ!=matTemp.getTamanhoColuna()-1)){
							for(int cont=0;cont<matTemp.getTamanhoColuna();cont++){
								matTemp.troca(contI,cont,contI+1,cont);
							}	
							result++;						
						}
					
					}
				
			


				if(contI>contJ){
					if(matTemp.getValor(contI,contJ)!=0){
						

						fatorX=matTemp.getValor(contI,contJ);
						fatorY=matTemp.getValor(contFator,contFator);
						fator=(fatorX*-1.0)/fatorY;

				
						for(int contColuna=contJ;contColuna<matTemp.getTamanhoColuna();contColuna++){
							valorTemp=matTemp.getValor(contI,contColuna)+(matTemp.getValor(contFator,contColuna)*fator);
							matTemp.setValor(contI,contColuna ,valorTemp);

						}
						
					}
			
				}
				
			}
			contFator++;
			
			
		}

		for(contI=0;contI<matTemp.getTamanhoLinha();contI++){

			for(contJ=0;contJ<matTemp.getTamanhoColuna();contJ++){
				if(contI==contJ){
					det=det *matTemp.getValor(contI,contJ);
				}
			}
		}
		
		sinalFinal=result+sinal;
		if(sinalFinal%2==0 || sinalFinal==0){
		detLong=Math.round(det);
		

		
		}else{

			detLong=Math.round(det)*(-1);

		

		}
	
		return detLong;
	}
		
	//Controlador dos det usando as otimizacoes por zero
	public long detOtimizado(){
		int ordem;
		long det;

		ordem = this.retorneOrdem();
		det = 0;

		if(ordem > 0){
			switch (ordem) {
			    case 1:  det = this.detOrdem1(this);
				     break;
			    case 2:  det = this.detOrdem2(this);
				     break;
			    default: det = this.detOrdemNOtim(this);
				     break;
			}
			
		}
		else{
			System.out.println("Matriz nao eh quadrada!! retornando 0");
		}

		return det;

	}
	//Controlador dos dets usando a eliminacao de Gauss
	public long detOtimizado2(){
		int ordem;
		long det;

		ordem = this.retorneOrdem();
		det = 0;

		if(ordem > 0){
			switch (ordem) {
			    case 1:  det = this.detOrdem1(this);
				     break;
			    case 2:  det = this.detOrdem2(this);
				     break;
				case 3:  det = this.detOrdem3(this);
				     break;
			    default: det = this.detOrdemNOtim2(this);
				     break;
			}
			
		}
		else{
			System.out.println("Matriz nao eh quadrada!! retornando 0");
		}

		return det;


	}

}
