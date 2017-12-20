export enum Role{
    GUEST, USER, ADMIN
}

export class User {
    public id: number;
    
    
    private date: Date;
    public role: Role;

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