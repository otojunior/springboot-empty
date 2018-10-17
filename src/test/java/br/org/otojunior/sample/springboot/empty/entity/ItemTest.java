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
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#getId()}.
	 */
	@Test
	public void testGets() {
		assertEquals(1L, item.getId().longValue());
		assertEquals(1L, item.getCodigo().longValue());
		assertEquals("Teste", item.getNome());
	}
	
	/** 
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.entity.Item#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("Item(super=AbstractEntity(id=1), codigo=1, nome=Teste)", item.toString());
	}
}
