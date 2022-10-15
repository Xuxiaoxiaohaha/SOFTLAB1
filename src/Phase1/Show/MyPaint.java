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
    /**
     * 用于添加组件
     */
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
        JLabel Operand1 = SetLabel(""+one,"宋体",40,40,30 ,60,100);
        this.add(Operand1);
        // 操作数2
        JLabel Operand2 = SetLabel(""+two,"宋体",40,40,30 ,180,100);
        this.add(Operand2);
        // 操作符
        JLabel Operation = SetLabel("+","宋体",40,40,30 ,130,100);
        this.add(Operation);
        // 等号
        JLabel Equal = SetLabel("=","宋体",40,40,30 ,250,100);
        this.add(Equal);
        // 输入框
        JTextField Result = new JTextField(3);
        Result.setSize(70,40);
        Result.setFont(new Font("宋体",Font.BOLD,30));
        Result.setLocation(300,100);
        this.add(Result);
        // 正确错误提示符
        JLabel TestResult = SetLabel("","隶书",40,40,30 ,380,100);
        TestResult.setForeground(Color.RED);
        this.add(TestResult);
        // 输入按钮
        ButtonListener buttonListener = new ButtonListener(Result,Operand1,Operand2,Operation,TestResult);
        // 按钮1
        JButton num1 = SetButton("1","1",90,70,30,70,200,buttonListener);
        this.add(num1);
        // 按钮2
        JButton num2 = SetButton("2","2",90,70,30,160,200,buttonListener);
        this.add(num2);
        // 按钮3
        JButton num3 = SetButton("3","3",90,70,30,250,200,buttonListener);
        this.add(num3);
        // 按钮4
        JButton num4 = SetButton("4","4",90,70,30,70,270,buttonListener);
        this.add(num4);
        // 按钮5
        JButton num5 = SetButton("5","5",90,70,30,160,270,buttonListener);
        this.add(num5);
        // 按钮6
        JButton num6 = SetButton("6","6",90,70,30,250,270,buttonListener);
        this.add(num6);
        // 按钮7
        JButton num7 = SetButton("7","7",90,70,30,70,340,buttonListener);
        this.add(num7);
        // 按钮8
        JButton num8 = SetButton("8","8",90,70,30,160,340,buttonListener);
        this.add(num8);
        // 按钮9
        JButton num9 = SetButton("9","9",90,70,30,250,340,buttonListener);
        this.add(num9);
        // 按钮0
        JButton num0 = SetButton("0","0",90,70,30,160,410,buttonListener);
        this.add(num0);

        // 确认按钮
        JButton YES = SetButton("确认","10",90,70,25,400,270,buttonListener);
        this.add(YES);

        // 下一题按钮
        JButton Next = SetButton("下一题","11",90,70,18,400,340,buttonListener);
        this.add(Next);

        // 删除按钮
        JButton Delete = SetButton("删除","12",90,70,25,400,200,buttonListener);
        this.add(Delete);

        // 错题集按钮
        //JButton ErrorSet = SetButton("错题集","13",90,70,18,)
    }

    /**
     * 获取标签
     * @param LabelShow 标签上的字
     * @param FontName 字体类型
     * @param width 标签宽
     * @param height 标签高
     * @param size 字体大小
     * @param x 标签x轴上的坐标
     * @param y 标签y轴上的坐标
     * @return 标签
     */
    private JLabel SetLabel(String LabelShow,String FontName,int width,int height,int size ,int x,int y)
    {
        JLabel label = new JLabel(LabelShow);
        label.setSize(width,height);
        label.setFont(new Font(FontName,Font.BOLD,size));
        label.setLocation(x,y);
        return label;
    }
    /**
     * 获取按钮
     * @param ButtonShow 按钮上的字
     * @param ButtonName 按钮标识
     * @param width 按钮宽
     * @param height 按钮高
     * @param size 按钮字大小
     * @param x 按钮x轴位置
     * @param y 按钮y轴位置
     * @param buttonListener 监听按钮
     * @return 按钮
     */
    private JButton SetButton(String ButtonShow,String ButtonName,int width,int height,int size,int x,int y,ButtonListener buttonListener )
    {
        JButton button = new JButton(ButtonShow);
        button.setName(ButtonName);
        button.setSize(width,height);
        button.setFont(new Font("宋体",Font.BOLD,size));
        button.setLocation(x,y);
        button.addActionListener(buttonListener);
        return button;
    }
    /**
     * 用于美化界面
     * @param g  画笔
     */
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

/**
 * 监听按钮事件
 */
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
                }catch (NumberFormatException a) {
                    //可能有人输入的不是数字...
                }
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
