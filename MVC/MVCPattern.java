/**
 * MVCPattern - Main class 
 * @author Chris Van Ry (example from multiple sources, slightly altered)
 *
 */

public class MVCPattern  
{ 
    public static void main(String[] args)  
    { 
    	// Retrieve data from model
        Student model  = retrieveStudentFromDatabase(); 
  
        // Displays user data from controller
        StudentView view = new StudentView(); 
        
        // Retrieves user data from controller and provides it to view
        StudentController controller = new StudentController(model, view); 
        controller.updateView(); 
  
    } // End of main method
    
    /** retrieveStudentFromDatabase method
	 * Purpose: Create new student object with provided data
	 * @param void
	 * @return student
	 */
    private static Student retrieveStudentFromDatabase() 
    { 
        Student student = new Student(); 
        student.setName("Chris Van Ry"); 
        student.setCourseName("CIT 360"); 
        return student; 
    } 
      
} // End of MVCPattern class