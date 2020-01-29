import { Component, OnInit } from '@angular/core';
import { AuthenticateService } from '../services/authenticate.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(public auth : AuthenticateService) { }

  ngOnInit() {
  }

}
