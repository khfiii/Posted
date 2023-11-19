/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorModel;
import View.AuthorView;


/**
 *
 * @author kahfi
 */


public class AuthorController {
    
  AuthorView authorView; 
  AuthorModel authorModel = new AuthorModel(); 

  
 public AuthorController(AuthorView view)
 {
     this.authorView = view; 
 }
  
 public void insert()
 {
  String name = authorView.getFieldAuthor().getText(); 
  String address = authorView.getFieldAddress().getText(); 
  String contact = authorView.getFieldContact().getText(); 

  
  this.authorModel.setName(name);
  this.authorModel.setAddress(address);
  this.authorModel.setContact(contact);
  
  
  this.authorModel.insertData();
  authorView.dispose();
  
 }
  

 
  

    
}
