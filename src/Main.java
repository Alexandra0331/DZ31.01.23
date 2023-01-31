import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// Найти минимальное значение
// Найти максимальное значение
// Найти среднее значение


public class Main {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 7, 6, 9, 4));
        //ArrayList<String> number = new ArrayList();
        // number.add("1");
        // number.add("4");
        // number.add("3");
        // number.add("6");
        // number.add("12");
        // number.add("5");
        // number.add("7");

        //number.remove(1);
        //number.remove(2);
        //number.remove(2);

// Нужно удалить из него четные числа
        list.removeIf(x -> (x % 2 == 0));


        System.out.println(list);
        System.out.println(getMin(list));
        System.out.println(getMax(list));

        double avg = getAverage(list);
        System.out.println(avg);
    }


// Найти минимальное значение
    public static Integer getMin(List<Integer> list)
    {
                Integer min = Integer.MAX_VALUE;
        for (Integer i: list)
        {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }


    // Найти максимальное значение
    public static Integer getMax(List<Integer> list)
    {
        Integer max = Integer.MIN_VALUE;
        for (Integer i: list)
        {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }


    // Найти среднее значение
    private static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}
