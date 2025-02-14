package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	Exercises ejercicios = new Exercises();
	Exercises.convertInt conv = ejercicios.new convertInt();

	@Test(expected = Exception.class)
	public void test_positiveWithException() throws Exception {
		char[] argumentos = new char[]{ '\6','\2','\3','\4','\5' }; 
		conv.convert(argumentos);
	}
	
	@Test(expected = Exception.class)
	public void test_moreThanSixException() throws Exception {
		char[] argumentos = new char[]{ '\1','\2','\3','\4','\5','\6','\7' }; 
		conv.convert(argumentos);
	}
	
	@Test(expected = Exception.class)
	public void test_negativeWithException() throws Exception {
		char[] argumentos = new char[]{ '-','\6','\2','\3','\4','\5' }; 
		conv.convert(argumentos);	
	}
	
	@Test
	public void test_negativeWithoutException() throws Exception {
		char[] argumentos = new char[]{ '-','\2','\3' }; 
		assertEquals(-23, conv.convert(argumentos),0);	
	}
	
	

}
