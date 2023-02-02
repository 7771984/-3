// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

import java.util.ArrayList;
import java.util.Random;

public class Задание_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(15);
        Random random = new Random();
        for (Integer i = 0; i < 15; i ++) {
            list.add(random.nextInt(10));
        }
        System.out.print(list);
        {
            int i = 0;
            while (i < list.size()) {
                if (list.get(i) % 2 == 0) {
                    list.remove(i);
                }
                else {
                    i++;
                }
            }
            System.out.printf("Список с удаленными четными числами %s", list);
        }
    }
}