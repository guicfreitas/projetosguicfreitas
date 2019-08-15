class MatrizDouble{
	private double[][] mat;
	private int tamLinha;
	private int tamColuna;

	MatrizDouble(int linha,int coluna){
		this.setTamanhoLinha(linha);
		this.setTamanhoColuna(coluna); 
		mat = new double[this.getTamanhoLinha()][this.getTamanhoColuna()];
		
		
	}

	public void setTamanhoLinha(int linha){
		this.tamLinha=linha;
	}
	public void setTamanhoColuna(int coluna){
		this.tamColuna=coluna;
	}
	public int getTamanhoColuna(){
		return tamColuna;
	}
	public int getTamanhoLinha(){
		return tamLinha;
	}
	public Double getValor(int indiceI,int indiceJ){
		return mat[indiceI][indiceJ];

	}
	public void setValor(int indiceI,int indiceJ,Double valor){
		mat[indiceI][indiceJ]=valor;

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

	public void transformaDouble(Matriz mat){
		long valorTempLong;
		Double valorTempDouble;

		for(int contI=0;contI<this.getTamanhoLinha();contI++){
			for(int contJ=0;contJ<this.getTamanhoColuna();contJ++){
				valorTempLong=mat.getValor(contI,contJ);
				valorTempDouble=(double) valorTempLong; 
				this.setValor(contI,contJ,valorTempDouble);
			}
		}
	}
	public void troca(int linha1,int coluna1,int linha2,int coluna2){
		double temp=this.getValor(linha1,coluna1);
		this.setValor(linha1,coluna1,this.getValor(linha2,coluna2));
		this.setValor(linha2,coluna2,temp);
	}
}