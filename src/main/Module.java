/*
    Programming for Computer Scientists (CS118) - Lab 5
    Classes and objects
*/

package lab5;

/**
* Represents a module.
*/
public class Module {
    private String moduleCode;
    private String moduleName;
    private DynamicAssessmentArray assessments;
    /**
    * Initialises a new module.
    */
    public Module(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        assessments = new DynamicAssessmentArray(1);
    }

    /**
    * Gets the module code for this module.
    */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
    * Gets the name of the module.
    */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
    * Adds an asssessment to this module. This method returns true if the
    * assessment has successfully been added or false if not. An assessment
    * is not added to the module if it would push the sum of the module's
    * assessment weights above 100.
    */
    public boolean addAssessment(Assessment assessment) {
        return false; // TODO: not implemented
    }

    /**
    * Calculates the overall, weighted average for this module.
    */
    public int calculateOverallMark() {
        return 0; // TODO: not implemented
    }
}
