package Lab7;
import java.awt.*;
import javax.swing.*;

class FlowLayoutPosition extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FlowLayoutPosition(){
		setTitle("JFrame������");
		Container c = getContentPane();
		JLabel jl = new JLabel("�ҵĵ�һ�����ڳ���");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(jl);
		c.setBackground(Color.white)	;
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}	
}

public class Lab7_2{
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new FlowLayoutPosition();
	}

}
