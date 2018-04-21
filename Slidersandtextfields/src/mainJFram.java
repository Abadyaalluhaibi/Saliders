import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainJFram extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JSlider sliderH;
	private JSlider slider_1;
	/**
	 * Launch the application.
	 * de
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainJFram frame = new mainJFram();
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
	public mainJFram() {
		setTitle("Slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				// update textFieldh
				JSlider me = (JSlider)e.getSource();
				
				//update the textfiled 
				textFieldh.setText9("" + me.getValue());
				
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setBounds(21, 29, 318, 26);
		contentPane.add(slider);
		
		textField = new JTextField();
		textField.setBounds(42, 195, 64, 40);
		contentPane.add(textField);
		textField.setColumns(50);
		
		sliderH = new JSlider();
		slider_1.setPaintLabels(true);
		slider_1.setPaintTicks(true);
		slider_1.setMinimum(2);
		slider_1.setMajorTickSpacing(200);
		slider_1.setOrientation(SwingConstants.VERTICAL);
		slider_1.setBounds(42, 49, 64, 135);
		contentPane.add(slider_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JTextFelid me = (JTexField)e.getSource();
				sliderH.setValue(Integer.parseInt(me.getText()));
				
			}
		});
		textField_1.setBounds(360, 17, 64, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(50);
		
		slider_1 = new JSlider();
		slider_1.setMinorTickSpacing(100);
		slider_1.setMajorTickSpacing(200);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setOrientation(SwingConstants.VERTICAL);
		slider_1.setBounds(-11, 76, 126, 91);
		contentPane.add(slider_1);
	}
}
