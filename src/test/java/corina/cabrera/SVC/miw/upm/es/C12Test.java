package corina.cabrera.SVC.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
	private C12 c12;
	
	@Before
    public void before() {
        this.c12 = new C12();
    }

	@Test
	public void testMA() {
		assertEquals("mA", this.c12.mA());
	}
}
