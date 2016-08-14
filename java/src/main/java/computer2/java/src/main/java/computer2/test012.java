package computer2.java.src.main.java.computer2; /**
 * Created by LK on 2016/3/9.
 * 下面的程序中，有两个文本框，Input和Output，用户在Input文本框中输入字符串后回车，字符串会在Output文本框中出现。
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test012 extends Frame{
    public static void main(String args[]){
        test012 f = new test012("java2");
        Panel pan=new Panel();

        f.init();
    }
    public test012(String str){
        super(str);
    }
    public void init(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(200,200);
        setLayout(new FlowLayout());
        final TextField tf1 = new TextField(20);
        final TextField tf2 = new TextField(20);
        final Label la1 = new Label("Input:");
        final Label la2 = new Label("Output:");
        tf1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf1.getText());
            }
        });
        add(la1);
        add(tf1);
        add(la2);
        add(tf2);
        setVisible(true);
    }
}

