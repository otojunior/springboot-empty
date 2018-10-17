/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 01456231650
 *
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Item extends AbstractEntity {
	private Long codigo;
	private String nome;
}
