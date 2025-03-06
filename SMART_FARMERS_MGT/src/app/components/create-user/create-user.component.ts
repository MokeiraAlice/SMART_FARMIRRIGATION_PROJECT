import { Component } from '@angular/core';
import { User } from '../../models/User';
import { UserService } from '../../service/user.service';
import { error } from 'console';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common'

@Component({
  selector: 'app-user-create',
  standalone: true,
  imports:[CommonModule,FormsModule],
  templateUrl: './create-user.component.html',
  styleUrl: './create-user.component.css'
})

export class UserCreateComponent {

    user = new User();

// onSubmit() {
// throw new Error('Method not implemented.');
// }

  constructor(private userService: UserService,
    private router: Router
  ){}



  ngOnInit(): void {
  }

  saveUser(){
    this.userService.createUser(this.user).subscribe(data =>{
      console.log(data);
      this.goToUserList();
    },
  error => console.log(this.user) );
  }

  goToUserList(){
    this.router.navigate(['/users']);
   
  }

  onSubmit(){
    console.log(this.user);
    this.saveUser();
  }

}
