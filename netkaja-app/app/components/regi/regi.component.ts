import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../../classes/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-regi',
  templateUrl: './regi.component.html',
  styleUrls: ['./regi.component.css'],
  providers: [UserService]
})
export class RegiComponent implements OnInit {
  private _error: string = "";

  public regi(name: string, email: string, password: string, passwordre: string): void {
    this._error = "";
    if(name.length < 6) {
      this._error = "Name at least 6 character long!";
    }
    if(password.length < 6) {
      this._error += "Password at least 6 character long!";
    }
    if(password != passwordre){
      this._error += "Passwords don't macth!";
    }
    if(this._error == "") {
      this.userService.regi(name, email, password).subscribe((succsess: boolean) => {
        if(succsess){
          this.userService.login(email, password);
          this.router.navigate(['news']);
        } else {
          this._error = "Email already in use!";
        }
      });
    }
    console.log(this._error);
  }

  constructor(
    private userService: UserService,
    private router: Router
  ) { }

  ngOnInit() {
  }

}