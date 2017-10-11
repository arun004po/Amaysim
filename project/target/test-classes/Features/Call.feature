@UI
Feature: Handling Call Forwarding option in setting page
in amaysim


@Screenshot
  Scenario: Handling Call Forwarding Option 
  When I provide username as "0468827174" and Password as "theHoff34" and login to the application
  Then I confirm popup 
  Then I go to Settings Page
  Then I click edit call forwarding option
  Then I enter "0426 177 390" as number to forward call to and save
  
  