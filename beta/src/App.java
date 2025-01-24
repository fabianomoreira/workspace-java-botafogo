import model.Tarefa;

public class App {

	public static void main(String[] args) {
		Tarefa exemplo = new Tarefa(1, "Comprar Batata", 1, false);
		Tarefa exemplo02 = new Tarefa(2, "Sacar dinheiro", 1);
		Tarefa exemplo03 = new Tarefa();
		Tarefa exemplo04 = new Tarefa();
		Tarefa exemplo05 = new Tarefa();
		Tarefa exemplo06 = new Tarefa();
		Tarefa exemplo07 = new Tarefa();
		Tarefa exemplo08 = new Tarefa();
		Tarefa exemplo09 = new Tarefa();
		Tarefa exemplo10 = new Tarefa();
		
		exemplo03.setId(3);
		exemplo03.setDescricao("Varrer o quintal");
		exemplo03.setPrazo(1);
		exemplo03.setFinalizada(false);
		
		exemplo04.setId(4);
		exemplo04.setDescricao("Corrigir provas");
		exemplo04.setPrazo(1);
		exemplo04.setFinalizada(false);
		
		exemplo05.setId(5);
		exemplo05.setDescricao("Jogar o lixo fora");
		exemplo05.setPrazo(1);
		exemplo05.setFinalizada(false);
		
		exemplo06.setId(6);
		exemplo06.setDescricao("Pagar IPVA");
		exemplo06.setPrazo(1);
		exemplo06.setFinalizada(false);
		
		exemplo07.setId(7);
		exemplo07.setDescricao("Lavar o carro");
		exemplo07.setPrazo(1);
		exemplo07.setFinalizada(false);
		
		exemplo08.setId(8);
		exemplo08.setDescricao("Comprar ingresso para o cinema");
		exemplo08.setPrazo(1);
		exemplo08.setFinalizada(false);
		
		exemplo09.setId(9);
		exemplo09.setDescricao("Almoçar");
		exemplo09.setPrazo(1);
		exemplo09.setFinalizada(false);
		
		exemplo10.setId(10);
		exemplo10.setDescricao("Limpar armário");
		exemplo10.setPrazo(1);
		exemplo10.setFinalizada(false);	
		
		System.out.println(exemplo02);
		
		System.out.println("Tarefa: " + exemplo.getId() + " - " + 
		                   exemplo.getDescricao() + " - " + 
						   exemplo.getPrazo() + " - " + 
		                   exemplo.isFinalizada());
	}

}
