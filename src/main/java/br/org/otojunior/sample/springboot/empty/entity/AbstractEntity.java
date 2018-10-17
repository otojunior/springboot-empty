/**
 * 
 */
package br.org.otojunior.sample.springboot.empty.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 01456231650
 *
 */
@Data
public abstract class AbstractEntity {
	@EqualsAndHashCode.Include
	private Long id;
}