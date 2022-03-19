package com.admin.adminDepartment;

import com.superClass.superdepartment.superDepartment;

public class AdminDepartment extends superDepartment{
	
	public String departmentName() {
		return "Admin Department";
	} 
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}  
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	} 
}
