package chapter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lottery {
    List<Integer> nums = new ArrayList<Integer>();
    List<Integer> pickedNums = new ArrayList<Integer>();

    public lottery() {
        fillList();

        for (int i=0; i<6; i++)
            pickedNums.add(getNum());

        Collections.sort(pickedNums);
    }

    private void fillList() {
        for (int i=1; i<50; i++)
            nums.add(i);
    }

    private int getNum() {
        int pos = (int)(Math.random()*nums.size());
        return nums.remove(pos);
    }

    public List<Integer> getPickedNums() {
        return pickedNums;
    }
}
