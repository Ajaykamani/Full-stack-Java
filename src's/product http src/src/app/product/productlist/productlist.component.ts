import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { Product } from 'src/app/model/product.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {
    products : Array <Product>;
  
  constructor(private productService:DataService,public router:Router) { }

  add(){
    // navigate to product-add component
    this.router.navigate(['/product-add']);
  }

  update(id:number){
    // navigate to update Component (associate id also)
    this.router.navigate(['/product-update/' + id]);
  }

  delete(id:number){
    // call product data service to delete
    this.productService.deleteProduct(id).subscribe((response) => {
        console.log(response);
        // call getAllProducts (selective loading)
        this.productService.getAllProducts().subscribe((response:any) => this.products = response);
        
        // navigate to same component (caching issues)
        // this.router.navigate(['/product']);
    });
  }

  ngOnInit() {
      this.productService.getAllProducts().subscribe((Response:any) =>this.products=Response);

  }

}
