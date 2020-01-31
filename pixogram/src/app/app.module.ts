import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AppHeaderComponent } from './Headers/app-header/app-header.component';
import { UserHeaderComponent } from './Headers/user-header/user-header.component';
import { LoginComponent } from './Authentication/login/login.component';
import { RegistrationPageComponent } from './Authentication/registration-page/registration-page.component';
import { MymediaComponent } from './Media/mymedia/mymedia.component';
import { UploadSingleMediaComponent } from './Media/upload-single-media/upload-single-media.component';
import { UploadMultipleMediaComponent } from './Media/upload-multiple-media/upload-multiple-media.component';
import { MediaDetailComponent } from './Media/media-detail/media-detail.component';
import { FollowersFollowingComponent } from './Followers_Following/followers-following/followers-following.component';
import { ActivityNewsfeedComponent } from './Account/activity-newsfeed/activity-newsfeed.component';
import { BlockedUserComponent } from './Account/blocked-user/blocked-user.component';
import { AccountDetailsComponent } from './Account/account-details/account-details.component';
import { SearchComponent } from './Account/search/search.component';

@NgModule({
  declarations: [
    AppComponent,
    AppHeaderComponent,
    UserHeaderComponent,
    LoginComponent,
    RegistrationPageComponent,
    MymediaComponent,
    UploadSingleMediaComponent,
    UploadMultipleMediaComponent,
    MediaDetailComponent,
    FollowersFollowingComponent,
    ActivityNewsfeedComponent,
    BlockedUserComponent,
    AccountDetailsComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
