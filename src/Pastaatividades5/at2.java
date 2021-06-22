package Pastaatividades5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class at2 {
    public static void main(String[] args) {
        int i = 0;
        String url;
        String verificacao = "[http, https, ftp ]+://www.[a-z]+.[com.br]";
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite sua URL:");
        url = ler.next();
        Pattern padrao=Pattern.compile(verificacao);
        Matcher match= padrao.matcher(url);
        if(match.find()== true){
            System.out.println(url);
            System.out.println("URL valida");
        }else {
            System.out.println("URL invalida");
        }
    }
}
