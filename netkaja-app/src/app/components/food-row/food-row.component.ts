import { Component, OnInit } from '@angular/core';
import { Food } from "../../classes/food";

@Component({
  selector: 'app-food-row',
  templateUrl: './food-row.component.html',
  styleUrls: ['./food-row.component.css']
})
export class FoodRowComponent implements OnInit {
  foodrows: Array<Food>

  constructor() { }

  ngOnInit() {
  }

}
