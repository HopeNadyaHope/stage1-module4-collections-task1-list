package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int fun1 = fun(num1);
        int fun2 = fun(num2);

        if (fun1 == fun2) {
            if(num1 > num2){
                return 1;
            }
            else if(num1==num2){
                return 0;
            }
            else {
                return -1;
            }
        } else {
            return fun1 > fun2 ? 1 : -1;
        }
    }

    private int fun(int a) {
        return 5 * a * a + 3;
    }
}

