import { Component, OnInit } from '@angular/core';
import { UserAuthService } from 'src/app/services/authentication/user-auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  errorMessage: string;
  autherized: boolean;

  constructor(public auth : UserAuthService, public router : Router) { 
    
    this.autherized = true;
}


  checkUser(txtemail : HTMLInputElement, txtpassword : HTMLInputElement){
    
    if(this.auth.authenticate(txtemail.value, txtpassword.value)){
       console.log("hello");
        this.autherized = true;
        this.router.navigateByUrl('/media');
    }else{
        this.autherized = false;
        this.errorMessage = "Invalid Credentials!!!";
    }
  }

  ngOnInit() {
  }

}