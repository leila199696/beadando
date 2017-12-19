import { User } from '../classes/user';
import { Food } from '../classes/food';
export class Orders {
    public id: number;
    private customer: User;
    private foods: Array<Food>;
    private date: Date;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}