import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddTravelComponent }   from './components/addtravel.component';
import { JobListComponent }   from './components/joblist.component';
import { AppComponent }   from './components/app.component';
const routes: Routes = [
  { path: '', redirectTo: '/joblist', pathMatch: 'full' },
  { path: 'addtravel',  component: AddTravelComponent },
  { path: 'joblist',  component: JobListComponent },
  { path: 'home',  component: AppComponent }
];
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class RoutingModule {}
