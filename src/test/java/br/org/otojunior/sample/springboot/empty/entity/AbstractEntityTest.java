/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 01456231650
 *
 */
public class AbstractEntityTest {
	private AbstractEntity entityTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void before() throws Exception {
		entityTest = new EntityTest();
		entityTest.setId(1L);
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEquals() {
		AbstractEntity entityTest2 = new EntityTest();
		entityTest2.setId(1L);
		assertTrue(entityTest.equals(entityTest2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsClassesDiferentes() {
		assertFalse(entityTest.equals("teste"));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdNaoNuloOutroIdNulo() {
		AbstractEntity entityTest2 = new EntityTest();
		entityTest2.setId(null);
		assertFalse(entityTest.equals(entityTest2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdNuloOutroIdNaoNulo() {
		entityTest.setId(null);
		AbstractEntity entityTest2 = new EntityTest();
		entityTest2.setId(1L);
		assertFalse(entityTest.equals(entityTest2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdsNulos() {
		entityTest.setId(null);
		AbstractEntity entityTest2 = new EntityTest();
		entityTest2.setId(null);
		assertTrue(entityTest.equals(entityTest2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsMesmoObj() {
		assertTrue(entityTest.equals(entityTest));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsObjNulo() {
		assertFalse(entityTest.equals(null));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#getId()}.
	 */
	@Test
	public void testGets() {
		assertEquals(1L, entityTest.getId().longValue());
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testHashCodeIdNulo() {
		entityTest.setId(null);
		assertEquals(102, entityTest.hashCode());
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testHashIdNaoNulo() {
		assertEquals(60, entityTest.hashCode());
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testNotEquals() {
		AbstractEntity entityTest2 = new EntityTest();
		entityTest2.setId(2L);
		assertFalse(entityTest.equals(entityTest2));
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("AbstractEntity(id=1)", entityTest.toString());
	}

	/**
	 * 
	 * @author 01456231650
	 *
	 */
	private static class EntityTest extends AbstractEntity { }
}
