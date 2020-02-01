import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './Authentication/login/login.component';
import { MymediaComponent } from './Media/mymedia/mymedia.component';
import { RegistrationPageComponent } from './Authentication/registration-page/registration-page.component';
import { UploadSingleMediaComponent } from './Media/upload-single-media/upload-single-media.component';
import { UploadMultipleMediaComponent } from './Media/upload-multiple-media/upload-multiple-media.component';
import { MediaDetailComponent } from './Media/media-detail/media-detail.component';
import { FollowersFollowingComponent } from './Followers_Following/followers-following/followers-following.component';
import { AccountDetailsComponent } from './Account/account-details/account-details.component';
import { ActivityNewsfeedComponent } from './Account/activity-newsfeed/activity-newsfeed.component';
import { BlockedUserComponent } from './Account/blocked-user/blocked-user.component';
import { SearchComponent } from './Account/search/search.component';
import { AuthGuardService } from './services/authentication/auth-guard.service';


const routes: Routes = [{path:"" ,redirectTo:"login",pathMatch:"full"},
{path:"login" , component:LoginComponent},
{path:"media",component:MymediaComponent, canActivate : [AuthGuardService]},
{path:"register", component:RegistrationPageComponent, canActivate : [AuthGuardService]},
{path:"singlemedia",component:UploadSingleMediaComponent,canActivate : [AuthGuardService]},
{path:"multiplemedia",component:UploadMultipleMediaComponent},
{path:"mediadetail",component:MediaDetailComponent,canActivate : [AuthGuardService]},
{path:"followers/following",component:FollowersFollowingComponent,canActivate : [AuthGuardService]},
{path:"acountdeatils",component:AccountDetailsComponent,canActivate : [AuthGuardService]},
{path:"activitynewsfeed",component:ActivityNewsfeedComponent,canActivate : [AuthGuardService]},
{path:"blockeduser",component:BlockedUserComponent,canActivate : [AuthGuardService]},
{path:"search",component:SearchComponent,canActivate : [AuthGuardService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 



  
}
