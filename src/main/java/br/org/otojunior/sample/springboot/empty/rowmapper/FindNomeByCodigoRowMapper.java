/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.org.otojunior.sample.springboot.empty.entity.Item;

/**
 * @author 01456231650
 *
 */
public class FindNomeByCodigoRowMapper implements RowMapper<Item> {
	/**
	 * 
	 */
	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item = new Item();
		item.setNome(rs.getString("nome"));
		return item;
	}
}
