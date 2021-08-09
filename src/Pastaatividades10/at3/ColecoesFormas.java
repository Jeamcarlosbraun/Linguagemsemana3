package Pastaatividades10.at3;

import java.util.ArrayList;

    public class ColecoesFormas {

         ArrayList<FormaBidimencional> FB = new ArrayList<FormaBidimencional>();
         ArrayList<FormaTridimencional> FT = new ArrayList<FormaTridimencional>();

         public void imprimir() {
         for (FormaBidimencional f : FB) {
         System.out.println(f.getClass());
         System.out.println(f.getArea());
         }

         for (FormaTridimencional f : FT) {
         System.out.println(f.getClass());
         System.out.println(f.getArea());
         System.out.println(f.getVolume());
         }

         }

        ArrayList<Forma> FF = new ArrayList<Forma>();


        public void adicionarForma(Forma form) {
            FF.add(form);
        }

        public static void main(String[] args) {
            ColecoesFormas colecoesFormas = new ColecoesFormas();


            Circulo a = new Circulo();
            a.setAresta(4);
            a.setArea(a.calculaArea(a.getAresta()));
            a.setDesenho('a');
            colecoesFormas.adicionarForma(a);

        }

}
