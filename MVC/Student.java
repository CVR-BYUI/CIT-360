/**
 * Student Model
 * @author Chris Van Ry (example from multiple sources, slightly altered)
 *
 */

public class Student  
{ 
    private String courseName; 
    private String name; 
    
    /** getCourseName method
	 * Purpose: getter
	 * @param void
	 * @return courseName
	 */
    public String getCourseName()  
    { 
        return courseName; 
    } 
    
    /** setCourseName method
	 * Purpose: setter
	 * @param void
	 * @return courseName
	 */
    public void setCourseName(String courseName)  
    { 
        this.courseName = courseName; 
    } 
    
    /** getName method
	 * Purpose: getter
	 * @param void
	 * @return name
	 */
    public String getName()  
    { 
        return name; 
    } 
    
    /** setName method
	 * Purpose: setter
	 * @param void
	 * @return name
	 */
    public void setName(String name)  
    { 
        this.name = name; 
    }
    
} // End of Student class