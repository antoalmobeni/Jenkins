
public class Cocinero implements Runnable{
	Olla o;
	
	public Cocinero(Olla _o){
		o=_o;
	}
	
	public void run(){
		while(true)
			o.RellenarOlla();
	}
	
	
}
