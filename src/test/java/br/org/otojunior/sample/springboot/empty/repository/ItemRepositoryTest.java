/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import br.org.otojunior.sample.springboot.empty.entity.Item;

/**
 * @author 01456231650
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepositoryTest {
	@Autowired
	private ItemRepository repository;
	
	@Autowired
	private JdbcTemplate template;
	
	@Before
	public void beforeClass() {
		template.update("create table item (\n" + 
			"  id bigserial primary key,\n" + 
			"  codigo integer,\n" + 
			"  nome varchar(20))");
	}
	
	@After
	public void afterClass() {
		template.update("drop table item");
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.repository.ItemRepository#findByCodigo(java.lang.Integer)}.
	 */
	@Test
	public void testFindByCodigo() {
		repository.insertItem(100, "item10");
		List<Item> itens = repository.findByCodigo(100);
		Item item = itens.get(0);
		assertEquals(100, item.getCodigo().intValue());
		assertEquals("item10", item.getNome());
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.repository.ItemRepository#findNomeByCodigo(java.lang.Integer)}.
	 */
	@Test
	public void testFindNomeByCodigo() {
		repository.insertItem(100, "item10");
		List<Item> itens = repository.findNomeByCodigo(100);
		Item item = itens.get(0);
		assertNull(item.getId());
		assertNull(item.getCodigo());
		assertEquals("item10", item.getNome());
	}

	/**
	 * Test method for {@link br.org.otojunior.sample.springboot.empty.repository.ItemRepository#insertItem(java.lang.Integer, java.lang.String)}.
	 */
	@Test
	public void testInsertItem() {
		long rlong = (long)(Math.random()*1e12);
		int count = repository.insertItem(999, "teste_" + rlong);
		assertEquals(1, count);
	}
}
