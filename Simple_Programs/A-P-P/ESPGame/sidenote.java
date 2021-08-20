import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//one class needs to have a main() method
public class sidenote {
    // arguments are passed using the text field below this editor
    public static void main(String[] args) {
        
		Scanner kb = new Scanner(System.in);
		
        List<Integer> list = new ArrayList<Integer>();
        
		boolean doExist = false;
        
		int inputVal;
        do {
            System.out.print("\nEnter an Integer:");
            inputVal = kb.nextInt();
            doExist = list.contains(inputVal);
            if (!doExist) {
                list.add(inputVal);
            }

        } while (!doExist);

        System.out.println("The Number of Non Duplicate Integers:"+list.size());

    }
}
