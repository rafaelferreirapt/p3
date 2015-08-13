// Rafael Ferreira https://github.com/gipmon/p3

package Aula4.ex44;
/**
 * @author Ant�nio Rafael Ferreira
 * nmec 67405
 */
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Catalogo {
	private String edicao;
	private LinkedHashMap<String, Calcado> calcado = new LinkedHashMap<String, Calcado>();
	
	public Catalogo(String edicao){
		this.edicao = edicao;
	}
	
	public String getEdicao(){
		return edicao;
	}
	
	public boolean add(Calcado c){
		if(calcado.containsValue(c)){
			return false;
		}
		calcado.put(c.getNome(), c);
		return true;
	}
	
	public Calcado[] getCalcadoDesportivo(){
		LinkedList<Calcado> list = new LinkedList<Calcado>();
		for(Entry<String, Calcado> set : calcado.entrySet()){
			if(set.getValue().getClass().getSimpleName().equals("BotaDesporto") || set.getValue().getClass().getSimpleName().equals("Sapatilha")
				|| set.getValue().getClass().getSimpleName().equals("Chuteira")){
				list.add(set.getValue());
			}
		}
		return list.toArray(new Calcado[0]);
	}
}
