import { Routes } from '@angular/router';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

import { UserCreateComponent } from './components/create-user/create-user.component';
import { UpdateUserComponent } from './components/update-user/update-user.component';
import { UserListComponent } from './components/users-list/users-list.component';


export const routes: Routes = [
    { path: '', redirectTo: '/users-list', pathMatch: 'full' },
    { path: 'create-user', component: UserCreateComponent},
    {path:'update-user/userId',component:UpdateUserComponent},
    { path: 'users-list', component: UserListComponent},
 
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }