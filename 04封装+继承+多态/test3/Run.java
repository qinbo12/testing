	package com.l05.test2;

public class Run {

	public static void main(String[] args) {
		int temp = 10;
//		if(temp > 0 && temp < 100) {
//			Water w = new Water();
//			w.showState();
//		} else if(temp <= 0) {
//			Ice i = new Ice();
//			i.showState();
//		} else if(temp >= 100) {
//			Gas g = new Gas();
//			g.showState();
//		}	
		
		H2o h2o = null;
		
		if(temp > 0 && temp < 100) {
			h2o = new Water();
		} else if(temp <= 0) {
			h2o = new Ice();
		} else if(temp >= 100) {
			h2o = new Gas();
		}
		
		h2o.showState();
	}

} 
