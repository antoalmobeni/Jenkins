
public class Salvaje implements Runnable{
	private int idSalvaje;
	Olla o;
	public Salvaje(int _idSalvaje, Olla _o){
		idSalvaje=_idSalvaje;
		o=_o;
	}
	synchronized public void run(){
		o.CogerMisionero(idSalvaje);
	}
}
