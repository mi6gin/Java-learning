import javax.swing.JOptionPane;
public class under_dog {
    int jojo, dio;
    String n1, n2;
    public void Scan(){
        n1=JOptionPane.showInputDialog("������� �����(���� � ����� ����)");
        n2=JOptionPane.showInputDialog("������� ������ �����");
        jojo = Integer.parseInt(n1);
        dio = Integer.parseInt(n2);
    }
    public void Scan(int a, int b){
        JOptionPane.showInputDialog(null,"������ ���� ������ ����� ��������� ="+a);
        JOptionPane.showInputDialog(null,"������ ���� ������ ����� ��������� ="+b);
    }
}
