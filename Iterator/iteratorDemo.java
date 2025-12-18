package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorDemo {
    public static void main(String[] args) {
        // collection interface implement iterable interface which has iterator
        // interface which allows us
        // to use "FOR EACH LOOP"
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : list) {
            System.out.println(i);
        }

        // in iterator interface this for loop looks like this -->
        // Iterator<Integer> iterator=list.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // for (Integer integer : numbers) {
        // if(integer % 2==0){
        // numbers.remove(integer);//this will throw error
        // ConcurrentModificationException
        // }
        // }

        // iterator provides functionality to remove while iterating
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0) {
                itr.remove();// this wont throw any error,and it will remove the element while looping
            }
        }

        System.out.println(numbers);
    }
}
