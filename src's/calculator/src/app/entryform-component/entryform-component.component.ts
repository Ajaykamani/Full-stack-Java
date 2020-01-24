import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'entryform-component',
  templateUrl: './entryform-component.component.html',
  styleUrls: ['./entryform-component.component.css']
})
export class EntryformComponentComponent  {                                                                                                                                                                                                                 name:String;
            email:String;
            age:number;

        saveData(uname:HTMLInputElement,email1:HTMLInputElement,age1:HTMLInputElement){
              this.name=uname.value;
              this.email=email1.value;
              this.age=Number(age1.value);
        
        }
 
  }


