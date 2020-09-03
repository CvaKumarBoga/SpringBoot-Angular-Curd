import { Component, OnInit } from '@angular/core';
import { Student } from '../createstudent/student';
import { StudentService } from '../student.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-student',
  templateUrl: './view-student.component.html',
  styleUrls: ['./view-student.component.css']
})
export class ViewStudentComponent implements OnInit {

  student : any;
  id : number;

  constructor(private service:StudentService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {

    

    this.id = this.route.snapshot.params['id']

    this.service.getStudent(this.id).subscribe(data=>this.student = data);
  }
}
