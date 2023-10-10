import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.util.Enumeration;
import java.awt.event.ItemEvent;

public class HelloWorld {
    
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}
	public String get(ButtonGroup bg) {
		for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();
			if(button.isSelected()) {
				return button.getText();
			}
			
		}
		return "Error";
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1155, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnCalculate.setBounds(318, 211, 146, 52);
		frame.getContentPane().add(btnCalculate);
		
		
		textField = new JTextField();
		textField.setBounds(200, 29, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblZ = new JLabel("z1 = ");
		lblZ.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblZ.setBounds(116, 32, 69, 20);
		frame.getContentPane().add(lblZ);
		
		JLabel lblI = new JLabel("+ i ");
		lblI.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblI.setBounds(394, 32, 69, 20);
		frame.getContentPane().add(lblI);
		
		textField_1 = new JTextField();
		textField_1.setBounds(460, 29, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblZ_1 = new JLabel("z2 =");
		lblZ_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblZ_1.setBounds(116, 127, 69, 20);
		frame.getContentPane().add(lblZ_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(200, 121, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblI_1 = new JLabel("+ i ");
		lblI_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblI_1.setBounds(394, 124, 69, 20);
		frame.getContentPane().add(lblI_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(460, 121, 146, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblZ_2 = new JLabel("z = ");
		lblZ_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblZ_2.setBounds(116, 301, 69, 20);
		frame.getContentPane().add(lblZ_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 298, 297, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		
		chckbxNewCheckBox.setBounds(51, 118, 35, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(749, 47, 289, 376);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add", true);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton.setSelected(false);
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Subtract");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_1.setVerticalAlignment(SwingConstants.TOP);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Multiply");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Divide");
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Greater");
		rdbtnNewRadioButton_4.setEnabled(false);
		rdbtnNewRadioButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Less");
		rdbtnNewRadioButton_5.setEnabled(false);
		rdbtnNewRadioButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Equal");
		rdbtnNewRadioButton_6.setEnabled(false);
		rdbtnNewRadioButton_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnNewRadioButton_6);
		JRadioButton rdbtnModule = new JRadioButton("Module");
		rdbtnModule.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnModule);
		
		JRadioButton rdbtnConjugateComplexNumber = new JRadioButton("Conjugate complex number");
		rdbtnConjugateComplexNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnConjugateComplexNumber);
		
		JRadioButton rdbtnInverse = new JRadioButton("Inverse");
		rdbtnInverse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(rdbtnInverse);
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == ItemEvent.SELECTED) {
					textField_2.setEditable(true);
					textField_3.setEditable(true);
					rdbtnModule.setEnabled(false);
					rdbtnConjugateComplexNumber.setEnabled(false);
					rdbtnInverse.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(true);
					rdbtnNewRadioButton_1.setEnabled(true);
					rdbtnNewRadioButton_2.setEnabled(true);
					rdbtnNewRadioButton_3.setEnabled(true);
					rdbtnNewRadioButton_4.setEnabled(true);
					rdbtnNewRadioButton_5.setEnabled(true);
					rdbtnNewRadioButton_6.setEnabled(true);
				}
				else {
					textField_2.setEditable(false);
					textField_3.setEditable(false);
					rdbtnModule.setEnabled(true);
					rdbtnConjugateComplexNumber.setEnabled(true);
					rdbtnInverse.setEnabled(true);
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					rdbtnNewRadioButton_3.setEnabled(false);
					rdbtnNewRadioButton_4.setEnabled(false);
					rdbtnNewRadioButton_5.setEnabled(false);
					rdbtnNewRadioButton_6.setEnabled(false);
				}
			}
		});
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{rdbtnNewRadioButton, rdbtnNewRadioButton_1}));
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_6);
		bg.add(rdbtnModule);
		bg.add(rdbtnConjugateComplexNumber);
		bg.add(rdbtnInverse);
		
		

		
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int real_1 = Integer.parseInt(textField.getText());
				int image_1 = Integer.parseInt(textField_1.getText());
				Complex c_1 = new Complex(real_1, image_1);
				int real_2 = Integer.parseInt(textField_2.getText());
				int image_2 = Integer.parseInt(textField_3.getText());
				Complex c_2 = new Complex(real_2, image_2);
				String operation = get(bg);
				switch (operation) {
				case("Add"):
					Complex res_1 = c_1.$plus(c_2);
					textField_4.setText(res_1.toString());
					break;
				case("Subtract"):
					Complex res_2 = c_1.$minus(c_2);
					textField_4.setText(res_2.toString());
					break;
				case("Multiply"):
					Complex res_3 = c_1.$times(c_2);
					textField_4.setText(res_3.toString());
					break;
				case("Divide"):
					Complex res_4 = c_1.$div(c_2);
					textField_4.setText(res_4.toString());
					break;
				case("Greater"):
					boolean res_5 = (Boolean)c_1.$greater(c_2);
					textField_4.setText(String.valueOf(res_5));
					break;
				case("Less"):
					boolean res_6 = (Boolean)(c_1.$less(c_2));
					textField_4.setText(String.valueOf(res_6));
					break;
				case("Equal"):
					boolean res_7 = (Boolean)(c_1.equals(c_2));
					textField_4.setText(String.valueOf(res_7));
					break;
				case("Module"):
					Double res_8 = c_1.unary_$bang();
					textField_4.setText(res_8.toString());
					break;
				case("Error"):
					JOptionPane.showConfirmDialog(null, "Operation is not selected!");
					break;
				case("Conjugate complex number"):
					Complex res_9 = c_1.unary_$tilde();
					textField_4.setText(res_9.toString());
				break;
				case("Inverse"):
					Complex res_10 = c_1.unary_$minus();
					textField_4.setText(res_10.toString());
				break;
				default:
					break;}
			}
		});
		
	}
}
