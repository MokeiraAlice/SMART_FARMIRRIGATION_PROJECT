import { Injectable } from '@angular/core';
import { User } from '../models/User';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8081/api/users';  // URL to GET user in the user microservice


constructor(private httpClient: HttpClient) { }


// TO GET A LIST OF ALL USERS
  getUserList(): Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.baseUrl}`);
  }



  // TO ADD A USER TO THE DATABASE
  createUser(user: User): Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`, user)
  }



  // UPDATE USER RECORDS---call this method in the update user component
  getUserById(userId:number): Observable<User>{
    return this.httpClient.get<User>(`${this.baseUrl}/${userId}`)
  }


  updateUser(userId:number, user:User):Observable<Object>{
    return this.httpClient.put(`${this.baseUrl}/${userId}`, user)
  }

  // DELETE A USER
  deleteUser(userId:number
    ):Observable<Object>{
    return this.httpClient.delete(`${this.baseUrl}/${userId}`)
  }
}
