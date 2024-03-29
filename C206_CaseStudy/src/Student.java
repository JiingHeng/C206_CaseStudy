/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Tay Hao Wen
 * Student ID: 20042303
 * Class: E37C
 * Date/Time created: Thursday 05-08-2021 11:31
 */

public class Student {
	private String name;
	private int studentID;
	private String gradeClass;
	private String teacher;
	private String parentName;
	private String parentEmail;
	private int parentContactNo;
	private String CCA;
	
	public Student(String name, int studentID, String gradeClass, String teacher, String parentName, 
			String parentEmail, int parentContactNo) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.gradeClass = gradeClass;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.parentContactNo = parentContactNo;
	}
	
	public Student(String name, int studentID, String gradeClass, String teacher) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.gradeClass = gradeClass;
		this.teacher = teacher;
	}
	        
    public Student(String name, int studentID, String gradeClass,String teacher, String CCA) {
        super();
        this.name = name;
        this.studentID = studentID;
        this.gradeClass = gradeClass;
        this.CCA = CCA;
        this.teacher = teacher;
    }
    
    public String getCCA() {
        return CCA;
    }
    
    public void setCCA(String cCA) {
        CCA = cCA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    } 

    public String getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(String gradeClass) {
        this.gradeClass = gradeClass;
    }
 
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }
 
    public int getParentContactNo() {
        return parentContactNo;
    }

    public void setParentContactNo(int parentContactNo) {
        this.parentContactNo = parentContactNo;
    }
}
