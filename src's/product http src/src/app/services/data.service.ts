import { Injectable, ɵAPP_ID_RANDOM_PROVIDER } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../model/product.model';
const API_URL = " http://localhost:3000/product"; // url of server
@Injectable({
  providedIn: 'root'
})
export class DataService {
  
  constructor(public http : HttpClient) { 

  }
  getAllProducts(){


    return this.http.get(API_URL);
  }
  addNewProduct(product : Product){
    // POST http verb
    return this.http.post(API_URL, product);
  }

  getOneProduct(id:number){
    // GET http verb
    return this.http.get(API_URL + "/" + id);

  }

  // method to send updated object(product) to server
  updateProduct(id:number, product : Product){
    // PUT http verb
    return this.http.put(API_URL + "/" + id, product);
  }

  // method to delete single record of given id
  deleteProduct(id:number){
    // DELETE http verb
    return this.http.delete(API_URL + "/" + id);

  }
}
