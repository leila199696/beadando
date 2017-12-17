import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loginform',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [UserService]
})
export class LoginComponent implements OnInit {
  private _error: string = '';

  public login(email: string, password: string): void {
    this.userService.login(email, password).subscribe((succsess: boolean) => {
      if(succsess){
        const redirectTo: string = this.activatedRouter.snapshot.queryParamMap.get('from') || 'news';
        this.router.navigate([redirectTo]);
      } else {
        this._error = "Wrong email or password!";
      }
    });
  }

  constructor(
    private userService: UserService,
    private router: Router,
    private activatedRouter: ActivatedRoute
  ) { }

  ngOnInit() {
    if (this.activatedRouter.snapshot.queryParamMap.get('from')) {
      this._error = 'Az adott oldal eléréséhez bejelentkezés szükséges!';
    }
  }

}