import { Allergen } from '../classes/allergen';

export class Food {
    id: number;
    type: string;
    price: number;
    name: string;
    allergens: Array<Allergen>;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}