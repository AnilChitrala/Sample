Feature: Application Login

Scenario: Login with working mailid
Given Intialize browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login link in homepage to land on secure signin page
When user enters "test99@gmail.com" and "123456" and logs in 
Then verify user is succesfully logged in

Scenario: Login with non working mailid
Given Intialize browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login link in homepage to land on secure signin page
When user enters "test99@gmail.com" and "12346" and logs in 
Then verify user is succesfully logged in
