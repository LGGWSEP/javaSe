package Lab9;
import javax.swing.*;
import java.awt.*;

class window_1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	final String[] box = {"����","ר��","�о���"};
	final String[] list = {"��ɽ","�Ϻ�","��ѧ��"};
	JTextField name;//�˺ſ�
	JPasswordField password;//�����
	JRadioButton sexButton_male;//�Ա�ť
	JRadioButton sexButton_female;//�Ա�ť
	JCheckBox box1;//���ð�ť
	JCheckBox box2;//���ð�ť
	JCheckBox box3;//���ð�ť
	JCheckBox box4;//���ð�ť
	JComboBox<String> combox;//ѧ��
	JList<String> List;//У��
	JTextArea area;//���ҽ���
	JButton jb;//�ύ��ť
	public window_1(){
		setTitle("�û�ע�����");
		setLayout(null);
		
		//����
		JLabel title = new JLabel("�û�ע��",SwingConstants.CENTER);
		title.setFont(new Font("����", Font.BOLD, 25));
		title.setBounds(0, 0, 600, 50);
		add(title);
		
		//�˺�
		JPanel Jname = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lname = new JLabel("�˺ţ�",SwingConstants.RIGHT);
		name = new JTextField();
		Jname.add(Lname);
		Jname.add(name);
		Jname.setBounds(85,50,300,30);
		add(Jname);
		
		//����
		JPanel Jpassword = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lpassword = new JLabel("���룺",SwingConstants.RIGHT);
		password = new JPasswordField();
		Jpassword.add(Lpassword);
		Jpassword.add(password);
		Jpassword.setBounds(85,100,300,30);
		add(Jpassword);
		
		//�Ա�
		JPanel Jsex = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lsex = new JLabel("�Ա�");
		sexButton_male = new JRadioButton("��");
		sexButton_female = new JRadioButton("Ů");
		ButtonGroup group = new ButtonGroup();
		group.add(sexButton_male);
		group.add(sexButton_female);
		Jsex.add(Lsex);
		Jsex.add(sexButton_male);
		Jsex.add(sexButton_female);
		Jsex.setBounds(193,150,166,30);
		add(Jsex);
		
		//����
		JPanel Jhobby = new JPanel(new GridLayout(1,5,5,5));
		JLabel Lhobby = new JLabel("���ã�");
		box1 = new JCheckBox("��");
		box2 = new JCheckBox("��");
		box3 = new JCheckBox("RAP");
		box4 = new JCheckBox("����");
		Jhobby.add(Lhobby);
		Jhobby.add(box1);
		Jhobby.add(box2);
		Jhobby.add(box3);
		Jhobby.add(box4);
		Jhobby.setBounds(193,200,280,30);
		add(Jhobby);
		
		//ѧ��
		JPanel Jstudy = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lstudy = new JLabel("ѧ�ƣ�");
		combox = new JComboBox<String>(box);
		//combox.setSelectedItem(null);
		Jstudy.add(Lstudy);
		Jstudy.add(combox);
		Jstudy.setBounds(193,250,120,30);
		add(Jstudy);
		
		//У��
		JPanel Jposition = new JPanel(new GridLayout(1,2,5,5));
		JLabel Lposition = new JLabel("У����");
		List = new JList<String>(list);
		List.setBorder(BorderFactory.createLineBorder(Color.black));
		Jposition.add(Lposition);
		Jposition.add(List);
		Jposition.setBounds(193,300,120,60);
		add(Jposition);
		
		//���ҽ���
		JPanel Jintroduction = new JPanel(new GridLayout(1,2,0,0));
		JLabel Lintroduction = new JLabel("���ܣ�",SwingConstants.RIGHT);
		area = new JTextArea();
		JScrollPane js = new JScrollPane(); 
		js.setViewportView(area);
		area.setLineWrap(true);
		area.setBorder(BorderFactory.createLineBorder(Color.black));
		js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		Jintroduction.add(Lintroduction);
		Jintroduction.add(js);
		Jintroduction.setBounds(30,380,400,120);
		add(Jintroduction);
		
		//�ύ
		jb = new JButton("�ύ");
		jb.setBounds(275, 515, 80, 30);
		add(jb);
		
		setBounds((int)(screensize.getWidth()/2-300),(int)(screensize.getHeight()/2-300),600,600);
		setResizable(false);
		setBackground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab9_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new window_1();
	}

}
