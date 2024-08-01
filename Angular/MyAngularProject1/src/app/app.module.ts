import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
  
  
import { Routes, RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { CalculatorService } from './calculator.service';
import { ChildComponent } from './child/child.component';
import { FactorialComponent } from './factorial/factorial.component';
const ROUTES: Routes = [
  { path : 'Home', component : HomeComponent},
  { path : 'Contact', component : ContactComponent},
  { path : 'About', component : AboutComponent}
  ];
  
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    ChildComponent,
    FactorialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
