/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroprodutos.java;

/**
 *
 * @author Gabriel Castro
 */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class CadastroProdutos extends JFrame {

    private JTextField nomeField, precoField, quantidadeField;
    private JTextArea areaTexto;
    private ArrayList<Produto> produtos = new ArrayList<>();

    
    public CadastroProdutos() {
        super("Cadastro de Produtos");
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        nomeField = new JTextField(20); 
        add(nomeField);

        add(new JLabel("Preço:"));
        precoField = new JTextField(10); 
        add(precoField);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField(10); 
        add(quantidadeField);

        JButton cadastrarBtn = new JButton("Cadastrar");
        JButton listarBtn = new JButton("Listar");
        JButton limparBtn = new JButton("Limpar");

        add(cadastrarBtn);
        add(listarBtn);
        add(limparBtn);

        areaTexto = new JTextArea(10, 30); // 10 linhas, 30 colunas
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto));

        cadastrarBtn.addActionListener(e -> cadastrarProduto());
        listarBtn.addActionListener(e -> listarProdutos());
        limparBtn.addActionListener(e -> limparCampos());

        setSize(400, 350); 
        setResizable(false); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrarProduto() {
        String nome = nomeField.getText();
        String precoStr = precoField.getText();
        String quantidadeStr = quantidadeField.getText();

        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O nome do produto não pode ser vazio.");
            return; 
        }

        try {
            double preco = Double.parseDouble(precoStr);
            int quantidade = Integer.parseInt(quantidadeStr);

            if (preco <= 0 || quantidade <= 0) {
                JOptionPane.showMessageDialog(this, "Preço e quantidade devem ser positivos.");
                return; 
            }

            produtos.add(new Produto(nome, preco, quantidade));
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preço e quantidade devem ser numéricos.");
        }
    }

   
    private void listarProdutos() {
        areaTexto.setText(""); 
        for (Produto p : produtos) {
            areaTexto.append(p.toString() + "\n"); 
        }
    }

    
    private void limparCampos() {
        nomeField.setText("");
        precoField.setText("");
        quantidadeField.setText("");
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroProdutos());
    }

    static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

       
        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        
        @Override
        public String toString() {
            return nome + " - R$" + String.format("%.2f", preco) + " - Quantidade: " + quantidade;
        }
    }
}
