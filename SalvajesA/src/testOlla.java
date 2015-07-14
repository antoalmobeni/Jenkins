import static org.junit.Assert.*;

import org.junit.Test;

public class testOlla {

	@Test
	public void test() {
		Olla test = new Olla ();
		test.CogerMisionero(0);
		assertEquals(test.ObtenerNumMisioneros(), 4);

	}
	@Test
	public void test2() {
		Olla test = new Olla ();
		test.CogerMisionero(0);
		assertEquals(test.ObtenerNumMisioneros(), 34);

	}

}
