import { StudentService } from './student.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreatestudentComponent } from './createstudent/createstudent.component';
import { UpdatestudentComponent } from './updatestudent/updatestudent.component';
import { GetallstudentsComponent } from './getallstudents/getallstudents.component';
import { ViewStudentComponent } from './view-student/view-student.component';

@NgModule({
  declarations: [
    AppComponent,
    CreatestudentComponent,
    UpdatestudentComponent,
    GetallstudentsComponent,
    ViewStudentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    StudentService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
