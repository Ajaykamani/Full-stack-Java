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

    addNewMedia(mediadetail:Media){
        this.mediafile.push(mediadetail);
    }

  ngOnInit() {
  }

}
