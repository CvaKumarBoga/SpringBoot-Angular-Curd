import { StudentService } from './../student.service';
import { Component, OnInit } from '@angular/core';
import { Student } from './student';

@Component({
  selector: 'app-createstudent',
  templateUrl: './createstudent.component.html',
  styleUrls: ['./createstudent.component.css']
})
export class CreatestudentComponent implements OnInit {

  student : Student = new Student();
  message : any;

  constructor(private service:StudentService) { }

  ngOnInit(): void {
  }
  createStudent(){
    this.service.createStudent(this.student).subscribe((data)=> this.message = data);
       
  }

}
