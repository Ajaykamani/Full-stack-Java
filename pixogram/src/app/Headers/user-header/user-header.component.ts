import { Component, OnInit } from '@angular/core';
import { UserAuthService } from 'src/app/services/authentication/user-auth.service';

@Component({
  selector: 'user-header',
  templateUrl: './user-header.component.html',
  styleUrls: ['./user-header.component.css']
})
export class UserHeaderComponent implements OnInit {

  constructor(public auth:UserAuthService) { }

  ngOnInit() {
  }

}
