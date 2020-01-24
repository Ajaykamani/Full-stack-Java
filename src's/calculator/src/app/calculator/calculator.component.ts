import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  val1:number;
  val2:number;
  result:number;
 
      add(v1:HTMLInputElement,v2:HTMLInputElement){
        this.val1=parseInt(v1.value);
        this.val2=parseInt(v2.value);
          this.result=this.val1+this.val2;
          v1.value="";
          v2.value="";
          console.log(this.result);
          
        }
        sub(v1:HTMLInputElement,v2:HTMLInputElement){
          this.val1=parseInt(v1.value);
          this.val2=parseInt(v2.value);
            this.result=this.val1-this.val2;
            
          }
          mul(v1:HTMLInputElement,v2:HTMLInputElement){
            this.val1=parseInt(v1.value);
            this.val2=parseInt(v2.value);
              this.result=this.val1*this.val2;
              
            }
            div(v1:HTMLInputElement,v2:HTMLInputElement){
              this.val1=parseInt(v1.value);
              this.val2=parseInt(v2.value);
              this.result=this.val1/this.val2;
                 
              }

 

  ngOnInit() {
  }

}
