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
import { FoodComponent } from './components/food/food.component';
import { LoginComponent } from './components/login/login.component';
import { OrdersComponent } from './components/orders/orders.component';
import { RegiComponent } from './components/regi/regi.component';
import { DataComponent } from './components/data/data.component';
import { EditUserComponent } from './components/edit-user/edit-user.component';
import { UserComponent } from './components/user/user.component';
import { UserViewComponent } from './components/user-view/user-view.component';
import { AddFoodComponent } from './components/add-food/add-food.component';
import { FoodRowComponent } from './components/food-row/food-row.component';
import { FoodService } from './services/food/food.service';


@NgModule({
  declarations: [
    AppComponent,
    LoginViewComponent,
    NaviViewComponent,
    FoodComponent,
    LoginComponent,
    OrdersComponent,
    RegiComponent,
    DataComponent,
    UserComponent,
    EditUserComponent,
    UserViewComponent,
    AddFoodComponent,
    FoodRowComponent,
    FoodService
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