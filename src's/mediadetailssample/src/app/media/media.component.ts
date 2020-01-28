import { Component, OnInit } from '@angular/core';
import { Media } from '../model/product.model';

@Component({
  selector: 'media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {
      mediafile:Array <Media>;
  constructor() {
  
    this.mediafile=[new Media("image1"," hotel","lunch"," friends trip daries","@ram"),
    new Media("image2","palace","tour","bangalore palace trip","@sam")];
  }

    saveMediaDetails(txtfile:HTMLInputElement,txttitle:HTMLInputElement,txtcategory:HTMLInputElement,txtdesc:HTMLInputElement,txttags:HTMLInputElement){
        let mediadetail=new Media(txtfile.value,txttitle.value,txtcategory.value,txtdesc.value,txttags.value);
        this.mediafile.push(mediadetail);

        txtfile.value="";
        txttitle.value="";
        txtcategory.value="";
        txtdesc.value="";
        txttags.value="";
  


   }

  ngOnInit() {
  }

}
