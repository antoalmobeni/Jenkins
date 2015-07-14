

public class Olla {
	private int MAX_MISIONEROS=5;
	private int numMisioneros=MAX_MISIONEROS;
	
	public Olla () {
		
	}
	synchronized public void CogerMisionero(int idSalvaje){
		while(numMisioneros==0){
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		numMisioneros--;
		System.out.println("Come Salvaje "+idSalvaje);
		notifyAll();
		
	}
	
	
	synchronized public void RellenarOlla(){
		while(numMisioneros!=0){
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		numMisioneros=MAX_MISIONEROS;
		System.out.println("Cocinero rellena la olla");
		notifyAll();
		
	}
	
	public int ObtenerNumMisioneros(){
		return numMisioneros;
	}
	
}
