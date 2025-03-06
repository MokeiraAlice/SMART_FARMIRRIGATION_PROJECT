import { Component, OnInit } from '@angular/core';
import { User } from '../../models/User';
import { UserService } from '../../service/user.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-list',
  standalone: true,
  imports:[CommonModule,FormsModule],
  templateUrl: './users-list.component.html',
  styleUrl: './users-list.component.css'
})
export class UserListComponent implements OnInit{
  
  users: User[]=[];

  constructor(private userService: UserService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getUsers();
  }

  private getUsers(){
    this.userService.getUserList().subscribe(data =>{
      this.users = data;
    });
  }

  updateUser(user_id:number){
    if (!user_id){
        console.error('User ID is undefined! Check API response.');
      return;
    }
    this.router.navigate(['update-user', user_id]);
  }




  deleteUser(user_id:number){
    this.userService.deleteUser(user_id).subscribe(data => {
      console.log(data);
      this.getUsers();
    })
  }

}
