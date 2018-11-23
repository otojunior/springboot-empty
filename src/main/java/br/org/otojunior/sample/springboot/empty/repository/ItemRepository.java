/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.org.otojunior.sample.springboot.empty.entity.Item;
import br.org.otojunior.sample.springboot.empty.rowmapper.FindNomeByCodigoRowMapper;

/**
 * 
 * @author 01456231650
 *
 */
public interface ItemRepository extends Repository<Item, Long> {
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@Query("select * from item where codigo = :codigo")
	List<Item> findByCodigo(@Param("codigo") Integer codigo);
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	@Query(
		rowMapperClass=FindNomeByCodigoRowMapper.class,
		value="select nome from item where codigo = :codigo")
	List<Item> findNomeByCodigo(@Param("codigo") Integer codigo);
	
	/**
	 * 
	 * @param codigo
	 * @param nome
	 * @return
	 */
	@Modifying
	@Query("insert into item (codigo, nome) values (:codigo, :nome)")
	int insertItem(@Param("codigo") Integer codigo, @Param("nome") String nome);
}
