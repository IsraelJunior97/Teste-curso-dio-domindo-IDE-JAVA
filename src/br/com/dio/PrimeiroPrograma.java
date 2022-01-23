package br.com.dio;

import br.com.dio.gato.Gato;

public class PrimeiroPrograma
{
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro Private nome;
        Object numpags;

        int i = 300;
        new Livro (nome,"O problema dos tres porcos",numpags:300);

        System.out.println(livro1);

       /*int a = 5;
       int b = 3;

        System.out.println("Helo world " +(a+b));*/

    }


}
    class Livro{

    Private  String  livro;
    Private Interger numpags;

        public Livro(Private string, Private interger) {
            String = string;
            Interger = interger;
        }

        public Private getString() {
            return String;
        }

        public void setString(Private string) {
            String = string;
        }

        public Private getInterger() {
            return Interger;
        }

        public void setInterger(Private interger) {
            Interger = interger;
        }

        @Override
        public java.lang.String toString() {
            return "Livro{" +
                    "String=" + String +
                    ", Interger=" + Interger +
                    '}';
        }
    }

