import { Component } from '@angular/core';
// import { Employee } from './model/Employee';

import { EmployeeService } from './employee.service';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee: Employee;
  result:string;


constructor(private service:EmployeeService){
  this.employee=new Employee();
  this.result="";
}
insertEmployee(data:any){
  this.employee.id=data.empId;
  this.employee.empName=data.empName;
  this.employee.empSalary=data.empSalary;
  //this.service.insertEmployee(this.employee);
  this.result=this.service.insertEmployee(this.employee);
  //alert(data.id+" "+data.empName+" "+data.empSalary);
}
}
