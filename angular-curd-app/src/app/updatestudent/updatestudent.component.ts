import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-updatestudent',
  templateUrl: './updatestudent.component.html',
  styleUrls: ['./updatestudent.component.css']
})
export class UpdatestudentComponent implements OnInit {

  id : number;

  student : any;

  message : any;

  constructor(private service:StudentService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];
    this.service.getStudent(this.id).subscribe(data=>this.student=data);
  }

  updateStudent() {
    this.service.updateStudent(this.student).subscribe(data=>this.message = data);
  }

}
