import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  private readonly sevenOrTenDigits = /^(?:\d{7}|\d{10})$/;
  invalidNumber=false;
  numbers;
  phoneNumber="8888888"

  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.requestNumbersFromPage(this.phoneNumber, 0).subscribe((res: any) => this.numbers = res);
    this.selected = 0;
  }

  selected: number = 0;
  onSelect(page: number){
    this.selected = page;
    this.dataService.requestNumbersFromPage(this.phoneNumber, page).subscribe((res: any) => this.numbers = res);
  }

  getNavPageCount(): number[]{
    return Array.from(Array(this.numbers.totalPages).keys())
  }

  onValid(){
    if (this.sevenOrTenDigits.test(this.phoneNumber)){
      this.invalidNumber = false;
      this.ngOnInit();
    }
    else this.invalidNumber=true;
  }
}
