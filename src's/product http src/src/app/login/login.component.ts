import { Component, OnInit } from '@angular/core';
import { AuthenticateService } from '../services/authenticate.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  autherized: boolean;
  
  errorMessage: string;

  constructor(public authentication:AuthenticateService,public router:Router) { 

    this.errorMessage = "Invalid Credentials!!!";
    this.autherized = true;
  }


  checkLogin(txtlogin:HTMLInputElement,txtpassword:HTMLInputElement){
    if(this.authentication.authenticate(txtlogin.value, txtpassword.value)){
      // if user autherized navigate to product component
      this.autherized = true;
      this.router.navigate(['/productlist']);
  }else{
      this.autherized = false;
  }

    }
  
 
  ngOnInit() {
  }
}
