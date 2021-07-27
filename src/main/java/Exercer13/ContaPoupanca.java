package Exercer13;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancária {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
// Metodo


    @Override
    public String toString() {
      String s = "ContaPoupança [";
      s += " diaRendimento: "+ diaRendimento;
      s += "; "+ super.toString();
      s += "]";
      return s;
    }
    public boolean calcularNovoSaldo(double taxiRendimento) {
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxiRendimento;
            this.setSaldo(this.getSaldo()+ (this.getSaldo() * taxiRendimento));
            return true;
        }
        return false;
    }
}
