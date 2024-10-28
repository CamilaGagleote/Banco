/*
 *@author:<Camila Gagleote,1110482312050>
 */
package br.edu.fateczl.banco.model;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }


    @Override
    public float depositar(float valorDepositar) {
        return super.depositar(valorDepositar);
    }

    @Override
    public float sacar(float valorSacar) {
        float saldo = getSaldo();
        if ((saldo-valorSacar)<0){
            float limite = getLimite() * -1;
            if ((saldo-valorSacar)>=limite){
                setSaldo(saldo-valorSacar);
                return saldo - valorSacar;
            }
            else {
                return Float.parseFloat("Erro: Não foi possível sacar, pois a conta ficaria negativa");
            }
        }
        else {
            setSaldo(saldo-valorSacar);
            return saldo - valorSacar;
        }
    }
}
