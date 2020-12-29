
package project.pkg2.pkg2;

import java.math.BigInteger;


public class user_show_class {
     private String b_names,w_name,dates;
  
   
   public user_show_class(String name,String writer,String date){
       this.b_names=name;
       this.w_name=writer;
       this.dates=date;
   }
   
   public String getb_name(){
       return b_names;
   }
   public String getw_name(){
       return w_name;
   }
   public String getdate(){
       return dates;
   }
}
