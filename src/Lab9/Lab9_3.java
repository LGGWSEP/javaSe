package Lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;


class window_3 extends window_1{
	private static final long serialVersionUID = 1L;
	public static String s = "";
	public window_3() {
		super();
		super.jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//����
				s = "<html><body><h1>������</h1><p>";
				
				//�˺�
				s += "�˺ţ�"+name.getText()+"<p>";
				
				//����
				s += "���룺"+password.getPassword().toString()+"<p>";
				
				//�Ա�
				if(sexButton_male.isSelected())  s += "�Ա���<p>";
				else if (sexButton_female.isSelected())  s += "�Ա�Ů<p>";
				else s += "�Ա���<p>";

				//����
				s += "���ã�";
				if (box1.isSelected()) s+="��";
				if (box2.isSelected()) s+="��";
				if (box3.isSelected()) s+="RAP";
				if (box4.isSelected()) s+="����";
				s += "<p>";
				
				//ѧ��
				s += "ѧ�ƣ�"+combox.getSelectedItem().toString()+"<p>";
				
				//У��
				s += "У����"+List.getSelectedValuesList().toString()+"<p>";
				
				//���ҽ���
				s += "���ҽ��ܣ�"+area.getText()+"<p>";
				
				s += "</body></html>";
				
				//JDialog
				new MyJDialog(window_3.this).setVisible(true);
				
				
			}
		});
	}
}

class MyJDialog extends JDialog{
	private static final long serialVersionUID = 1L;
	MyJDialog(window_3 frame) {
		super(frame,"���",true);
		add(new JLabel(window_3.s,SwingConstants.CENTER));
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)(screensize.getWidth()/2-150),(int)(screensize.getHeight()/2-150),300,300);
	}
}

public class Lab9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new window_3();
	}

}
