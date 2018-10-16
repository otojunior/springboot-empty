/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 01456231650
 *
 */
public class ItemTest {
	private Item item;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void before() throws Exception {
		item = new Item();
		item.setId(1L);
		item.setCodigo(1L);
		item.setNome("Teste");
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEquals() {
		Item item2 = new Item();
		item2.setId(1L);
		item2.setCodigo(2L);
		item2.setNome("Teste");
		assertTrue(item.equals(item2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsClassesDiferentes() {
		assertFalse(item.equals("teste"));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdNaoNuloOutroIdNulo() {
		item.setId(1L);
		Item item2 = new Item();
		item2.setId(null);
		item2.setCodigo(2L);
		item2.setNome("Teste");
		assertFalse(item.equals(item2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdNuloOutroIdNaoNulo() {
		item.setId(null);
		Item item2 = new Item();
		item2.setId(1L);
		item2.setCodigo(2L);
		item2.setNome("Teste");
		assertFalse(item.equals(item2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsIdsNulos() {
		item.setId(null);
		Item item2 = new Item();
		item2.setId(null);
		item2.setCodigo(2L);
		item2.setNome("Teste");
		assertTrue(item.equals(item2));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsMesmoObj() {
		assertTrue(item.equals(item));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testEqualsObjNulo() {
		assertFalse(item.equals(null));
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#getId()}.
	 */
	@Test
	public void testGets() {
		assertEquals(1L, item.getId().longValue());
		assertEquals(1L, item.getCodigo().longValue());
		assertEquals("Teste", item.getNome());
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testHashCodeIdNulo() {
		item.setId(null);
		assertEquals(102, item.hashCode());
	}
	
	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testHashIdNaoNulo() {
		assertEquals(60, item.hashCode());
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#hashCode()}.
	 */
	@Test
	public void testNotEquals() {
		Item item2 = new Item();
		item2.setId(2L);
		item2.setCodigo(1L);
		item2.setNome("Teste");
		assertFalse(item.equals(item2));
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("Item(super=AbstractEntity(id=1), codigo=1, nome=Teste)", item.toString());
	}
}
