package Pastaatividades9.at4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        Date dataFilme = new GregorianCalendar(2021, Calendar.MARCH, 8).getTime();
        EntradaDeCinema entrada =  new EntradaDeCinema(dataFilme, 22.55f, 111, 20);
        EntradaDeCinema entrada2 = new EntradaDeCinema(dataFilme, 18.55f, 222, 20);
        EntradaDeCinema entrada3 = new EntradaDeCinema(dataFilme, 16, 333, 20);
        EntradaDeCinema entrada4 = new EntradaDeCinema(dataFilme, 22.55f, 444, 20);
        EntradaDeCinema entrada5 = new EntradaDeCinema(dataFilme, 21f, 555, 20);
        EntradaDeCinema entrada6 = new EntradaDeCinema(dataFilme, 02.55f, 666, 20);

        Date dataNascimento = new GregorianCalendar(2009, Calendar.MARCH, 7).getTime();
        entrada.calculaDesconto(dataNascimento);

        Date dataNascimento2 = new GregorianCalendar(2010, Calendar.DECEMBER, 8).getTime();
        entrada2.calculaDesconto(dataNascimento2);

        Date dataNascimento3 = new GregorianCalendar(2007, Calendar.JUNE, 8).getTime();
        entrada3.calculaDescontoEstudante(dataNascimento3, 123);

        Date dataNascimento4 = new GregorianCalendar(2004, Calendar.DECEMBER, 19).getTime();
        entrada4.calculaDescontoEstudante(dataNascimento4, 456);

        Date dataNascimento5 = new GregorianCalendar(1966, Calendar.APRIL, 22).getTime();
        entrada5.calculaDescontoEstudante(dataNascimento5, 789);

        Date dataNascimento6 = new GregorianCalendar(1999, Calendar.MARCH, 7).getTime();
        entrada6.calculaDescontoEstudante(dataNascimento6, 789);


        System.out.println("Normais");
        entrada.forString();

        System.out.println("Menor de 12 anos");
        entrada2.forString();

        System.out.println("Estudante 40%");
        entrada3.forString();

        System.out.println("Estudante 30%");
        entrada4.forString();

        System.out.println("Estudante 20%");
        entrada5.forString();

        System.out.println("Desconto de Horário com Desconto de 20%");
        entrada6.forString();

    }
}
