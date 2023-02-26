package ExerciciosAulaCollections;

import java.util.ArrayList;
import java.util.List;

/*
*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista 
após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/

public class Exercicio1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<Double>();
        temperaturas.add(35.0);
        temperaturas.add(36.0);
        temperaturas.add(29.0);
        temperaturas.add(27.0);
        temperaturas.add(17.0);
        temperaturas.add(10.0);

        System.out.println(temperaturas.toString());

        double maiorTemperatura = calcularMediaSemestral(temperaturas);

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > maiorTemperatura) {
                System.out.println("O mês mais quente é: " + getMesPorExtenso(i + 1) + " e a temperatura é: "
                        + temperaturas.get(i));

            }
        }

    }

    private static double calcularMediaSemestral(List<Double> temperaturas) {
        double soma = 0;
        for (Double tmp : temperaturas) {
            soma += tmp;
        }
        return soma / temperaturas.size();
    }

    private static String getMesPorExtenso(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            default:
                return "Mês inválido";
        }

    }

    class NumeroMaior implements Comparable<NumeroMaior> {

        int mes;
        double temperatura;

        public NumeroMaior(int mes, double temperatura) {
            this.mes = mes;
            this.temperatura = temperatura;
        }

        public int getMes() {
            return mes;
        }

        public double getTemperatura() {
            return temperatura;
        }

        @Override
        public String toString() {
            return "{" + "mes=" + mes + ", temperatura" + temperatura + "}" + "]";
        }

        @Override
        public int compareTo(NumeroMaior numeroMaior) {
            return this.getMes();
        }

    }

}