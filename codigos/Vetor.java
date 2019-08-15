import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
class Vetor{
	private int[] vet;
	private int tamanho;

	Random rand = new Random();
	Scanner read = new Scanner(System.in);

	Vetor(){
		this.setTamanho(10);
		vet = new int[this.getTamanho()];
	}
	Vetor(int tamanho){
		this.setTamanho(tamanho);
		vet = new int[this.getTamanho()];

	}

	public int getTamanho(){
		return this.tamanho;
	}
	private void setTamanho(int novoT){
		this.tamanho = novoT;
	}

	public int getElemento(int index){
		return this.vet[index];
	}
	public void setElemento(int index, int novoValor){
		this.vet[index]=novoValor;
	}
	public void inicializa(int novoValor){
		int cont;
		
		for(cont=0;cont<this.getTamanho();cont++){
			this.setElemento(cont,novoValor);
		}
	}
	public void imprime(){
		System.out.print("|");
		for(int cont=0;cont<this.getTamanho();cont++){
			System.out.print(this.getElemento(cont)+"|");

		}
		System.out.println("");
		
	}
	public void inicializaRand(){
		int cont;
		
		for(cont=0;cont<this.getTamanho();cont++){
			this.setElemento(cont,rand.nextInt(this.getTamanho()));
		}
	}
	public void imprimeMaior(){
		int maior;
		maior=this.getElemento(0);
		for(int cont=0;cont<this.getTamanho();cont++){
			if(this.getElemento(cont)>maior){
				maior=this.getElemento(cont);
			}

		}
		System.out.println("maior: "+maior);

	}
	public int busca(int numero){
		int cont,posicao;
		cont=0;
		posicao=0;
		while(cont<this.getTamanho()){
			if(this.getElemento(cont)==numero){
				posicao=cont;
			}
			cont++;

		}
		if(posicao==0){
			posicao=-1;

		}

	return posicao;
	}
	public void misturaVetor(Vetor vetA, Vetor vetB){
		int contA,contB;
		//this.setElemento(0,vetA.getElemento(0));
		//this.setElemento(1,vetB.getElemento(0));
		contA=0;
		contB=0;

		//vetorPAR
		for(int cont=0;cont<this.getTamanho();cont=cont+2){
			this.setElemento(cont,vetA.getElemento(contA));
			contA++;

		}
		//vetorImpar
		for(int cont=1;cont<this.getTamanho();cont=cont++){
			this.setElemento(cont,vetA.getElemento(contB));
			contB++;

		}

	}
	public int determinante(Vetor vetA, Vetor vetB){
		int determin;
		determin=((this.getElemento(0)*vetA.getElemento(1)*vetB.getElemento(2))+(this.getElemento(1)*vetA.getElemento(2)*vetB.getElemento(0))+(this.getElemento(2)*vetA.getElemento(0)*vetB.getElemento(1)))-((vetB.getElemento(0)*vetA.getElemento(1)*this.getElemento(2))+(vetB.getElemento(1)*vetA.getElemento(2)*this.getElemento(0))+(vetB.getElemento(2)*vetA.getElemento(0)*this.getElemento(1)));
		return determin;
	}
	public int produtoInterno(Vetor vetA){
		int produtoInterno,somaTemp;
		produtoInterno=0;
		somaTemp=0;

		for(int cont=0;cont<this.getTamanho();cont++){
			somaTemp=this.getElemento(cont)*vetA.getElemento(cont);
			produtoInterno=produtoInterno+somaTemp;
		}
		return produtoInterno;
	}
	public Double norma(){
		Double result;

		result=Math.sqrt(this.produtoInterno(this));
		return result;
	}
	public void trocaMenor(){
		int menor,posicaoMenor,valorpos;
		menor=this.getElemento(0);
		valorpos=this.getElemento(0);
		posicaoMenor=0;
		for(int cont=1;cont<this.getTamanho();cont++){
			if(menor>this.getElemento(cont)){
				menor=this.getElemento(cont);
				posicaoMenor=cont;
			}
		}
		this.setElemento(posicaoMenor,valorpos);
		this.setElemento(0,menor);
	}
	public void imprimeIverso(){
		int cont,i;
		cont=this.getTamanho()-1;

		System.out.print("|");
		while(cont!=-1){
			System.out.print(this.getElemento(cont)+"|");
			cont--;
		}
		System.out.println("");
	}
	public void inicializaManual(){
		int cont,valor;
		
		for(cont=0;cont<this.getTamanho();cont++){
			System.out.print("["+cont+"] Digite o valor:");
			valor=read.nextInt();
			this.setElemento(cont,valor);
		}
	

	}
	public void somaImpares(){
		int cont,soma;
		soma=0;
		for(cont=0;cont<this.getTamanho();cont++){
			if(this.getElemento(cont)%2!=0){
				soma=soma+this.getElemento(cont);
			}

			
		}
		if(soma==0){
			System.out.println("Nao existe impares");
		}else{
			System.out.println("Soma dos impares: "+soma);
		}
	}
	public void preencherPares(Vetor vetA){
		for(int cont=0;cont<this.getTamanho();cont++){
			if(this.getElemento(cont)%2==0){
				vetA.setElemento(cont,this.getElemento(cont));
				

			
		}

	}
	
}
	public void troca(int indice1, int indice2){
		int temp=this.getElemento(indice1);

		this.setElemento(indice1,this.getElemento(indice2));
		this.setElemento(indice2,temp);
	}
	//ta errado
	public void inicializaShuffle(){
		for(int cont=0;cont<this.getTamanho();cont++){
			this.setElemento(cont,cont);

		}
		for(int cont=0;cont<this.getTamanho();cont++){
			System.out.print(this.getElemento(cont)+" ");

		}
		System.out.println("\n");
		
		for(int cont=0;cont<this.getTamanho();cont++){
			int indice1,indice2;
			indice1=rand.nextInt(this.getTamanho());
			indice2=rand.nextInt(this.getTamanho());

			this.troca(indice1,indice2);
			

		}
		for(int cont=0;cont<this.getTamanho();cont++){
			System.out.print(this.getElemento(cont)+" ");

		}
		
	}

	public void selectionSort(){
		int menorI,temp;
		menorI=0;
		for(int contvez=0;contvez<(this.getTamanho()-1);contvez++){
			menorI=contvez;
		for(int cont=(contvez+1);cont<this.getTamanho();cont++){
			if(this.getElemento(menorI)>this.getElemento(cont)){
				menorI=cont;
			}

		}
		
		this.troca(contvez,menorI);
	}
}
	//incompleto
	public void insertionSort(){
		int analisado,anterior;
		for(int cont=1;cont<this.getTamanho();cont++){
			analisado=cont;
			anterior=cont-1;

			while((anterior>-1)&&(cont>0) && this.getElemento(anterior)>this.getElemento(analisado) ){
				this.troca(anterior,analisado);
				analisado=anterior;
				anterior=anterior-1;

			}
		}
	}

	public void bubbleSort(){
		for(int cont1=1;cont1<this.getTamanho();cont1++){
		for(int cont=1;cont<this.getTamanho();cont++){
			if(this.getElemento(cont-1)>this.getElemento(cont)){
				this.troca(cont,cont-1);
			}
		}
		}
		this.imprime();
	}
}