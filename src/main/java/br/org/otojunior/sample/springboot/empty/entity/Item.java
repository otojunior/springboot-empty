/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author 01456231650
 *
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
public class Item extends AbstractEntity {
	private Long codigo;
	private String nome;
}
