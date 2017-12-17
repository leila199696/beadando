import { Component, OnInit } from '@angular/core';

import { Component, OnInit } from '@angular/core';
import { Data } from '../../classes/data';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-login-view',
  templateUrl: './login-view.component.html',
  styleUrls: ['./login-view.component.css'],
  providers: [UserService]
})
export class LoginViewComponent implements OnInit {

  constructor(
  ) { }

  ngOnInit() {

  }

}
