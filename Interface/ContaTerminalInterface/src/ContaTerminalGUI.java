import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContaTerminalGUI {
    public static void main(String[] args) {
        // Criando o frame (janela)
        JFrame frame = new JFrame("Conta Bancária");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Criando os campos de entrada de dados
        JLabel nameLabel = new JLabel("Nome do Cliente:");
        nameLabel.setBounds(20, 20, 150, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 20, 180, 25);
        frame.add(nameField);

        JLabel agenciaLabel = new JLabel("Número da Agência:");
        agenciaLabel.setBounds(20, 60, 150, 25);
        frame.add(agenciaLabel);

        JTextField agenciaField = new JTextField();
        agenciaField.setBounds(180, 60, 180, 25);
        frame.add(agenciaField);

        JLabel contaLabel = new JLabel("Número da Conta:");
        contaLabel.setBounds(20, 100, 150, 25);
        frame.add(contaLabel);

        JTextField contaField = new JTextField();
        contaField.setBounds(180, 100, 180, 25);
        frame.add(contaField);

        JLabel saldoLabel = new JLabel("Saldo:");
        saldoLabel.setBounds(20, 140, 150, 25);
        frame.add(saldoLabel);

        JTextField saldoField = new JTextField();
        saldoField.setBounds(180, 140, 180, 25);
        frame.add(saldoField);

        // Criando o botão de ação
        JButton submitButton = new JButton("Criar Conta");
        submitButton.setBounds(140, 180, 120, 30);
        frame.add(submitButton);

        // Label para mostrar a mensagem final
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(20, 220, 350, 50);
        frame.add(messageLabel);

        // Adicionando ação ao botão
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturando os dados dos campos de texto
                String nomeCliente = nameField.getText();
                String agencia = agenciaField.getText();
                int contaCliente = Integer.parseInt(contaField.getText());
                double saldo = Double.parseDouble(saldoField.getText());

                // Criando a mensagem final
                String mensagem = "<html>Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. <br>" +
                "Sua agência é " + agencia + ", conta " + contaCliente + " e seu saldo " + saldo + " já está disponível para saque.</html>";

                // Exibindo a mensagem no label
                messageLabel.setText(mensagem);
            }
        });

        // Tornando a janela visível
        frame.setVisible(true);
    }
}