package aha.java.src.main.java.computer2;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

/**
 * Created by LK on 2016/3/22.
 * 本题中，窗口里有一个文本框和一个文字标签，用户在文本框中输入任意字符串，后面的文字标签都能实时显示出来。
 */
public class test4502 extends JFrame {
    private JLabel label = new JLabel();
    private JTextField textField;
    public test4502() {
        super("test4502");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        textField = new JTextField(15);
        textField.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                label.setText(textField.getText());  //获取文本框的值
            }
        });

        getContentPane().add(textField);
        getContentPane().add(label);
        setSize(200, 200);
    }
    public static void main(String[] args) {
        test4502 tt = new test4502();
        tt.show();
    }
}