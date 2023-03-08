import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCadProduto extends JFrame  {
    private JPanel telaInicialCadP;
    private JLabel lblCodigo;
    private JLabel lblDescricao;
    private JLabel lblPreco;
    private JLabel lblQuantidade;
    private JTextField textCodigo;
    private JTextField textDescricao;
    private JTextField textPreco;
    private JTextField textQuantidade;
    private JButton btnOKP;
public telaCadProduto() {
    btnOKP.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String codProduto = textCodigo.getText();
            String descProduto = textDescricao.getText();
            String precoProduto = textPreco.getText();
            String qtdProduto = textQuantidade.getText();

            JOptionPane.showMessageDialog(btnOKP, "O seguinte produto foi cadastrado com as seguintes informações: "
                    + "Código: "+ codProduto+ "\n"
                    +"Descrição: "+ descProduto+ "\n"
                    +"Preço: "+ precoProduto+ "\n"
                    +"Quantidade em Estoque: "+ qtdProduto);


        }
    });
}
}
