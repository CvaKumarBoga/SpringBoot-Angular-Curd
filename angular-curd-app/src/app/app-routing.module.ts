import { ViewStudentComponent } from './view-student/view-student.component';
import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreatestudentComponent } from './createstudent/createstudent.component';
import { GetallstudentsComponent } from './getallstudents/getallstudents.component';
import { UpdatestudentComponent } from './updatestudent/updatestudent.component';

const routes: Routes = [
  {path:'',redirectTo:'create',pathMatch:'full'}, 
  {path:'create',component:CreatestudentComponent},
  {path:'allstudents',component:GetallstudentsComponent},
  {path:'update/:id',component:UpdatestudentComponent},
  {path:'delete',component:GetallstudentsComponent},
  {path:'details/:id',component:ViewStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
