import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCadUsuario extends JFrame {
    private JPasswordField pswSenhaCad;
    private JTextField textUsuarioCad;
    private JTextField textFuncao;
    private JTextField textSetor;
    private JTextField textSobrenome;
    private JTextField textNome;
    private JLabel lblNome;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JLabel lblUsuarioCad;
    private JLabel lblSenhaCad;
    private JButton btnOKU;
    private JPanel telaInicialCadU;

    public telaCadUsuario() {
    btnOKU.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String nomeUsuario = textNome.getText();
            String sobrenomeUsuario = textSobrenome.getText();
            String setorUsuario = textSetor.getText();
            String funcaoUsuario = textFuncao.getText();
            String LoginUsuario = textUsuarioCad.getText();
            String senha = new String(pswSenhaCad.getPassword());

            JOptionPane.showMessageDialog(btnOKU, "O seguinte usuário foi cadastrado com as seguintes informações: "
                    + "Nome: "+ nomeUsuario+ "\n"
                            +"Sobrenom: "+ sobrenomeUsuario+ "\n"
                            +"Setor: "+ setorUsuario+ "\n"
                            +"Função: "+ funcaoUsuario);



        }
    });

    }
}
