import { Injectable } from '@angular/core';
import { Food } from '../../classes/Food';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const HttpHeader = {
  headers: new HttpHeaders( {
    'Content-Type': 'application/json'
  })
}

@Injectable()
export class FoodService {

  constructor(
    private http: HttpClient
  ) { }

  getFood() : Promise<Array<Food>> {
    return this.http.get<Array<Food>>('api/food/list').toPromise();
  }

  deleteFood(food) : Promise<Food> {
    return this.http.post<Food>('api/food/delete', {
      'id': food.id,
      'type': food.type,
      'allergens': food.allergens,
      'prize': food.prize
    }, HttpHeader).toPromise();
  }

  addFood(food) : Promise<Food> {
    return this.http.post<Food>('api/food/create', {
      'id': food.id,
      'type': food.type,
      'allergens': food.allergens,
      'prize': food.prize
    }, HttpHeader).toPromise();
  }

  modifyFood(food) : Promise<Food> {
    return this.http.post<Food>('api/food/update', {
      'id': food.id,
      'type': food.type,
      'allergens': food.allergens,
      'prize': food.prize
    }, HttpHeader).toPromise();
  }

}