import { Component, OnInit, EventEmitter,Output } from '@angular/core';
import { Media } from '../model/product.model';


@Component({
  selector: 'medianew',
  templateUrl: './medianew.component.html',
  styleUrls: ['./medianew.component.css']
})
export class MedianewComponent implements OnInit {

  @Output()
    submit_info:EventEmitter<Media>;
  constructor() { 
    this.submit_info=new EventEmitter();
  }

  saveMediaDetails(txtfile:HTMLInputElement,txttitle:HTMLInputElement,txtcategory:HTMLInputElement,txtdesc:HTMLInputElement,txttags:HTMLInputElement){
    let mediadetail=new Media(txtfile.value,txttitle.value,txtcategory.value,txtdesc.value,txttags.value);
      this.submit_info.emit(mediadetail);

    txtfile.value="";
    txttitle.value="";
    txtcategory.value="";
    txtdesc.value="";
    txttags.value="";



}

  ngOnInit() {
  }

}
