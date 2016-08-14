package aha.java.src.main.java.computer2;///**
// * Created by LK on 2016/3/12.
// * 本题用复选框来控制字体的显示，窗口中有一个标签和两个复选按钮，这两个
// * 复选按钮分别对应的字体的两个特点：加粗和倾斜，任意选中一个按钮或两个都选中，标签上的字符串就显示对应的字体。
// */
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//class CheckBoxFrame extends JFrame implements ActionListener {
//    public CheckBoxFrame() {
//        setTitle("CheckBoxTest");
//        setSize(300, 200);
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        JPanel p = new JPanel();
//        bold = addCheckBox(p, "Bold");
//        italic = addCheckBox(p, "Italic");
//        getContentPane().add(p, "South");
//        panel = new CheckBoxTestPanel();
//        getContentPane().add(panel, "Center");
//    }
//
//    public JCheckBox addCheckBox(JPanel p, String name) {
//        JCheckBox c = new JCheckBox(name);
//        //c.addActionListener(name);
//        p.add(c);
//        return c;
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        int m = (bold.isSelected() ? Font.BOLD : 0) + (italic.isSelected() ? Font.ITALIC : 0);
//        panel.setFont(m);
//    }
//
//    private CheckBoxTestPanel panel;
//    private JCheckBox bold;
//    private JCheckBox italic;
//}
//
//class CheckBoxTestPanel extends JPanel {
//    public CheckBoxTestPanel() {
//        setFont(Font.PLAIN);
//    }
//
//    public void setFont(int m) {
//        setFont(new Font("SansSerif", m, 12));
//        repaint();
//    }
//
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawString("The quick brown fox jumps over the lazy dog.", 0, 50);
//    }
//}
//
//public class test022 {
//    public static void main(String[] args) {
//        JFrame frame = new CheckBoxFrame();
//        frame.show();
//    }
//}
