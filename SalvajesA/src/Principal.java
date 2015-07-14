
public class Principal {
	public static void main(String[] args) {
		
		Olla o = new Olla();
		Cocinero c = new Cocinero(o);
		Salvaje salvajes[] = new Salvaje[15];
		Thread hilosSalvajes[] = new Thread[15];
		Thread hiloCocinero = new Thread(c);
		
		hiloCocinero.start();
		for (int i=0; i< 15;i++){
			salvajes[i]=new Salvaje(i,o);
			hilosSalvajes[i]= new Thread(salvajes[i]);
			hilosSalvajes[i].start();
		}
	}

}
