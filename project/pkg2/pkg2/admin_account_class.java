
package project.pkg2.pkg2;

import java.math.BigInteger;


public class admin_account_class {
    private String names,passwords,email,roll;
   
   public admin_account_class(String name,String passwords,String email,String roll){
       this.names=name;
       this.passwords=passwords;
       this.email=email;
       this.roll=roll;
   }
   
   public String getname(){
       return names;
   }
   public String getpasswords(){
       return passwords;
   }
   public String getemail(){
       return email;
   }
   public String getroll(){
       return roll;
   }
}
