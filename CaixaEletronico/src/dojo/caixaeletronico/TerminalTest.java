package dojo.caixaeletronico;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TerminalTest {

	Terminal tm;
	
	@Before
	public void init(){
		
		tm = new Terminal();
	}
	
	
	@Test
	public void test10Reais() {
		
		int []qtdNotas = {1,0,0,0};		
		assertArrayEquals(qtdNotas, tm.saque(10)); 
			
	}
	
	@Test
	public void test200Reais() {
		
		int []qtdNotas = {0,0,0,2};
		assertArrayEquals(qtdNotas, tm.saque(200));			
	}
	
	
	
	@Test
	public void test230Reais() {
		
		int []qtdNotas = {1,1,0,2};
		
		assertArrayEquals(qtdNotas, tm.saque(230)); 
			
	}
	
	@Test
	public void test30Reais() {
		
		int []qtdNotas = {1,1,0,0};
		
		assertArrayEquals(qtdNotas, tm.saque(30)); 
			
	}

	
	@Test
	public void test490Reais() {
		
		int []qtdNotas = {0,2,1,4};
		
		assertArrayEquals(qtdNotas, tm.saque(490)); 
			
	}
	
	
	@Test
	public void test880Reais() {
		
		int []qtdNotas = {1,1,1,8};
		
		assertArrayEquals(qtdNotas, tm.saque(880)); 
			
	}	
	
	@Test
	public void test60Reais() {
		
		int []qtdNotas = {1,0,1,0};
		
		assertArrayEquals(qtdNotas, tm.saque(60)); 
			
	}	
	
	
	@Test
	public void test1380() {
		
		int []qtdNotas = {1,1,1,13};
		
		assertArrayEquals(qtdNotas, tm.saque(1380)); 
			
	}	
	

}
