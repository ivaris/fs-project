import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http'

import { CountryService }  from './providers/country.service';
import { JobService }  from './providers/job.service';
import { AddTravelComponent }  from './components/addtravel.component';
import { JobListComponent }  from './components/joblist.component';
import { AppComponent }  from './components/app.component';
import { RoutingModule }     from './routing.module';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RoutingModule
  ],
  declarations: [
    AddTravelComponent,
    JobListComponent,
    AppComponent
  ],
  providers: [
    CountryService,
    JobService
  ],
  bootstrap: [
    AppComponent,
  ]
})
export class AppModule { }
