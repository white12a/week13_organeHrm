package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.Utilities.Utility;
import org.openqa.selenium.By;

public class LogIn extends Utility {
// Enter “Admin” username
    By UserName = By.id("txtUsername");
      public void enterUserName(String username){
        sendTextToElement(UserName,username);
      }
// Enter “admin123 password
    By Password = By.id("txtPassword");
      public void enterPassword(String password){
          sendTextToElement(Password,password);}
//* Click on ‘LOGIN’ button
          By Login =By.id("btnLogin");
    public void clickOnLogin(){
        clickOnElement(Login);
          }
// Verify the ‘Welcome’ text is display
          By WelcomeText = By.id("welcome");

    public String VerifyWelcomeText(){
        return getTextFromElement(WelcomeText);
          }
          //===========userShouldNavigateToForgotPasswordPageSuccessfully test ============
// click on the ‘Forgot your password’ link
    By ForgotPassword = By.linkText("Forgot your password?");
         public void clickOnForgotPassword(){
             clickOnElement(ForgotPassword);
         }
    // Verify the text ‘Forgot Your Password?
    By ForgotPasswordText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");
   public String verifyForgotPasswordText(){
       return getTextFromElement(ForgotPasswordText);
   }





}

