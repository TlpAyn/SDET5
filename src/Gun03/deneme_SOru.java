package Gun03;

import java.util.ArrayList;
import java.util.Arrays;

public class deneme_SOru {
    public static void main(String[] args) {

String [] arr ={ "Hi","How","Are","You"
};
ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

if(arrList.removeIf(s->{System.out.print(s); return s.length()<=2;})){
            System.out.println("removed");

        }
    }
}
