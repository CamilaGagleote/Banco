package br.edu.fateczl.banco.model;

/*
 *@author:<Camila Gagleote,1110482312050>
 */


public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public float calcularNovoSaldo(float taxaRendimento){
        taxaRendimento = taxaRendimento/100;
        taxaRendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() +  taxaRendimento);
        return getSaldo();
    }

    @Override
    public float sacar(float valorSacar) {
        return super.sacar(valorSacar);
    }
    @Override
    public float depositar(float valorDepositar) {
        return super.depositar(valorDepositar);
    }
}
