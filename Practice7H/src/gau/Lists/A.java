package gau.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A implements InterfaceForA {
    protected ArrayList<Integer> arr = new ArrayList<>();
    protected ArrayList<String> arrs = new ArrayList<>();
    @Override
    public void fillListWith5() {
        arr.clear();
        for (int i = 0; i < 5; i++) {
            arr.add((int)(Math.random()*101));
        }
    }

    @Override
    public void fillListWith20() {
        arr.clear();
        for (int i = 0; i < 20; i++) {
            arr.add((int)(Math.random()*101));
        }
    }

    @Override
    public void fillListWith20s() {
        arrs.clear();
        for (int i = 0; i < 20; i++) {
            arrs.add(randWord());
        }
    }

    @Override
    public void printList() {
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size()-1){
                System.out.println(arr.get(i));
            }
            else {
                System.out.print(arr.get(i)+", ");
            }
        }
    }

    @Override
    public void printList(ArrayList<?> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i == array.size()-1){
                System.out.println(array.get(i));
            }
            else {
                System.out.print(array.get(i)+", ");
            }
        }
    }

    @Override
    public void sortASC() {
        Collections.sort(arr);
    }

    @Override
    public void sortDESC() {
        Collections.sort(arr);
        Collections.reverse(arr);
    }

    @Override
    public String randWord() {
        StringBuilder word = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i<10; i++){
            word.append((char) (r.nextInt(26) + 'a'));
        }
        return word.toString();
    }
}
