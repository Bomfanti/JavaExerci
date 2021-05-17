import javax.swing.JOptionPane;

public class GUI_Teste {


        public static void main(String[] args) {

            String name = JOptionPane.showInputDialog("Digite seu nome");
            JOptionPane.showMessageDialog(null, "Eae "+name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            JOptionPane.showMessageDialog(null, "Voce tem "+age+" anos de idade");

            double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
            JOptionPane.showMessageDialog(null, "Você tem "+height+" cm de altura");
        }
}
