import { Component, OnInit } from '@angular/core';
import { MediadataService } from '../services/mediadata.service';
import { Router } from '@angular/router';
import { Media } from '../model/media.model';

@Component({
  selector: 'app-media-add',
  templateUrl: './media-add.component.html',
  styleUrls: ['./media-add.component.css']
})
export class MediaAddComponent implements OnInit {

  constructor(public mediadetails:MediadataService,public router:Router) {

   }

   addMedia(txtName: HTMLInputElement, txttitle: HTMLInputElement, txtCategory: HTMLInputElement, txtdesc: HTMLInputElement, txttags: HTMLInputElement):void{

     let media1=new Media(txtName.value,txttitle.value,txtCategory.value,txtdesc.value,txttags.value);

     this.mediadetails.addNewMedia(media1).subscribe(
      (response) => {
        console.log(response);
        // navigate to product-list
        this.router.navigate(['/medialist/']);
      });


    // reset the form
    txtName.value = "";
    txttitle.value="";
    txtCategory.value = "";
    txtdesc.value="";
    txttags.value = "";

    
}

  ngOnInit() {
  }

}
