package edu.wellinton.desafio.Dia1;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Dia: 11/100
https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
 */
public class $011 {
    public static void main(String[] args) {
        String time12Hour = "8:30 PM"; // Coloque aqui o horário PM que você deseja converter

        try {

            DateFormat inputFormat = new SimpleDateFormat("hh:mm a");

            DateFormat outputFormat = new SimpleDateFormat("HH:mm");

            Date date = inputFormat.parse(time12Hour);

            String time24Hour = outputFormat.format(date);

            System.out.println("Horário em formato de 24 horas: " + time24Hour);
        } catch (ParseException e) {
            System.out.println("Erro ao fazer a conversão: " + e.getMessage());
        }
    }
}
