import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { LoginViewComponent } from './login-view/login-view.component';
import { NaviViewComponent } from './navi-view/navi-view.component';
import { DataViewComponent } from './data-view/data-view.component';
import { RegiViewComponent } from './regi-view/regi-view.component';
import { CustomersViewComponent } from './customers-view/customers-view.component';
import { AllergensViewComponent } from './allergens-view/allergens-view.component';
import { OrdersViewComponent } from './orders-view/orders-view.component';
import { AllOrdersViewComponent } from './all-orders-view/all-orders-view.component';
import { FoodViewComponent } from './food-view/food-view.component';
import { DelDataViewComponent } from './del-data-view/del-data-view.component';
import { DelOrdersViewComponent } from './del-orders-view/del-orders-view.component';
import { LoginComponent } from './login/login.component';
import { AddOrdersComponent } from './add-orders/add-orders.component';
import { ListOrdersComponent } from './list-orders/list-orders.component';
import { OrdersComponent } from './orders/orders.component';
import { RegiComponent } from './regi/regi.component';
import { DataComponent } from './data/data.component';
import { EditDataComponent } from './edit-data/edit-data.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginViewComponent,
    NaviViewComponent,
    DataViewComponent,
    RegiViewComponent,
    CustomersViewComponent,
    AllergensViewComponent,
    OrdersViewComponent,
    AllOrdersViewComponent,
    FoodViewComponent,
    DelDataViewComponent,
    DelOrdersViewComponent,
    LoginComponent,
    AddOrdersComponent,
    ListOrdersComponent,
    OrdersComponent,
    RegiComponent,
    DataComponent,
    EditDataComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
