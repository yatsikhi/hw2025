import java.util.LinkedList;
import java.util.Scanner;

public class Train {
    
    public static void MakeTrain() {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> train = new LinkedList<>();
        
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            
            if (command.startsWith("+")) { 
                char direction = command.charAt(1); 
                int wagonNumber = Integer.parseInt(command.substring(6)); 
                
                if (direction == 'l') {
                    train.addFirst(wagonNumber); 
                } else {
                    train.addLast(wagonNumber); 
                }
            } else if (command.startsWith("-")) { 
                char direction = command.charAt(1); 
                int count = Integer.parseInt(command.substring(7)); я
                
                if (direction == 'l') {
                    for (int i = 0; i < Math.min(count, train.size()); i++) {
                        train.removeFirst(); 
                    }
                } else {
                    for (int i = 0; i < Math.min(count, train.size()); i++) {
                        train.removeLast(); 
                    }
                }
            }
        }
        
       
        for (Integer wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
    }
}
