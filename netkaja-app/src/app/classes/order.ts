import { User } from '../classes/user';
import { OrderItem } from '../classes/orderItem';

export class Order {
    public id: number;
    private customer: User;
    private foods: OrderItem;
    private date: Date;

    constructor(
       
    ) { }

    public getId(): number{
        return this.id;
    }
}