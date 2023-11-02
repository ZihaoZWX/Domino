package Ejercicio12_2;

import junit.framework.TestCase;

public class TestDomino extends TestCase{
	Main m=new Main();
	public void testSumar() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				}
				if (i == 1 && j != 0) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 2 && j != 0 && j != 1) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 3 && j != 0 && j != 1 && j != 2) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 4 && j != 0 && j != 1 && j != 2 && j != 3) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 5 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 6 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4 && j != 5) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				} else if (i == 7 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4 && j != 5 && j != 6) {
					Ficha a = new Ficha(i, j);
					m.barajas.add(a);
				}
			}
		}
		assertTrue(m.barajas.size()==28);
		
	}

}
