import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes }   from '@angular/router';

import { AppComponent } from '../app.component';

import { LoginViewComponent } from '../components/login-view/login-view.component';
import { RegiComponent } from '../components/regi/regi.component';
import {FoodComponent} from '../components/food/food.component';
import {AddFoodComponent} from '../components/add-food/add-food.component';
import {OrderComponent} from '../components/order/order.component';
import {AddOrdersComponent} from '../components/add-orders/add-orders.component';
import {MyOrdersComponent} from '../components/my-orders/my-orders.component';
import {UserComponent} from '../components/user/user.component';
import { AuthGuard } from '../auth.guard';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/food',
    pathMatch: 'full'
  },
  {
    path: 'food',
    component: FoodComponent
  },

  {
    path: 'login',
    component: LoginViewComponent
  },

  {
    path: 'regi',
    component: RegiComponent
  },

  {
    path: 'order',
    component: OrderComponent,
    canActivate: [AuthGuard],
    data: {roles: ['USER']}
  },

  {
    path: 'add-food',
    component: AddFoodComponent,
    canActivate: [AuthGuard],
    data: {roles: ['ADMIN']}
  },

  {
    path: 'add-order',
    component: AddOrdersComponent,
    canActivate: [AuthGuard],
    data: {roles: ['ADMIN']}
  },

  {
    path: 'my-orders',
    component: MyOrdersComponent,
    canActivate: [AuthGuard],
    data: {roles: ['USER']}
  },

  {
    path: 'user',
    component: UserComponent,
    canActivate: [AuthGuard],
    data: {roles: ['USER']}
  },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
  declarations: []
})
export class RoutingModule { }