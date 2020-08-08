import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Playing_5x5 extends JFrame {

	private JPanel contentPane;
	private static final Color GREEN = Color.cyan;
	private  final Color GRAY = Color.getColor("#ffffff");
	
	private int sumatoria = 34; // suma a la cual deben llegan los Ni y los Ri con i = 1,2,3,4,5
	private JTextField A1;
	private JTextField A2;
	private JTextField A3;
	private JTextField A4;
	private JTextField B1;
	private JTextField B2;
	private JTextField B3;
	private JTextField B4;
	private JTextField C1;
	private JTextField C2;
	private JTextField C3;
	private JTextField C4;
	private JTextField D1;
	private JTextField D2;
	private JTextField D3;
	private JTextField D4;
	private JTextField A5;
	private JTextField B5;
	private JTextField C5;
	private JTextField D5;
	private JTextField E1;
	private JTextField E2;
	private JTextField E3;
	private JTextField E4;
	private JTextField E5;

	private int[] F1 = new int[5];
	private int[] F2 = new int[5];
	private int[] F3 = new int[5];
	private int[] F4 = new int[5];
	private int[] F5 = new int[5];
	private int[] J1 = new int[5];
	private int[] J2 = new int[5];
	private int[] J3 = new int[5];
	private int[] J4 = new int[5];
	private int[] J5 = new int[5];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playing_5x5 frame = new Playing_5x5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Playing_5x5() {
		setTitle("Playin 5x5");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 51));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField N1 = new JFormattedTextField();
		N1.setForeground(new Color(0, 153, 0));
		N1.setText("N1");
		N1.setEditable(false);
		N1.setHorizontalAlignment(SwingConstants.CENTER);
		N1.setEnabled(false);
		N1.setFont(new Font("Tahoma", Font.BOLD, 13));
		N1.setBounds(10, 216, 35, 35);
		contentPane.add(N1);
		
		JFormattedTextField N2 = new JFormattedTextField();
		N2.setText("N2");
		N2.setEditable(false);
		N2.setHorizontalAlignment(SwingConstants.CENTER);
		N2.setEnabled(false);
		N2.setFont(new Font("Tahoma", Font.BOLD, 13));
		N2.setBounds(43, 216, 35, 35);
		contentPane.add(N2);
		
		JFormattedTextField N3 = new JFormattedTextField();
		N3.setText("N3");
		N3.setHorizontalAlignment(SwingConstants.CENTER);
		N3.setFont(new Font("Tahoma", Font.BOLD, 13));
		N3.setEnabled(false);
		N3.setEditable(false);
		N3.setBounds(75, 216, 35, 35);
		contentPane.add(N3);
		
		JFormattedTextField N4 = new JFormattedTextField();
		N4.setText("N4");
		N4.setHorizontalAlignment(SwingConstants.CENTER);
		N4.setFont(new Font("Tahoma", Font.BOLD, 13));
		N4.setEnabled(false);
		N4.setEditable(false);
		N4.setBounds(109, 216, 35, 35);
		contentPane.add(N4);
		
		JFormattedTextField N5 = new JFormattedTextField();
		N5.setText("N5");
		N5.setHorizontalAlignment(SwingConstants.CENTER);
		N5.setFont(new Font("Tahoma", Font.BOLD, 13));
		N5.setEnabled(false);
		N5.setEditable(false);
		N5.setBounds(143, 216, 35, 35);
		contentPane.add(N5);
		
		
		JFormattedTextField R1 = new JFormattedTextField();
		R1.setForeground(new Color(0, 255, 0));
		R1.setText("R1");
		R1.setEditable(false);
		R1.setEnabled(false);
		R1.setHorizontalAlignment(SwingConstants.CENTER);
		R1.setFont(new Font("Tahoma", Font.BOLD, 13));
		R1.setBounds(212, 23, 35, 35);
		contentPane.add(R1);
		
		JFormattedTextField R2 = new JFormattedTextField();
		R2.setText("R2");
		R2.setHorizontalAlignment(SwingConstants.CENTER);
		R2.setFont(new Font("Tahoma", Font.BOLD, 13));
		R2.setEnabled(false);
		R2.setEditable(false);
		R2.setBounds(212, 58, 35, 35);
		contentPane.add(R2);
		
		JFormattedTextField R3 = new JFormattedTextField();
		R3.setText("R3");
		R3.setHorizontalAlignment(SwingConstants.CENTER);
		R3.setFont(new Font("Tahoma", Font.BOLD, 13));
		R3.setEnabled(false);
		R3.setEditable(false);
		R3.setBounds(212, 93, 35, 35);
		contentPane.add(R3);
		
		JFormattedTextField R4 = new JFormattedTextField();
		R4.setText("R4");
		R4.setHorizontalAlignment(SwingConstants.CENTER);
		R4.setFont(new Font("Tahoma", Font.BOLD, 13));
		R4.setEnabled(false);
		R4.setEditable(false);
		R4.setBounds(212, 128, 35, 35);
		contentPane.add(R4);
		
		JFormattedTextField R5 = new JFormattedTextField();
		R5.setText("R5");
		R5.setHorizontalAlignment(SwingConstants.CENTER);
		R5.setFont(new Font("Tahoma", Font.BOLD, 13));
		R5.setEnabled(false);
		R5.setEditable(false);
		R5.setBounds(212, 163, 35, 35);
		contentPane.add(R5);
		
		A1 = new JTextField();
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Controll.validarSoloEnteros(A1.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
//					return;
				}
				
				F1[0] = Integer.parseInt(A1.getText());
				J1[0] = Integer.parseInt(A1.getText());
				
				if(Controll.sumatoriaCorrecta(F1,Integer.parseInt(R1.getText()))) {
					R1.setBackground(GREEN);
				}
				else {
					R1.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N1.getText()))) {
					N1.setBackground(GREEN);
				}
				else {
					N1.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		A1.setFont(new Font("Tahoma", Font.BOLD, 13));
		A1.setHorizontalAlignment(SwingConstants.CENTER);
		A1.setBounds(10, 23, 35, 35);
		contentPane.add(A1);
		A1.setColumns(10);
		A1.addKeyListener(null);
		
		A2 = new JTextField();
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
								
				if(Controll.validarSoloEnteros(A2.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
//					return;
				}
				
				F1[1] = Integer.parseInt(A2.getText());
				J2[0] = Integer.parseInt(A2.getText());
				
				if(Controll.sumatoriaCorrecta(F1,Integer.parseInt(R1.getText()))) {
					R1.setBackground(GREEN);
				}
				else {
					R1.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N2.getText()))) {
					N2.setBackground(GREEN);
				}
				else {
					N2.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		A2.setFont(new Font("Tahoma", Font.BOLD, 13));
		A2.setHorizontalAlignment(SwingConstants.CENTER);
		A2.setColumns(10);
		A2.setBounds(43, 23, 35, 35);
		contentPane.add(A2);
		A2.addKeyListener(null);
		
		A3 = new JTextField();
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(A3.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
					
				}
				
				F1[2] = Integer.parseInt(A3.getText());
				J3[0] = Integer.parseInt(A3.getText());
				
				if(Controll.sumatoriaCorrecta(F1,Integer.parseInt(R1.getText()))) {
					R1.setBackground(GREEN);
				}
				else {
					R1.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J3,Integer.parseInt(N3.getText()))) {
					N3.setBackground(GREEN);
				}
				else {
					N3.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		A3.setHorizontalAlignment(SwingConstants.CENTER);
		A3.setFont(new Font("Tahoma", Font.BOLD, 13));
		A3.setColumns(10);
		A3.setBounds(75, 23, 35, 35);
		contentPane.add(A3);
		A3.addKeyListener(null);
		
		A4 = new JTextField();
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(A4.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F1[3] = Integer.parseInt(A4.getText());
				J4[0] = Integer.parseInt(A4.getText());
				
				if(Controll.sumatoriaCorrecta(F1,Integer.parseInt(R1.getText()))) {
					R1.setBackground(GREEN);
				}
				else {
					R1.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N4.getText()))) {
					N4.setBackground(GREEN);
				}
				else {
					N4.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		A4.setHorizontalAlignment(SwingConstants.CENTER);
		A4.setFont(new Font("Tahoma", Font.BOLD, 13));
		A4.setColumns(10);
		A4.setBounds(109, 23, 35, 35);
		contentPane.add(A4);
		
		A5 = new JTextField();
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(A5.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F1[4] = Integer.parseInt(A5.getText());
				J5[0] = Integer.parseInt(A5.getText());
				
				if(Controll.sumatoriaCorrecta(F1,Integer.parseInt(R1.getText()))) {
					R1.setBackground(GREEN);
				}
				else {
					R1.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J5,Integer.parseInt(N5.getText()))) {
					N5.setBackground(GREEN);
				}
				else {
					N5.setBackground(GRAY);
				}
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		A5.setHorizontalAlignment(SwingConstants.CENTER);
		A5.setFont(new Font("Tahoma", Font.BOLD, 13));
		A5.setColumns(10);
		A5.setBounds(143, 23, 35, 35);
		contentPane.add(A5);
		
		
		
		B1 = new JTextField();
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(B1.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F2[0] = Integer.parseInt(B1.getText());
				J1[1] = Integer.parseInt(B1.getText());
				
				if(Controll.sumatoriaCorrecta(F2,Integer.parseInt(R2.getText()))) {
					R2.setBackground(GREEN);
				}
				else {
					R2.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N1.getText()))) {
					N1.setBackground(GREEN);
				}
				else {
					N1.setBackground(GRAY);
				}
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		B1.setHorizontalAlignment(SwingConstants.CENTER);
		B1.setFont(new Font("Tahoma", Font.BOLD, 13));
		B1.setColumns(10);
		B1.setBounds(10, 58, 35, 35);
		contentPane.add(B1);
		
		B2 = new JTextField();
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(B2.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F2[1] = Integer.parseInt(B2.getText());
				J2[1] = Integer.parseInt(B2.getText());
				
				if(Controll.sumatoriaCorrecta(F2,Integer.parseInt(R2.getText()))) {
					R2.setBackground(GREEN);
				}
				else {
					R2.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J2,Integer.parseInt(N2.getText()))) {
					N2.setBackground(GREEN);
				}
				else {
					N2.setBackground(GRAY);
				}
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		B2.setHorizontalAlignment(SwingConstants.CENTER);
		B2.setFont(new Font("Tahoma", Font.BOLD, 13));
		B2.setColumns(10);
		B2.setBounds(43, 58, 35, 35);
		contentPane.add(B2);
		
		B3 = new JTextField();
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(B3.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F2[2] = Integer.parseInt(B3.getText());
				J3[1] = Integer.parseInt(B3.getText());
				
				if(Controll.sumatoriaCorrecta(F2,Integer.parseInt(R2.getText()))) {
					R2.setBackground(GREEN);
				}
				else {
					R2.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J3,Integer.parseInt(N3.getText()))) {
					N3.setBackground(GREEN);
				}
				else {
					N3.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		B3.setHorizontalAlignment(SwingConstants.CENTER);
		B3.setFont(new Font("Tahoma", Font.BOLD, 13));
		B3.setColumns(10);
		B3.setBounds(75, 58, 35, 35);
		contentPane.add(B3);
		
		B4 = new JTextField();
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(B4.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F2[3] = Integer.parseInt(B4.getText());
				J4[1] = Integer.parseInt(B4.getText());
				
				if(Controll.sumatoriaCorrecta(F2,Integer.parseInt(R2.getText()))) {
					R2.setBackground(GREEN);
				}
				else {
					R2.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J4,Integer.parseInt(N4.getText()))) {
					N4.setBackground(GREEN);
				}
				else {
					N4.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		B4.setHorizontalAlignment(SwingConstants.CENTER);
		B4.setFont(new Font("Tahoma", Font.BOLD, 13));
		B4.setColumns(10);
		B4.setBounds(109, 58, 35, 35);
		contentPane.add(B4);
		
		B5 = new JTextField();
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(B5.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F2[4] = Integer.parseInt(B5.getText());
				J5[1] = Integer.parseInt(B5.getText());
				
				if(Controll.sumatoriaCorrecta(F2,Integer.parseInt(R2.getText()))) {
					R2.setBackground(GREEN);
				}
				else {
					R2.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J5,Integer.parseInt(N5.getText()))) {
					N5.setBackground(GREEN);
				}
				else {
					N5.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		B5.setHorizontalAlignment(SwingConstants.CENTER);
		B5.setFont(new Font("Tahoma", Font.BOLD, 13));
		B5.setColumns(10);
		B5.setBounds(143, 58, 35, 35);
		contentPane.add(B5);
		
		
		
		C1 = new JTextField();
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(C1.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F3[0] = Integer.parseInt(C1.getText());
				J1[2] = Integer.parseInt(C1.getText());
				
				if(Controll.sumatoriaCorrecta(F3,Integer.parseInt(R3.getText()))) {
					R3.setBackground(GREEN);
				}
				else {
					R3.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N1.getText()))) {
					N1.setBackground(GREEN);
				}
				else {
					N1.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		C1.setHorizontalAlignment(SwingConstants.CENTER);
		C1.setFont(new Font("Tahoma", Font.BOLD, 13));
		C1.setColumns(10);
		C1.setBounds(10, 93, 35, 35);
		contentPane.add(C1);
		
		C2 = new JTextField();
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(C2.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F3[1] = Integer.parseInt(C2.getText());
				J2[2] = Integer.parseInt(C2.getText());
				
				if(Controll.sumatoriaCorrecta(F3,Integer.parseInt(R3.getText()))) {
					R3.setBackground(GREEN);
				}
				else {
					R3.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J2,Integer.parseInt(N2.getText()))) {
					N2.setBackground(GREEN);
				}
				else {
					N2.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		C2.setHorizontalAlignment(SwingConstants.CENTER);
		C2.setFont(new Font("Tahoma", Font.BOLD, 13));
		C2.setColumns(10);
		C2.setBounds(43, 93, 35, 35);
		contentPane.add(C2);
		
		C3 = new JTextField();
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(C3.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F3[2] = Integer.parseInt(C3.getText());
				J3[2] = Integer.parseInt(C3.getText());
				
				if(Controll.sumatoriaCorrecta(F3,Integer.parseInt(R3.getText()))) {
					R3.setBackground(GREEN);
				}
				else {
					R3.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N3.getText()))) {
					N3.setBackground(GREEN);
				}
				else {
					N3.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		C3.setHorizontalAlignment(SwingConstants.CENTER);
		C3.setFont(new Font("Tahoma", Font.BOLD, 13));
		C3.setColumns(10);
		C3.setBounds(75, 93, 35, 35);
		contentPane.add(C3);
		
		C4 = new JTextField();
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(C4.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F3[3] = Integer.parseInt(C4.getText());
				J4[2] = Integer.parseInt(C4.getText());
				
				if(Controll.sumatoriaCorrecta(F3,Integer.parseInt(R3.getText()))) {
					R3.setBackground(GREEN);
				}
				else {
					R3.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J4,Integer.parseInt(N4.getText()))) {
					N4.setBackground(GREEN);
				}
				else {
					N4.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		C4.setHorizontalAlignment(SwingConstants.CENTER);
		C4.setFont(new Font("Tahoma", Font.BOLD, 13));
		C4.setColumns(10);
		C4.setBounds(109, 93, 35, 35);
		contentPane.add(C4);
		
		C5 = new JTextField();
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(C5.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F3[4] = Integer.parseInt(C5.getText());
				J5[2] = Integer.parseInt(C5.getText());
				
				if(Controll.sumatoriaCorrecta(F3,Integer.parseInt(R3.getText()))) {
					R3.setBackground(GREEN);
				}
				else {
					R3.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J5,Integer.parseInt(N5.getText()))) {
					N5.setBackground(GREEN);
				}
				else {
					N5.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		C5.setHorizontalAlignment(SwingConstants.CENTER);
		C5.setFont(new Font("Tahoma", Font.BOLD, 13));
		C5.setColumns(10);
		C5.setBounds(143, 93, 35, 35);
		contentPane.add(C5);
		
		D1 = new JTextField();
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(D1.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F4[0] = Integer.parseInt(D1.getText());
				J1[3] = Integer.parseInt(D1.getText());
				
				if(Controll.sumatoriaCorrecta(F4,Integer.parseInt(R4.getText()))) {
					R4.setBackground(GREEN);
				}
				else {
					R4.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N1.getText()))) {
					N1.setBackground(GREEN);
				}
				else {
					N1.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		D1.setHorizontalAlignment(SwingConstants.CENTER);
		D1.setFont(new Font("Tahoma", Font.BOLD, 13));
		D1.setColumns(10);
		D1.setBounds(10, 128, 35, 35);
		contentPane.add(D1);
		
		D2 = new JTextField();
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(D2.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F4[1] = Integer.parseInt(D2.getText());
				J2[3] = Integer.parseInt(D2.getText());
				
				if(Controll.sumatoriaCorrecta(F4,Integer.parseInt(R4.getText()))) {
					R4.setBackground(GREEN);
				}
				else {
					R4.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J2,Integer.parseInt(N2.getText()))) {
					N2.setBackground(GREEN);
				}
				else {
					N2.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		D2.setHorizontalAlignment(SwingConstants.CENTER);
		D2.setFont(new Font("Tahoma", Font.BOLD, 13));
		D2.setColumns(10);
		D2.setBounds(43, 128, 35, 35);
		contentPane.add(D2);
		
		D3 = new JTextField();
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(D3.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F4[2] = Integer.parseInt(D3.getText());
				J3[3] = Integer.parseInt(D3.getText());
				
				if(Controll.sumatoriaCorrecta(F4,Integer.parseInt(R4.getText()))) {
					R4.setBackground(GREEN);
				}
				else {
					R4.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J3,Integer.parseInt(N3.getText()))) {
					N3.setBackground(GREEN);
				}
				else {
					N3.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		D3.setHorizontalAlignment(SwingConstants.CENTER);
		D3.setFont(new Font("Tahoma", Font.BOLD, 13));
		D3.setColumns(10);
		D3.setBounds(75, 128, 35, 35);
		contentPane.add(D3);
		
		D4 = new JTextField();
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(D4.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F4[3] = Integer.parseInt(D4.getText());
				J4[3] = Integer.parseInt(D4.getText());
				
				if(Controll.sumatoriaCorrecta(F4,Integer.parseInt(R4.getText()))) {
					R4.setBackground(GREEN);
				}
				else {
					R4.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J4,Integer.parseInt(N4.getText()))) {
					N4.setBackground(GREEN);
				}
				else {
					N4.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		D4.setHorizontalAlignment(SwingConstants.CENTER);
		D4.setFont(new Font("Tahoma", Font.BOLD, 13));
		D4.setColumns(10);
		D4.setBounds(109, 128, 35, 35);
		contentPane.add(D4);
		
		D5 = new JTextField();
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(D5.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F4[4] = Integer.parseInt(D5.getText());
				J5[3] = Integer.parseInt(D5.getText());
				
				if(Controll.sumatoriaCorrecta(F4,Integer.parseInt(R4.getText()))) {
					R4.setBackground(GREEN);
				}
				else {
					R4.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J5,Integer.parseInt(N5.getText()))) {
					N5.setBackground(GREEN);
				}
				else {
					N5.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		D5.setHorizontalAlignment(SwingConstants.CENTER);
		D5.setFont(new Font("Tahoma", Font.BOLD, 13));
		D5.setColumns(10);
		D5.setBounds(143, 128, 35, 35);
		contentPane.add(D5);
		
		E1 = new JTextField();
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(E1.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F5[0] = Integer.parseInt(E1.getText());
				J1[4] = Integer.parseInt(E1.getText());
				
				if(Controll.sumatoriaCorrecta(F5,Integer.parseInt(R5.getText()))) {
					R5.setBackground(GREEN);
				}
				else {
					R5.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J1,Integer.parseInt(N1.getText()))) {
					N1.setBackground(GREEN);
				}
				else {
					N1.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		E1.setHorizontalAlignment(SwingConstants.CENTER);
		E1.setFont(new Font("Tahoma", Font.BOLD, 13));
		E1.setColumns(10);
		E1.setBounds(10, 163, 35, 35);
		contentPane.add(E1);
		
		E2 = new JTextField();
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(E2.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F5[1] = Integer.parseInt(E2.getText());
				J2[4] = Integer.parseInt(E2.getText());
				
				if(Controll.sumatoriaCorrecta(F5,Integer.parseInt(R5.getText()))) {
					R5.setBackground(GREEN);
				}
				else {
					R5.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J2,Integer.parseInt(N2.getText()))) {
					N2.setBackground(GREEN);
				}
				else {
					N2.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		E2.setHorizontalAlignment(SwingConstants.CENTER);
		E2.setFont(new Font("Tahoma", Font.BOLD, 13));
		E2.setColumns(10);
		E2.setBounds(43, 163, 35, 35);
		contentPane.add(E2);
		
		E3 = new JTextField();
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(E3.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F5[2] = Integer.parseInt(E3.getText());
				J3[4] = Integer.parseInt(E3.getText());
				
				if(Controll.sumatoriaCorrecta(F5,Integer.parseInt(R5.getText()))) {
					R5.setBackground(GREEN);
				}
				else {
					R5.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J3,Integer.parseInt(N3.getText()))) {
					N3.setBackground(GREEN);
				}
				else {
					N3.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		E3.setHorizontalAlignment(SwingConstants.CENTER);
		E3.setFont(new Font("Tahoma", Font.BOLD, 13));
		E3.setColumns(10);
		E3.setBounds(75, 163, 35, 35);
		contentPane.add(E3);
		
		E4 = new JTextField();
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(E4.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F5[3] = Integer.parseInt(E4.getText());
				J4[4] = Integer.parseInt(E4.getText());
				
				if(Controll.sumatoriaCorrecta(F5,Integer.parseInt(R5.getText()))) {
					R5.setBackground(GREEN);
				}
				else {
					R5.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J4,Integer.parseInt(N4.getText()))) {
					N4.setBackground(GREEN);
				}
				else {
					N4.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		E4.setHorizontalAlignment(SwingConstants.CENTER);
		E4.setFont(new Font("Tahoma", Font.BOLD, 13));
		E4.setColumns(10);
		E4.setBounds(109, 163, 35, 35);
		contentPane.add(E4);
		
		E5 = new JTextField();
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controll.validarSoloEnteros(E5.getText()) == false) {
					JOptionPane.showMessageDialog(null,"solo se aceptan numeros enteros mayores o iguales a Cero");
				}
				
				F5[4] = Integer.parseInt(E5.getText());
				J5[4] = Integer.parseInt(E5.getText());
				
				if(Controll.sumatoriaCorrecta(F5,Integer.parseInt(R5.getText()))) {
					R5.setBackground(GREEN);
				}
				else {
					R5.setBackground(GRAY);
				}
				
				if(Controll.sumatoriaCorrecta(J5,Integer.parseInt(N5.getText()))) {
					N5.setBackground(GREEN);
				}
				else {
					N5.setBackground(GRAY);
				}
				
				if(N1.getBackground().equals(GREEN) && N2.getBackground().equals(GREEN) && N3.getBackground().equals(GREEN) && N4.getBackground().equals(GREEN) && N5.getBackground().equals(GREEN) 
						&& R1.getBackground().equals(GREEN) && R2.getBackground().equals(GREEN) && R3.getBackground().equals(GREEN) && R4.getBackground().equals(GREEN) && R5.getBackground().equals(GREEN)  ) {
					  INDEX main = new INDEX();
					  JOptionPane.showMessageDialog(null, "FELICIDADES GANASTE !!"); 
					  main.setVisible(true);
					  dispose();
					   
					   
				}
			}
		});
		E5.setHorizontalAlignment(SwingConstants.CENTER);
		E5.setFont(new Font("Tahoma", Font.BOLD, 13));
		E5.setColumns(10);
		E5.setBounds(143, 163, 35, 35);
		contentPane.add(E5);

		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int[] valoresPorFila = Controll.conseguirValores(5, sumatoria, 5, 12);
				int[] valoresPorColumna = Controll.conseguirValores(5, sumatoria, 5, 12);
				R1.setText(""+ valoresPorFila[0]);
				R2.setText(""+ valoresPorFila[1]);
				R3.setText(""+ valoresPorFila[2]);
				R4.setText(""+ valoresPorFila[3]); // Se asigan los valores Por Columna
				R5.setText(""+ valoresPorFila[4]);
				
				N1.setText(""+ valoresPorColumna[0]); // Se asigan los valores Por fila
				N2.setText(""+ valoresPorColumna[1]);
				N3.setText(""+ valoresPorColumna[2]);
				N4.setText(""+ valoresPorColumna[3]);
				N5.setText(""+ valoresPorColumna[4]);
				
				A1.setText(""); 
				A2.setText(""); 
				A3.setText(""); 
				A4.setText(""); 
				A5.setText(""); 
				B1.setText("");
				B2.setText("");
				B3.setText("");
				B4.setText("");
				B5.setText(""); 
				C1.setText("");
				C2.setText("");
				C3.setText("");
				C4.setText("");
				C5.setText(""); 
				D1.setText("");
				D2.setText("");
				D3.setText("");
				D4.setText("");
				D5.setText("");
				E1.setText("");
				E2.setText("");
				E3.setText("");
				E4.setText("");
				E5.setText("");
				R1.setBackground(GRAY); N1.setBackground(GRAY);
				R2.setBackground(GRAY); N2.setBackground(GRAY);
				R3.setBackground(GRAY); N3.setBackground(GRAY);
				R4.setBackground(GRAY); N4.setBackground(GRAY);
				R5.setBackground(GRAY); N5.setBackground(GRAY);
				
			}
		});
		btnReset.setBounds(305, 157, 68, 35);
		contentPane.add(btnReset);
		
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				INDEX Main = new INDEX();
				Main.setVisible(true);
				dispose();
//				
			}
		});
		btnExit.setBounds(305, 203, 68, 23);
		contentPane.add(btnExit);
	
		
		
	//---------------------------Se LLaman a ejecutar los metodos deseados agregados --------------------------
		btnReset.doClick(); // De esta forma se ejecuta ni bien se Abre la Ventana
		
	}


	public JPanel getContentPane() {
		
		return contentPane;
		
	}
}

		

