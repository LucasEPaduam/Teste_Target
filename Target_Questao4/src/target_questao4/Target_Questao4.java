/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target_questao4;

import java.text.DecimalFormat;

/**
 *
 * @author Lucas Eduardo
 */
public class Target_Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalculaPercentual cPercent = new CalculaPercentual();
        DecimalFormat df = new DecimalFormat("#,###.00");

        double saoPaulo = 67.83643;
        double rioDeJaneiro = 36.67866;
        double minasGerais = 29.22988;
        double espiritoSanto = 27.16548;
        double outrosEstados = 19.84953;

        double valorTotal = saoPaulo + rioDeJaneiro + minasGerais + espiritoSanto + outrosEstados;

        System.out.println("O estado de São Paulo teve percentual de "
                + df.format(cPercent.calculaPercentual(saoPaulo, valorTotal)) + "%");
        System.out.println("O estado do Rio de Janeiro teve percentual de "
                + df.format(cPercent.calculaPercentual(rioDeJaneiro, valorTotal)) + "%");
        System.out.println("O estado de Minas Gerais teve percentual de "
                + df.format(cPercent.calculaPercentual(minasGerais, valorTotal)) + "%");
        System.out.println("O estado do Espiríto Santo teve percentual de "
                + df.format(cPercent.calculaPercentual(espiritoSanto, valorTotal)) + "%");
        System.out.println("Outros Estados juntos tiveram um percentual de "
                + df.format(cPercent.calculaPercentual(outrosEstados, valorTotal)) + "%");
        
    }

}
