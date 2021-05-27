package classes;

public class Main {
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("Lenovo","S145");
		
		System.out.println(notebook);
		System.out.println("Processador: " + notebook.getModeloProcessador());
		System.out.println("Velocidade de Processamento: " + notebook.getVelocidade() + "Ghz");
		System.out.println("Tela: " + notebook.getTipoTela());
		System.out.println("Teclaco: " + notebook.getCor() +" "+ notebook.getFormato());
		
	}
}
