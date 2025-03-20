package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    // Constructor
    public WorkintechList() {
        super();
    }

    // Override the add method to prevent duplicates
    @Override
    public boolean add(T element) {
        // Only add the element if it doesn't already exist in the list
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    // Custom sort method that sorts the elements in ascending order
    public void sort() {
        Collections.sort(this);
    }

    // Custom remove method that removes an element and sorts the list afterwards
    @Override
    public boolean remove(Object obj) {
        boolean result = super.remove(obj);
        // Sort the list after removal
        Collections.sort(this);
        return result;
    }
}
