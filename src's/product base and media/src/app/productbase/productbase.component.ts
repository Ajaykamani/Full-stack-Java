import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-productbase',
  templateUrl: './productbase.component.html',
  styleUrls: ['./productbase.component.css']
})
export class ProductbaseComponent implements OnInit {
        products:Array<product>;
  constructor() { 
    //initialize with dummy data
    this.products=[new Product("First"," books",100),new Product("second","electronics",50),new this.product("third","stationary",60)];
  }
                                                             

  ngOnInit() {
  }

}
