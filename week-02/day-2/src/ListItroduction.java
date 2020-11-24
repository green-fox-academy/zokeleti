import java.util.ArrayList;

public class ListItroduction {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        System.out.println(myList.size());
        myList.add("William");
        System.out.println(myList.isEmpty());
        myList.add("John");
        myList.add("Amanda");
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        int counter = 1;
        for (int j = 0; j < myList.size(); j++){
            System.out.println(counter + "." + myList.get(j));
            counter += 1;
        }
        myList.remove(1);
        for (int k = myList.size() -1; k > -1; k--){
            System.out.println(myList.get(k));
        }
        myList.clear();

    }





}
