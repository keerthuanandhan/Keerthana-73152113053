import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';
import { subscribe } from 'diagnostics_channel';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService 
{
  url:string;


  constructor(private http:HttpClient) { 
    this.url="http://localhost:3004/employees";
  }
  insertEmployee(employee:Employee){
      this.http.post(this.url,employee).subscribe();
      return "Employee Details Added";
  }
}
