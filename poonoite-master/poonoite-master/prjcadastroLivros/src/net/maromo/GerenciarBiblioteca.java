package net.maromo;

import net.maromo.view.LivroView;

import javax.swing.*;

public class GerenciarBiblioteca {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Livros");
        janela.setContentPane(new LivroView().getPanelLivro());
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
