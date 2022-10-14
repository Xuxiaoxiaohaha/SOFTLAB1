package Phase1.Show;

import javax.swing.*;
import java.awt.*;

public class MyPaint extends JFrame {

    public MyPaint()
    {
        // 初始化窗口
        super("加减法计算小程序");
        this.setBounds(170,30,900,720);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new MyPanel());
        this.setVisible(true);
    }
}
class MyPanel extends JPanel
{
    public MyPanel()
    {
        this.setLayout(null);
        // 操作数1
        JLabel Operand1 = new JLabel("11");
        Operand1.setSize(40,40);
        Operand1.setFont(new Font("宋体",Font.BOLD,30));
        Operand1.setLocation(60,100);
        this.add(Operand1);
        // 操作数2
        JLabel Operand2 = new JLabel("22");
        Operand2.setSize(40,40);
        Operand2.setFont(new Font("宋体",Font.BOLD,30));
        Operand2.setLocation(180,100);
        this.add(Operand2);
        // 操作符
        JLabel Operation = new JLabel("+");
        Operation.setFont(new Font("宋体",Font.BOLD,30));
        Operation.setSize(40,40);
        Operation.setLocation(130,100);
        this.add(Operation);
        // 等号
        JLabel Equal = new JLabel("=");
        Equal.setSize(40,40);
        Equal.setFont(new Font("宋体",Font.BOLD,30));
        Equal.setLocation(250,100);
        this.add(Equal);
        // 输入框
        JTextField Result = new JTextField(3);
        Result.setSize(70,40);
        Result.setFont(new Font("宋体",Font.BOLD,30));
        Result.setLocation(300,100);
        this.add(Result);
        // 正确错误提示符
        JLabel TestResult = new JLabel("√");
        TestResult.setSize(40,40);
        TestResult.setForeground(Color.RED);
        TestResult.setFont(new Font("宋体",Font.BOLD,30));
        TestResult.setLocation(380,100);
        this.add(TestResult);
        // 输入按钮
        // 按钮1
        JButton num1 = new JButton("1");
        num1.setSize(90,70);
        num1.setFont(new Font("宋体",Font.BOLD,30));
        num1.setLocation(70,200);
        this.add(num1);
        // 按钮2
        JButton num2 = new JButton("2");
        num2.setSize(90,70);
        num2.setFont(new Font("宋体",Font.BOLD,30));
        num2.setLocation(160,200);
        this.add(num2);
        // 按钮3
        JButton num3 = new JButton("3");
        num3.setSize(90,70);
        num3.setFont(new Font("宋体",Font.BOLD,30));
        num3.setLocation(250,200);
        this.add(num3);
        // 按钮4
        JButton num4 = new JButton("4");
        num4.setSize(90,70);
        num4.setFont(new Font("宋体",Font.BOLD,30));
        num4.setLocation(70,270);
        this.add(num4);
        // 按钮5
        JButton num5 = new JButton("5");
        num5.setSize(90,70);
        num5.setFont(new Font("宋体",Font.BOLD,30));
        num5.setLocation(160,270);
        this.add(num5);
        // 按钮6
        JButton num6 = new JButton("6");
        num6.setSize(90,70);
        num6.setFont(new Font("宋体",Font.BOLD,30));
        num6.setLocation(250,270);
        this.add(num6);
        // 按钮7
        JButton num7 = new JButton("7");
        num7.setSize(90,70);
        num7.setFont(new Font("宋体",Font.BOLD,30));
        num7.setLocation(70,340);
        this.add(num7);
        // 按钮8
        JButton num8 = new JButton("8");
        num8.setSize(90,70);
        num8.setFont(new Font("宋体",Font.BOLD,30));
        num8.setLocation(160,340);
        this.add(num8);
        // 按钮9
        JButton num9 = new JButton("9");
        num9.setSize(90,70);
        num9.setFont(new Font("宋体",Font.BOLD,30));
        num9.setLocation(250,340);
        this.add(num9);
        // 按钮0
        JButton num0 = new JButton("0");
        num0.setSize(90,70);
        num0.setFont(new Font("宋体",Font.BOLD,30));
        num0.setLocation(160,410);
        this.add(num0);

    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // 顶部标题
        g.setColor(Color.magenta);
        g.setFont(new Font("隶书",Font.BOLD,40));
        g.drawString("加减法计算",359,50);
    }
}
