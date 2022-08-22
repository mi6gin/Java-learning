import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class Lesson_number_5 extends JFrame {
    JButton a1, a2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int jojo, dio;
    String a,b;
    under_dog handler = new under_dog();
    public Lesson_number_5(String s){
        super(s);
        setLayout(new FlowLayout());
        a1 = new JButton("Очистить");
        a2 = new JButton("Посчитать");
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
        add(l3);
        add(l4);
        a1.addActionListener(handler);
        a2.addActionListener(handler);


    }
    public class under_dog implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == a2) {
                    jojo = Integer.parseInt(t1.getText());
                    dio = Integer.parseInt(t2.getText());
                    jojo++;
                    dio++;
                    a = "Ваше первое число =" + jojo;
                    b = "Ваше второе число =" + dio;
                    l3.setText(a);
                    l4.setText(b);
                }
                if (e.getSource() == a1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText(null);
                    l4.setText(null);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в строки числа идиот!");}
        }
    }
}
