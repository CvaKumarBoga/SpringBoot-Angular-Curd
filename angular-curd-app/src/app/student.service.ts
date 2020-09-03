import { Student } from './createstudent/student';
import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl : String="http://localhost:2021/backend/student";

  constructor(private http:HttpClient) { }

  public getAllStudents() {
    return this.http.get(`${this.baseUrl}/allstudents`);
  }

  public deleteStudent(id:number) {
    return this.http.delete(`${this.baseUrl}/delete/${id}`)
  }

  public createStudent(student:Student) { 
    return this.http.post(`${this.baseUrl}/create`,student,{responseType:'text' as 'json'})

  }

  public updateStudent(student:Student) {
    return this.http.put(`${this.baseUrl}/update`,student,{responseType : 'text' as 'json'});
  }

  public getStudent(id:number) {
    return this.http.get(`${this.baseUrl}/view/${id}`);
  }

}
