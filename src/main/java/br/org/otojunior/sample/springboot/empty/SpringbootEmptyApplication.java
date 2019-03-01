/*
 * 
 */
package br.org.otojunior.sample.springboot.empty;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@SpringBootApplication
public class SpringbootEmptyApplication {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmptyApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner run() {
		return (args) -> {
			System.out.println(new File("teste.zip").exists());
			try (
				ZipInputStream zipin =
					new ZipInputStream(
					new FileInputStream("teste.zip"));
				BufferedReader in = 
					new BufferedReader(
					new InputStreamReader(zipin));
			) {
				zipin.getNextEntry();
				String line = in.readLine();
				while (line != null) {
					System.out.println(line);
					line = in.readLine();
				}
			}
		};
	}*/
	
	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			try (
				BufferedReader in = 
					new BufferedReader(
					new InputStreamReader(
					new GZIPInputStream(
					new FileInputStream("teste.txt.gz"))));
			) {
				String line = in.readLine();
				while (line != null) {
					System.out.println(line);
					line = in.readLine();
				}
			}
		};
	}
}
