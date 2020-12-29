package project.pkg2.pkg2;


import java.math.BigInteger;


class Admin_show {
   private String names,dates;
   private BigInteger b_identity;
   
   public Admin_show(String name,BigInteger identity,String date){
       this.names=name;
       this.dates=date;
       this.b_identity=identity;
   }
   
   public String getname(){
       return names;
   }
   public BigInteger getidentity(){
       return b_identity;
   }
   public String getdate(){
       return dates;
   }
}
