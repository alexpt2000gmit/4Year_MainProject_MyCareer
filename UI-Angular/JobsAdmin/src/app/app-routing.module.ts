import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NotauthorizedComponent } from './core/not-authorized.component';
import { PageNotFoundComponent } from './core/page-not-found.component';
import { DashboardComponent } from 'app/dashboard/dashboard.component';

const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'not-authorized', component: NotauthorizedComponent },
  { path: 'page-not-found', component: PageNotFoundComponent },
  { path: '**', redirectTo: 'page-not-found' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }


