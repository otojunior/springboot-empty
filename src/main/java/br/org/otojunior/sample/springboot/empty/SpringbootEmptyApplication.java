/*
 * 
 */
package br.org.otojunior.sample.springboot.empty;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
//@SpringBootApplication
public class SpringbootEmptyApplication {
	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(SpringbootEmptyApplication.class, args);
		
		Serializer ser = new Persister();
		
		Item item = new Item();
		item.setId(1L);
		item.setCodigo(100L);
		item.setNome("Produto");
		item.setPreco(BigDecimal.TEN);
		
		try (StringWriter writer = new StringWriter()) {
			ser.write(item, writer);
			String str = writer.toString();
			System.out.println(str);
		}
	}
}
