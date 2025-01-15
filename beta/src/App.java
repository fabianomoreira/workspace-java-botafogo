import model.Tarefa;

public class App {

	public static void main(String[] args) {
		Tarefa exemplo = new Tarefa();
		
		exemplo.setId(1);
		exemplo.setDescricao("Comprar Batata");
		exemplo.setPrazo(1);
		exemplo.setFinalizada(false);
		
		System.out.println(exemplo.getDescricao());
	}

}
