import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaComponent } from './media/media.component';
import { MedialistComponent } from './medialist/medialist.component';
import { MedianewComponent } from './medianew/medianew.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaComponent,
    MedialistComponent,
    MedianewComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
