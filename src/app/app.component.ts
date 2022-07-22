import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'crud';

  constructor(private router:Router) {}

  Listar(){
    this.router.navigate(["listar"]);  // llamamos al componente mediante el enrutador declarado en el constructor
  }
  Nuevo(){
    this.router.navigate(["add"]);
  }

}
