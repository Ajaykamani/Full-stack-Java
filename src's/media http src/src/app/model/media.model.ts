export class Media {
  
    file:string;
    title:string;
    category:string;
    description:string;
    tags:string;
    
    
    constructor(file:string,title:string,category:string,description:string,tags:string){
        this.file=file;
        this.title=title;
        this.category=category;
        this.description=description;
        this.tags=tags;
        
    }
}