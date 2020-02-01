import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { UserAuthService } from './user-auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService {

  constructor(public auth : UserAuthService, public router : Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {

      
      if(this.auth.isUserLoggedIn()){
        return true;
      }
          
      else{
       // this.router.navigate(['/login']);
        return false;
      }    
          
  }
}