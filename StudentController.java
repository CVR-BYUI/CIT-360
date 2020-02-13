/**
 * Student Controller
 * @author Chris Van Ry (example from multiple sources, slightly altered)
 *
 */

public class StudentController  
{ 
    private Student model; 
    private StudentView view;
    
    /** StudentController constructor
	 * Purpose: Create a Student
	 * @param model, view
	 * @return model, view
	 */
    public StudentController(Student model, StudentView view) 
    { 
        this.model = model; 
        this.view = view; 
    } 
  
    /** setStudentName method
	 * Purpose: setter
	 * @param name
	 * @return void
	 */
    public void setStudentName(String name) 
    { 
        model.setName(name);         
    } 
    
    /** getStudentName method
	 * Purpose: getter
	 * @param void
	 * @return model.getName()
	 */
    public String getStudentName() 
    { 
        return model.getName();         
    } 
    
    /** setStudentCourseName method
	 * Purpose: setter
	 * @param courseName
	 * @return void
	 */
    public void setStudentCourseName(String courseName) 
    { 
        model.setCourseName(courseName);         
    } 
    
    /** getStudentCourseName method
	 * Purpose: getter
	 * @param void
	 * @return model.getCourseName()
	 */
    public String getStudentCourseName() 
    { 
        return model.getCourseName();         
    } 
  
    /** updateView method
	 * Purpose: update view with data from model
	 * @param void
	 * @return void
	 */
    public void updateView() 
    {                 
        view.printStudentDetails(model.getName(), model.getCourseName()); 
    } 
    
} // End of StudentController class