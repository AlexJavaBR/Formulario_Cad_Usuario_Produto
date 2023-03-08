import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame {
    private JButton btnCadUsuario;
    private JButton btnCadProduto;
    private JPanel pnltelaMenu;

    public telaMenu() {
    btnCadUsuario.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            telaCadUsuario telacadU = new telaCadUsuario();
            telacadU.setVisible(true);
            dispose();
        }
    });
    btnCadProduto.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            telaCadProduto telacadP = new telaCadProduto();
            telacadP.setVisible(true);
            dispose();
        }
    });

    }
}
