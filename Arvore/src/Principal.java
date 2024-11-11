public class Principal {

    public static void main(String[] args) {
        
        Estrutura e = new Estrutura();
        No n = new No();

        e.inserir(4);
        e.inserir(2);
        e.inserir(3);
        e.inserir(1);
        e.inserir(6);
        e.inserir(5);
        e.inserir(7);

       e.inOrdem();
		
		n = e.valorMinimo();
		
		System.out.println("\n\nValor mínimo = "+n.getValor());
		
		n = e.valorMaximo();
		
		System.out.println(("\n\nValor máximo = "+n.getValor()));
        
        e.removerMinimo();
        
        System.out.println("\n\nOrdem após remover o valor mínimo\n");
        e.inOrdem();

        No novoMinimo = e.valorMinimo();
        System.out.println("\n\nValor mínimo = " + novoMinimo.getValor());

      
    }

}