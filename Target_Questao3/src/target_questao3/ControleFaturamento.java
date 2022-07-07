/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target_questao3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Lucas Eduardo
 */
public class ControleFaturamento {

    ArrayList<FaturamentoDiario> faturamentoDiario;
    FaturamentoDiario faturamento;

    public ArrayList criarListaFaturamento() {

        faturamentoDiario = new ArrayList();

        JSONParser jsonParse = new JSONParser();

        try (FileReader reader = new FileReader("dados.json")) {
            Object obj = jsonParse.parse(reader);
            JSONArray listaArquivo;
            listaArquivo = (JSONArray) obj;

            for (Object o : listaArquivo) {

                JSONObject faturaDia = (JSONObject) o;
                String dia = faturaDia.get("dia").toString();
                Double valor = Double.parseDouble(faturaDia.get("valor").toString());

                faturamento = new FaturamentoDiario();
                faturamento.setDia(dia);
                faturamento.setValor(valor);
                faturamentoDiario.add(faturamento);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return faturamentoDiario;
    }

    public FaturamentoDiario maiorFaturamento(ArrayList<FaturamentoDiario> faturamentos) {

        FaturamentoDiario maiorFat = faturamentos.get(0);

        for (int i = 0; i < faturamentos.size(); i++) {

            if (faturamentos.get(i).getValor() > maiorFat.getValor()) {
                maiorFat = faturamentos.get(i);
            }

        }

        return maiorFat;
    }
    
    public FaturamentoDiario menorFaturamento(ArrayList<FaturamentoDiario> faturamentos) {

        FaturamentoDiario menorFat = faturamentos.get(0);

        for (int i = 0; i < faturamentos.size(); i++) {
            if (faturamentos.get(i).getValor() > 0 && faturamentos.get(i).getValor() < menorFat.getValor()) {
                menorFat = faturamentos.get(i);
            }

        }

        return menorFat;
    }
    
    public int faturamentoSuperiorMediaMensal(ArrayList<FaturamentoDiario> faturamentos) {

        int diasFaturamentoAcimaMedia = 0;
        int diasMedia = 0;
        double faturamentoSoma = 0;
        double media = 0;

        for (int i = 0; i < faturamentos.size(); i++) {
            if (faturamentos.get(i).getValor() > 0){
                faturamentoSoma = faturamentoSoma + faturamentos.get(i).getValor();
                diasMedia++;
            }
        }
        
        media = faturamentoSoma / diasMedia;
        
        for (int i = 0; i < faturamentos.size(); i++) {
            if (faturamentos.get(i).getValor() > 0 && faturamentos.get(i).getValor() > media){
                
                diasFaturamentoAcimaMedia++;
            }
        }

        return diasFaturamentoAcimaMedia;
    }

}
