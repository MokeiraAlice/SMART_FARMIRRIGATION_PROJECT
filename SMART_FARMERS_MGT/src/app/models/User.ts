export class User{
 
  userId: number = 0; 
  userName: string = ''; // Default value
  email: string = ''; 
  role: string = ''; 
  phoneNumber: string = ''; 
  
  constructor(
    userId?: number,
    userName?: string,
    email?: string,
    role?: string,
    phoneNumber?: string,
    
  ) 
  
  {
    if (userId) this.userId = userId;
    if (userName) this.userName = userName;
    if (email) this.email = email;
    if (role) this.role = role;
    if (phoneNumber) this.phoneNumber = phoneNumber;
    
  }

}
