package com.pl.test;

import org.junit.Test;

import com.pl.Complex;
import com.pl.ComplexExpression;
import com.pl.IComplex;

public class ComplexTest {
	@Test
	public void testComplex(){
		IComplex c1=new Complex(10, 20);
		IComplex c2=new Complex(20, 30);
		ComplexExpression ce1=new ComplexExpression();
		ce1.add(c1);
		ce1.add(c2);
		ComplexExpression ce2=new ComplexExpression();
		ce2.add(c1);
		ce1.add(ce2);
//		Complex result=(Complex)ce1.plus();
		Complex result=(Complex)c1.plus(c2);
		System.out.println(result.getReal()+"--"+result.getUnreal());
	}
}
