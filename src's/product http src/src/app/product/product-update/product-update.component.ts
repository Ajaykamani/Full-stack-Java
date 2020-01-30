import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from 'src/app/services/data.service';
import { Product } from 'src/app/model/product.model';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  productId : number;
  product : Product;

  constructor(public activatedRoute : ActivatedRoute, public productService : DataService, public router : Router) { 
    this.activatedRoute.params.subscribe((parameter) => this.productId = parameter["productId"]);
  }

  ngOnInit() {
    this.productService.getOneProduct(this.productId).subscribe((response:any) => this.product = response);
  }

  updateProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    // create a product object of updated info
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));

    // need to send it to server using product Data Service
    this.productService.updateProduct(this.productId, product).subscribe(
      (response) => {
        console.log(response);
        // navigate to product-list
        this.router.navigate(['/productlist']);
      });


    // reset the form
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";

    }
}
