import { StudentService } from './../student.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-getallstudents',
  templateUrl: './getallstudents.component.html',
  styleUrls: ['./getallstudents.component.css']
})
export class GetallstudentsComponent implements OnInit {

  students : any;

  message : any;

  constructor(private service:StudentService ,private router:Router) { }

  ngOnInit(){
    this.getAllStudents();
    
  }
  getAllStudents() {
  this.service.getAllStudents().subscribe((data)=>this.students = data);
  }

  deleteStudent(id:number) {
    this.service.deleteStudent(id).subscribe(data=>this.students = data);
  }

  viewStudent(id:number) {
    this.router.navigate(['details',id]);
  }

  editStudent(id:number) {
    this.router.navigate(['update',id]);
  }

}
