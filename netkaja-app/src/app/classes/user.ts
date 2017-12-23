export class User {
    public id: number=0;
    public role: string = 'GUEST';

    public constructor(
        public name: string,
        public email: string,
        private userName: string,
        private password: string,
        private address: string,
        private phoneNumber: number
     ) { }

    public getId(): number{
        return this.id;
    }
}