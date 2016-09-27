package corina.cabrera.SVC.miw.upm.es;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class C11Test {
	private C11 c11;
	
	@Before
    public void before() {
        this.c11 = new C11();
    }

	@Test
	public void testM1() {
		assertEquals("m1", this.c11.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", this.c11.m2());
	}
}