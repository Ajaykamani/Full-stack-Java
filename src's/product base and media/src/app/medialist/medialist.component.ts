import { Component, OnInit, Input } from '@angular/core';
import { Media } from '../model/product.model';

@Component({
  selector: 'app-medialist',
  templateUrl: './medialist.component.html',
  styleUrls: ['./medialist.component.css']
})
export class MedialistComponent implements OnInit {
      @Input()
      medialist:Array <Media>;
  constructor() { }

  ngOnInit() {
  }

}
