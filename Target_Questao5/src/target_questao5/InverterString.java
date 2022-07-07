/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target_questao5;

import java.util.Stack;

/**
 *
 * @author Lucas Eduardo
 */
public class InverterString {

    public String Invert(String palavra) {

        if (palavra == null || palavra.equals("")) {
            return palavra;
        }

        Stack<Character> stack = new Stack<Character>();

        // empurra cada caractere da string dada para a Stac
        char[] ch = palavra.toCharArray();
        for (int i = 0; i < palavra.length(); i++) {
            stack.push(ch[i]);
        }

        int k = 0;

        while (!stack.isEmpty()) {

            ch[k++] = stack.pop();
        }

        return String.copyValueOf(ch);
    }

}
