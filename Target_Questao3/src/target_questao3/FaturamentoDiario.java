/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target_questao3;

/**
 *
 * @author Lucas Eduardo
 */
public class FaturamentoDiario {
    
    String dia;
    Double valor;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "Dia: " + dia + ", Valor = " + valor;
    }
    
    
    
}
