import { Component, OnInit } from '@angular/core';
import { User } from '../../models/User';
import { UserService } from '../../service/user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { error } from 'console';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-update-user',
  standalone: true,
  imports:[CommonModule,FormsModule],
  templateUrl: './update-user.component.html',
  styleUrl: './update-user.component.css'
})
export class UpdateUserComponent implements OnInit {

  userId!: number;

  user: User = new User();


  constructor(private userService: UserService,
              private route:ActivatedRoute, 
              private router: Router) { }

  

  ngOnInit(): void {

    // Get userID from the Url
    this.userId = this.route.snapshot.params['userId'];

    // fetch user data
      this.userService.getUserById(this.userId).subscribe(data =>{
        this.user = data;
      }, error => console.log(error));
  }


  
  onSubmit(){
    this.userService.updateUser(this.userId, this.user).subscribe( data =>{
      this.goToUserList();
    },error => console.log(error));
  }



  goToUserList(){
    this.router.navigate(['/users']);
   
  }



}
  // updateUser(){
  //   this.userService.updateUser(this.user_id, this.user)
  //   .subscribe(data =>{
  //     console.log(data);
  //     this.user = new User();
  //     this.goToUserList();

  //   },error => console.log(error))
  // }


