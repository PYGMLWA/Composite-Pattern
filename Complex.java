package com.pl;

public class Complex implements IComplex{
	private int real;
	private int unreal;
	
	public Complex(int real,int unreal) {
		// TODO Auto-generated constructor stub
		this.real=real;
		this.unreal=unreal;
	}
	@Override
	public void add(IComplex complex) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public IComplex plus(IComplex complex) {
		
		this.real+=((Complex)complex).getReal();
		this.unreal+=((Complex)complex).getUnreal();
		return this;
	}
	
	@Override
	public IComplex multi(IComplex complex) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getUnreal() {
		return unreal;
	}

	public void setUnreal(int unreal) {
		this.unreal = unreal;
	}
	
	

}
