package javaapplication;

import javax.swing.JOptionPane;

public class Produtos {
    
    String NomeCliente;
    String Pedido;
    int Quantidade1=0, Quantidade2=0, Quantidade3=0, Quantidade4=0, Quantidade5=0, Quantidade6=0, Quantidade7=0, Quantidade8=0, Quantidade9=0;
    int Op1, Op2, Op3, Op4, Op5, Op6, Op7, Op8, Op9, erro=0;
    float Preco1 = 5.00f, Preco2 = 5.50f, Preco3 = 5.80f, Preco4 = 2.00f, Preco5 = 1.50f, Preco6 = 2.20f, Preco7 = 8.50f, Preco8 = 7.00f, Preco9 = 8.00f;
    float PrecoTotal;
    
    TelaPedido P = new TelaPedido();
    TelaComanda T = new TelaComanda();
   
    public Produtos(String NomeCliente, String Pedido, int Quantidade1, int Quantidade2, int Quantidade3, int Quantidade4, int Quantidade5, int Quantidade6, int Quantidade7, int Quantidade8, int Quantidade9){
        this.NomeCliente = NomeCliente;
        this.Pedido = Pedido;
        this.Quantidade1 = Quantidade1;
        this.Quantidade2 = Quantidade2;
        this.Quantidade3 = Quantidade3;
        this.Quantidade4 = Quantidade4;
        this.Quantidade5 = Quantidade5;
        this.Quantidade6 = Quantidade6;
        this.Quantidade7 = Quantidade7;
        this.Quantidade8 = Quantidade8;
        this.Quantidade9 = Quantidade9;
    }
    
    public float Calcula(int Quantidade1, int Quantidade2, int Quantidade3, int Quantidade4, int Quantidade5, int Quantidade6, int Quantidade7, int Quantidade8, int Quantidade9){
        PrecoTotal = Preco1*Quantidade1 + Preco2*Quantidade2 + Preco3*Quantidade3 + Preco4*Quantidade4 + Preco5*Quantidade5 + Preco6*Quantidade6 + Preco7*Quantidade7 + Preco8*Quantidade8 + Preco9*Quantidade9;
        if(PrecoTotal!=0){
            return PrecoTotal;
        }
        else{
            JOptionPane.showMessageDialog(null,"É preciso ter ao menos um produto para realizar o pedido!");
            P.Limpa();
            return 0;
        }
    }
    
    public void Valida(String NomeCliente){
        if(NomeCliente.trim().equals("")){
            JOptionPane.showMessageDialog(null,"É preciso o nome do cliente para realizar o pedido!");
            erro = 1;
        }
        for(int cont=0;cont<NomeCliente.length();cont++){
            if(Character.isDigit(NomeCliente.charAt(cont))|| !Character.isAlphabetic(NomeCliente.charAt(cont)) && NomeCliente.charAt(cont)!=' '){
                JOptionPane.showMessageDialog(null,"Por favor, apenas insira letras no nome do cliente!");
                erro = 1;
                break;
            }
        }
        if(erro==0){
            ValidaPreco(PrecoTotal);
        }
    }
    
    
    public void ValidaPreco(float PrecoTotal){
        if(PrecoTotal!=0){
            ChamaComanda();
        }
    }
    
    public boolean ValidaQuantidade(String quantidade){
        for(int cont=0;cont<quantidade.length();cont++){
            if(!Character.isDigit(quantidade.charAt(cont))){
                JOptionPane.showMessageDialog(null,"Por favor, apenas insira números na quantidade de produtos!");
                return false;
            }
        }
        return true;
    }
    
    public void ChamaComanda(){
        T.Funcionario(true);
        T.Registra(NomeCliente,Pedido,PrecoTotal);
        T.setLocationRelativeTo(null);
        T.show();
    }
    
    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public int getQuantidade1() {
        return Quantidade1;
    }

    public void setQuantidade1(int Quantidade1) {
        this.Quantidade1 = Quantidade1;
    }

    public int getQuantidade2() {
        return Quantidade2;
    }

    public void setQuantidade2(int Quantidade2) {
        this.Quantidade2 = Quantidade2;
    }

    public int getQuantidade3() {
        return Quantidade3;
    }

    public void setQuantidade3(int Quantidade3) {
        this.Quantidade3 = Quantidade3;
    }

    public int getQuantidade4() {
        return Quantidade4;
    }

    public void setQuantidade4(int Quantidade4) {
        this.Quantidade4 = Quantidade4;
    }

    public int getQuantidade5() {
        return Quantidade5;
    }

    public void setQuantidade5(int Quantidade5) {
        this.Quantidade5 = Quantidade5;
    }

    public int getQuantidade6() {
        return Quantidade6;
    }

    public void setQuantidade6(int Quantidade6) {
        this.Quantidade6 = Quantidade6;
    }

    public int getQuantidade7() {
        return Quantidade7;
    }

    public void setQuantidade7(int Quantidade7) {
        this.Quantidade7 = Quantidade7;
    }

    public int getQuantidade8() {
        return Quantidade8;
    }

    public void setQuantidade8(int Quantidade8) {
        this.Quantidade8 = Quantidade8;
    }

    public int getQuantidade9() {
        return Quantidade9;
    }

    public void setQuantidade9(int Quantidade9) {
        this.Quantidade9 = Quantidade9;
    }

    public int getOp1() {
        return Op1;
    }

    public void setOp1(int Op1) {
        this.Op1 = Op1;
    }

    public int getOp2() {
        return Op2;
    }

    public void setOp2(int Op2) {
        this.Op2 = Op2;
    }

    public int getOp3() {
        return Op3;
    }

    public void setOp3(int Op3) {
        this.Op3 = Op3;
    }

    public int getOp4() {
        return Op4;
    }

    public void setOp4(int Op4) {
        this.Op4 = Op4;
    }

    public int getOp5() {
        return Op5;
    }

    public void setOp5(int Op5) {
        this.Op5 = Op5;
    }

    public int getOp6() {
        return Op6;
    }

    public void setOp6(int Op6) {
        this.Op6 = Op6;
    }

    public int getOp7() {
        return Op7;
    }

    public void setOp7(int Op7) {
        this.Op7 = Op7;
    }

    public int getOp8() {
        return Op8;
    }

    public void setOp8(int Op8) {
        this.Op8 = Op8;
    }

    public int getOp9() {
        return Op9;
    }

    public void setOp9(int Op9) {
        this.Op9 = Op9;
    }

    public float getPreco1() {
        return Preco1;
    }

    public void setPreco1(float Preco1) {
        this.Preco1 = Preco1;
    }

    public float getPreco2() {
        return Preco2;
    }

    public void setPreco2(float Preco2) {
        this.Preco2 = Preco2;
    }

    public float getPreco3() {
        return Preco3;
    }

    public void setPreco3(float Preco3) {
        this.Preco3 = Preco3;
    }

    public float getPreco4() {
        return Preco4;
    }

    public void setPreco4(float Preco4) {
        this.Preco4 = Preco4;
    }

    public float getPreco5() {
        return Preco5;
    }

    public void setPreco5(float Preco5) {
        this.Preco5 = Preco5;
    }

    public float getPreco6() {
        return Preco6;
    }

    public void setPreco6(float Preco6) {
        this.Preco6 = Preco6;
    }

    public float getPreco7() {
        return Preco7;
    }

    public void setPreco7(float Preco7) {
        this.Preco7 = Preco7;
    }

    public float getPreco8() {
        return Preco8;
    }

    public void setPreco8(float Preco8) {
        this.Preco8 = Preco8;
    }

    public float getPreco9() {
        return Preco9;
    }

    public void setPreco9(float Preco9) {
        this.Preco9 = Preco9;
    }

    public float getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(float PrecoTotal) {
        this.PrecoTotal = PrecoTotal;
    }
    
}
