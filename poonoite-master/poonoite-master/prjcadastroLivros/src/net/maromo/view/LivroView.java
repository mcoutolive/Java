package net.maromo.view;

import net.maromo.model.Livro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LivroView {
    private JTextField textField1;
    private JTextField textField2;
    private JButton cadastrarButton;
    private JPanel panelLivro;

    public JPanel getPanelLivro() {
        return panelLivro;
    }

    public LivroView() {
        cadastrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Livro livro = new Livro();
                livro.setIsbn(Integer.parseInt(textField1.getText()));
                livro.setTitulo(textField2.getText());
                JOptionPane.showMessageDialog(null,
                        "Objeto: " + livro.toString(),
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
