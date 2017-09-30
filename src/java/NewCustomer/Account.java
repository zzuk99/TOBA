/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCustomer;

//import javax.xml.registry.infomodel.User;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;


/**
 *
 * @author Whisper119
 */
class Account {
/*
* ENUM for account types
*/
public enum AccountType {
    CHECKING,
    SAVINGS,
}
    Account(User newCustomer, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected AccountType accountType;
   protected double balance;
   protected User user;


   public void credit(double amount) {
       if (amount > 0) {
           balance += amount;
       }
   }
  
   public void debit(double amount) {
       if (amount >= balance) {
           balance -= amount;
       }
       else {
           System.out.println("Insufficient funds");
       }
   }

   public User getUser() {
       return user;
   }

   public void setUser(User user) {
       this.user = user;
   }

   public AccountType getAccountType() {
       return accountType;
   }

   public void setAccountType(AccountType accountType) {
       this.accountType = accountType;
   }
  
}

