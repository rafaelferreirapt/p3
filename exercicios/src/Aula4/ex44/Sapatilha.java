// Rafael Ferreira https://github.com/gipmon/p3

package Aula4.ex44;
/**
 * @author Ant�nio Rafael Ferreira
 * nmec 67405
 */
public class Sapatilha extends Calcado{
	public enum Tipo{Atletismo, Futebol, Ginastica, Montanha};

	private Tipo t;
	
	public Sapatilha(String nome, String fabricante, double preco, String t){
		super(nome, fabricante, preco);
		this.t = Tipo.valueOf(t);
	}
	
	public String getFinalidade(){
		return t.toString();
	}
	
	@Override public boolean equals(Object b){
		return super.equals(b) && t.equals(((Sapatilha)b).t);
	}
	
	@Override public String toString(){
		return super.toString()+"\nFinalidade: "+getFinalidade();
	}
}
