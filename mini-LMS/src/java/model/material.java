package model;




public class material {
    
     private int id;
    private String name;
    private String type;    
    private int instructorId;
    private String courseCode;
  
    





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public material(int id, String name,String type,int instructorId,String courseCode )
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.instructorId = instructorId;
        this.courseCode = courseCode;
        
    }
    
    
}
