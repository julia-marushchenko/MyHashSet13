/**
 *  Java program to create and modify HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of HashSet.
        Set<Float> mySet = new HashSet<>();

        // Add.
        mySet.add(5.7f);
        mySet.add(7.8f);
        mySet.add(9.8f);
        mySet.add(4.1f);
        mySet.add(5.9f);

        // Display.
        System.out.println(mySet); // Output: [5.7, 4.1, 9.8, 5.9, 7.8]

        // Remove.
        mySet.remove(4.1f);

        // Display.
        System.out.println(mySet); // Output: [5.7, 9.8, 5.9, 7.8]

        // Display amount.
        System.out.println(mySet.stream().count()); // Output: 4

        // Add.
        mySet.add(9.0f);

        // Display.
        System.out.println(mySet); // Output: [5.7, 9.0, 9.8, 5.9, 7.8]

        // Delete all.
        mySet.clear();

    }
}