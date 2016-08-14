package computer2.java.src.main.java.computer2;///**
// * Created by LK on 2016/3/22.
// * 本题的功能是通过滑动条修改颜色的RGB值，从而控制颜色。程序中有一个面板、三个标签和三个滑动条，标签和滑动条一一对应，分
// * 别对应三原色“红”、“绿”和“蓝”，任意拖动其中的一个滑动条，所对应的颜色值就会发生变化，面板的颜色也会对应的发生变
// * 化，滑动条值的范围是0～255。
// */
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class test4402 extends JFrame implements AdjustmentListener {
//    public test4402() {
//        setTitle("test4402");
//        setSize(300, 200);
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        Container contentPane = new Container();
//        JPanel p = new JPanel();
//        p.setLayout(new GridLayout(3, 2));
//        p.add(redLabel = new JLabel("Red 0"));
//        p.add(red = new JScrollBar(Adjustable.HORIZONTAL, 0, 0, 0, 255));
//        red.setBlockIncrement(16);
//        red.addAdjustmentListener(this);
//
//        p.add(greenLabel = new JLabel("Green 0"));
//        p.add(green = new JScrollBar(Adjustable.HORIZONTAL, 0, 0, 0, 255));
//        green.setBlockIncrement(16);
//        green.addAdjustmentListener(this);
//
//        p.add(blueLabel = new JLabel("Blue 0"));
//        p.add(blue = new JScrollBar(Adjustable.HORIZONTAL, 0, 0, 0, 255));
//        blue.setBlockIncrement(16);
//        blue.addAdjustmentListener(this);
//
//        contentPane.add(p, "South");
//
//        colorPanel = new JPanel();
//        colorPanel.setBackground(new Color(0, 0, 0));
//        contentPane.add(colorPanel, "Center");
//    }
//
//    public void adjustmentValueChanged(AdjustmentEvent evt) {
//        redLabel.setText("Red " + red.getValue());
//        greenLabel.setText("Green " + green.getValue());
//        blueLabel.setText("Blue " + blue.getValue());
//        colorPanel.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
//        __________;
//    }
//
//    public static void main(String[] args) {
//        JFrame f = new test4402();
//        f.show();
//    }
//
//    private JLabel redLabel;
//    private JLabel greenLabel;
//    private JLabel blueLabel;
//    private JScrollBar red;
//    private JScrollBar green;
//    private JScrollBar blue;
//    private JPanel colorPanel;
//}
