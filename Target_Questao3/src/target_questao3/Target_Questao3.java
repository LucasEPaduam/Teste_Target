/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target_questao3;

import java.util.ArrayList;


/**
 *
 * @author Lucas Eduardo
 */
public class Target_Questao3 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {

        ControleFaturamento cf;
        cf = new ControleFaturamento();
        
        ArrayList<FaturamentoDiario> fd;
        fd = cf.criarListaFaturamento();
        
        System.out.println("O maior faturamento do mês foi no " + 
                            cf.maiorFaturamento(fd));
        
        System.out.println("O menor faturamento do mês foi no " + 
                            cf.menorFaturamento(fd));
        
        System.out.println("Neste mês " + cf.faturamentoSuperiorMediaMensal(fd) + 
                            " dias tiveram faturamento maior que a média mensal");
        
        
        
        
        
        
        
    }
        
        

    

}
