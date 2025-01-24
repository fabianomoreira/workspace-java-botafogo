package view;

import java.util.Scanner;

import model.Tarefa;

public class Tela {
	public void exibirMenu() {
		System.out.println("----- MENU PRINCIPAL -----");
		System.out.println("1 - Inclusão de tarefa");
		System.out.println("2 - Consulta de tarefa");
		System.out.println("3 - Alteração de tarefa");
		System.out.println("4 - Exclusão de tarefa");
		System.out.println("0 - F  I  M");
		System.out.println("Digite a opção desejada:");
	}
	
	public Tarefa exibirInclusao() {
		Scanner teclado = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		System.out.println("I N C L U S Ã O");
		System.out.println("Descrição : ");
		tarefa.setDescricao(teclado.nextLine());
		System.out.println("Prazo : ");
		tarefa.setPrazo(teclado.nextInt());
		System.out.println("Finalizada (S/N)? ");
		String status = teclado.next();
		
		if(status.equals("S") || status.equals("s")) {
			tarefa.setFinalizada(true);	
		} else {
			tarefa.setFinalizada(false);
		}
		
		return tarefa;
	}
}
