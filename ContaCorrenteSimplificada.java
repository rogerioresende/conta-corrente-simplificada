
public class ContaCorrenteSimplificada {
	
	String nomeDoCorrentista;
	String agencia;
	String nroConta;
	double saldo;
	boolean especial;
	PessoaFisica[] pessoas = new PessoaFisica[2];
	
	
	double sacar(double valor){
		if(valor>this.saldo && this.especial==false){
			System.out.println("Saldo indisponivel ou a conta não é especial");
			
		return this.saldo;
		
		}
		else{
			if(this.saldo  - valor > -5000){
				this.saldo = this.saldo - valor;
			}
		return this.saldo;
	}
	}


	double depositar(double valor){
		this.saldo =this.saldo + valor;
		return this.saldo;
}
	void exibeSaldo(){
		System.out.println("Saldo:"+this.saldo);
	}
	void adicionarPessoa(PessoaFisica p){
		if (this.pessoas[0] == null){
			this.pessoas[0] = p;
		}else {
			this.pessoas[1] = p;
		}
	}
	void imprimirDadosCorrentista(){
		if(this.pessoas[0] != null){
			System.out.println("=== CORRENTISTA 1 ===");
			System.out.println("Nome:"+this.pessoas[0].nome);
			System.out.println("CPF:"+this.pessoas[0].cpf);
			System.out.println("RG:"+this.pessoas[0].rg);
			System.out.println("Orgão Expedidor:"+this.pessoas[0].orgaoExpedidor);
			System.out.println("Data Nascimento:"+this.pessoas[0].dataNascimento);
			System.out.println("Profissão:"+this.pessoas[0].profissao);
		
		}
		if(this.pessoas[1] != null){
			System.out.println("=== CORRENTISTA 2 ===");
			System.out.println("Nome:"+this.pessoas[1].nome);
			System.out.println("CPF:"+this.pessoas[1].cpf);
			System.out.println("RG:"+this.pessoas[1].rg);
			System.out.println("Orgão Expedidor:"+this.pessoas[1].orgaoExpedidor);
			System.out.println("Data Nascimento:"+this.pessoas[1].dataNascimento);
			System.out.println("Profissão:"+this.pessoas[1].profissao);
		
	}
		
	}
}

