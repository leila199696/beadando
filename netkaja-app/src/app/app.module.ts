import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import {
  MatToolbarModule,
  MatButtonModule,
  MatIconModule,
  MatMenuModule,
  MatListModule,
  MatTableModule,
  MatProgressSpinnerModule,
  // News
  MatFormFieldModule,
  MatInputModule,
  MatButtonToggleModule,
  MatChipsModule,
  MatCardModule,
  MatSelectModule
} from '@angular/material'
import { FlexLayoutModule } from '@angular/flex-layout';
import { RoutingModule } from './routing/routing.module'; 
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AuthService } from './services/auth/auth.service'; 

import { AppComponent } from './app.component';
import { LoginViewComponent } from './components/login-view/login-view.component';
import { NaviComponent } from './components/navi/navi.component';
import { FoodComponent } from './components/food/food.component';
import { LoginComponent } from './components/login/login.component';
import { OrderComponent } from './components/order/order.component';
import { RegiComponent } from './components/regi/regi.component';
import { DataComponent } from './components/data/data.component';
import { EditUserComponent } from './components/edit-user/edit-user.component';
import { UserComponent } from './components/user/user.component';
import { UserViewComponent } from './components/user-view/user-view.component';
import { AddFoodComponent } from './components/add-food/add-food.component';
import { FoodRowComponent } from './components/food-row/food-row.component';
import { FoodCellComponent } from './components/food-cell/food-cell.component';
import { MyOrdersComponent } from './components/my-orders/my-orders.component';
import { AddOrdersComponent } from './components/add-orders/add-orders.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginViewComponent,
    NaviComponent,
    FoodComponent,
    LoginComponent,
    OrderComponent,
    RegiComponent,
    DataComponent,
    UserComponent,
    EditUserComponent,
    UserViewComponent,
    AddFoodComponent,
    FoodRowComponent,
    FoodCellComponent,
    MyOrdersComponent,
    AddOrdersComponent

  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatMenuModule,

    // news
    MatFormFieldModule,
    MatInputModule,
    MatButtonToggleModule, 
    MatChipsModule,
    MatCardModule,
    MatSelectModule,
    HttpClientModule,
    //
    FlexLayoutModule,
    RoutingModule,
    // News
    FormsModule
  ],
  exports: [MatButtonModule, MatInputModule, MatListModule, MatToolbarModule, MatCardModule, MatIconModule, MatProgressSpinnerModule, MatMenuModule, MatTableModule, MatSelectModule
  ],
  providers: [AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }