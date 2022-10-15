package Phase1.Show;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
        long t = System.currentTimeMillis();//用于设置随机数种子
        Random random = new Random(t);
        int one = random.nextInt(100);
        int two = random.nextInt(100);
        while (two>one)
        {
            two = random.nextInt(100);
        }
        JLabel Operand1 = new JLabel(""+one);
        Operand1.setSize(40,40);
        Operand1.setFont(new Font("宋体",Font.BOLD,30));
        Operand1.setLocation(60,100);
        this.add(Operand1);
        // 操作数2
        JLabel Operand2 = new JLabel(""+two);
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
        JLabel TestResult = new JLabel("");
        TestResult.setSize(40,40);
        TestResult.setForeground(Color.RED);
        TestResult.setFont(new Font("隶书",Font.BOLD,30));
        TestResult.setLocation(380,100);
        this.add(TestResult);
        // 输入按钮
        ButtonListener buttonListener = new ButtonListener(Result,Operand1,Operand2,Operation,TestResult);
        // 按钮1
        JButton num1 = new JButton("1");
        num1.setName("1");
        num1.setSize(90,70);
        num1.setFont(new Font("宋体",Font.BOLD,30));
        num1.setLocation(70,200);
        num1.addActionListener(buttonListener);
        this.add(num1);
        // 按钮2
        JButton num2 = new JButton("2");
        num2.setName("2");
        num2.setSize(90,70);
        num2.setFont(new Font("宋体",Font.BOLD,30));
        num2.setLocation(160,200);
        num2.addActionListener(buttonListener);
        this.add(num2);
        // 按钮3
        JButton num3 = new JButton("3");
        num3.setName("3");
        num3.setSize(90,70);
        num3.setFont(new Font("宋体",Font.BOLD,30));
        num3.setLocation(250,200);
        num3.addActionListener(buttonListener);
        this.add(num3);
        // 按钮4
        JButton num4 = new JButton("4");
        num4.setName("4");
        num4.setSize(90,70);
        num4.setFont(new Font("宋体",Font.BOLD,30));
        num4.setLocation(70,270);
        num4.addActionListener(buttonListener);
        this.add(num4);
        // 按钮5
        JButton num5 = new JButton("5");
        num5.setName("5");
        num5.setSize(90,70);
        num5.setFont(new Font("宋体",Font.BOLD,30));
        num5.setLocation(160,270);
        num5.addActionListener(buttonListener);
        this.add(num5);
        // 按钮6
        JButton num6 = new JButton("6");
        num6.setName("6");
        num6.setSize(90,70);
        num6.setFont(new Font("宋体",Font.BOLD,30));
        num6.setLocation(250,270);
        num6.addActionListener(buttonListener);
        this.add(num6);
        // 按钮7
        JButton num7 = new JButton("7");
        num7.setName("7");
        num7.setSize(90,70);
        num7.setFont(new Font("宋体",Font.BOLD,30));
        num7.setLocation(70,340);
        num7.addActionListener(buttonListener);
        this.add(num7);
        // 按钮8
        JButton num8 = new JButton("8");
        num8.setName("8");
        num8.setSize(90,70);
        num8.setFont(new Font("宋体",Font.BOLD,30));
        num8.setLocation(160,340);
        num8.addActionListener(buttonListener);
        this.add(num8);
        // 按钮9
        JButton num9 = new JButton("9");
        num9.setName("9");
        num9.setSize(90,70);
        num9.setFont(new Font("宋体",Font.BOLD,30));
        num9.setLocation(250,340);
        num9.addActionListener(buttonListener);
        this.add(num9);
        // 按钮0
        JButton num0 = new JButton("0");
        num0.setName("0");
        num0.setSize(90,70);
        num0.setFont(new Font("宋体",Font.BOLD,30));
        num0.setLocation(160,410);
        num0.addActionListener(buttonListener);
        this.add(num0);

        // 确认按钮
        JButton YES = new JButton("确认");
        YES.setName("10");//
        YES.setSize(90,70);
        YES.setFont(new Font("宋体",Font.BOLD,25));
        YES.setLocation(400,270);
        YES.addActionListener(buttonListener);
        this.add(YES);

        // 下一题按钮
        JButton Next = new JButton("下一题");
        Next.setName("11");
        Next.setSize(90,70);
        Next.setFont(new Font("宋体",Font.BOLD,18));
        Next.setLocation(400,340);
        Next.addActionListener(buttonListener);
        this.add(Next);

        // 删除按钮
        JButton Delete = new JButton("删除");
        Delete.setName("12");
        Delete.setSize(90,70);
        Delete.setFont(new Font("宋体",Font.BOLD,25));
        Delete.setLocation(400,200);
        Delete.addActionListener(buttonListener);
        this.add(Delete);

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
class ButtonListener implements ActionListener
{
    private JTextField textField;
    private JLabel testResult;
    private JLabel Operation;
    private JLabel one;
    private JLabel two;
    public ButtonListener(JTextField textField,JLabel one,JLabel two,JLabel Operation,JLabel testResult)
    {
        this.textField = textField;
        this.one = one;
        this.two = two;
        this.testResult = testResult;
        this.Operation = Operation;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        switch (Integer.parseInt(button.getName()))
        {
            case 0:
                textField.setText(textField.getText()+"0");
                break;
            case 1:
                textField.setText(textField.getText()+"1");
                break;
            case 2:
                textField.setText(textField.getText()+"2");
                break;
            case 3:
                textField.setText(textField.getText()+"3");
                break;
            case 4:
                textField.setText(textField.getText()+"4");
                break;
            case 5:
                textField.setText(textField.getText()+"5");
                break;
            case 6:
                textField.setText(textField.getText()+"6");
                break;
            case 7:
                textField.setText(textField.getText()+"7");
                break;
            case 8:
                textField.setText(textField.getText()+"8");
                break;
            case 9:
                textField.setText(textField.getText()+"9");
                break;
            // 按下确认
            case 10:
                try
                {
                    if(Operation.getText().equals("+"))
                    {
                        if(Integer.parseInt(textField.getText())==Integer.parseInt(one.getText())+Integer.parseInt(two.getText()))
                            testResult.setText("√");
                        else
                            testResult.setText("×");
                    }
                    else
                    {
                        if(Integer.parseInt(textField.getText())==Integer.parseInt(one.getText())-Integer.parseInt(two.getText()))
                            testResult.setText("√");
                        else
                            testResult.setText("×");
                    }
                }catch (NumberFormatException a) {}
                textField.setText("");
                break;
            // 按下下一题
            case 11:
                testResult.setText("");
                long t = System.currentTimeMillis();//用于设置随机数种子
                Random random = new Random(t);
                int first = random.nextInt(100);
                int second = random.nextInt(100);
                int AddOrSub = random.nextInt(2);
                while(second>first)
                {
                    second = random.nextInt(100);
                }
                one.setText(""+first);
                two.setText(""+second);
                if(AddOrSub==0)
                    Operation.setText("+");
                else
                    Operation.setText("-");
                break;
            // 按下删除
            case 12:
                if(textField.getText().equals(""))
                    break;
                else
                {
                    try {
                        textField.setText(textField.getText(0,textField.getText().length()-1));
                    } catch (BadLocationException ex) {
                        System.out.println("出现异常");
                        System.exit(0);
                    }
                    break;
                }
            default:
                break;
        }
    }
}
