import { Component, OnInit } from '@angular/core';
import { DataService } from '../../services/data.service';

@Component({
  selector: 'app-register-view',
  templateUrl: './register-view.component.html',
  styleUrls: ['./register-view.component.css'],
  providers: [UserService]
})
export class RegisterViewComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
