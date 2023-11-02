package Ejercicio12_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tablero extends JFrame implements ActionListener{
	
	Toolkit tk=Toolkit.getDefaultToolkit();
	Dimension d=tk.getScreenSize();
	int alto=(int)d.getHeight();
	int largo=(int)d.getWidth();
	int distAlto=alto/2-300;
	int distLargo=largo/2-500;
	Container container=getContentPane();
	JButton bFicha1=new JButton("");
	JButton bFicha2=new JButton("");
	JButton bFicha3=new JButton("");
	JButton bFicha4=new JButton("");
	JButton bFicha5=new JButton("");
	JButton bFicha6=new JButton("");
	JButton bFicha7=new JButton("");
	JButton bDerecha=new JButton("");
	JButton bIzquierda=new JButton("");
	JButton pasar=new JButton("Pasar");
	JFrame frame=new JFrame();
	Main m=new Main();
	int n1=7,n2=7,n3=7;
	boolean sacar=false;
	int borrar=0;
	String m1=String.valueOf(n1);
	String m2=String.valueOf(n2);
	String m3=String.valueOf(n3);
	JLabel fondo=new JLabel();
	JLabel lFicha1=new JLabel(m.f1);
	JLabel lFicha2=new JLabel(m.f2);
	JLabel lFicha3=new JLabel(m.f3);
	JLabel lFicha4=new JLabel(m.f4);
	JLabel lFicha5=new JLabel(m.f5);
	JLabel lFicha6=new JLabel(m.f6);
	JLabel lFicha7=new JLabel(m.f7);
	JLabel lFicha8=new JLabel(m.f8);
	JLabel lFicha9=new JLabel(m.f9);
	JLabel lFicha10=new JLabel(m.f10);
	JLabel lFicha11=new JLabel(m.f11);
	JLabel lFicha12=new JLabel(m.f12);
	JLabel lFicha13=new JLabel(m.f13);
	JLabel lFicha14=new JLabel(m.f14);
	JLabel lPrimero=new JLabel("6");
	JLabel lPrimero2=new JLabel("6");
	JLabel lCentro=new JLabel("");
	JLabel lDerecha=new JLabel("");
	JLabel lDerecha2=new JLabel("");
	JLabel lIzquierda=new JLabel("");
	JLabel lIzquierda2=new JLabel("");
	JLabel jugador2=new JLabel("");
	JLabel jugador3=new JLabel("");
	JLabel jugador4=new JLabel("");
	JLabel jugador2C=new JLabel(m1);
	JLabel jugador3C=new JLabel(m2);
	JLabel jugador4C=new JLabel(m3);
	JLabel eleTemp;
	JLabel eleTemp2;
	
	public Tablero() {
		setLayout();
		setLocationAndSize();
		addComponentToLocation();
		addActionListener();
		frame.setTitle("Domino");
		frame.setBounds(distLargo,distAlto,1000,600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(container);
		frame.setVisible(true);
	}
	
	public void setLayout() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		fondo.setBounds(0,0,1000,600);
		fondo.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/madera1000x600.png")));
		bFicha1.setBounds(330,450,20,60);
		bFicha1.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha1.setBorderPainted(false);
		bFicha1.setFocusPainted(false);
		bFicha1.setContentAreaFilled(false);
		bFicha1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha2.setBounds(380,450,20,60);
		bFicha2.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha2.setBorderPainted(false);
		bFicha2.setFocusPainted(false);
		bFicha2.setContentAreaFilled(false);
		bFicha2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha3.setBounds(430,450,20,60);
		bFicha3.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha3.setBorderPainted(false);
		bFicha3.setFocusPainted(false);
		bFicha3.setContentAreaFilled(false);
		bFicha3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha4.setBounds(480,450,20,60);
		bFicha4.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha4.setBorderPainted(false);
		bFicha4.setFocusPainted(false);
		bFicha4.setContentAreaFilled(false);
		bFicha4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha5.setBounds(530,450,20,60);
		bFicha5.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha5.setBorderPainted(false);
		bFicha5.setFocusPainted(false);
		bFicha5.setContentAreaFilled(false);
		bFicha5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha6.setBounds(580,450,20,60);
		bFicha6.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha6.setBorderPainted(false);
		bFicha6.setFocusPainted(false);
		bFicha6.setContentAreaFilled(false);
		bFicha6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bFicha7.setBounds(630,450,20,60);
		bFicha7.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		bFicha7.setBorderPainted(false);
		bFicha7.setFocusPainted(false);
		bFicha7.setContentAreaFilled(false);
		bFicha7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lFicha1.setBounds(334,453,11,20);
		lFicha1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha1.setForeground(new Color(0, 0, 0));
		lFicha2.setBounds(334,483,11,20);
		lFicha2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha2.setForeground(new Color(0, 0, 0));
		lFicha3.setBounds(384,453,11,20);
		lFicha3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha3.setForeground(new Color(0, 0, 0));
		lFicha4.setBounds(384,483,11,20);
		lFicha4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha4.setForeground(new Color(0, 0, 0));
		lFicha5.setBounds(434,453,11,20);
		lFicha5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha5.setForeground(new Color(0, 0, 0));
		lFicha6.setBounds(434,483,11,20);
		lFicha6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha6.setForeground(new Color(0, 0, 0));
		lFicha7.setBounds(484,453,11,20);
		lFicha7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha7.setForeground(new Color(0, 0, 0));
		lFicha8.setBounds(484,483,11,20);
		lFicha8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha8.setForeground(new Color(0, 0, 0));
		lFicha9.setBounds(534,453,11,20);
		lFicha9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha9.setForeground(new Color(0, 0, 0));
		lFicha10.setBounds(534,483,11,20);
		lFicha10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha10.setForeground(new Color(0, 0, 0));
		lFicha11.setBounds(584,453,11,20);
		lFicha11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha11.setForeground(new Color(0, 0, 0));
		lFicha12.setBounds(584,483,11,20);
		lFicha12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha12.setForeground(new Color(0, 0, 0));
		lFicha13.setBounds(634,453,11,20);
		lFicha13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha13.setForeground(new Color(0, 0, 0));
		lFicha14.setBounds(634,483,11,20);
		lFicha14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFicha14.setForeground(new Color(0, 0, 0));
		lCentro.setBounds(480,290,20,60);
		lCentro.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha.png")));
		lPrimero.setBounds(484,293,11,20);
		lPrimero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lPrimero.setForeground(new Color(0, 0, 0));
		lPrimero2.setBounds(484,323,11,20);
		lPrimero2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lPrimero2.setForeground(new Color(0, 0, 0));
		lDerecha.setBounds(564,307,11,20);
		lDerecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lDerecha.setForeground(new Color(0, 0, 0));
		lDerecha2.setBounds(594,307,11,20);
		lDerecha2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lDerecha2.setForeground(new Color(0, 0, 0));
		lIzquierda.setBounds(384,307,11,20);
		lIzquierda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lIzquierda.setForeground(new Color(0, 0, 0));
		lIzquierda2.setBounds(414,307,11,20);
		lIzquierda2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lIzquierda2.setForeground(new Color(0, 0, 0));
		bDerecha.setBounds(550,307,60,22);
		bDerecha.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha2.png")));
		bDerecha.setBorderPainted(false);
		bDerecha.setFocusPainted(false);
		bDerecha.setContentAreaFilled(false);
		bIzquierda.setBounds(370,307,60,22);
		bIzquierda.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/ficha2.png")));
		bIzquierda.setBorderPainted(false);
		bIzquierda.setFocusPainted(false);
		bIzquierda.setContentAreaFilled(false);
		jugador2.setBounds(775,100,225,225);
		jugador2.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/jugador1.png")));
		jugador3.setBounds(385,0,225,225);
		jugador3.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/jugador1.png")));
		jugador4.setBounds(0,100,225,225);
		jugador4.setIcon(new ImageIcon(Tablero.class.getResource("/Imagenes/jugador2.png")));
		jugador2C.setBounds(875,340,11,20);
		jugador2C.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jugador2C.setForeground(new Color(0, 0, 0));
		jugador3C.setBounds(485,240,11,20);
		jugador3C.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jugador3C.setForeground(new Color(0, 0, 0));
		jugador4C.setBounds(112,340,11,20);
		jugador4C.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jugador4C.setForeground(new Color(0, 0, 0));
		pasar.setBounds(445,400,100,30);
		pasar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pasar.setVisible(false);
	}
	
	public void addComponentToLocation() {
		container.add(bFicha1);
		container.add(bFicha2);
		container.add(bFicha3);
		container.add(bFicha4);
		container.add(bFicha5);
		container.add(bFicha6);
		container.add(bFicha7);
		container.add(lFicha1);
		container.add(lFicha2);
		container.add(lFicha3);
		container.add(lFicha4);
		container.add(lFicha5);
		container.add(lFicha6);
		container.add(lFicha7);
		container.add(lFicha8);
		container.add(lFicha9);
		container.add(lFicha10);
		container.add(lFicha11);
		container.add(lFicha12);
		container.add(lFicha13);
		container.add(lFicha14);
		container.add(lCentro);
		container.add(lPrimero);
		container.add(lPrimero2);
		container.add(lDerecha);
		container.add(lDerecha2);
		container.add(lIzquierda);
		container.add(lIzquierda2);
		container.add(bDerecha);
		container.add(bIzquierda);
		container.add(jugador2);
		container.add(jugador3);
		container.add(jugador4);
		container.add(jugador2C);
		container.add(jugador3C);
		container.add(jugador4C);
		container.add(pasar);
		container.add(fondo);
	}
	
	public void addActionListener() {
		bFicha1.addActionListener(this);
		bFicha2.addActionListener(this);
		bFicha3.addActionListener(this);
		bFicha4.addActionListener(this);
		bFicha5.addActionListener(this);
		bFicha6.addActionListener(this);
		bFicha7.addActionListener(this);
		pasar.addActionListener(this);
		bDerecha.addActionListener(this);
		bIzquierda.addActionListener(this);
	}
	
	public void sacarFicha(JButton botonTemp,JLabel templ,JLabel templ2) {
		m.jFichas=m.barajas1.toString().replace("[","").replace("]", "").replace("|", ",").replace(" ", "").split(",");
		if(templ.getText().equals(lIzquierda.getText())&&templ.getText().equals(lDerecha2.getText())) {
			sacar=true;
			bIzquierda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			eleTemp=templ;
			eleTemp2=templ2;
		}else if(templ2.getText().equals(lIzquierda.getText())&&templ2.getText().equals(lDerecha2.getText())) {
			sacar=true;
			bIzquierda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			bDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			eleTemp=templ;
			eleTemp2=templ2;
		}else if(templ.getText().equals(lDerecha2.getText())) {
			lDerecha.setText(templ.getText());
			lDerecha2.setText(templ2.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(templ2.getText().equals(lDerecha2.getText())) {
			lDerecha.setText(templ2.getText());
			lDerecha2.setText(templ.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(templ.getText().equals(lIzquierda.getText())) {
			lIzquierda2.setText(templ.getText());
			lIzquierda.setText(templ2.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(templ2.getText().equals(lIzquierda.getText())) {
			lIzquierda2.setText(templ2.getText());
			lIzquierda.setText(templ.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(lIzquierda.getText().equals("")&&templ.getText().equals("6")) {
			lIzquierda2.setText(templ.getText());
			lIzquierda.setText(templ2.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(lIzquierda.getText().equals("")&&templ2.getText().equals("6")) {
			lIzquierda2.setText(templ2.getText());
			lIzquierda.setText(templ.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(lDerecha2.getText().equals("")&&templ.getText().equals("6")) {
			lDerecha2.setText(templ.getText());
			lDerecha.setText(templ2.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}else if(lDerecha2.getText().equals("")&&templ2.getText().equals("6")) {
			lDerecha2.setText(templ2.getText());
			lDerecha.setText(templ.getText());
			botonTemp.setVisible(false);
			templ.setVisible(false);
			templ2.setVisible(false);
			m.turno=m.turno+1;
		}
		
	}
	
	public void elegirIzquierda() {
		if(sacar==true&&eleTemp.getText().equals(lIzquierda.getText())&&eleTemp.getText().equals(lDerecha2.getText())) {
			lIzquierda2.setText(eleTemp.getText());
			lIzquierda.setText(eleTemp2.getText());
			m.turno=m.turno+1;
		}else if(sacar==true&&eleTemp2.getText().equals(lIzquierda.getText())&&eleTemp2.getText().equals(lDerecha2.getText())) {
			lIzquierda2.setText(eleTemp2.getText());
			lIzquierda.setText(eleTemp.getText());
			m.turno=m.turno+1;
		}
		bIzquierda.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		sacar=false;
	}
	
	public void elegirDerecha() {
		if(sacar==true&&eleTemp.getText().equals(lIzquierda.getText())&&eleTemp.getText().equals(lDerecha2.getText())) {
			lDerecha.setText(eleTemp.getText());
			lDerecha2.setText(eleTemp2.getText());
			m.turno=m.turno+1;
		}else if(sacar==true&&eleTemp2.getText().equals(lIzquierda.getText())&&eleTemp2.getText().equals(lDerecha2.getText())) {
			lDerecha.setText(eleTemp2.getText());
			lDerecha2.setText(eleTemp.getText());
			m.turno=m.turno+1;
		}
		bIzquierda.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		sacar=false;
		
	}
	
	public boolean ganar() {
		if(!bFicha1.isVisible()&&!bFicha2.isVisible()&&!bFicha3.isVisible()&&!bFicha4.isVisible()&&!bFicha5.isVisible()&&!bFicha6.isVisible()&&!bFicha7.isVisible()) {
			JOptionPane.showMessageDialog(null, "Ganastes");
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bFicha1) {
			if(m.turno==1) {
			sacarFicha(bFicha1,lFicha1,lFicha2);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha2) {
			if(m.turno==1) {
			sacarFicha(bFicha2,lFicha3,lFicha4);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha3) {
			if(m.turno==1) {
			sacarFicha(bFicha3,lFicha5,lFicha6);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha4) {
			if(m.turno==1) {
			sacarFicha(bFicha4,lFicha7,lFicha8);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha5) {
			if(m.turno==1) {
			sacarFicha(bFicha5,lFicha9,lFicha10);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha6) {
			if(m.turno==1) {
			sacarFicha(bFicha6,lFicha11,lFicha12);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==bFicha7) {
			if(m.turno==1) {
			sacarFicha(bFicha7,lFicha13,lFicha14);
			ganar();
			pasar.setVisible(false);
			m.empate=0;
			}
		}
		if(e.getSource()==pasar) {
			if(m.turno==1) {
			m.turno=m.turno+1;
			pasar.setVisible(false);
			m.empate=m.empate+1;
			}
		}
		if(e.getSource()==bDerecha) {
			elegirDerecha();
			pasar.setVisible(false);
		}
		if(e.getSource()==bIzquierda) {
			elegirIzquierda();
			pasar.setVisible(false);
		}
	}

}
