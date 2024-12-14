package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dayI = Integer.parseInt(sc.nextLine().replaceAll("\\D", ""));
        String[] inputI = sc.nextLine().split(" : ");
        int hi = Integer.parseInt(inputI[0]);
        int mi = Integer.parseInt(inputI[1]);
        int si = Integer.parseInt(inputI[2]);

        int dayF = Integer.parseInt(sc.nextLine().replaceAll("\\D", ""));
        String[] inputF = sc.nextLine().split(" : ");
        int hf = Integer.parseInt(inputF[0]);
        int mf = Integer.parseInt(inputF[1]);
        int sf = Integer.parseInt(inputF[2]);

        // Converter tudo para segundos
        int startInSeconds = toSeconds(dayI, hi, mi, si);
        int endInSeconds = toSeconds(dayF, hf, mf, sf);

        // Calcular a diferença em segundos
        int diffInSeconds = endInSeconds - startInSeconds;

        // Converter a diferença de volta para dias, horas, minutos e segundos
        int[] time = toTime(diffInSeconds);

        System.out.printf("%d dia(s)%n", time[0]);
        System.out.printf("%d hora(s)%n", time[1]);
        System.out.printf("%d minuto(s)%n", time[2]);
        System.out.printf("%d segundo(s)%n", time[3]);

        sc.close();
    }

    private static int toSeconds(int day, int hour, int minute, int second) {
        return second + minute * 60 + hour * 3600 + day * 86400;
    }

    private static int[] toTime(int totalSeconds) {
        int days = totalSeconds / 86400;
        totalSeconds %= 86400;
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        return new int[]{days, hours, minutes, seconds};
    }
}
