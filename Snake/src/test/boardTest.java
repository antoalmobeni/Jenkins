package test;
import snake2.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class boardTest {

	@Test
	public void test() {
		Snake test = new Snake();
		test.startGame();
		assertEquals(test.isPaused(), "antonio");
	}

}
