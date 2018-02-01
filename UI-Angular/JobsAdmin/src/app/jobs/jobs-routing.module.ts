import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

import { AuthGuard } from './../security/auth.guard';
import { JobsSearchComponent } from 'app/jobs/jobs-search/jobs-search.component';

const routes: Routes = [
  {
    path: 'jobs',
    component: JobsSearchComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_READ_JOB'] }
  },
  {
    path: 'jobs/newjob',
    component: JobsSearchComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_ADD_JOB'] }
  },
  {
    path: 'jobs/:code',
    component: JobsSearchComponent,
    canActivate: [AuthGuard],
    data: { roles: ['ROLE_ADD_JOB'] }
  }
];


@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class JobsRoutingModule { }
