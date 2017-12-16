import { Data } from '../classes/data';
import { Food } from '../classes/food';
export class Orders {
    public id: number;
    private customer: Data;
    private foods: Array<Food>;
    private date: Date;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}