import { Component, OnInit } from '@angular/core';
import { Food } from "../../classes/food";

@Component({
  selector: 'app-food-cell',
  templateUrl: './food-cell.component.html',
  styleUrls: ['./food-cell.component.css']
})
export class FoodCellComponent implements OnInit {

 foods=Array<Food>();
  constructor() {
  }

  ngOnInit() {
  }

}
