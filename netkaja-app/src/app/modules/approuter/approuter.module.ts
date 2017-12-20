import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginViewComponent } from '../../components/login-view/login-view.component';
import { FoodViewComponent } from '../../components/food-view/food-view.component';
import { UserViewComponent } from '../../components/user-view/user-view.component';
import { RegiViewComponent } from '../../components/regi-view/regi-view.component';
import { DelUserViewComponent } from '../../components/del-user-view/del-user-view.component';
import { DelFoodViewComponent } from '../../components/del-food-view/del-food-view.component';
import { EditFoodViewComponent } from '../../components/edit-food-view/edit-food-view.component';
import { AddFoodViewComponent } from '../../components/add-food-view/add-food-view.component';
import { DelOrderViewComponent } from '../../components/del-order-view/del-order-view.component';
import { EditOrderViewComponent } from '../../components/edit-order-view/edit-order-view.component';
import { AddOrderViewComponent } from '../../components/add-order-view/add-order-view.component';
import { DataViewComponent } from '../../components/data-view/data-view.component';

import { RouteGuardService } from '../../services/route-guard.service';
import { UserService } from '../../services/user.service';

const appRoutes: Routes = [
  {path: '', canActivateChild: [RouteGuardService], children: [
    { path: 'food', component: FoodViewComponent },
    { path: 'login', component: LoginViewComponent },
    { path: 'user/:id', component: UserViewComponent, data: { roles: ['USER', 'ADMIN'] } },
    { path: 'regi', component: RegiViewComponent },
    { path: 'admin/users', component: DelUserViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/orders', component: DelOrderViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/orders', component: EditOrderViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/orders', component: AddOrderViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/food', component: DelFoodViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/food', component: EditFoodViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'admin/food', component: AddFoodViewComponent, data: { roles: ['ADMIN'] } },
    { path: 'data/:id', component: DataViewComponent, data: { roles: ['USER', 'ADMIN'] } },
  ]}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ],
  declarations: [],
  providers: [RouteGuardService, UserService]
})
export class AppRouterModule { }