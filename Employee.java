import java.util.*;
class Employee{
	public static void main(String[] args) {
		
      EmployeeInfo [] emp = new EmployeeInfo[5];

      emp[0] = new EmployeeInfo(1234,"kajal",50000,"devloper");
      emp[1] = new EmployeeInfo(1236,"srushti",40000,"trainer");
      emp[2] = new EmployeeInfo(1238,"atharv",60000,"testing");
      emp[3] = new EmployeeInfo(1232,"tanvi",70000,"HR");
      emp[4] = new EmployeeInfo(1231,"sanika",30000,"manager");
      

      for(EmployeeInfo el :emp){
      	System.out.println(el);
      }
		

	}

class EmployeeInfo{
	int id;
	String name;
	double salary;
	String department;


 EmployeeInfo (int id,String name,double salary,String department){

 	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=department;

}


	public static void displayEmployeeInfo(){

    System.out.println("id"+id);
    System.out.println("name:"+name);
    System.out.println("salary"+salary);
    System.out.println("department"+department);
}



	}

}