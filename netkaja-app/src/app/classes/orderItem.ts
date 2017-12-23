import { Food } from "./food";

export class OrderItem {
    id: number = 0;  
    foods: Array<Food>;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}