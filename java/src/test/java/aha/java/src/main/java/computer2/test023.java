package aha.java.src.main.java.computer2;///**
// * Created by LK on 2016/3/12.
// * 本题的功能是用按钮来控制文本框中文本的颜色。窗口中有两个带有文字标题的面板“Sample text”和“Text color control”，
// * 窗口的底部还有一个复选按钮“Disable changes”。在“Sample text”面板中有一个带有字符串的文本框，
// * 而在“Text color control”面板中有三个按钮“Black”、“Red”和“Green”，并且每个按钮上都有一个对应颜色的圆。
// * 点击任意按钮，文本框的文本变成对应的颜色，
// * 如果选中“Disable changes”复选框，则三个颜色按钮变为不可用，如果取消选中复选框，则三个按钮变为可用。
// */
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class test023 extends JFrame {
//    private JPanel upper, middle, lower;
//    private JTextField text;
//    private JButton black, red, green;
//    private JCheckBox disable;
//
//    public test023(String titleText) {
//        super(titleText);
//        addWindowListener(new WindowAdapter() {
//                              public void
//                              windowClosing(WindowEvent e) {
//                                  System.exit(0);
//                              }
//                          }
//        );
//        upper = new JPanel();
//        upper.setBorder(BorderFactory.createTitledBorder("Sample text"));
//        ______
//                text = new JTextField("Change the color of this text");
//        upper.add(text, BorderLayout.CENTER);
//        middle = new JPanel();
//        middle.setBorder(BorderFactory.createTitledBorder("Text color control"));
//        middle.setLayout(new FlowLayout(FlowLayout.CENTER));
//        black = new JButton("Black", new ColorIcon(Color.black));
//        black.addActionListener(new ButtonListener(Color.black));
//        middle.add(black);
//        red = new JButton("Red", new ColorIcon(Color.red));
//        red.addActionListener(new ButtonListener(Color.red));
//        middle.add(red);
//        green = new JButton("Green", new ColorIcon(Color.green));
//        green.addActionListener(new ButtonListener(Color.green));
//        middle.add(green);
//        lower = new JPanel();
//        lower.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        disable = new JCheckBox("Disable changes");
//        disable.addItemListener(new ItemListener() {
//                                    public void itemStateChanged(ItemEvent e) {
//                                        boolean enabled
//                                                = (e.getStateChange()
//                                                == ItemEvent.DESELECTED);
//                                        black.setEnabled(enabled);
//                                        red.setEnabled(enabled);
//                                        green.setEnabled(enabled);
//                                    }
//                                }
//        );
//        lower.add(disable);
//        Container cp = getContentPane();
//        cp.add(upper, BorderLayout.NORTH);
//        cp.add(middle, BorderLayout.CENTER);
//        cp.add(lower, BorderLayout.SOUTH);
//        pack();
//        setVisible(true);
//    }
//
//    ______
//
//    {
//        private Color c;
//        public ButtonListener(Color c) {
//        this.c = c;
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        text.setForeground(c);
//    }
//}
//
//class ColorIcon implements Icon {
//    private Color c;
//    private static final int DIAMETER = 10;
//
//    public ColorIcon(Color c) {
//        ______;
//    }
//
//    public void paintIcon(Component cp, Graphics g,
//                          int x, int y) {
//        g.setColor(c);
//        g.fillOval(x, y, DIAMETER, DIAMETER);
//        g.setColor(Color.black);
//        g.drawOval(x, y, DIAMETER, DIAMETER);
//    }
//
//    public int getIconHeight() {
//        return DIAMETER;
//    }
//
//    public int getIconWidth() {
//        return DIAMETER;
//    }
//
//}
//
//    public static void main(String[] args) {
//        new test023("java3");
//    }
//}