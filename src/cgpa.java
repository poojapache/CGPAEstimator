


import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

import java.lang.Math;
public class cgpa  {
    private JPanel panelcgpa;
    private JPanel panelsemselect;
    private JPanel panelcalc;
    private JPanel panelpartipointer;
    private JPanel panelopt;
    private JPanel panelchk1ptr;
    private JPanel ptr;
	private JFrame frame;
	private JPanel contentPane;
	ImageIcon ii;
	float ut1,ut2,c3,c2,c4;
	static float ans,ut,utb,ten,nine,eight,seven,six,five,four,tot1,tot2,tot11,tot21,ut11,tot12,tot22,ut12,tot13,tot23,ut13,tot14,tot24,ut14,cs1,wkshop1,lab1,final_pointer,final_pointer1;
	static int ptr1,u,u1,p,p1,q,q1,t,v,w,y,z,k,l;
	String s="";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static float a,b,c,d,f,a1,b1,c1,d1,a2,b2,d2,a3,b3,a4,b4,cs,wkshop,lab,pointer_marks;
	int flag;
	private JTextField textFieldut1;
	private JTextField textFieldut2;
	private JTextField textFieldres;
	private JTextField textFieldptr;
	private JTextField textField_ut1;
	private JTextField textField_ut2;
	private JTextField textFieldans;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textFieldu1;
	private JTextField textFieldu2;
	private JTextField textFieldese;
	private JTextField textFieldtut;
	private JTextField textFieldoral;
	private JTextField textField_u1;
	private JTextField textField_u2;
	private JTextField textField_ese;
	private JTextField textField_tut;
	private JTextField textField_u11;
	private JTextField textField_u22;
	private JTextField textField_ese1;
	private JTextField textField_tuto;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	 {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					cgpa window = new cgpa();
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
	public cgpa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(new Rectangle(0, 0,1366,768));
		frame.setBounds(100,100,750,494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelcgpa = new JPanel();
		panelcgpa.setBounds(new Rectangle(0, 0,744,468));
		frame.getContentPane().add(panelcgpa, "name_263124569236539");
		panelcgpa.setLayout(null);
		
		JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.setBackground(new Color(255, 222, 173));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 0)));
		btnNewButton.setBounds(245,387,256, 54);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setMaximumSize(new Dimension(686, 384));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		panelcgpa.add(btnNewButton);
		
		final JPanel panelsemselect = new JPanel();
		panelsemselect.setForeground(Color.RED);
		frame.getContentPane().add(panelsemselect, "name_263127706708229");
		panelsemselect.setLayout(null);
		panelsemselect.setVisible(false);
		
		
		
		
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelcgpa.setVisible(false);
				panelsemselect.setVisible(true);
				
				
			}
		});
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(new Rectangle(0, 0, 760, 606));
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Javamainedit.PNG")).getImage().getScaledInstance(frame.getWidth(),frame.getHeight(), Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0,744,465);
		panelcgpa.add(lblNewLabel);
		panelcgpa.setVisible(true);
	
		
		
		final JPanel panelcalc = new JPanel();
		frame.getContentPane().add(panelcalc, "name_598032008492380");
		panelcalc.setLayout(null);
		panelsemselect.setVisible(false);
		
		final JPanel panelpartipointer = new JPanel();
		frame.getContentPane().add(panelpartipointer, "name_599725758142940");
		panelpartipointer.setLayout(null);
		panelpartipointer.setVisible(false);
		
		final JPanel panelopt = new JPanel();
		frame.getContentPane().add(panelopt, "name_414239214889996");
		panelopt.setLayout(null);
		panelopt.setVisible(false);
		
		final JPanel panelchk1ptr = new JPanel();
		frame.getContentPane().add(panelchk1ptr, "name_400207193316431");
		panelchk1ptr.setLayout(null);
		panelchk1ptr.setVisible(false);
		
		final JPanel panelptr = new JPanel();
		frame.getContentPane().add(panelptr, "name_416320869137381");
		panelptr.setLayout(null);
		panelptr.setVisible(false);
		
		JPanel paneloverall = new JPanel();
		frame.getContentPane().add(paneloverall, "name_428369954559961");
		paneloverall.setLayout(null);
		paneloverall.setVisible(false);
		
		final JPanel panelov1 = new JPanel();
		frame.getContentPane().add(panelov1, "name_430587432795676");
		panelov1.setLayout(null);
		panelov1.setVisible(false);
		
		final JPanel panelov2 = new JPanel();
		frame.getContentPane().add(panelov2, "name_577211571385660");
		panelov2.setLayout(null);
		panelov2.setVisible(false);
		
		final JPanel panelov3 = new JPanel();
		frame.getContentPane().add(panelov3, "name_580877691689123");
		panelov3.setLayout(null);
		panelov3.setVisible(false);
		
		final JPanel panelov4 = new JPanel();
		frame.getContentPane().add(panelov4, "name_583728763792438");
		panelov4.setLayout(null);
		panelov4.setVisible(false);
		
		final JPanel panelov5 = new JPanel();
		frame.getContentPane().add(panelov5, "name_596313837608821");
		panelov5.setLayout(null);
		
		final JPanel panelov6 = new JPanel();
		frame.getContentPane().add(panelov6, "name_596903711904180");
		panelov6.setLayout(null);
		
		final JPanel panelov7 = new JPanel();
		frame.getContentPane().add(panelov7, "name_599034970687121");
		panelov7.setLayout(null);
		
		
		
		final JPanel panelov8 = new JPanel();
		frame.getContentPane().add(panelov8, "name_599059746416850");
		panelov8.setLayout(null);
		
		
		
		final JPanel panelfinal = new JPanel();
		frame.getContentPane().add(panelfinal, "name_587322801347243");
		panelfinal.setVisible(false);
		Image img6=new ImageIcon(this.getClass().getResource("/yellow1.jpg")).getImage();
		
		JLabel label_15 = new JLabel("TUTORIAL");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.RED);
		label_15.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_15.setBackground(Color.YELLOW);
		label_15.setBounds(128, 187, 195, 45);
		panelov7.add(label_15);
		
		textField_11 = new JTextField();
		textField_11.setSelectedTextColor(Color.RED);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(Color.RED);
		textField_11.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(442, 187, 75, 45);
		panelov7.add(textField_11);
		
		JButton button_16 = new JButton("Enter");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					wkshop= Float.parseFloat(textField_11.getText());
					wkshop1=(100*wkshop)/50;	
					y=pointer(wkshop1);
					if(y==0)
					{
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else
					{
						y=y*1;
					}
					
					}catch(Exception m)
						{
							JOptionPane.showMessageDialog(null, "Plaese enter valid marks");
						}
                  panelov7.setVisible(false);
                  paneloverall.setVisible(true);
			}
		});
		button_16.setForeground(Color.RED);
		button_16.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_16.setBounds(610, 416, 124, 38);
		panelov7.add(button_16);
		
		JLabel label_40 = new JLabel("/50");
		label_40.setHorizontalAlignment(SwingConstants.LEFT);
		label_40.setForeground(Color.RED);
		label_40.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_40.setBounds(527, 187, 75, 45);
		panelov7.add(label_40);
		 
		JLabel lblWorkshop = new JLabel("WORKSHOP");
		lblWorkshop.setHorizontalTextPosition(SwingConstants.CENTER);
		lblWorkshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkshop.setForeground(Color.RED);
		lblWorkshop.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblWorkshop.setBounds(new Rectangle(0, -313, 744, 778));
		lblWorkshop.setAlignmentY(0.0f);
		lblWorkshop.setBounds(-50, -372, 794, 851);
		panelov7.add(lblWorkshop);
		lblWorkshop.setIcon(new ImageIcon(img6));
		
		JLabel label_20 = new JLabel("TUTORIAL");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.RED);
		label_20.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_20.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_20.setBackground(Color.YELLOW);
		label_20.setBounds(152, 138, 195, 45);
		panelov8.add(label_20);
		
		textField_12 = new JTextField();
		textField_12.setSelectedTextColor(Color.RED);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.RED);
		textField_12.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(437, 138, 75, 45);
		panelov8.add(textField_12);
		
		JButton button_17 = new JButton("Enter");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					lab= Float.parseFloat(textField_12.getText());
					lab1=(100*lab)/50;	
					z=pointer(lab1);
					if(z==0)
					{
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else
					{
						z=z*1;
					}
					
					}catch(Exception m)
						{
							JOptionPane.showMessageDialog(null, "Plaese enter valid marks");
						}
				panelov8.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
		button_17.setForeground(Color.RED);
		button_17.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_17.setBounds(610, 416, 124, 38);
		panelov8.add(button_17);
		
		JLabel label_41 = new JLabel("/50");
		label_41.setHorizontalAlignment(SwingConstants.LEFT);
		label_41.setForeground(Color.RED);
		label_41.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_41.setBounds(520, 138, 75, 45);
		panelov8.add(label_41);
		
		JLabel lblAslab = new JLabel("AS-LAB\r\n");
		lblAslab.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAslab.setHorizontalAlignment(SwingConstants.CENTER);
		lblAslab.setForeground(Color.RED);
		lblAslab.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblAslab.setBounds(new Rectangle(0, -313, 744, 778));
		lblAslab.setAlignmentY(0.0f);
		lblAslab.setBounds(-35, -370, 794, 851);
		panelov8.add(lblAslab);
		lblAslab.setIcon(new ImageIcon(img6));
		
		JLabel label_21 = new JLabel("UT1 marks");
		label_21.setForeground(Color.RED);
		label_21.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_21.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_21.setBackground(Color.YELLOW);
		label_21.setBounds(139, 112, 114, 45);
		panelov6.add(label_21);
		
		textField_5 = new JTextField();
		textField_5.setSelectedTextColor(Color.RED);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.RED);
		textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(414, 112, 75, 45);
		panelov6.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setSelectedTextColor(Color.RED);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.RED);
		textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(414, 223, 75, 45);
		panelov6.add(textField_6);
		
		JLabel label_22 = new JLabel("UT2 marks");
		label_22.setForeground(Color.RED);
		label_22.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_22.setBackground(Color.YELLOW);
		label_22.setBounds(139, 223, 114, 45);
		panelov6.add(label_22);
		
		JLabel label_23 = new JLabel("ESE marks");
		label_23.setForeground(Color.RED);
		label_23.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_23.setBackground(Color.YELLOW);
		label_23.setBounds(139, 337, 114, 45);
		panelov6.add(label_23);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.RED);
		textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(414, 337, 75, 45);
		panelov6.add(textField_7);
		
		JButton button_14 = new JButton("Enter");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					a4= Float.parseFloat(textField_5.getText());
					b4= Float.parseFloat(textField_6.getText());
					c4= Float.parseFloat(textField_7.getText());
					ut14=round((a4+b4)/2,(float)Math.floor((a4+b4)/2));
					c4=round((45*c4)/75,(float)Math.floor((45*c4)/75));
					tot14=ut14+c4;
					v=pointer1(tot14);
					if(v==0){
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						v=v*3;
					}
					}catch(Exception ap){

						JOptionPane.showMessageDialog(null, "Please enter valid marks");
				}
				panelov6.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
		button_14.setForeground(Color.RED);
		button_14.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_14.setBounds(610, 416, 124, 38);
		panelov6.add(button_14);
		
		JLabel label_37 = new JLabel("/30");
		label_37.setHorizontalAlignment(SwingConstants.LEFT);
		label_37.setForeground(Color.RED);
		label_37.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_37.setBounds(499, 112, 75, 45);
		panelov6.add(label_37);
		
		JLabel label_38 = new JLabel("/30");
		label_38.setHorizontalAlignment(SwingConstants.LEFT);
		label_38.setForeground(Color.RED);
		label_38.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_38.setBounds(499, 223, 75, 45);
		panelov6.add(label_38);
		
		JLabel label_39 = new JLabel("/75");
		label_39.setHorizontalAlignment(SwingConstants.LEFT);
		label_39.setForeground(Color.RED);
		label_39.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_39.setBounds(499, 337, 75, 45);
		panelov6.add(label_39);
		
		JLabel lblAcac = new JLabel("AC1/AC2");
		lblAcac.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAcac.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcac.setForeground(Color.RED);
		lblAcac.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblAcac.setBounds(new Rectangle(0, -313, 744, 778));
		lblAcac.setAlignmentY(0.0f);
		lblAcac.setBounds(-50, -373, 794, 851);
		panelov6.add(lblAcac);
		panelov6.setVisible(false);
		lblAcac.setIcon(new ImageIcon(img6));
		
		JLabel lblCsevs = new JLabel("CS/EVS");
		
		JLabel label_16 = new JLabel("UT1 marks");
		label_16.setForeground(Color.RED);
		label_16.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_16.setBackground(Color.YELLOW);
		label_16.setBounds(147, 109, 114, 45);
		panelov5.add(label_16);
		
		textField_1 = new JTextField();
		textField_1.setSelectedTextColor(Color.RED);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(427, 109, 75, 45);
		panelov5.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setSelectedTextColor(Color.RED);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.RED);
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(427, 204, 75, 45);
		panelov5.add(textField_2);
		
		JLabel label_17 = new JLabel("UT2 marks");
		label_17.setForeground(Color.RED);
		label_17.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_17.setBackground(Color.YELLOW);
		label_17.setBounds(147, 204, 114, 45);
		panelov5.add(label_17);
		
		JLabel label_18 = new JLabel("ESE marks");
		label_18.setForeground(Color.RED);
		label_18.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_18.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_18.setBackground(Color.YELLOW);
		label_18.setBounds(147, 299, 114, 45);
		panelov5.add(label_18);
		
		textField_3 = new JTextField();
		textField_3.setSelectedTextColor(Color.RED);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.RED);
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(427, 299, 75, 45);
		panelov5.add(textField_3);
		
		JLabel label_19 = new JLabel("Tutorial");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.RED);
		label_19.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_19.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_19.setBackground(Color.YELLOW);
		label_19.setBounds(147, 393, 114, 45);
		panelov5.add(label_19);
		
		textField_4 = new JTextField();
		textField_4.setSelectedTextColor(Color.RED);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.RED);
		textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(427, 393, 75, 45);
		panelov5.add(textField_4);
		
		JButton button_13 = new JButton("Enter");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					a2= Float.parseFloat(textField_1.getText());
					b2= Float.parseFloat(textField_2.getText());
					c2= Float.parseFloat(textField_3.getText());
					d2= Float.parseFloat(textField_4.getText());
					ut12=round((a2+b2)/2,(float)Math.floor((a2+b2)/2));
					c2=round((60*c2)/100,(float)Math.floor(0.6*c2));
				    tot12=ut12+c2;
				    q=pointer(tot12);
					if(q==0){
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						q=q*4;
					}
					q1=pointer(4*d2);
					if(q1==0)
					{
					JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						q1=q1*1;
					}
					}catch(Exception af){

						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					
					}
				panelov5.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
		button_13.setForeground(Color.RED);
		button_13.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_13.setBounds(610, 416, 124, 38);
		panelov5.add(button_13);
		
		JLabel label_35 = new JLabel("/100");
		label_35.setHorizontalAlignment(SwingConstants.LEFT);
		label_35.setForeground(Color.RED);
		label_35.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_35.setBounds(512, 299, 75, 45);
		panelov5.add(label_35);
		
		JLabel label_34 = new JLabel("/40");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setForeground(Color.RED);
		label_34.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_34.setBounds(512, 204, 75, 45);
		panelov5.add(label_34);
		
		JLabel label_36 = new JLabel("/25");
		label_36.setHorizontalAlignment(SwingConstants.LEFT);
		label_36.setForeground(Color.RED);
		label_36.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_36.setBounds(512, 393, 75, 45);
		panelov5.add(label_36);
		
		JLabel label_33 = new JLabel("/40");
		label_33.setHorizontalAlignment(SwingConstants.LEFT);
		label_33.setForeground(Color.RED);
		label_33.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_33.setBounds(512, 109, 75, 45);
		panelov5.add(label_33);
		JLabel lblAmam = new JLabel("AM1/AM2");
		lblAmam.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAmam.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmam.setForeground(Color.RED);
		lblAmam.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblAmam.setBounds(new Rectangle(0, -313, 744, 778));
		lblAmam.setAlignmentY(0.0f);
		lblAmam.setBounds(0, -367, 744, 851);
		panelov5.add(lblAmam);
		panelov5.setVisible(false);
		lblAmam.setIcon(new ImageIcon(img6));
  		
		JLabel lblTutorial_1 = new JLabel("TUTORIAL");
		lblTutorial_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTutorial_1.setForeground(Color.RED);
		lblTutorial_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTutorial_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblTutorial_1.setBackground(Color.YELLOW);
		lblTutorial_1.setBounds(199, 197, 195, 45);
		panelov4.add(lblTutorial_1);
		
		textField_tuto = new JTextField();
		textField_tuto.setSelectedTextColor(Color.RED);
		textField_tuto.setHorizontalAlignment(SwingConstants.CENTER);
		textField_tuto.setForeground(Color.RED);
		textField_tuto.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_tuto.setColumns(10);
		textField_tuto.setBounds(486, 197, 75, 45);
		panelov4.add(textField_tuto);
		Image img10=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		
		JButton button_12 = new JButton("Enter");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					cs= Float.parseFloat(textField_tuto.getText());
					cs1=(100*cs)/75;	
					w=pointer(cs1);
					if(w==0)
					{
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else
					{
						w=w*3;
					}
					
					}catch(Exception m)
						{
							JOptionPane.showMessageDialog(null, "Plaese enter valid marks");
						}
                            panelov4.setVisible(false);
                            paneloverall.setVisible(true);
			}
		});
		button_12.setForeground(Color.RED);
		button_12.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_12.setBounds(610, 416, 124, 38);
		panelov4.add(button_12);
		
		JLabel label_31 = new JLabel("/75");
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setForeground(Color.RED);
		label_31.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_31.setBounds(571, 197, 75, 45);
		panelov4.add(label_31);
		lblCsevs.setIcon(new ImageIcon(img6));
		lblCsevs.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCsevs.setHorizontalAlignment(SwingConstants.CENTER);
		lblCsevs.setForeground(Color.RED);
		lblCsevs.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblCsevs.setBounds(new Rectangle(0, -313, 744, 778));
		lblCsevs.setAlignmentY(0.0f);
		lblCsevs.setBounds(0, -342, 795, 851);
		panelov4.add(lblCsevs);
		panelov4.setVisible(false);
		
		JLabel label_2 = new JLabel("Please enter your marks ");
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your marks ");
		
		panelchk1ptr.setLayout(null);
		JLabel lblPleaseSelectOne = new JLabel("Please select any one option");
		lblPleaseSelectOne.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblPleaseSelectOne.setBackground(new Color(255, 255, 0));
		Image img7=new ImageIcon(this.getClass().getResource("/yellow1.jpg")).getImage();
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("To calculate the marks needed to score the highest possible pointer");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelopt.setVisible(false);
				panelchk1ptr.setVisible(true);
			}
		});
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 0, 0));
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(19, 166, 715, 59);
		panelopt.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnToCalculateThe = new JRadioButton("To calculate the marks needed to score a particular pointer");
		buttonGroup_1.add(rdbtnToCalculateThe);
		rdbtnToCalculateThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelopt.setVisible(false);
				panelptr.setVisible(true);
			}
		});
		rdbtnToCalculateThe.setForeground(new Color(255, 0, 0));
		rdbtnToCalculateThe.setBackground(new Color(255, 255, 0));
		rdbtnToCalculateThe.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		rdbtnToCalculateThe.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rdbtnToCalculateThe.setBounds(19, 257, 715, 59);
		panelopt.add(rdbtnToCalculateThe);
		lblPleaseSelectOne.setIcon(new ImageIcon(img7));
		lblPleaseSelectOne.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPleaseSelectOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectOne.setForeground(Color.RED);
		lblPleaseSelectOne.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPleaseSelectOne.setBounds(new Rectangle(0, -313, 744, 778));
		lblPleaseSelectOne.setAlignmentY(0.0f);
		lblPleaseSelectOne.setBounds(-10, -324, 770, 789);
		panelopt.add(lblPleaseSelectOne);
		
		JButton button_2 = new JButton("");
		Image img16=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		button_2.setIcon(new ImageIcon(img16));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelopt.setVisible(false);
				panelpartipointer.setVisible(true);
			}
		});
		button_2.setBounds(0, 0, 30, 30);
		panelopt.add(button_2);
		
		JButton btnEnter = new JButton("ENTER");
	
					btnEnter.setBackground(new Color(255, 255, 0));
		btnEnter.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnEnter.setForeground(new Color(255, 0, 0));
		btnEnter.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnEnter.setBounds(288, 307, 147, 44);
		panelchk1ptr.add(btnEnter);
		
		textFieldut2 = new JTextField();
		
		textFieldut2.setForeground(new Color(255, 0, 0));
		textFieldut2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldut2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textFieldut2.setCaretColor(new Color(0, 0, 0));
		textFieldut2.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textFieldut2.setSelectedTextColor(new Color(255, 0, 0));
		textFieldut2.setColumns(10);
		textFieldut2.setBounds(489, 187, 58, 44);
		panelchk1ptr.add(textFieldut2);
		
		textFieldut1 = new JTextField();
		textFieldut1.setForeground(new Color(255, 0, 0));
		textFieldut1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldut1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textFieldut1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textFieldut1.setBounds(174, 187, 58, 44);
		panelchk1ptr.add(textFieldut1);
		textFieldut1.setColumns(10);
		
		JLabel lblUt = new JLabel("UT 1");
		lblUt.setForeground(new Color(255, 0, 0));
		lblUt.setHorizontalAlignment(SwingConstants.CENTER);
		lblUt.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblUt.setBounds(150, 143, 103, 33);
		panelchk1ptr.add(lblUt);
		
		JLabel lblUt_1 = new JLabel("Ut 2");
		lblUt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUt_1.setForeground(Color.RED);
		lblUt_1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblUt_1.setBounds(469, 143, 103, 33);
		panelchk1ptr.add(lblUt_1);
		
		JLabel lblPressEnterAfter = new JLabel("Press enter after entering the marks ");
		lblPressEnterAfter.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPressEnterAfter.setForeground(new Color(255, 0, 0));
		lblPressEnterAfter.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPressEnterAfter.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressEnterAfter.setBounds(182, 262, 365, 33);
		panelchk1ptr.add(lblPressEnterAfter);
		
		
		

		
		panelchk1ptr.add(lblPleaseEnterYour);
		lblPleaseEnterYour.setIcon(new ImageIcon(img6));
		lblPleaseEnterYour.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPleaseEnterYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnterYour.setForeground(Color.RED);
		lblPleaseEnterYour.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPleaseEnterYour.setBounds(new Rectangle(0, -313, 744, 778));
		lblPleaseEnterYour.setAlignmentY(0.0f);
		Image img4=new ImageIcon(this.getClass().getResource("/yellow1.jpg")).getImage();
		JButton btnAm_1 = new JButton("AM-1");
		btnAm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     flag=1;
			     panelpartipointer.setVisible(true);
				 panelopt.setVisible(false);
			}
		});
		btnAm_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnAm_1.setBackground(new Color(255, 255, 0));
		btnAm_1.setForeground(new Color(255, 0, 0));
		btnAm_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAm_1.setBounds(85, 113, 118, 55);
		panelpartipointer.add(btnAm_1);
		
		JButton btnAp = new JButton("AP-1");
		btnAp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=0;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnAp.setForeground(Color.RED);
		btnAp.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnAp.setBackground(Color.YELLOW);
		btnAp.setBounds(85, 219, 118, 55);
		panelpartipointer.add(btnAp);
		
		JButton btnAc = new JButton("AC-1");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=0;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnAc.setForeground(Color.RED);
		btnAc.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnAc.setBackground(Color.YELLOW);
		btnAc.setBounds(85, 320, 118, 55);
		panelpartipointer.add(btnAc);
		
		JButton btnBee = new JButton("BEE\r\n");
		btnBee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=1;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnBee.setForeground(Color.RED);
		btnBee.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnBee.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnBee.setBackground(Color.YELLOW);
		btnBee.setBounds(308, 113, 118, 55);
		panelpartipointer.add(btnBee);
		
		JButton btnEg = new JButton("EG");
		btnEg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=1;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnEg.setForeground(Color.RED);
		btnEg.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnEg.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnEg.setBackground(Color.YELLOW);
		btnEg.setBounds(308, 219, 118, 55);
		panelpartipointer.add(btnEg);
		
		JButton btnFcp = new JButton("FCP");
		btnFcp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=1;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnFcp.setForeground(Color.RED);
		btnFcp.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnFcp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnFcp.setBackground(Color.YELLOW);
		btnFcp.setBounds(308, 320, 118, 55);
		panelpartipointer.add(btnFcp);
		
		JButton btnAm_2 = new JButton("AM-2");
		btnAm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=1;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnAm_2.setForeground(Color.RED);
		btnAm_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAm_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnAm_2.setBackground(Color.YELLOW);
		btnAm_2.setBounds(537, 113, 118, 55);
		panelpartipointer.add(btnAm_2);
		
		JButton btnAp_1 = new JButton("AP-2");
		btnAp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=0;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnAp_1.setForeground(Color.RED);
		btnAp_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAp_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnAp_1.setBackground(Color.YELLOW);
		btnAp_1.setBounds(537, 219, 118, 55);
		panelpartipointer.add(btnAp_1);
		
		JButton btnAc_1 = new JButton("AC-2");
		btnAc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=0;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnAc_1.setForeground(Color.RED);
		btnAc_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnAc_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 140, 0)));
		btnAc_1.setBackground(Color.YELLOW);
		btnAc_1.setBounds(537, 320, 118, 55);
		panelpartipointer.add(btnAc_1);
		
		JButton btnmech = new JButton("Mechanics");
		btnmech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=1;
				 panelpartipointer.setVisible(false);
				 panelopt.setVisible(true);
			}
		});
		btnEnter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			if(flag==1){
				
				try{
					
					ut1=Float.parseFloat(textFieldut1.getText());
					ut2=Float.parseFloat(textFieldut2.getText());
					if((ut1>0&&ut1<=40)&&(ut2>0&&ut2<=40))
					{
						ut=(ut1+ut2)/2;
						{if(ut>=16)
						{ten=85-ut;
						if(ten<=60)
						{
							ans=(100*ten)/60;
							s = "You will require "+ans+" marks to score a 10 pointer in this subject in ESE";
							
							
						}
						else 
						{
							nine=75-ut;
							if(nine<=60)
							{
								ans=(100*nine)/60;
								s = "You will require "+ans+" marks to score a 9 pointer in this subject in ESE";
								
								
							}
							else
							{
								eight=70-ut;
								if(eight<=60)
								{
									ans=(100*eight)/60;
									s="You will require "+ans+" marks to score a 8 pointer in this subject in ESE";
									
								}
								else
								{
								  seven=60-ut;
								  if(seven<=60)
								  {
									  ans=(100*seven)/60;  
									 s="You will require "+ans+" marks to score a 7 pointer in this subject in ESE";
									
								  }
								  else
								  {
									  six=50-ut;
									  if(six<=60)
									  {
										  ans=(100*six)/60;
								s="You will require "+ans+" marks to score a 6 pointer in this subject in ESE";
								
									  }
									  else
									  {
										  five=45-ut;
										  if(five<=60)
										  {
											  ans=(100*five)/60;
										s="You will require "+ans+" marks to score a 5 pointer in this subject in ESE";
										
										  }
										  else
										  {
											  four=40-ut;
											  if(four<=60)
											  {
												  ans=(100*four)/60;
											s= "You will require "+ans+" marks to score a 4 pointer in this subject in ESE";
											
											  }
											  else
												s="Oops!!! You will get 0 credits";
											 
												  
										  }
												  
									  }
								  }
								}
							}
						}
					}
					
					else
					{
						s= "Oops!!! FAILED";	
						
					}
					}
				    }
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					}
					
					
				}catch(Exception m){
					JOptionPane.showMessageDialog(null, "Please enter valid marks");
				}
			
				
			}
			else
			{
				try{
					
					ut1=Float.parseFloat(textFieldut1.getText());
					ut2=Float.parseFloat(textFieldut2.getText());
					if((ut1>0&&ut1<=30)&&(ut2>0&&ut2<=30))
					{
						ut=(ut1+ut2)/2;
						{if(ut>=12)
						{ten=(float) (63.75-ut);
						if(ten<=45)
						{
							ans=(75*ten)/45;
							s= "You will require "+ans+" to score a 10 pointer in this subject in ESE";
						}
						else 
						{
							nine=(float)(56.25-ut);
							if(nine<=45)
							{
								ans=(75*nine)/45;
								s= "You will require "+ans+" to score a 9 pointer in this subject in ESE";
							}
							else
							{
								eight=(float)(52.5-ut);
								if(eight<=45)
								{
									ans=(75*eight)/45;
									s="You will require "+ans+" to score a 8 pointer in this subject in ESE";
								}
								else
								{
								  seven=(float)(45-ut);
								  if(seven<=45)
								  {
									  ans=(75*seven)/45;  
									 s="You will require "+ans+" to score a 7 pointer in this subject in ESE";
								  }
								  else
								  {
									  six=(float)(37.5-ut);
									  if(six<=45)
									  {
										  ans=(75*six)/45;
										  s="You will require "+ans+" to score a 6 pointer in this subject in ESE";
									  }
									  else
									  {
										  five=(float)(33.75-ut);
										  if(five<=45)
										  {
											  ans=(75*five)/45;
											 s="You will require "+ans+" to score a 5 pointer in this subject in ESE";
										  }
										  else
										  {
											  four=(float)(30-ut);
											  if(four<=45)
											  {
												  ans=(75*four)/60;
												s="You will require "+ans+" to score a 4 pointer in this subject in ESE";
											  }
											  else
												  s= "Oops!!! You will get 0 credits";
												  
										  }
												  
									  }
								  }
								}
							}
						}
					}
				
					else
					{
						s= "Oops!!! FAILED";	
					}
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					}
					
				}catch(Exception m){
					JOptionPane.showMessageDialog(null, "Please enter valid marks");
				}
			}
			textFieldres.setText(s);
			}
			
		
	});
		textFieldres = new JTextField();
		textFieldres.setForeground(new Color(255, 0, 0));
		textFieldres.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldres.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		textFieldres.setBackground(new Color(255, 255, 240));
		textFieldres.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textFieldres.setBounds(28, 384, 687, 50);
		panelchk1ptr.add(textFieldres);
		textFieldres.setColumns(10);
		
		JButton button_1 = new JButton("");
		Image img11=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		button_1.setIcon(new ImageIcon(img11));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelchk1ptr.setVisible(false);;
				panelopt.setVisible(true);
				textFieldut1.setText(null);
				textFieldut2.setText(null);
				textFieldres.setText(null);
			}
		});
		button_1.setBounds(0, 0, 30, 30);
		panelchk1ptr.add(button_1);
		

		btnmech.setBackground(new Color(255, 255, 0));
		btnmech.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnmech.setForeground(new Color(255, 0, 0));
		btnmech.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnmech.setBounds(281, 399, 182, 55);
		panelpartipointer.add(btnmech);
		
		
		
		JButton btnarrow = new JButton("");
		btnarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelpartipointer.setVisible(false);
				panelcalc.setVisible(true);
			}
		});
		Image img8=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		btnarrow.setIcon(new ImageIcon(img8));
		btnarrow.setBounds(0, 0, 30, 30);
		panelpartipointer.add(btnarrow);
		
		JButton button = new JButton("");
		Image img9=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		button.setIcon(new ImageIcon(img9));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelpartipointer.setVisible(false);
				panelcalc.setVisible(true);
			}
		});
		button.setBounds(0, 0, 30, 30);
		panelpartipointer.add(button);
		
		
		
		
		JLabel lblPleaseChooseThe = new JLabel("Please choose the subject ");
		lblPleaseChooseThe.setIcon(new ImageIcon(img4));
		lblPleaseChooseThe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPleaseChooseThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseChooseThe.setForeground(Color.RED);
		lblPleaseChooseThe.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPleaseChooseThe.setBounds(new Rectangle(0, 0, 760, 1000));
		lblPleaseChooseThe.setAlignmentY(0.0f);
		lblPleaseChooseThe.setBounds(-389, -482, 1547, 1055);
		panelpartipointer.add(lblPleaseChooseThe);
		panelpartipointer.setVisible(false);
		
		
		JLabel lblNewLabel_1 = new JLabel("Please choose your semester");
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setBounds(new Rectangle(0, 0, 760, 1000));
		Image img=new ImageIcon(this.getClass().getResource("/yellow1.jpg")).getImage();
		
		
		
		JButton btnNewButton_1 = new JButton("SEMESTER 1");
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelsemselect.setVisible(false);
				panelcalc.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_1.setBounds(222, 135, 309, 53);
		panelsemselect.add(btnNewButton_1);
		
		JButton btnSemester = new JButton("SEMESTER 2");
		btnSemester.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnSemester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelsemselect.setVisible(false);
				panelcalc.setVisible(true);
			}
		});
		btnSemester.setBackground(new Color(255, 255, 0));
		btnSemester.setForeground(Color.RED);
		btnSemester.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnSemester.setBounds(222, 277, 309, 53);
		panelsemselect.add(btnSemester);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelsemselect.setVisible(false);
				panelcgpa.setVisible(true);
			}
		});
		Image img1=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img1));
		btnNewButton_2.setBounds(0, 0, 30, 30);
		panelsemselect.add(btnNewButton_2);
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-414, -478, 1547, 1055);
		panelsemselect.add(lblNewLabel_1);
		panelsemselect.setVisible(false);
		
		
		JLabel lblPleaseChooseYour = new JLabel("Please choose your option :");
		lblPleaseChooseYour.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPleaseChooseYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseChooseYour.setForeground(Color.RED);
		lblPleaseChooseYour.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblPleaseChooseYour.setBounds(new Rectangle(0, 0, 760, 1000));
		Image img2=new ImageIcon(this.getClass().getResource("/yellow1.jpg")).getImage();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Calculate the marks required for a particular pointer");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelcalc.setVisible(false);
				panelpartipointer.setVisible(true);
			}
		});
		rdbtnNewRadioButton.setBorderPainted(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		rdbtnNewRadioButton.setForeground(Color.RED);
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(60, 152, 577, 81);
		panelcalc.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCalculateTheOverall = new JRadioButton("Calculate the overall pointer");
		rdbtnCalculateTheOverall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelcalc.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
		rdbtnCalculateTheOverall.setBorderPainted(true);
		rdbtnCalculateTheOverall.setActionCommand("Calculate the overall pointer in ESE");
		buttonGroup.add(rdbtnCalculateTheOverall);
		rdbtnCalculateTheOverall.setForeground(Color.RED);
		rdbtnCalculateTheOverall.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rdbtnCalculateTheOverall.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		rdbtnCalculateTheOverall.setBackground(new Color(255, 255, 0));
		rdbtnCalculateTheOverall.setBounds(60, 284, 577, 81);
		panelcalc.add(rdbtnCalculateTheOverall);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelcalc.setVisible(false);
				panelsemselect.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(img1));
		btnNewButton_3.setBounds(0, 0, 30, 30);
		panelcalc.add(btnNewButton_3);
		lblPleaseChooseYour.setIcon(new ImageIcon(img2));
		lblPleaseChooseYour.setAlignmentY(0.0f);
		lblPleaseChooseYour.setBounds(-411, -495, 1547, 1055);
		panelcalc.add(lblPleaseChooseYour);
		Image img3=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		
		
		
		JLabel label = new JLabel("Please enter your marks ");
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==1)
				{try{
					
				
					ut1=Float.parseFloat(textField_ut1.getText());
					ut2=Float.parseFloat(textField_ut2.getText());
					ptr1=Integer.parseInt(textFieldptr.getText());
					if((ut1>0&&ut1<=40)&&(ut2>0&&ut2<=40))
					{
						ut=(ut1+ut2)/2;
						if(ut>=16)
						{switch(ptr1){
						case 10:
							ten=85-ut;
							if(ten<=60)
							{
								ans=(100*ten)/60;
								s ="You will require minimum "+ans+" marks to score a 10 pointer in this subject in ESE";
							}
							else
							{
								s="Sorry!!! You won't get 10 pointer. Try for some other pointer.";
							}
							break;
						case 9:
							nine=75-ut;
							if(nine<=60)
							{
								ans=(100*nine)/60;
								s="You will require minimum "+ans+" marks to score a 9 pointer in this subject in ESE";
							}
							else
							{
								s="Sorry!!! You won't get 9 pointer. Try for some other pointer.";
							}
							break;
						case 8:
							eight=70-ut;
							if(eight<=60)
							{
								ans=(100*eight)/60;
								s="You will require minimum "+ans+" marks to score a 8 pointer in this subject in ESE";
							}
							else
							{
								s="Sorry!!! You won't get 8 pointer. Try for some other pointer.";
							}
							break;
						case 7:
							 seven=60-ut;
							  if(seven<=60)
							  {
								  ans=(100*seven)/60;  
								  s="You will require minimum "+ans+" marks to score a 7 pointer in this subject in ESE";
							  }
							  else
								{
									s="Sorry!!! You won't get 7 pointer. Try for some other pointer.";
								}
							  break;
						case 6:
							 six=50-ut;
							  if(six<=60)
							  {
								  ans=(100*six)/60;
								  s= "You will require minimum "+ans+" marks to score a 6 pointer in this subject in ESE";
							  }
							  else
								{
									s="Sorry!!! You won't get 6 pointer. Try for some other pointer.";
								}
							  break;
						case 5:
							 five=45-ut;
							  if(five<=60)
							  {
								  ans=(100*five)/60;
								  s="You will require minimum "+ans+" marks to score a 5 pointer in this subject in ESE";
							  }
							  else
								{
									s="Sorry!!! You won't get 5 pointer. Try for some other pointer.";
								}
							  break;
						case 4:
							four=40-ut;
							  if(four<=60)
							  {
								  ans=(100*four)/60;
								  s= "You will require minimum "+ans+" marks to score a 4 pointer in this subject in ESE";
							  }
							  else
								{
							       s= "Sorry!!! You won't get 4 pointer. Try for some other pointer.";
								}
							  break;
						case 3:
						case 2:
						case 1:
						case 0:s="Oops!!! You will get 0 credits";
							break;
						}
			
					}
						else
						{
							s="Oops!!! FAILED";
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					}
				}catch(Exception ae)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid marks");
				}
			}
		
			else{
				try{
					
					
					ut1=Float.parseFloat(textField_ut1.getText());
					ut2=Float.parseFloat(textField_ut2.getText());
					ptr1=Integer.parseInt(textFieldptr.getText());
					if((ut1>0&&ut1<=40)&&(ut2>0&&ut2<=40))
					{
						ut=(ut1+ut2)/2;
						if(ut>=12)
						{switch(ptr1){
						case 10:
							ten=(float) (63.75-ut);
							if(ten<=45)
							{
								ans=(75*ten)/45;
								s="You will require minimum "+ans+" marks to score a 10 pointer in this subject in ESE";
							}
							else
							{
								s= "Sorry!!! You won't get 10 pointer. Try for some other pointer.";
							}
							break;
						case 9:
							nine=(float)(56.25-ut);
							if(nine<=45)
							{
								ans=(75*nine)/45;
								s="You will require minimum "+ans+" marks to score a 9 pointer in this subject in ESE";
							}
							else
							{
								s= "Sorry!!! You won't get 9 pointer. Try for some other pointer.";
							}
							break;
						case 8:
							eight=(float)(52.5-ut);
							if(eight<=45)
							{
								ans=(75*eight)/45;
								s="You will require minimum "+ans+" marks to score a 8 pointer in this subject in ESE";
							}
							else
							{
								s="Sorry!!! You won't get 8 pointer. Try for some other pointer.";
							}
							break;
						case 7:
							 seven=(float)(45-ut);
							  if(seven<=45)
							  {
								  ans=(75*seven)/45;  
								  s= "You will require minimum "+ans+" marks to score a 7 pointer in this subject in ESE";
							  }
							  else
								{
									s= "Sorry!!! You won't get 7 pointer. Try for some other pointer.";
								}
							  break;
						case 6:
							 six=(float)(37.5-ut);
							  if(six<=45)
							  {
								  ans=(75*six)/45;
								 s= "You will require minimum "+ans+" marks to score a 6 pointer in this subject in ESE";
							  }
							  else
								{
								s= "Sorry!!! You won't get 6 pointer. Try for some other pointer.";
								}
							  break;
						case 5:
							 five=(float)(33.75-ut);
							  if(five<=45)
							  {
								  ans=(75*five)/45;
								  s= "You will require minimum "+ans+" marks to score a 5 pointer in this subject in ESE";
							  }
							  else
								{
								s= "Sorry!!! You won't get 5 pointer. Try for some other pointer.";
								}
							  break;
						case 4:
							four=(float)(30-ut);
							  if(four<=45)
							  {
								  ans=(75*four)/45;
								  s="You will require minimum "+ans+" marks to score a 4 pointer in this subject in ESE";
							  }
							  else
								{
									s="Sorry!!! You won't get 4 pointer. Try for some other pointer.";
								}
							  break;
						case 3:
						case 2:
						case 1:
						case 0:s="Oops!!! You will get 0 credits";
							
						}
			
					}
						else
						{
							s="Oops!!! FAILED";
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					}
				}catch(Exception ae)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid marks");
				}
				
			}
			
			textFieldans.setText(s);
			}
			
			
		});
		textFieldans = new JTextField();
		textFieldans.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldans.setForeground(Color.RED);
		textFieldans.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		textFieldans.setColumns(10);
		textFieldans.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textFieldans.setBackground(new Color(255, 255, 240));
		textFieldans.setBounds(10, 388, 724, 50);
		panelptr.add(textFieldans);
		
		btnCalculate.setForeground(Color.RED);
		btnCalculate.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnCalculate.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnCalculate.setBackground(Color.YELLOW);
		btnCalculate.setBounds(284, 305, 176, 44);
		panelptr.add(btnCalculate);
		
		JLabel label_1 = new JLabel("UT 1");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		label_1.setBounds(112, 133, 103, 33);
		panelptr.add(label_1);
		
		JLabel lblPointer = new JLabel("Pointer");
		lblPointer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPointer.setForeground(Color.RED);
		lblPointer.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblPointer.setBounds(478, 133, 146, 33);
		panelptr.add(lblPointer);
		
		textFieldptr = new JTextField();
		textFieldptr.setSelectedTextColor(Color.RED);
		textFieldptr.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldptr.setForeground(Color.RED);
		textFieldptr.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textFieldptr.setColumns(10);
		textFieldptr.setCaretColor(Color.BLACK);
		textFieldptr.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textFieldptr.setBounds(522, 177, 58, 44);
		panelptr.add(textFieldptr);
		
		textField_ut1 = new JTextField();
		textField_ut1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ut1.setForeground(Color.RED);
		textField_ut1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textField_ut1.setColumns(10);
		textField_ut1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textField_ut1.setBounds(135, 177, 58, 44);
		panelptr.add(textField_ut1);
		
		JLabel label_3 = new JLabel("Ut 2");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		label_3.setBounds(306, 133, 103, 33);
		panelptr.add(label_3);
		
		textField_ut2 = new JTextField();
		textField_ut2.setSelectedTextColor(Color.RED);
		textField_ut2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ut2.setForeground(Color.RED);
		textField_ut2.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		textField_ut2.setColumns(10);
		textField_ut2.setCaretColor(Color.BLACK);
		textField_ut2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		textField_ut2.setBounds(329, 177, 58, 44);
		panelptr.add(textField_ut2);
		
		JLabel lblPressCalculate = new JLabel("Press calculate after entering marks and pointer");
		lblPressCalculate.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPressCalculate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPressCalculate.setForeground(Color.RED);
		lblPressCalculate.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPressCalculate.setBounds(135, 261, 489, 33);
		panelptr.add(lblPressCalculate);
		label.setIcon(new ImageIcon(img));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		label.setBounds(new Rectangle(0, -313, 744, 778));
		label.setAlignmentY(0.0f);
		label.setBounds(0, -313, 744, 778);
		panelptr.add(label);
		
		JButton button_3 = new JButton("");
		Image img13=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		button_3.setIcon(new ImageIcon(img13));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelptr.setVisible(false);
				panelopt.setVisible(true);
				textField_ut1.setText(null);
				textField_ut2.setText(null);
				textFieldptr.setText(null);
				textFieldans.setText(null);
			}
		});
		button_3.setBounds(0, 0, 30, 30);
		panelptr.add(button_3);
		
		JLabel lblBeefcp = new JLabel("BEE/FCP");
		
		
		JLabel lblUtMarks = new JLabel("UT1 marks");
		lblUtMarks.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblUtMarks.setBackground(new Color(255, 255, 0));
		lblUtMarks.setForeground(new Color(255, 0, 0));
		lblUtMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblUtMarks.setBounds(121, 48, 114, 45);
		panelov1.add(lblUtMarks);
		
		textFieldu1 = new JTextField();
		textFieldu1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldu1.setForeground(new Color(255, 0, 0));
		textFieldu1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldu1.setSelectedTextColor(new Color(255, 0, 0));
		textFieldu1.setBounds(371, 48, 75, 45);
		panelov1.add(textFieldu1);
		textFieldu1.setColumns(10);
		
		JLabel lblUtMarks_1 = new JLabel("UT2 marks");
		lblUtMarks_1.setForeground(Color.RED);
		lblUtMarks_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblUtMarks_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblUtMarks_1.setBackground(Color.YELLOW);
		lblUtMarks_1.setBounds(121, 138, 114, 45);
		panelov1.add(lblUtMarks_1);
		
		textFieldu2 = new JTextField();
		textFieldu2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldu2.setForeground(new Color(255, 0, 0));
		textFieldu2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldu2.setColumns(10);
		textFieldu2.setBounds(371, 138, 75, 45);
		panelov1.add(textFieldu2);

		
		JLabel lblEseMarks = new JLabel("ESE marks");
		lblEseMarks.setForeground(Color.RED);
		lblEseMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEseMarks.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblEseMarks.setBackground(Color.YELLOW);
		lblEseMarks.setBounds(121, 230, 114, 45);
		panelov1.add(lblEseMarks);
		
		textFieldese = new JTextField();
		textFieldese.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldese.setForeground(new Color(255, 0, 0));
		textFieldese.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldese.setColumns(10);
		textFieldese.setBounds(371, 230, 75, 45);
		panelov1.add(textFieldese);
		
		JLabel lblTutorial = new JLabel("Tutorial");
		lblTutorial.setHorizontalAlignment(SwingConstants.CENTER);
		lblTutorial.setForeground(Color.RED);
		lblTutorial.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTutorial.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblTutorial.setBackground(Color.YELLOW);
		lblTutorial.setBounds(121, 319, 114, 45);
		panelov1.add(lblTutorial);
		
		JLabel lblOral = new JLabel("Oral");
		lblOral.setHorizontalAlignment(SwingConstants.CENTER);
		lblOral.setForeground(Color.RED);
		lblOral.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblOral.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		lblOral.setBackground(Color.YELLOW);
		lblOral.setBounds(121, 409, 114, 45);
		panelov1.add(lblOral);
		
		textFieldtut = new JTextField();
		textFieldtut.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldtut.setForeground(new Color(255, 0, 0));
		textFieldtut.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldtut.setColumns(10);
		textFieldtut.setBounds(371, 319, 75, 45);
		panelov1.add(textFieldtut);
		
		
		textFieldoral = new JTextField();
		textFieldoral.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldoral.setForeground(new Color(255, 0, 0));
		textFieldoral.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldoral.setColumns(10);
		textFieldoral.setBounds(371, 409, 75, 45);
		panelov1.add(textFieldoral);
		button_3.setIcon(new ImageIcon(img13));
		
		JButton btnNewButton_5 = new JButton("Enter");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					a= Float.parseFloat(textFieldu1.getText());
					b= Float.parseFloat(textFieldu2.getText());
					c= Float.parseFloat(textFieldese.getText());
					d= Float.parseFloat(textFieldtut.getText());
					f= Float.parseFloat(textFieldoral.getText());
					utb=round((a+b)/2,(float)Math.floor((a+b)/2));
					c=round((60*c)/100,(float)Math.floor(0.6*c));
					tot1=utb+c;
					u=pointer(tot1);
					if(u==0){
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						u=u*4;
					}
					tot2=round((d+f),(float)Math.floor((d+f)));
					u1=pointer((100*tot2)/50);
					if(u1==0)
					{JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						u1=u1*1;	
					}
					}catch(Exception m)
						{
							JOptionPane.showMessageDialog(null, "Plaese enter valid marks");
						}
                     panelov1.setVisible(false);
                     paneloverall.setVisible(true);
			}
		});
		btnNewButton_5.setForeground(new Color(255, 0, 0));
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnNewButton_5.setBounds(610, 416, 124, 38);
		panelov1.add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("/40");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(457, 48, 75, 45);
		panelov1.add(lblNewLabel_2);
		
		JLabel label_5 = new JLabel("/40");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_5.setBounds(456, 138, 75, 45);
		panelov1.add(label_5);
		
		JLabel label_10 = new JLabel("/100");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_10.setBounds(456, 230, 75, 45);
		panelov1.add(label_10);
		
		JLabel label_14 = new JLabel("/25");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setForeground(Color.RED);
		label_14.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_14.setBounds(457, 319, 75, 45);
		panelov1.add(label_14);
		
		JLabel label_24 = new JLabel("/25");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setForeground(Color.RED);
		label_24.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_24.setBounds(456, 409, 75, 45);
		panelov1.add(label_24);
		lblBeefcp.setIcon(new ImageIcon(img));
		lblBeefcp.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBeefcp.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeefcp.setForeground(Color.RED);
		lblBeefcp.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblBeefcp.setBounds(new Rectangle(0, -313, 744, 778));
		lblBeefcp.setAlignmentY(0.0f);
		lblBeefcp.setBounds(-37, -411, 781, 876);
		panelov1.add(lblBeefcp);
		
		JButton mntmAm = new JButton("BEE/FCP");
		mntmAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneloverall.setVisible(false);
				panelov1.setVisible(true);
				
				
				}
		});
		
		mntmAm.setBackground(new Color(255, 255, 0));
		mntmAm.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmAm.setForeground(new Color(255, 0, 0));
		mntmAm.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAm.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmAm.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmAm.setBounds(43, 125, 153, 34);
		paneloverall.add(mntmAm);
		
		JButton mntmAp = new JButton("AP");
		mntmAp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov3.setVisible(true);
				
			}
		});
		
		JButton mntmAm_1 = new JButton("AM");
		mntmAm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov5.setVisible(true);
				
				
			}
		});
		mntmAm_1.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmAm_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAm_1.setForeground(Color.RED);
		mntmAm_1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmAm_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmAm_1.setBackground(Color.YELLOW);
		mntmAm_1.setBounds(43, 211, 153, 34);
		paneloverall.add(mntmAm_1);
		mntmAp.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmAp.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAp.setForeground(Color.RED);
		mntmAp.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmAp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmAp.setBackground(Color.YELLOW);
		mntmAp.setBounds(283, 211, 153, 34);
		paneloverall.add(mntmAp);
		
		JButton mntmAc = new JButton("AC");
		mntmAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov6.setVisible(true);
				}
		});
		mntmAc.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmAc.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAc.setForeground(Color.RED);
		mntmAc.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmAc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmAc.setBackground(Color.YELLOW);
		mntmAc.setBounds(569, 211, 153, 34);
		paneloverall.add(mntmAc);
		
		JButton mntmSubject = new JButton("EG/MECH");
		mntmSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			paneloverall.setVisible(false);
			panelov2.setVisible(true);
			
			
			}
		});
		mntmSubject.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmSubject.setHorizontalAlignment(SwingConstants.CENTER);
		mntmSubject.setForeground(Color.RED);
		mntmSubject.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmSubject.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmSubject.setBackground(Color.YELLOW);
		mntmSubject.setBounds(283, 125, 153, 34);
		paneloverall.add(mntmSubject);
		
		JButton mntmSubject_1 = new JButton("CS/EVS");
		mntmSubject_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov4.setVisible(true);
				
				
			}
		});
		mntmSubject_1.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmSubject_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmSubject_1.setForeground(Color.RED);
		mntmSubject_1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmSubject_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmSubject_1.setBackground(Color.YELLOW);
		mntmSubject_1.setBounds(569, 125, 153, 34);
		paneloverall.add(mntmSubject_1);
		
		JButton mntmWorkshop = new JButton("Workshop");
		mntmWorkshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov7.setVisible(true);
			}
		});
		mntmWorkshop.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmWorkshop.setHorizontalAlignment(SwingConstants.CENTER);
		mntmWorkshop.setForeground(Color.RED);
		mntmWorkshop.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmWorkshop.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmWorkshop.setBackground(Color.YELLOW);
		mntmWorkshop.setBounds(156, 281, 153, 34);
		paneloverall.add(mntmWorkshop);
		
		JButton mntmAslab = new JButton("AS-Lab");
		mntmAslab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelov8.setVisible(true);
				}
			});
		
		mntmAslab.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmAslab.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAslab.setForeground(Color.RED);
		mntmAslab.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		mntmAslab.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		mntmAslab.setBackground(Color.YELLOW);
		mntmAslab.setBounds(445, 281, 153, 34);
		paneloverall.add(mntmAslab);
		panelfinal.setLayout(null);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(0, 0, 30, 30);
		button_9.setIcon(new ImageIcon(img1));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelfinal.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
			panelfinal.add(button_9);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 125, 744, 340);
		panelfinal.add(label_4);
		JLabel lbl = new JLabel(s);
		lbl.setIcon(new ImageIcon(img));
		lbl.setBounds(-35, -370, 794, 851);
		lbl.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(Color.RED);
		lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lbl.setAlignmentY(0.0f);
		panelfinal.add(lbl);
		JButton btnNewButton_4 = new JButton("CALCULATE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pointer_marks=u+u1+q+q1+t+v+p+p1+w+y+z;
				final_pointer=(pointer_marks*10)/260;
				final_pointer1=final_pointer;
				s="You have scored "+final_pointer+" pointer in this semester";
				paneloverall.setVisible(false);
				panelfinal.setVisible(true);
				lbl.setText(s);
				String path = "img1/";
				if(final_pointer>=9.5 && final_pointer<=10)
					ii=new ImageIcon(path+"clap1.gif");
			
				else if(final_pointer>=9 && final_pointer<=9.5)
					ii=new ImageIcon(path+"giphy.gif");
				else if(final_pointer>=8.5 && final_pointer<9)
					ii=new ImageIcon(path+"giphy (2).gif");
				else if(final_pointer>=8 && final_pointer<8.5)
					ii=new ImageIcon(path+"giphy (1).gif");
				else if(final_pointer>=7 && final_pointer<8)
					ii=new ImageIcon(path+"clap.gif");
				else if(final_pointer>=6 && final_pointer<7)
					ii=new ImageIcon(path+"clap3.gif");
				else if(final_pointer>=5 && final_pointer<6)
					ii=new ImageIcon(path+"clap3.gif");
				else if(final_pointer>=4 && final_pointer<5)
					ii=new ImageIcon(path+"clap3.gif");
				else
					{lbl.setText("Oops!!! You will get a K.T.");
					ii=new ImageIcon(path+"giph4.gif");
					}
				label_4.setIcon(ii);
				
			}
		
		});
		
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(img1));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneloverall.setVisible(false);
				panelcalc.setVisible(true);
			}
		});
		button_4.setBounds(0, 0, 30, 30);
		paneloverall.add(button_4);
		btnNewButton_4.setBackground(new Color(255, 255, 0));
		btnNewButton_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setForeground(new Color(255, 0, 0));
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_4.setBounds(269, 397, 205, 57);
		paneloverall.add(btnNewButton_4);
		button_3.setIcon(new ImageIcon(img13));
		label_2.setIcon(new ImageIcon(img));
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		label_2.setBounds(new Rectangle(0, -313, 744, 778));
		label_2.setAlignmentY(0.0f);
		label_2.setBounds(0, -362, 744, 827);
		paneloverall.add(label_2);
		
		
		JLabel label_6 = new JLabel("UT1 marks");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_6.setBackground(Color.YELLOW);
		label_6.setBounds(157, 59, 114, 45);
		panelov2.add(label_6);
		
		textField_u1 = new JTextField();
		textField_u1.setSelectedTextColor(Color.RED);
		textField_u1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_u1.setForeground(Color.RED);
		textField_u1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_u1.setColumns(10);
		textField_u1.setBounds(445, 59, 75, 45);
		panelov2.add(textField_u1);
		
		JLabel label_7 = new JLabel("UT2 marks");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_7.setBackground(Color.YELLOW);
		label_7.setBounds(157, 148, 114, 45);
		panelov2.add(label_7);
		
		textField_u2 = new JTextField();
		textField_u2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_u2.setForeground(Color.RED);
		textField_u2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_u2.setColumns(10);
		textField_u2.setBounds(445, 148, 75, 45);
		panelov2.add(textField_u2);
		
		JLabel label_8 = new JLabel("ESE marks");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_8.setBackground(Color.YELLOW);
		label_8.setBounds(157, 237, 114, 45);
		panelov2.add(label_8);
		
		textField_ese = new JTextField();
		textField_ese.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ese.setForeground(Color.RED);
		textField_ese.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_ese.setColumns(10);
		textField_ese.setBounds(445, 237, 75, 45);
		panelov2.add(textField_ese);
		
		JLabel label_9 = new JLabel("Tutorial");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_9.setBackground(Color.YELLOW);
		label_9.setBounds(157, 325, 114, 45);
		panelov2.add(label_9);
		
		textField_tut = new JTextField();
		textField_tut.setHorizontalAlignment(SwingConstants.CENTER);
		textField_tut.setForeground(Color.RED);
		textField_tut.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_tut.setColumns(10);
		textField_tut.setBounds(445, 325, 75, 45);
		panelov2.add(textField_tut);
		button_3.setIcon(new ImageIcon(img13));
		
		JButton button_8 = new JButton("Enter");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					a1= Float.parseFloat(textField_u1.getText());
					b1= Float.parseFloat(textField_u2.getText());
					c1= Float.parseFloat(textField_ese.getText());
					d1= Float.parseFloat(textField_tut.getText());
					ut11=round((a1+b1)/2,(float)Math.floor((a1+b1)/2));
					c1=round((60*c1)/100,(float)Math.floor(0.6*c1));	
					tot11=ut11+c1;
					p=pointer(tot11);
					if(p==0){
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						p=p*4;
					}
					
					tot12=d1*2;
					p1=pointer(tot12);
					if(p1==0)
					{
					JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						p1=p1*1;
					}
					}catch(Exception af){

						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					
					}
				panelov2.setVisible(false);
				paneloverall.setVisible(true);
			}
		});
		button_8.setForeground(Color.RED);
		button_8.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_8.setBounds(610, 416, 124, 38);
		panelov2.add(button_8);
		
		JLabel label_25 = new JLabel("/40");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setForeground(Color.RED);
		label_25.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_25.setBounds(530, 148, 75, 45);
		panelov2.add(label_25);
		
		JLabel label_26 = new JLabel("/100");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setForeground(Color.RED);
		label_26.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_26.setBounds(530, 237, 75, 45);
		panelov2.add(label_26);
		
		JLabel label_27 = new JLabel("/50");
		label_27.setHorizontalAlignment(SwingConstants.LEFT);
		label_27.setForeground(Color.RED);
		label_27.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_27.setBounds(530, 325, 75, 45);
		panelov2.add(label_27);
		
		JLabel label_28 = new JLabel("/40");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setForeground(Color.RED);
		label_28.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_28.setBounds(530, 59, 75, 45);
		panelov2.add(label_28);
		
		JLabel lblEgmech = new JLabel("EG/MECH");
		lblEgmech.setIcon(new ImageIcon(img));
		lblEgmech.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEgmech.setHorizontalAlignment(SwingConstants.CENTER);
		lblEgmech.setForeground(Color.RED);
		lblEgmech.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblEgmech.setBounds(new Rectangle(0, -313, 744, 778));
		lblEgmech.setAlignmentY(0.0f);
		lblEgmech.setBounds(-10, -397, 754, 862);
		panelov2.add(lblEgmech);
		
		
		
		JLabel label_11 = new JLabel("UT1 marks");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_11.setBackground(Color.YELLOW);
		label_11.setBounds(162, 71, 114, 45);
		panelov3.add(label_11);
		
		textField_u11 = new JTextField();
		textField_u11.setSelectedTextColor(Color.RED);
		textField_u11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_u11.setForeground(Color.RED);
		textField_u11.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_u11.setColumns(10);
		textField_u11.setBounds(456, 71, 75, 45);
		panelov3.add(textField_u11);
		
		JLabel label_12 = new JLabel("UT2 marks");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_12.setBackground(Color.YELLOW);
		label_12.setBounds(162, 169, 114, 45);
		panelov3.add(label_12);
		
		textField_u22 = new JTextField();
		textField_u22.setSelectedTextColor(Color.RED);
		textField_u22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_u22.setForeground(Color.RED);
		textField_u22.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_u22.setColumns(10);
		textField_u22.setBounds(456, 169, 75, 45);
		panelov3.add(textField_u22);
		
		JLabel label_13 = new JLabel("ESE marks");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		label_13.setBackground(Color.YELLOW);
		label_13.setBounds(162, 267, 114, 45);
		panelov3.add(label_13);
		
		textField_ese1 = new JTextField();
		textField_ese1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ese1.setForeground(Color.RED);
		textField_ese1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_ese1.setColumns(10);
		textField_ese1.setBounds(456, 267, 75, 45);
		panelov3.add(textField_ese1);
		
		JButton button_11 = new JButton("Enter");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					a3= Float.parseFloat(textField_u11.getText());
					b3= Float.parseFloat(textField_u22.getText());
					c3= Float.parseFloat(textField_ese1.getText());
					ut13=round((a3+b3)/2,(float)Math.floor((a3+b3)/2));
					c3=round((45*c3)/75,(float)Math.floor((45*c3)/75));
				    tot13=ut13+c3;
					t=pointer1(tot13);
					if(t==0){
						JOptionPane.showMessageDialog(null, "K.T.");
					}
					else{
						t=t*3;
					}
					
					}catch(Exception af){

						JOptionPane.showMessageDialog(null, "Please enter valid marks");
					
					}
				
				panelov3.setVisible(false);
				paneloverall.setVisible(true);
				
			}
		});
		button_11.setForeground(Color.RED);
		button_11.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		button_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 69, 0)));
		button_11.setBounds(610, 416, 124, 38);
		panelov3.add(button_11);
		
		JLabel label_29 = new JLabel("/30");
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setForeground(Color.RED);
		label_29.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_29.setBounds(541, 169, 75, 45);
		panelov3.add(label_29);
		
		JLabel label_30 = new JLabel("/75");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setForeground(Color.RED);
		label_30.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_30.setBounds(541, 267, 75, 45);
		panelov3.add(label_30);
		
		JLabel label_32 = new JLabel("/30");
		label_32.setHorizontalAlignment(SwingConstants.LEFT);
		label_32.setForeground(Color.RED);
		label_32.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_32.setBounds(541, 71, 75, 45);
		panelov3.add(label_32);
		
		JLabel lblApap = new JLabel("AP1/AP2");
		lblApap.setIcon(new ImageIcon(img));
		lblApap.setHorizontalTextPosition(SwingConstants.CENTER);
		lblApap.setHorizontalAlignment(SwingConstants.CENTER);
		lblApap.setForeground(Color.RED);
		lblApap.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblApap.setBounds(new Rectangle(0, -313, 744, 778));
		lblApap.setAlignmentY(0.0f);
		lblApap.setBounds(0, -397, 744, 862);
		panelov3.add(lblApap);
		button_3.setIcon(new ImageIcon(img13));
	}
protected float round(float h,float i){
float n;
n=h-i;
	if(n<0.5)
	 {h=(float)(Math.floor(h));
	 }
	else{
		if(n>=0.5)
		h=(float)(Math.ceil(h));
		}
	return h;
}



	protected int pointer1(float x) {
		if(x>=63.75)
		{
			k=10;
		}
		else if(x>=56.25){
			k=9;
		}
		else if(x>=52.5){
			k=8;
		}
		else if(x>=45){
			k=7;
		}
		else if(x>=37.5){
			k=6;
		}
		else if(x>=33.75){
			k=5;
		}
		else if(x>=30){
			k=4;
		}
		else{
			k=0;
		}
		return k;
	}
	protected int pointer(float g) {
		if(g>=85)
		{
			l=10;
		}
		else if(g>=75){
			l=9;
		}
		else if(g>=70){
			l=8;
		}
		else if(g>=60){
			l=7;
		}
		else if(g>=50){
			l=6;
		}
		else if(g>=45){
			l=5;
		}
		else if(g>=40){
			l=4;
		}
		else{
			l=0;
		}
		return l;
	}
}