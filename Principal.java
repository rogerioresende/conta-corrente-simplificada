
public class Principal {
 public static void main(String[] args) {
	ContaCorrenteSimplificada conta1;
	ContaCorrenteSimplificada conta2;
	
	
	conta1 = new ContaCorrenteSimplificada();
	conta2 = new ContaCorrenteSimplificada();
	
	conta1.agencia = "123";
	conta1.nroConta ="789-2";
	conta1.nomeDoCorrentista = "Kamila";
	conta1.saldo =500;
	conta1.especial = true;
	
    double saldoDaKamila;
	saldoDaKamila = conta1.sacar(700);
	System.out.println("SALDO DA KAMILA PELA VARIÁVEL:"+ saldoDaKamila);
 
	conta2.agencia = "321";
	conta2.nroConta ="889-8";
	conta2.nomeDoCorrentista = "Vitor";
	conta2.saldo = 60;
	conta2.especial = true;
	
	double saldoDoVitor;
	saldoDoVitor = conta2.depositar(70);
	System.out.println("SALDO DO VITOR PELA VARIÁVEL:"+ saldoDoVitor);
	
	conta1.exibeSaldo();
	conta2.exibeSaldo();	
	
	PessoaFisica pessoa = new PessoaFisica();
	pessoa.nome = "João da Silva Sauro";
	pessoa.dataNascimento = "29/02/1996";
	pessoa.cpf = "123.321.741-38";
	pessoa.rg = "54786-77";
	pessoa.orgaoExpedidor = "SSP/GO";
	pessoa.profissao ="Desenvolvedor";
	
	ContaCorrenteSimplificada c3 = new ContaCorrenteSimplificada();
	
	c3.agencia = "456-1";
	c3.nroConta = "45485-2";
	c3.nomeDoCorrentista = "Paulo Henrique Junior";
	c3.saldo = 2000;
	c3.especial = false;
	c3.adicionarPessoa(pessoa);
	c3.imprimirDadosCorrentista();
	
	
}

}
