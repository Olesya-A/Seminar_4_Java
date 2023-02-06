import java.util.LinkedList;
import java.util.Queue;


/**
 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

public class Task_3_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7};
        Queue<Integer>  newQueue = turnToQueue(array);
        System.out.println(newQueue);
        for (int j = 0; j < array.length; j++) {
            System.out.println(newQueue.poll());
        }
    }
    static Queue <Integer> turnToQueue (int[] arrayInput) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer item : arrayInput) {
            queue.add(item);
        }
        return queue;
        }
}
