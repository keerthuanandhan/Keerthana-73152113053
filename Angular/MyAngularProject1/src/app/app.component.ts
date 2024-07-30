import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyAngularProject1';
//   name :string;
//   age : number;
//   email: string;
//   imagePath: string;

// constructor(){
//   this.name="keerthana";
//   this.age=20;
//   this.email="priya@gmail.com";
//   this.imagePath="https://miro.medium.com/v2/resize:fit:720/format:webp/1*lqMtWmTLHxT_6SN4Kjvaog.png"
// }
// chaneName(){
//   this.name="Mouni";
// }
// changeAge(){
//   this.age=21;
// }
// changeEmail(){
//   this.email="mouni@gmail.com";
// }
// changeImage(){
//   this.imagePath="https://miro.medium.com/v2/resize:fit:720/format:webp/1*bMgQ8MhbnQexpqHgIgBJPA.png"
// }


   
  flag:boolean;
  vehicles:string[];
  selectedVehicle :string;
  myStyle: {};
  myClass: string;
  constructor(){
    this.flag=true;
    this.vehicles=["Twowheeler","Threewheeler","Fourwheeler"];
    this.selectedVehicle="";
    this.myStyle={'width': '40%', 'border':'2px solid green','border-radius':'25px'};
    this.myClass="MyClass1";
  }
  changeFlag(){
    this.flag= ! this.flag;
  }
  setSelectedItem(vec: string){
      this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle= {'width': '40%', 'border':'2px solid red','border-radius':'25px'};
  }
}
