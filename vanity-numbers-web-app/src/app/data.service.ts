import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  
  private pageSize = 150;
  private path = "decoded-page"
  private hostUrl = `http://localhost:8080/${this.path}`;

  constructor(private http: HttpClient) { }

  requestNumbersFromPage(phoneNumber: string, pageNumber: number): Observable<any>{
    return this.http.get(`${this.hostUrl}?number=${phoneNumber}&page=${pageNumber}&pageSize=${this.pageSize}`) as Observable<any>;
  }
}
