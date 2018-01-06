package interfaces_exc.i_collection_hierarchy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        IAddCollection addCollection = new AddCollection();
        IAddRemoveCollection addRemoveCollection = new RemoveCollection();
        IMyList myList = new MyList();

        String[] words = reader.readLine().split("\\s+");

        StringBuilder firstResult = new StringBuilder();
        StringBuilder secondResult = new StringBuilder();
        StringBuilder thirdResult = new StringBuilder();


        for (String word : words) {
            firstResult.append(addCollection.add(word) + " ");
            secondResult.append(addRemoveCollection.add(word)+" ");
            thirdResult.append(myList.add(word)+" ");
        }

        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);

        firstResult.delete(0, firstResult.length() - 1);
        secondResult.delete(0, secondResult.length() - 1);
        thirdResult.delete(0, thirdResult.length() - 1);

        Integer countRemoves = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countRemoves; i++) {
            secondResult.append(addRemoveCollection.remove()+" ");
            thirdResult.append(myList.remove()+" ");
        }

        System.out.println(secondResult.toString().trim());
        System.out.println(thirdResult.toString().trim());
    }
}
