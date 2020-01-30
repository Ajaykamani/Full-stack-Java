import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticateService {

  constructor() { }
     authenticate(userid:string,password:string):boolean{

      if(userid==="First"&&password==="abc"){
        sessionStorage.setItem("user",userid);
        return true;
      }
      else{
        return false;
      }
    }
        isUserLoggedIn():boolean {

          let user=sessionStorage.getItem('user');
          if(user==null)
            return false;
          return true;
}
logout(){
  sessionStorage.removeItem('user');
}
getUserDeatils():string{
  let user=sessionStorage.getItem('user');
  return user;
}





}
