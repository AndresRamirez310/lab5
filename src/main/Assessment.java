/*
    Programming for Computer Scientists (CS118) - Lab 5
    Classes and objects
*/

package lab5;

/**
* The Assessment class is used to represent assessments for a module.
*/
public class Assessment {
    int weight =0;
    int mark = 0;
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
    * Gets the weight of the assessment.
    */
    public int getWeight() {
        return this.weight;
    }


    /**
    * Sets the mark that was awarded.
    */
    public void setMark(int mark) {
        this.mark = mark;
    }

    /**
    * Gets the mark that was awarded.
    */
    public int getMark() {
        return this.mark; 
    }
}
