import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-regi-view',
  templateUrl: './regi-view.component.html',
  styleUrls: ['./regi-view.component.css'],
  providers: [UserService]
})
export class RegiViewComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
