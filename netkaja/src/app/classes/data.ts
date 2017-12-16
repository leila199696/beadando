export class Data {
    public id: number;
    private likes: number;
    private dislikes: number;
    private date: Date;
    private user: User;
    private news: News;

    constructor(
        private text: string
    ) { }

    public getId(): number{
        return this.id;
    }
}