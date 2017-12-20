import { Allergen } from '../classes/allergen';

export class Food {
    public id: number;
    private type: string;
    private price: number;
    private name: string;
    private allergens: Array<Allergen>;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}