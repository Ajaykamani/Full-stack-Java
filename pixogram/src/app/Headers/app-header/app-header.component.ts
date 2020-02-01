import { Component, OnInit } from '@angular/core';
import { UserAuthService } from 'src/app/services/authentication/user-auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './app-header.component.html',
  styleUrls: ['./app-header.component.css']
})
export class AppHeaderComponent implements OnInit {

  constructor(public auth:UserAuthService) { }

  ngOnInit() {
  }

}
