import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { ProductlistComponent } from './product/productlist/productlist.component';
import { ProductAddComponent } from './product/product-add/product-add.component';
import { ProductUpdateComponent } from './product/product-update/product-update.component';




const routes: Routes = [{path:"",redirectTo:"home",pathMatch:"full"},{path:"home",component:HomeComponent},{path:"aboutus",component:AboutComponent},{path:"contactus",component:ContactComponent},{path:"search/:searchtext",component:SearchComponent},{path:"login",component:LoginComponent},{path:"logout",component:LogoutComponent},{ path:"productlist", component: ProductlistComponent},{ path:"product-add", component: ProductAddComponent},{ path:"product-update/:productId", component: ProductUpdateComponent } ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
