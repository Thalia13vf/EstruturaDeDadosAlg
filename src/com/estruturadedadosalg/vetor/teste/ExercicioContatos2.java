package com.estruturadedadosalg.vetor.teste;

import java.util.Scanner;

import com.estruturadedadosalg.vetor.Vetor;

public class ExercicioContatos2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Vetor<Contato> lista = new Vetor(20);
		criarContatosDinamicamente(5, lista);
		
		int opcao = 1;
		while(opcao != 0) {
			opcao = obterOpcaoMenu(teclado);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(teclado, lista);
				break;
			case 2:
				adicionarContatoPorPosicao(teclado, lista);
				break;
			case 3:
				obtemContatoPosicao(teclado, lista);
				break;
			case 4:
				obtemContato(teclado, lista);
				break;
			case 5:
				pesquisarUltimoIndice(teclado, lista);
				break;
			case 6:
				pesquisarContatoExiste(teclado, lista);
				break;
			case 7:
				excluirPorPosicao(teclado, lista);
				break;
			case 8:
				excluirContato(teclado, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			default:
				break;
			}
		}
		
		System.out.println("Usu�rio digitou 0; programa encerrado");
	}
	
	private static void imprimirVetor(Vetor<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(Vetor<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos foram exclu�dos");
	}
	
	private static void imprimeTamanhoVetor(Vetor<Contato>lista) {
		System.out.println("Tamanho do vetor � de: " + lista.tamanho());
	}
	
	private static void excluirContato(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o a ser removida", teclado);
		
		try {
			Contato contato = lista.busca(pos);
			lista.remove(contato);
			System.out.println("Contato Excluido com sucesso!");
		
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	private static void excluirPorPosicao(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o a ser removida", teclado);
		
		try {
			lista.remove(pos);
			System.out.println("Contato Excluido com sucesso!");
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o desejada", teclado);
		
		try {
			Contato contato = lista.busca(pos);
			boolean existe = lista.contem(contato);
			
			if(existe) {
				System.out.println("Contato existe, segue dados: ");
				System.out.println(contato);
				
			}else {
				System.out.println("Contato n�o existe");
			}
			
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	
	private static void pesquisarUltimoIndice(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o desejada", teclado);
		
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Dados do contato");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado");
			pos = lista.ultimoIndice(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
			
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	private static void obtemContato(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o desejada", teclado);
		
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Dados do contato");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado");
			pos = lista.busca(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
			
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	private static void obtemContatoPosicao(Scanner teclado, Vetor<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posi��o desejada", teclado);
		
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Dados do contato");
			System.out.println(contato);
			
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}
	
	private static void adicionarContatoFinal(Scanner teclado, Vetor<Contato> lista) {
		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome", teclado);
		String telefone = leInformacao("Digite o telefone", teclado);
		String email = leInformacao("Digite o email", teclado);		
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso!!");
		System.out.println(contato);
	}
	
	private static void adicionarContatoPorPosicao(Scanner teclado, Vetor<Contato> lista) {
		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome", teclado);
		String telefone = leInformacao("Digite o telefone", teclado);
		String email = leInformacao("Digite o email", teclado);		
		
		Contato contato = new Contato(nome, telefone, email);
		int pos = leInformacaoInt("Digite a posi��o para adicionar o contato", teclado);
		
		
		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato adicionado com sucesso!!");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posi��o inv�lida.Contato n�o adicionado  ");
		}
		
	}
	
	private static String leInformacao(String msg, Scanner teclado) {
		System.out.println(msg);
		String entrada  = teclado.nextLine();
		
		return entrada;
	}
	
	private static int leInformacaoInt(String msg, Scanner teclado) {
		boolean entradaValida = false;
		int num = 0;
		while(!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = teclado.nextLine();
				
				num = Integer.parseInt(entrada);
				
				entradaValida = true;
			}catch(Exception e) {
				System.out.println("Entrada inv�lida! Digite novamente.");
			}
		}
		return num;
	}
	private static int obterOpcaoMenu(Scanner teclado) {
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while(!entradaValida) {
			System.out.println("Digite a op��o desejada: ");
			System.out.println("Op��o 1: Adiciona o contato no final do vetor");
			System.out.println("Op��o 2: Adiciona o contato em uma posi��o espec�fica");
			System.out.println("Op��o 3: Obt�m contato de uma posi��o espec�fica");
			System.out.println("Op��o 4: Consulta contato");
			System.out.println("Op��o 5: Consulta �ltimo �ndice do contato");
			System.out.println("Op��o 6: Verifica se o contato existe");
			System.out.println("Op��o 7: Excluir por posi��o");
			System.out.println("Op��o 8: Excluir contato");
			System.out.println("Op��o 9: Verifica tamanho do vetor");
			System.out.println("Op��o 10: Excluir todos os contatos");
			System.out.println("Op��o 11: Imprime vetor");
			System.out.println("Op��o 0: Sair");
		
			try {
				entrada = teclado.nextLine();
				opcao = Integer.parseInt(entrada);
				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}
				
			}catch(Exception e) {
				System.out.println("Entrada inv�lida, digite novamente\n\n");
			}
				
		}
		
		return opcao;
	}
	
	private static void criarContatosDinamicamente(int quantidade, Vetor<Contato> lista) {
		Contato contato;
		for(int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");
			
			lista.adiciona(contato);
		}
	}
	
}
