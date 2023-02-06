import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим.
 */
public class Task_1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(1);
        }
        System.out.println(System.currentTimeMillis() - s);

        var d = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(1);
        }
        System.out.println(System.currentTimeMillis() - d);
    }
}