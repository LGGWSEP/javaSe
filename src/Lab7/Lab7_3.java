package Lab7;
import java.awt.*;
import javax.swing.*;
import java.net.URL;

class DrawIcon implements Icon{
	DrawIcon(int width,int height){
		this.width = width;
		this.height = height;
	}
	public int width;
	public int height;
	public int getIconHeight() {
		// TODO �Զ����ɵķ������
		return this.height;
	}

	public int getIconWidth() {
		// TODO �Զ����ɵķ������
		return this.width;
	}
	
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO �Զ����ɵķ������
		arg1.fillOval(x, y, width, height);
	}
	
}

class Windows extends JFrame{
	Windows(DrawIcon Icon){
		setTitle("����");
		Container c = getContentPane();
		
		JLabel jl = new JLabel("����",Icon,SwingConstants.CENTER);
		jl.setHorizontalAlignment(SwingConstants.CENTER);

		/*String path = "moneybag.png";
		jl.setIcon(new ImageIcon(path));
		jl.setOpaque(true);*/
		
		c.add(jl);
		c.setBackground(Color.white);
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}	
}

class MyImageIcon extends JFrame{
	MyImageIcon(){
		Container container = getContentPane();
		JLabel jl = new JLabel("����һ��JFrame����",JLabel.CENTER);
		
		String path = "moneybag.png";
		jl.setIcon(new ImageIcon(path));
		
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		container.add(jl);
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab7_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Windows(new DrawIcon(15,15));
		new MyImageIcon();
	}

}
