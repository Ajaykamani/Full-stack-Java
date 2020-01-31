import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'originaldata'
})
export class OriginaldataPipe implements PipeTransform {
      response:string;
  transform(value: string, ...args: any[]): any {
   let response="";
      switch(value.length){
       
        case 0:response="Data not available";
        break;
        default: response=value;
      }


    return response;
  }

}
