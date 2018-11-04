/*
    Programming for Computer Scientists (CS118) - Lab 5
    Classes and objects
*/

package lab5;

/**
* Represents a dynamic array for Assessment objects.
*/
public class DynamicAssessmentArray {
    /**
    * The underlying array.
    */
    private Assessment[] array;
    private int next = 0;
    /**
    * Initialises a new dynamic array with the specified initial capacity.
    */
    public DynamicAssessmentArray(int initialCapacity) {
        array = new Assessment[initialCapacity];
    }

    /**
    * Gets the number of elements stored in this dynamic array.
    */
    public int getSize() {
        return next;
    }

    /**
    * Gets the current capacity of this dynamic array.
    */
    public int getCapacity() {
        return array.length;
    }

    /**
    * Increases the size of the underlying array by initialising a new array
    * and copies all elements from the old array into the new one.
    */
    private void resize() {
        Assessment[] tempArray = new Assessment[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        array = tempArray;
    }

    /**
    * Adds a new element to this dynamic array.
    */
    public void add(Assessment assessment) {
      if (next >= array.length) {
        resize();
      }

        array [next] = assessment;
        next++;
    }

    /**
    * Gets the element at the specified index. If the index is out of bounds,
    * this method returns null.
    */
    public Assessment get(int index) {
      if (index < array.length) {
        return array [index];
      } else {
        return null;
      }
    }
}
