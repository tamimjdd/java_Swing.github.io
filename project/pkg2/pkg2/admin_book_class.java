/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2.pkg2;

import java.math.BigInteger;

/**
 *
 * @author devil
 */
public class admin_book_class {
    private String names,writer;
    int available;
    private BigInteger b_identity;
   
   public admin_book_class(String name,String write,int available,BigInteger identity){
       this.names=name;
       this.writer=write;
       this.available=available;
       this.b_identity=identity;
   }
   
   public String getname(){
       return names;
   }
   public String getwriter(){
       return writer;
   }
   public int getavailable(){
       return available;
   }
   public BigInteger getidentity(){
       return b_identity;
   }

}
