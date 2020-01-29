import { Injectable } from '@angular/core';
import { AuthenticateService } from './authenticate.service';
import { Router, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService {

  constructor(public auth : AuthenticateService, public router : Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {

      // check from authentication service is user is logged in
      if(this.auth.isUserLoggedIn())
          return true;
      else{
        // navigate to login component
        this.router.navigate(['/login']);
        return false;
      }    
          
  }

}