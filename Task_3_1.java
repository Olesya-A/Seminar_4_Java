import java.util.Stack;

/**
 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

public class Task_3_1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7};
        Stack<Integer>  newStack = turnToStack(array);
        System.out.println(newStack);
        for (int j = 0; j < array.length; j++) {
            System.out.println(newStack.pop());
        }
        
        
    }
    static Stack <Integer> turnToStack (int[] arrayInput) {
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : arrayInput) {
            stack.add(integer);
        }
        return stack;
        }
}
