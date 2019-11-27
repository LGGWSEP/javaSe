package Lab9;
import javax.swing.*;
import javax.xml.stream.events.StartDocument;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

class Chart {
	public static int a = 0;
	public static int b = 0;
	public static int c = 0;
	public static int d = 0;
	public static int e = 0;
	static ChartPanel frame;
	public Chart(){
		CategoryDataset dataset = getDataSet();
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                "ͶƱ", // ͼ�����
                            "��Ա", // Ŀ¼�����ʾ��ǩ
                            "Ʊ��", // ��ֵ�����ʾ��ǩ
                            dataset, // ���ݼ�
                            PlotOrientation.HORIZONTAL, // ͼ����ˮƽ����ֱ
                            true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
                            false,          // �Ƿ����ɹ���
                            false           // �Ƿ�����URL����
                            );
        
        //�����￪ʼ
        CategoryPlot plot=chart.getCategoryPlot();//��ȡͼ���������
        CategoryAxis domainAxis=plot.getDomainAxis();         //ˮƽ�ײ��б�
         domainAxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
         domainAxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
         ValueAxis rangeAxis=plot.getRangeAxis();//��ȡ��״
         rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));
          chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
          chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
          
          //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
          
         frame=new ChartPanel(chart,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
         
	}
		static CategoryDataset getDataSet() {
           DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           dataset.addValue(a, "A", "A");
           dataset.addValue(b, "B", "B");
           dataset.addValue(c, "C", "C");
           dataset.addValue(d, "D", "D");
           dataset.addValue(e, "E", "E");
           return dataset;
	   }

		public static ChartPanel getChartPanel(){
			return frame;
		}
}

class start extends JFrame{
	public start() {
		final JFrame frame=new JFrame("Java����ͳ��ͼ");
		new Chart();
		frame.add(Chart.getChartPanel());
		
		JPanel jp = new JPanel(new GridLayout(5, 1, 5, 5));
		
		//�����ť
		JButton jb1 = new JButton("A");
		JButton jb2 = new JButton("B");
		JButton jb3 = new JButton("C");
		JButton jb4 = new JButton("D");
		JButton jb5 = new JButton("E");
		
		//��ť����
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.a++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.b++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.c++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.d++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chart.e++;
				new start();
				frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
			}
		});
		
		//��ť���
		jp.add(jb1);jp.add(jb2);jp.add(jb3);jp.add(jb4);jp.add(jb5);
		frame.add(BorderLayout.WEST,jp);
		
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int)(screensize.getWidth()/2-400),(int)(screensize.getHeight()/2-300), 800, 600);
		frame.setResizable(false);
		frame.setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

public class Lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new start();
	}

}
