import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http'

import { CountryService }  from './providers/country.service';
import { JobService }  from './providers/job.service';
import { AddTravelComponent }  from './components/addtravel.component';
import { JobListComponent }  from './components/joblist.component';
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
    JobListComponent
  ],
  providers: [
    CountryService,
    JobService
  ],
  bootstrap: [
   JobListComponent,
   AddTravelComponent
  ]
})
export class AppModule { }
