import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'classevents',
  templateUrl: './classevents.component.html',
  styleUrls: ['./classevents.component.css']
})
export class ClasseventsComponent {
      name:String;
      age:number;
      email:String;
      job:String;
      hobbies: string[]=["cricket","watching movies","reading"];

      

      constructor() { 
          this.name="First";
          this.age=20;
          this.email="first@gmail.com";
          this.job="Manager";
      }
    
          changeIn():void{
            this.name="second";
            this.age=15;
            this.email="second@gmail.com";
            this.job="developer";
          }



}



 
      


