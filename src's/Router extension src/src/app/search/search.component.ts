import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
    searchData :string;
  constructor(public activatedRoute:ActivatedRoute) {

    this.activatedRoute.params.subscribe((parameter) =>this.searchData=parameter["searchtext"]);
   }

  ngOnInit() {
  }

}
