

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = "31 12 28 33 23 34 9 18 26 25 18 33 12 28 11 22 32 26 22 29";
        var data = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        final int size = 1000;
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder();

        double s;
        boolean isFirst = true;

        for(int j = 0; j < size; j++) {

            s = 0;
            for (int i = 0; i < data.length; i++) {

                s += data[rnd.nextInt(data.length)];

            }
            if(!isFirst) {
                sb.append("\n");
            }
            sb.append(s / data.length);
            isFirst = false;
        }

        System.out.println(sb);

//        System.out.println(Arrays.stream(sb.toString()
//                .split(" ")).mapToDouble(Double::parseDouble).toArray().length);

    }
}