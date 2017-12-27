import { Component, OnInit } from '@angular/core';
import { AuthService } from "../../services/auth/auth.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-navi',
  templateUrl: './navi.component.html',
  styleUrls: ['./navi.component.css']
})
export class NaviComponent implements OnInit {

  constructor(
    private authService: AuthService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  async logout() {
    try {
      await this.authService.logout();
      this.router.navigate(['/dashboard']);
    }
    catch (err) {
      console.log(err);
    }
  }

}
