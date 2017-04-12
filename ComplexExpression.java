package com.pl;

import java.util.ArrayList;
import java.util.List;

public class ComplexExpression implements IComplex{
	private List<IComplex> complexList=new ArrayList<>();
	@Override
	public void add(IComplex complex) {
		// TODO Auto-generated method stub
		this.complexList.add(complex);
	}
	
	@Override
	public IComplex multi(IComplex complex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public IComplex plus(IComplex complex) {
		add(complex);
		IComplex result=new Complex(0, 0);
		for(IComplex comp:complexList){
			result=comp.plus(result);
		}	
		return result;
	};
	
	public IComplex plus() {
		return plus(new Complex(0, 0));
	}

}
