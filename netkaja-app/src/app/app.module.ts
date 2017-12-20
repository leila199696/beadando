import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { NgModule } from '@angular/core';

import { 
MatButtonModule, 
MatInputModule, 
MatListModule, 
MatToolbarModule, 
MatCardModule, 
MatIconModule, 
MatProgressSpinnerModule, 
MatMenuModule,  
MatTableModule,
 MatSelectModule 
} from '@angular/material';


import { AppComponent } from './app.component';
import { LoginViewComponent } from './components/login-view/login-view.component';
import { NaviViewComponent } from './components/navi-view/navi-view.component';
import { DataViewComponent } from './components/data-view/data-view.component';
import { RegiViewComponent } from './components/regi-view/regi-view.component';
import { OrdersViewComponent } from './components/orders-view/orders-view.component';
import { FoodViewComponent } from './components/food-view/food-view.component';
import { DelUserViewComponent } from './components/del-user-view/del-user-view.component';
import { LoginComponent } from './components/login/login.component';
import { AddOrderViewComponent } from './components/add-order-view/add-order-view.component';
import { ListOrdersComponent } from './components/list-orders/list-orders.component';
import { OrdersComponent } from './components/orders/orders.component';
import { RegiComponent } from './components/regi/regi.component';
import { DataComponent } from './components/data/data.component';
import { EditUserComponent } from './components/edit-user/edit-user.component';
import { UserComponent } from './components/user/user.component';
import { UserViewComponent } from './components/user-view/user-view.component';
import { DelFoodViewComponent } from './components/del-food-view/del-food-view.component';
import { DelOrderViewComponent } from './components/del-order-view/del-order-view.component';
import { EditOrderViewComponent } from './components/edit-order-view/edit-order-view.component';
import { EditFoodViewComponent } from './components/edit-food-view/edit-food-view.component';
import { AddFoodViewComponent } from './components/add-food-view/add-food-view.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginViewComponent,
    NaviViewComponent,
    DataViewComponent,
    RegiViewComponent,
    OrdersViewComponent,
    FoodViewComponent,
    LoginComponent,
    ListOrdersComponent,
    OrdersComponent,
    RegiComponent,
    DataComponent,
    UserComponent,
    EditUserComponent,
    UserViewComponent,
    AddOrderViewComponent,
    DelUserViewComponent,
    DelFoodViewComponent,
    DelOrderViewComponent,
    EditOrderViewComponent,
    EditFoodViewComponent,
    AddFoodViewComponent
  ],
  imports: [
    BrowserModule,
	BrowserAnimationsModule, 
	MatButtonModule, 
	MatInputModule, 
	MatListModule, 
	MatToolbarModule, 
	MatCardModule, 
	MatIconModule, 
	MatProgressSpinnerModule, 
	MatMenuModule, 
	MatTableModule, 
	MatSelectModule
	],
  exports: [MatButtonModule, MatInputModule, MatListModule, MatToolbarModule, MatCardModule, MatIconModule, MatProgressSpinnerModule, MatMenuModule, MatTableModule, MatSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }