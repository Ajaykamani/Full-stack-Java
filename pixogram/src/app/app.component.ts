import { Component } from '@angular/core';
import { UserAuthService } from './services/authentication/user-auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(public auth:UserAuthService){

  }
  title = 'route-base2-app';
}
