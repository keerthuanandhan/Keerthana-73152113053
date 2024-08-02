import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {
  getAddition(a:number,b:number){
    return a+b;
  }
  getSubtraction(a:number,b:number){
    return a-b;
  }
  getfactorial(a:number){
    let fact=1;
    for(let i=1;i<=a;i++){
      fact=fact*i;
    }
    return fact;
  }
}
