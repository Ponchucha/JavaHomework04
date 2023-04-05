import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод(не void), который вернет “перевернутый” список. */
/**
 * task01
 */
public class task01 {

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
        LinkedList<Integer> newList = getReverceLinkedList(myList);
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");
    }
    static LinkedList<Integer> getReverceLinkedList(LinkedList<Integer> array){
        LinkedList<Integer> result = new LinkedList<>();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            result.add(array.removeLast());
        }
        return result;
    }
}