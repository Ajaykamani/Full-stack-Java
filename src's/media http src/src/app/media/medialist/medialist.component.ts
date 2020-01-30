import { Component, OnInit } from '@angular/core';
import { Media } from 'src/app/model/media.model';
import { Router } from '@angular/router';
import { MediadataService } from 'src/app/services/mediadata.service';

@Component({
  selector: 'app-medialist',
  templateUrl: './medialist.component.html',
  styleUrls: ['./medialist.component.css']
})
export class MedialistComponent implements OnInit {
        medialist:Array<Media>;
  
  constructor(private mediadetail : MediadataService,public router:Router) { }


  add(){

    this.router.navigate(['/mediaadd/']);
  }


  ngOnInit() {
    this.mediadetail.getAllMedia().subscribe((response:any) => this.medialist = response);
  }

}
