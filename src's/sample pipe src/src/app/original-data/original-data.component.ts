import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'original-data',
  templateUrl: './original-data.component.html',
  styleUrls: ['./original-data.component.css']
})
export class OriginalDataComponent implements OnInit {
      txt:string;
  constructor() { 

    this.txt="helo"
  }
      /*checkData(txtinput:HTMLInputElement){
          this.txt=txtinput.value;
      } */
  ngOnInit() {
  }

}
