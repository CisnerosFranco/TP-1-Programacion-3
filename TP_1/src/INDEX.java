import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INDEX extends JFrame {

	private JPanel contentPane;
	Playing_4x4 GameEasy = new Playing_4x4();
	Playing_5x5 GameHard = new Playing_5x5();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INDEX frame = new INDEX();
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
	
	public INDEX() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 0));
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(84, 25, 236, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMateicos = new JLabel("MATEICOS 2.0");
		lblMateicos.setBackground(new Color(47, 79, 79));
		lblMateicos.setForeground(new Color(0, 0, 128));
		lblMateicos.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblMateicos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateicos.setBounds(32, 11, 190, 43);
		panel.add(lblMateicos);
		
		JLabel lblDifficult = new JLabel("Difficult");
		lblDifficult.setForeground(new Color(0, 0, 0));
		lblDifficult.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblDifficult.setBounds(96, 115, 86, 16);
		contentPane.add(lblDifficult);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Easy", "Hard"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(192, 111, 79, 22);
		contentPane.add(comboBox);
		
		
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Easy")) {
					GameEasy.setVisible(true);
					dispose();
				}
				else if(comboBox.getSelectedItem().equals("Hard")){
					GameHard.setVisible(true);
					dispose();
					
				}
				
			}
		});
		btnStart.setForeground(new Color(102, 0, 255));
		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setFont(new Font("Goudy Stout", Font.PLAIN, 11));
		btnStart.setBounds(157, 181, 114, 23);
		contentPane.add(btnStart);
	}
	
}
