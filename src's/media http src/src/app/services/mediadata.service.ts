import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Media } from '../model/media.model';
const API_URL = " http://localhost:3000/Media";
@Injectable({
  providedIn: 'root'
})
export class MediadataService {

  constructor(public http:HttpClient) { }


  getAllMedia(){


    return this.http.get(API_URL);

      }
      addNewMedia(media:Media){

         return this.http.post(API_URL,media);

      }
      

}

