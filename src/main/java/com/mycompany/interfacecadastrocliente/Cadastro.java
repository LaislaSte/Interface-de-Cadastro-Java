
package com.mycompany.interfacecadastrocliente;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Cadastro extends JFrame {
    JLabel CodCli, Nome, Endereco, Bairro, Cidade, Estado, Cep, Sexo, Celular, Telef,DtAniv, DtCadastro;
    JTextField TxtCod, TxtNome, TxtEnder, TxtBair, TxtCidad;
    JFormattedTextField TxtCep, TxtCelu, TxtTele, TxtAniv, TxtCadas;
    MaskFormatter mascaraCep, mascaraCelu, mascaraTele, mascaraAniv, mascaraCadas;
    JComboBox estado;
    JButton Incluir, Limpar, Sair, Consultar, ConsultarTds;
    JRadioButton homem, mulher, nbinario;
    
    public Cadastro(){
        super("Cadastro de Clientes");
        Container tela = getContentPane();
        setLayout (null);
        CodCli = new JLabel ("Codigo do Cliente");
        Nome = new JLabel ("Nome Completo");
        Endereco = new JLabel ("Endereço");
        Bairro = new JLabel ("Bairro");
        Cidade = new JLabel ("Cidade");
        Estado = new JLabel ("Estado");
        Cep = new JLabel ("Cep");
        Sexo = new JLabel ("Sexo");
        Celular = new JLabel ("Celular");
        Telef = new JLabel ("Telefone");
        DtAniv = new JLabel ("Data de Aniversário");
        DtCadastro = new JLabel ("Data de Cadastro");
        
        TxtCod = new JTextField ("");
        TxtNome = new JTextField ("");
        TxtEnder = new JTextField ("");
        TxtBair = new JTextField ("");
        TxtCidad = new JTextField ("");
        
        try{
            mascaraCep = new MaskFormatter("###-###-AA");
            mascaraCelu = new MaskFormatter("(##)#####-####");
            mascaraTele = new MaskFormatter("(##)####-####");
            mascaraAniv = new MaskFormatter("##/##/####");
            mascaraCadas = new MaskFormatter("##/##/####");
            
        }catch(ParseException excp){}
        
        TxtCep = new JFormattedTextField (mascaraCep);
        TxtCelu = new JFormattedTextField (mascaraCelu);
        TxtTele = new JFormattedTextField (mascaraTele);
        TxtAniv = new JFormattedTextField (mascaraAniv);
        TxtCadas = new JFormattedTextField (mascaraCadas);
        
        Incluir = new JButton("Incluir");
        Limpar = new JButton("Limpar");
        Sair = new JButton("Sair");
        Consultar = new JButton("Consultar");
        ConsultarTds = new JButton("Consultar Todos");
        
        estado = new JComboBox();
        mulher = new JRadioButton();
        homem = new JRadioButton();
        nbinario = new JRadioButton();
        
        estado.addItem("AC"); estado.addItem("AL"); estado.addItem("AP"); estado.addItem("AM"); estado.addItem("BA"); 
        estado.addItem("CE"); estado.addItem("DF"); estado.addItem("ES"); estado.addItem("GO"); estado.addItem("MA"); 
        estado.addItem("MT"); estado.addItem("MS"); estado.addItem("MG"); estado.addItem("PA"); estado.addItem("PB");
        estado.addItem("PR"); estado.addItem("PE"); estado.addItem("PI"); estado.addItem("RJ"); estado.addItem("RN");
        estado.addItem("RS"); estado.addItem("RO"); estado.addItem("RR"); estado.addItem("SC"); estado.addItem("SP");
        estado.addItem("SE"); estado.addItem("TO");
        homem.setText("Homem"); mulher.setText("Mulher"); nbinario.setText("Não-Binário");
        
        Incluir.setBounds(30,400,100,20); Limpar.setBounds(150,400,100,20); Sair.setBounds(270,400,100,20); 
        Consultar.setBounds(30,440,100,20); ConsultarTds.setBounds(150,440,150,20);
        
        TxtCod.setBounds(235,20,200,20); TxtNome.setBounds(235,50,200,20); TxtEnder.setBounds(235,80,200,20); TxtBair.setBounds(235,110,200,20); 
        TxtCidad.setBounds(235,140,200,20); estado.setBounds(235,170,200,20); TxtCep.setBounds(235,200,200,20); mulher.setBounds(235,230,100,20);
        homem.setBounds(345,230,100,20); nbinario.setBounds(455,230,100,20); TxtCelu.setBounds(235,260,200,20); TxtTele.setBounds(235,290,200,20); 
        TxtAniv.setBounds(235,320,200,20); TxtCadas.setBounds(235,350,200,20);
        
        CodCli.setBounds(20,20,100,20); Nome.setBounds(20,50,100,20); Endereco.setBounds(20,80,100,20); Bairro.setBounds(20,110,100,20); 
        Cidade.setBounds(20,140,100,20); Estado.setBounds(20,170,100,20); Cep.setBounds(20,200,100,20); Sexo.setBounds(20,230,100,20);
        Celular.setBounds(20,260,100,20); Telef.setBounds(20,290,100,20); DtAniv.setBounds(20,320,100,20); DtCadastro.setBounds(20,350,100,20);
        
        tela.add(CodCli); tela.add(Nome); tela.add(Endereco); tela.add(Bairro); tela.add(Cidade); tela.add(Estado); tela.add(Cep);
        tela.add(Sexo); tela.add(Celular); tela.add(Telef); tela.add(DtAniv); tela.add(DtCadastro);
        
        tela.add(TxtCod); tela.add(TxtNome); tela.add(TxtEnder); tela.add(TxtBair); tela.add(TxtCidad); tela.add(TxtCep); 
        tela.add(TxtCelu); tela.add(TxtTele); tela.add(TxtAniv); tela.add(TxtCadas); tela.add(estado); tela.add(homem);
        tela.add(mulher); tela.add(nbinario);
        
        tela.add(Incluir); tela.add(Limpar); tela.add(Sair); tela.add(Consultar); tela.add(ConsultarTds);
        
        setSize(600, 700);
        setVisible(true);
    }
    
    public static void main(String[] args){
        Cadastro teste = new Cadastro();
        teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
