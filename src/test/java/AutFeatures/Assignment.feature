Feature: Online self service Signup

Scenario: Username validation
Given open signup page
When Enter username in username input field
Then prompt an error mesage "Username taken please enter another username" if the username already exists in the system

Scenario: Validating password
Given Enter password in password and re enter password input field
When If password consists of least 7 characters 1 number 1 uppercase letter
And one lowercase letter one special character
And The Password and Re enter password fields matched
Then Display "green" check mark next to re enter password field otherwise display red mark

Scenario Outline: Login Button
Given User need to enter all required Input fields
When All the input fields successfully validate
And click on submit button
Then User will be redirected to login page <welcome>

Examples:
|welcome|
|wehsbcdjvknflkb|
|Welcome, to the Online self service|
|Your account has been created successfully|
