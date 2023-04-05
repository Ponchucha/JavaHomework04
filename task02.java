import java.util.LinkedList;
/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
public class task02 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
        
        Enqueqe(myList, 20);

        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        System.out.println(Dequeue(myList));

        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        System.out.println(First(myList));
        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");


    }
    static void Enqueqe(LinkedList<Integer> array, int number){
        array.add(number);
    }
    static int Dequeue(LinkedList<Integer> array){
        return array.removeFirst();
    }
    static int First (LinkedList<Integer> array){
        return array.get(0);
    }
}
