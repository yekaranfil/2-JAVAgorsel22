package java221;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class odev2_1 extends JFrame {

	private JPanel contentPane;
	DefaultComboBoxModel model1 = new DefaultComboBoxModel();
	DefaultComboBoxModel model2 = new DefaultComboBoxModel();
	DefaultComboBoxModel model3 = new DefaultComboBoxModel();
	DefaultComboBoxModel model4 = new DefaultComboBoxModel();
	int r, g, b;
	private JTextField textf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev2_1 frame = new odev2_1();
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
	public odev2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i < 256; i++)
			model1.addElement(i);
		for (int i = 0; i < 256; i++)
			model2.addElement(i);
		for (int i = 0; i < 256; i++)
			model3.addElement(i);

		JComboBox cgreen = new JComboBox();
		cgreen.setEnabled(false);
		cgreen.setEditable(true);
		cgreen.setModel(model1);
		cgreen.setBackground(Color.GREEN);
		cgreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cgreen.setBounds(282, 86, 105, 43);
		contentPane.add(cgreen);

		JComboBox cblue = new JComboBox();
		cblue.setEnabled(false);
		cblue.setEditable(true);
		cblue.setModel(model2);
		cblue.setBackground(Color.BLUE);
		cblue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cblue.setBounds(282, 174, 105, 43);
		contentPane.add(cblue);

		JComboBox cred = new JComboBox();
		cred.setEnabled(false);
		cred.setEditable(true);
		cred.setModel(model3);
		cred.setBackground(Color.RED);
		cred.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cred.setBounds(282, 11, 105, 43);
		contentPane.add(cred);

		JComboBox csec1 = new JComboBox();
		csec1.setModel(
				new DefaultComboBoxModel(new String[] { "TextField", "LabelBack", "Arkaplan", "Buton", "Combobox","LabelFore" }));
		csec1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		csec1.setBackground(Color.WHITE);
		csec1.setBounds(10, 11, 105, 43);
		contentPane.add(csec1);
		
		JLabel lbl2 = new JLabel("Yusuf Emre Karanfil");
		lbl2.setOpaque(true);
		lbl2.setBackground(Color.WHITE);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl2.setBounds(10, 165, 177, 33);
		contentPane.add(lbl2);

		JButton btn = new JButton("Buton");
		btn.setBounds(10, 66, 105, 44);
		contentPane.add(btn);

		textf = new JTextField();
		textf.setBounds(10, 121, 105, 33);
		contentPane.add(textf);
		textf.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("");

		rdbtnNewRadioButton.setBounds(251, 24, 21, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(251, 98, 21, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(251, 174, 21, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		r = g = b = 0;

		cgreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				g = (int) cgreen.getSelectedIndex();
				int a = (int) csec1.getSelectedIndex();

				String msg = (String) csec1.getSelectedItem();
				System.out.println(msg);
				System.out.println(b);

				switch (msg) {
				case "Arkaplan":
					contentPane.setBackground(new Color(r, g, b));
					break;
				case "LabelBack":
					lbl2.setBackground(new Color(r, g, b));
					break;
				case "TextField":
					textf.setBackground(new Color(r, g, b));
					break;
				case "Buton":
					btn.setBackground(new Color(r, g, b));
					break;
				case "Combobox":
					csec1.setBackground(new Color(r, g, b));
					break;
				case "LabelFore":
					lbl2.setForeground(new Color(r, g, b));
					break;
				default:
				}

			}
		});

		cblue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				b = (int) cblue.getSelectedIndex();

				String msg = (String) csec1.getSelectedItem();
				System.out.println(msg);
				System.out.println(b);

				switch (msg) {
				case "Arkaplan":
					contentPane.setBackground(new Color(r, g, b));
					break;
				case "LabelBack":
					lbl2.setBackground(new Color(r, g, b));
					break;
				case "TextBox":
					textf.setBackground(new Color(r, g, b));
					break;
				case "Buton":
					btn.setBackground(new Color(r, g, b));
					break;
				case "Combobox":
					csec1.setBackground(new Color(r, g, b));
					break;
				case "LabelFore":
					lbl2.setForeground(new Color(r, g, b));
					break;
				default:
				}

			}
		});

		cred.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				r = (int) cred.getSelectedIndex();

				String msg = (String) csec1.getSelectedItem();
				System.out.println(msg);
				System.out.println(b);

				switch (msg) {
				case "Arkaplan":
					contentPane.setBackground(new Color(r, g, b));
					break;
				case "LabelBack":
					lbl2.setBackground(new Color(r, g, b));
					break;
				case "TextBox":
					textf.setBackground(new Color(r, g, b));
					break;
				case "Buton":
					btn.setBackground(new Color(r, g, b));
					break;
				case "Combobox":
					csec1.setBackground(new Color(r, g, b));
					break;
				case "LabelFore":
					lbl2.setForeground(new Color(r, g, b));
					break;
				default:
				}

			}
		});

		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cred.setEnabled(true);

			}

		});
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cgreen.setEnabled(true);

			}

		});

		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cblue.setEnabled(true);
			}

		});

	}
}
