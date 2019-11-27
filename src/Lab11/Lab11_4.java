package Lab11;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lab11_4 extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel jContentPanel = null;
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	private JButton readButton = null;
	
	private JPanel getControlPanel() {
		if (controlPanel == null) {
			controlPanel = new JPanel();
		}
		controlPanel.add(getOpenButton());
		controlPanel.add(getCloseButton());
		controlPanel.add(getReadButton());
		return controlPanel;
	}
	
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}
	
	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("д���ļ�");
			openButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("./src/Lab11/File.txt");
					try {
						FileWriter out = new FileWriter(file);
						String s = jTextArea.getText();
						out.write(s);
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
						}
					
				}
			});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("��ȡ�ļ�");
			closeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("./src/Lab11/File.txt");
					try {
						FileReader in = new FileReader(file);
						char[] byt = new char[1024];
						int len = in.read(byt);
						jTextArea.setText(new String(byt,0,len));
						in.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			});
		}
		return closeButton;
	}
	
	private JButton getReadButton() {
		if (readButton == null) {
			readButton = new JButton();
			readButton.setText("���ļ�");
			readButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc=new JFileChooser();
					JTextArea msgTextArea = new JTextArea();
					fc.setCurrentDirectory(new File("./src/Lab11"));															//����Ĭ��·��
					fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);												//����ѡ��ģʽ��ֻѡ�ļ���ֻѡ�ļ��С��ļ����ļ�����ѡ��
					fc.setMultiSelectionEnabled(true);																			//�Ƿ������ѡ
					fc.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar"));					//�ļ�������
					fc.addChoosableFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));	//�ļ�������
					fc.setFileFilter(new FileNameExtensionFilter("txt(*.txt)", "txt"));
					int result = fc.showOpenDialog(getParent());
					if(result == JFileChooser.APPROVE_OPTION)
					{
						File file = fc.getSelectedFile();																		//��ȡ�򿪵��ļ�
						msgTextArea.append("���ļ�:"+file.getAbsolutePath()+"\n\n");
				        try {
				        	Reader reader = new InputStreamReader(new FileInputStream(file));									//System.out.println("���ַ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�");
				        	int tempchar;																						// һ�ζ�һ���ַ�
				            while ((tempchar = reader.read()) != -1) {
				                if (((char) tempchar) != '\r') {																//����windows�£�\r\n�������ַ���һ��ʱ����ʾһ�����С�
				                    System.out.print((char) tempchar);															//������������ַ��ֿ���ʾʱ���ỻ�����С���ˣ����ε�\r����������\n�����򣬽������ܶ���С�
				                    msgTextArea.append((tempchar)+"");															//String str = ""+tempchar;
				                }
				            }
				            reader.close();
				        } catch (Exception e1) {
				            e1.printStackTrace();
				        }
				        try {
							Desktop.getDesktop().open(file);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
		}
		return readButton;
	}
	
	public Lab11_4() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setContentPane(getContentPane());
		this.setTitle("JFrame");
		this.setBounds(200, 200, 400, 300);
		this.add(getJContentPane());
		this.setVisible(true);
	}
	
	private JPanel getJContentPane() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
			jContentPanel.add(getJTextArea(),BorderLayout.CENTER);
			jContentPanel.add(getControlPanel(),BorderLayout.SOUTH);
		}
		return jContentPanel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab11_4 thisClass = new Lab11_4();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}

}
