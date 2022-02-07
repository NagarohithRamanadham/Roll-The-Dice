import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dice {

	private JFrame frmDice;
	private ImageIcon img1;
	private ImageIcon img2;
	private ImageIcon img3;
	private ImageIcon img4;
	private ImageIcon img5;
	private ImageIcon img6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice window = new Dice();
					window.frmDice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDice = new JFrame();
		frmDice.getContentPane().setBackground(Color.PINK);
		frmDice.setTitle("Dice");
		frmDice.setBounds(100, 100, 722, 513);
		frmDice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDice.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dice Roller");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(195, 32, 304, 45);
		frmDice.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Click on the dice to roll");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(276, 88, 156, 26);
		frmDice.getContentPane().add(lblNewLabel_1);
		
		JButton buttonDice = new JButton();
		buttonDice.setBackground(Color.GREEN);
		buttonDice.setRolloverIcon(img6);
		buttonDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = 1+new Random().nextInt(6);
				switch(n)
				{
				case 1:
					buttonDice.setIcon(img1);
					break;
				case 2:
					buttonDice.setIcon(img2);
					break;
				case 3:
					buttonDice.setIcon(img3);
					break;
				case 4:
					buttonDice.setIcon(img4);
					break;
				case 5:
					buttonDice.setIcon(img5);
					break;
				case 6:
					buttonDice.setIcon(img6);
					break;
				}
			}
		});
		buttonDice.setBounds(261, 183, 171, 177);
		frmDice.getContentPane().add(buttonDice);
		img1 = new ImageIcon(this.getClass().getResource("/Dice1.png"));
		img2 = new ImageIcon(this.getClass().getResource("/Dice2.png"));
		img3 = new ImageIcon(this.getClass().getResource("/Dice3.png"));
		img4 = new ImageIcon(this.getClass().getResource("/Dice4.png"));
		img5 = new ImageIcon(this.getClass().getResource("/Dice5.png"));
		img6 = new ImageIcon(this.getClass().getResource("/Dice6.png"));
	}

}
