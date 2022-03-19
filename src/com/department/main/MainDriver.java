package com.department.main;

import com.admin.adminDepartment.AdminDepartment;
import com.hrClass.hrDepartment.HrDepartment;
import com.tech.techDepartment.TechDepartment;

public class MainDriver {

	public static void main(String[] arg) {
		AdminDepartment ad=new AdminDepartment();
		HrDepartment hrd=new HrDepartment();
		TechDepartment td=new TechDepartment();
		
		//Admin Department 
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println("");
		
		//Hr Department
		System.out.println("Welcome to "+hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
	    System.out.println(hrd.isTodayAHoliday());
	    
	    System.out.println("");
	    
	    //Tech Department
	    System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}
