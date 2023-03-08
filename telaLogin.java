import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame {
    private JPanel telaInicial;
    private JButton btnOK;
    private JTextField textUsuario;
    private JPasswordField pswSenha;
    private JLabel lblUsuario;
    private JLabel lblSenha;

    public telaLogin() {
        iniciarComponenetes();
        criarListeners();
    }
    public void iniciarComponenetes(){

        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setContentPane(telaInicial);
       setVisible(true);

}
public void criarListeners(){

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });

}
private void  validarLogin(){
    String usuario = textUsuario.getText();
    String senha = new String(pswSenha.getPassword());

    if (usuario.equals("admin") && senha.equals("admin")) {

        telaMenu menu = new telaMenu();
        menu.setVisible(true);
        dispose();

    }else{
        JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
    }
}
    public static void main(String[] args) {
        telaLogin iniciar = new telaLogin();
    }



}
