import javax.swing.JOptionPane;
public class under_dog {
    int jojo, dio;
    String n1, n2;
    public void Scan(){
        n1=JOptionPane.showInputDialog("Введите число(хуев в своей жопе)");
        n2=JOptionPane.showInputDialog("Введите второе число");
        jojo = Integer.parseInt(n1);
        dio = Integer.parseInt(n2);
    }
    public void Scan(int a, int b){
        JOptionPane.showInputDialog(null,"Теперь ваше первое число равняется ="+a);
        JOptionPane.showInputDialog(null,"Теперь ваше второе число равняется ="+b);
    }
}
