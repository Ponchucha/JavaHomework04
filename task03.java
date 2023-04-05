import java.util.ArrayDeque;
import java.util.Scanner;
/*В калькулятор добавьте возможность отменить последнюю операцию. */
public class task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> results = new ArrayDeque<>();
        int number01 = 0;
        while (true){
            if(results.isEmpty()){
        System.out.println("Input first number: ");
        results.add(in.nextInt());
            }
            System.out.println("Input operation (+, -, *, /): \nor 'close' to close the calc: \nor 'cancel' to abandon the last operation: \nor 'clear' to start it over: ");
            String operation = in.next();
            switch(operation){
                case "close":
                    in.close();
                    break;
                case "cancel":
                    if(! results.isEmpty()){                        
                        results.removeLast();
                        if(!results.isEmpty()){
                            System.out.println(results.getLast());
                        }
                    }
                    continue;
                case "clear":
                    results.removeAll(results);
                    continue;
                default:
                    System.out.println("Input second number: ");
                    int number02 = in.nextInt();
                    number01 = results.getLast();
                    switch (operation) {
                        case "+":
                            results.add(number01+number02);
                            break;
                        case "-":
                            results.add(number01-number02);
                            break;
                        case "*":
                            results.add(number01*number02);
                            break;
                        case "/":
                            results.add(number01/number02);
                            break;
                    }      
                    System.out.printf("%d %s %d = %d\n", number01, operation, number02, results.getLast());
                    System.out.println("\n\n" + results.getLast());
            }
        }
        
    }
}
