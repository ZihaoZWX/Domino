package Ejercicio12_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	static String f1;
	static String f2;
	static String f3;
	static String f4;
	static String f5;
	static String f6;
	static String f7;
	static String f8;
	static String f9;
	static String f10;
	static String f11;
	static String f12;
	static String f13;
	static String f14;
	
	static int turno=1;
	static boolean sacadas=true;
	static int empate=0;
	static int no;
	
	static String []tFichas;
	static String []jFichas;
	
	static ArrayList<Ficha> barajas = new ArrayList<Ficha>();
	static ArrayList<Ficha> barajas1 = new ArrayList<Ficha>();
	static ArrayList<Ficha> barajas2 = new ArrayList<Ficha>();
	static ArrayList<Ficha> barajas3 = new ArrayList<Ficha>();
	static ArrayList<Ficha> barajas4 = new ArrayList<Ficha>();
	
	static Jugador jugador1 = new Jugador("Jugador1", barajas1);
	static Jugador jugador2 = new Jugador("Jugador2", barajas2);
	static Jugador jugador3 = new Jugador("Jugador3", barajas3);
	static Jugador jugador4 = new Jugador("Jugador4", barajas4);
	
	public static void main(String[] args) {

		int a2 = 0;
		int b2 = 27;
		
		

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				}
				if (i == 1 && j != 0) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 2 && j != 0 && j != 1) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 3 && j != 0 && j != 1 && j != 2) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 4 && j != 0 && j != 1 && j != 2 && j != 3) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 5 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 6 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4 && j != 5) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				} else if (i == 7 && j != 0 && j != 1 && j != 2 && j != 3 && j != 4 && j != 5 && j != 6) {
					Ficha a = new Ficha(i, j);
					barajas.add(a);
				}
			}
		}
		
		for (int k = 0; k < 7; k++) {
			int num = generarNumero(a2, b2);
			barajas1.add(barajas.get(num));
			barajas.remove(barajas.get(num));
			b2--;
		}
		for (int k = 0; k < 7; k++) {
			int num = generarNumero(a2, b2);
			barajas2.add(barajas.get(num));
			barajas.remove(barajas.get(num));
			b2--;
		}
		for (int k = 0; k < 7; k++) {
			int num = generarNumero(a2, b2);
			barajas3.add(barajas.get(num));
			barajas.remove(barajas.get(num));
			b2--;
		}
		for (int k = 0; k < 7; k++) {
			int num = generarNumero(a2, b2);
			barajas4.add(barajas.get(num));
			barajas.remove(barajas.get(num));
			b2--;
		}
		
		jFichas=barajas1.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
		f1=jFichas[0];
		f2=jFichas[1];
		f3=jFichas[2];
		f4=jFichas[3];
		f5=jFichas[4];
		f6=jFichas[5];
		f7=jFichas[6];
		f8=jFichas[7];
		f9=jFichas[8];
		f10=jFichas[9];
		f11=jFichas[10];
		f12=jFichas[11];
		f13=jFichas[12];
		f14=jFichas[13];
		
		Tablero t=new Tablero();
		
		tFichas=barajas1.toString().replace("|","").replace("[", "").replace("]","").replace(" ", "").split(",");
		for(int i=0;i<tFichas.length;i++) {
			if(tFichas[i].equals("66")) {
				switch(i) {
				case 0:
					t.bFicha1.setVisible(false);
					t.lFicha1.setVisible(false);
					t.lFicha2.setVisible(false);
					break;
				case 1:
					t.bFicha2.setVisible(false);
					t.lFicha3.setVisible(false);
					t.lFicha4.setVisible(false);
					break;
				case 2:
					t.bFicha3.setVisible(false);
					t.lFicha5.setVisible(false);
					t.lFicha6.setVisible(false);
					break;
				case 3:
					t.bFicha4.setVisible(false);
					t.lFicha7.setVisible(false);
					t.lFicha8.setVisible(false);
					break;
				case 4:
					t.bFicha5.setVisible(false);
					t.lFicha9.setVisible(false);
					t.lFicha10.setVisible(false);
					break;
				case 5:
					t.bFicha6.setVisible(false);
					t.lFicha11.setVisible(false);
					t.lFicha12.setVisible(false);
					break;
				case 6:
					t.bFicha7.setVisible(false);
					t.lFicha13.setVisible(false);
					t.lFicha14.setVisible(false);
					break;
				}
				jugador1.ficha.remove(i);
				turno=2;
			}
			
		}
				
		tFichas=barajas2.toString().replace("|", "").replace("[", "").replace("]","").replace(" ", "").split(",");
		for(int i2=0;i2<tFichas.length;i2++) {
			if(tFichas[i2].equals("66")) {
				jugador2.ficha.remove(i2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				turno=3;
			}
		}
		
		tFichas=barajas3.toString().replace("|", "").replace("[", "").replace("]","").replace(" ", "").split(",");
		for(int i3=0;i3<tFichas.length;i3++) {
			if(tFichas[i3].equals("66")) {
				jugador3.ficha.remove(i3);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				turno=4;
			}
		}
		
		tFichas=barajas4.toString().replace("|", "").replace("[", "").replace("]","").replace(" ", "").split(",");
		for(int i4=0;i4<tFichas.length;i4++) {
			if(tFichas[i4].equals("66")) {
				jugador4.ficha.remove(i4);
				t.n3=t.n3-1;
				t.m3=String.valueOf(t.n3);
				t.jugador4C.setText(t.m3);
				turno=1;
			}
		}
		
		try {
			
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		do {
		
		switch(turno) {
		
		case 1:
			tFichas=barajas1.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
			for(int i=0;i<tFichas.length;i++) {
				if(!t.lDerecha2.getText().equals("")&&!t.lIzquierda.getText().equals("")) {
					if(!tFichas[i].equals(t.lDerecha2.getText())&&!tFichas[i].equals(t.lIzquierda.getText())) {
						t.pasar.setVisible(true);
					}
				}else if(t.lDerecha2.getText().equals("")&&!t.lIzquierda.getText().equals("")) {
					if(!tFichas[i].equals("6")&&!tFichas[i].equals(t.lIzquierda.getText())) {
						t.pasar.setVisible(true);
					}
				}else if(!t.lDerecha2.getText().equals("")&&t.lIzquierda.getText().equals("")) {
					if(!tFichas[i].equals(t.lDerecha2.getText())&&!tFichas[i].equals("6")) {
						t.pasar.setVisible(true);
					}
				}else if(t.lDerecha2.getText().equals("")&&t.lIzquierda.getText().equals("")) {
					if(!tFichas[i].equals("6")) {
						t.pasar.setVisible(true);
					}
				}
				
			}
		break;
		case 2:
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			tFichas=barajas2.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
			for(int i=0;i<tFichas.length;i++) {
				if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==0) {
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i+1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==1) {
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i-1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==0) {
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i+1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==1) {
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i-1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else if(t.lDerecha2.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true){
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i+1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else if(t.lIzquierda.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true){
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i-1]);
				jugador2.ficha.remove(i/2);
				t.n1=t.n1-1;
				t.m1=String.valueOf(t.n1);
				t.jugador2C.setText(t.m1);
				sacadas=false;
				empate=0;
			}else {
				no=no+1;
			}
				
			if(no==tFichas.length+1) {
				empate=empate+1;
			}
			
		}
			try {
				
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			sacadas=true;
			turno=turno+1;
		break;
		case 3:
			tFichas=barajas3.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
			for(int i=0;i<tFichas.length;i++) {
				if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==0) {
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i+1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==1) {
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i-1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==0) {
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i+1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==1) {
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i-1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(t.lDerecha2.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==0){
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i+1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(t.lDerecha2.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==1){
				t.lDerecha.setText(tFichas[i]);
				t.lDerecha2.setText(tFichas[i-1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(t.lIzquierda.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==0){
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i+1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else if(t.lIzquierda.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==1){
				t.lIzquierda2.setText(tFichas[i]);
				t.lIzquierda.setText(tFichas[i-1]);
				jugador3.ficha.remove(i/2);
				t.n2=t.n2-1;
				t.m2=String.valueOf(t.n2);
				t.jugador3C.setText(t.m2);
				sacadas=false;
				empate=0;
			}else {
				no=no+1;
			}
				
			if(no==tFichas.length+1) {
				empate=empate+1;
			}
			
		}
			try {
				
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			sacadas=true;
			turno=turno+1;
		break;
		case 4:
			tFichas=barajas4.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
			for(int i=0;i<tFichas.length;i++) {
				if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==0) {
					t.lDerecha.setText(tFichas[i]);
					t.lDerecha2.setText(tFichas[i+1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(tFichas[i].equals(t.lDerecha2.getText())&&sacadas==true&&i%2==1) {
					t.lDerecha.setText(tFichas[i]);
					t.lDerecha2.setText(tFichas[i-1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==0) {
					t.lIzquierda2.setText(tFichas[i]);
					t.lIzquierda.setText(tFichas[i+1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(tFichas[i].equals(t.lIzquierda.getText())&&sacadas==true&&i%2==1) {
					t.lIzquierda2.setText(tFichas[i]);
					t.lIzquierda.setText(tFichas[i-1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(t.lDerecha2.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==0){
					t.lDerecha.setText(tFichas[i]);
					t.lDerecha2.setText(tFichas[i+1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(t.lDerecha2.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==1){
					t.lDerecha.setText(tFichas[i]);
					t.lDerecha2.setText(tFichas[i-1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(t.lIzquierda.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==0){
					t.lIzquierda2.setText(tFichas[i]);
					t.lIzquierda.setText(tFichas[i+1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else if(t.lIzquierda.getText().equals("")&&tFichas[i].equals("6")&&sacadas==true&&i%2==1){
					t.lIzquierda2.setText(tFichas[i]);
					t.lIzquierda.setText(tFichas[i-1]);
					jugador4.ficha.remove(i/2);
					t.n3=t.n3-1;
					t.m3=String.valueOf(t.n3);
					t.jugador4C.setText(t.m3);
					sacadas=false;
					empate=0;
				}else {
					no=no+1;
				}
					
				if(no==tFichas.length+1) {
					empate=empate+1;
				}
			
		}
			try {
				
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			sacadas=true;
			turno=1;
		break;
		
		}
	
		}while(jugador1.ficha.size()>0&&jugador2.ficha.size()>0&&jugador3.ficha.size()>0&&jugador4.ficha.size()>0&&empate!=4&&t.ganar()!=true);
		if(jugador2.ficha.size()==0) {
			JOptionPane.showMessageDialog(null, "El ganador es el jugador 2");
		}else if(jugador3.ficha.size()==0) {
			JOptionPane.showMessageDialog(null, "El ganador es el jugador 3");
		}else if(jugador4.ficha.size()==0) {
			JOptionPane.showMessageDialog(null, "El ganador es el jugador 4");
		}
		
		empate();
		
	}

	public static int generarNumero(int a, int b) {
		int valorEntero = (int) Math.floor(Math.random() * (b - a + 1) + a);
		return valorEntero;
	}
	
	public static void empate() {
		int j1=0,j2=0,j3=0,j4=0;
		int[] puntos=new int[14];
		if(empate==4) {
			tFichas=barajas1.toString().replace("|","").replace("[", "").replace("]","").replace(" ", "").split(",");
			for (int i=0;i<tFichas.length;i++) {
				puntos[i]=Integer.parseInt(tFichas[i]);
				j1=j1+puntos[i];
			}
			tFichas=barajas2.toString().replace("|","").replace("[", "").replace("]","").replace(" ", "").split(",");
			for (int i=0;i<tFichas.length;i++) {
				puntos[i]=Integer.parseInt(tFichas[i]);
				j2=j2+puntos[i];
			}
			tFichas=barajas3.toString().replace("|","").replace("[", "").replace("]","").replace(" ", "").split(",");
			for (int i=0;i<tFichas.length;i++) {
				puntos[i]=Integer.parseInt(tFichas[i]);
				j3=j3+puntos[i];
			}
			tFichas=barajas4.toString().replace("|","").replace("[", "").replace("]","").replace(" ", "").split(",");
			for (int i=0;i<tFichas.length;i++) {
				puntos[i]=Integer.parseInt(tFichas[i]);
				j4=j4+puntos[i];
			}
			if(j1>j2&&j1>j3&&j1>j4) {
				JOptionPane.showMessageDialog(null, "El ganador es el jugador 1");
			}else if(j2>j3&&j2>j4) {
				JOptionPane.showMessageDialog(null, "El ganador es el jugador 2");
			}else if(j3>j4) {
				JOptionPane.showMessageDialog(null, "El ganador es el jugador 3");
			}else {
				JOptionPane.showMessageDialog(null, "El ganador es el jugador 4");
			}
		}
	}
	
}
