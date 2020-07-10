package com.atguigu.userDevelopment;

public class user {
       private String firstname;
       private String lastname;
       private String email;
       public user(String firstname,String lastname,String email) {
    	   this.firstname=firstname;
    	   this.lastname=lastname;
    	   this.email=email;
       }
       public String getName() {
    	   return firstname;
       }
       public void setName(String firstname) {
    	   this.firstname=firstname;
       }
       public String getLastname() {
    	   return lastname;
       }
       public void setLastname(String lastname) {
    	   this.lastname=lastname;
       }
       public String getEamil() {
    	   return email;
       }
       public void setEamil(String email) {
    	   this.email=email;
       }
}
