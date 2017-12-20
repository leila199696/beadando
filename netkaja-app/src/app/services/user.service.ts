import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from "../classes/user";
import { Role } from "../classes/user";
import { Observable, Subject } from 'rxjs';
import { netkaja } from '../config/netkaja';

@Injectable()
export class UserService {
  private static loggedInUser: User = null;

  constructor(
    private httpClient: HttpClient
  ) { }

  public allUser(): Observable<any> {
    return this.httpClient.get(netkaja + 'user');
  }

  public login(email: string, password: string): Observable<boolean> {
    const result = new Subject<boolean>();
    this.httpClient.post(netkaja + 'user/login', { email, password }).subscribe((user: User) => {
      UserService.loggedInUser = user as User;
      result.next(true);
    }, (error) => {
      UserService.loggedInUser = null as User;
      result.next(false);
    });
    return result;
  }

  public logout(): void {
    this.httpClient.post(netkaja + 'user/logout', null).subscribe(() => {
      UserService.loggedInUser = null;
    });
  }

  public regi(name: string, email: string, password: string): Observable<boolean> {
    const result = new Subject<boolean>();
    this.httpClient.post(netkaja + 'user/regi', {name, email, password}).subscribe((user: User) => {
      result.next(true);
    }, (error) => {
      result.next(false);
    });
    return result;
  }

  public modify(id: number, user: User): Observable<any> {
    return this.httpClient.put(netkaja + 'user/modify/' + id, user);
  }
  
  public profile(id: number): Observable<any> {
    return this.httpClient.get(netkaja + 'user/profile/' + id);
  }

  public delete(id: number): Observable<any> {
    return this.httpClient.delete(netkaja + 'user/delete/' + id);
  }

  public getLoggedInUser(): Observable<any> {
    return this.httpClient.get(netkaja + 'user/loggedin');
  }

  public isLoggedIn(): boolean {
    return UserService.loggedInUser !== null;
  }

  public syncLoginStatus(): void {
    this.httpClient.get(netkaja + "user/loggedin").subscribe((user: User) => {
      if(user){
        UserService.loggedInUser = user as User;
      } else {
        UserService.loggedInUser = null;
      }
    });
  }

  public userHasRole(role: Role[]): boolean {
    if (!this.isLoggedIn()) {
      return false;
    }
    return role.includes(UserService.loggedInUser.role);
  }

  public getRole(): Role {
    if (this.isLoggedIn()) {
      return UserService.loggedInUser.role;
      //return 'USER';
    }
    return undefined;
}
}