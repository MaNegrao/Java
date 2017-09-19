import java.util.Scanner; 

public class Banco{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);
		Conta m = new Conta();
		Conta auxiliar = new Conta();

		m.dono = "Matheus Negrão";
		m.saldo = 10000.0;
		m.numero = 1711100026;

		auxiliar.dono = "Vida";
		auxiliar.saldo = 1000000000.0;
		auxiliar.numero = 1711100021;

		int x;

		do{
			System.out.print("1. Consultar saldo\n2. Efetuar saque\n3. Efetuar depósito\n4. Efetuar transferência\n5. Exibir dados da conta\n6. Sair\n");
			x = entrada.nextInt();
			switch(x){
				case 1:
					m.saldo();
					break;
				case 2:
					m.sacar();
					break;
				case 3:
					m.depositar();
					break;
				case 4:
					m.transferir(auxiliar.saldo);
					break;
				case 5:
					m.dados();
					break;
				case 6:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Numero invalido, tente novamente");
					break;

			}
			//System.out.printf("\33[2J");
		}while(x != 6);
	}
}
