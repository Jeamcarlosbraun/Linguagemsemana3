package Pastaatividades5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class at3 {
    public static void main(String[] args) {
        String senha;
        String verificacao = "^(?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        senha = ler.next();
        Pattern padrao=Pattern.compile(verificacao);
        Matcher match= padrao.matcher(senha);
        if(match.find() == true ){
            System.out.println(senha);
            System.out.println("Senha Forte");
        }else {
            System.out.println("Senha Fraca");
        }
    }
}
