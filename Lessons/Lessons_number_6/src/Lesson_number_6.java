import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class Lesson_number_6 extends JFrame {
    JButton a1, a2, a3, a4, a5, a6;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int jojo, dio, joske;
    String a,b;
    under_dog handler = new under_dog();
    public Lesson_number_6(String s){
        super(s);
        setLayout(new FlowLayout());
        a1 = new JButton("    Очистить    ");
        a2 = new JButton("    Посчитать    ");
        a3 = new JButton(" + ");
        a4 = new JButton(" - ");
        a5 = new JButton(" * ");
        a6 = new JButton(" / ");
        l1 = new JLabel("Введите первое число");
        l2 = new JLabel("Введите второе число");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        add(a1);
        add(a2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(a3);
        add(a4);
        add(a5);
        add(a6);
        add(l3);
        add(l4);
        a1.addActionListener(handler);
        a2.addActionListener(handler);
        a3.addActionListener(handler);
        a4.addActionListener(handler);
        a5.addActionListener(handler);
        a6.addActionListener(handler);


    }
    public class under_dog implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            jojo = Integer.parseInt(t1.getText());
            dio = Integer.parseInt(t2.getText());
            try {
                if (e.getSource() == a1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText(null);
                    l4.setText(null);
                }
                if (e.getSource() == a2) {
                    a = "Ваше первое число =" + joske;
                    l3.setText(a);
                }
                if (e.getSource() == a3) {
                    joske = dio + jojo;
                }
                if (e.getSource() == a4) {
                    joske = dio - jojo;
                }
                if (e.getSource() == a5) {
                    joske = dio * jojo;
                }
                if (e.getSource() == a6) {
                    joske = dio / jojo;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в строки числа идиот!");}
        }
    }
}