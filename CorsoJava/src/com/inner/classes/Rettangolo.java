package com.inner.classes;

public class Rettangolo {
	
	private long base;
	private long altezza;
	
	

	public Rettangolo(long base, long altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	
	public class Area {
		public long getArea() {
			return base*altezza;
		}
	}


	public static void main(String[] args) {
		Rettangolo rettangolo = new Rettangolo(5, 2);
		
		Rettangolo.Area area = rettangolo.new Area();
		
		System.out.println(area.getArea());
		

	}

}
