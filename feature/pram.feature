Feature: Login Action
Scenario Outline: Successful login with credentials
Given user opens the application
When user click on signin link
And User enters "<username>" and "<password>"
Then message displayed login successful

Examples:
 | username | password |
 | lalitha  | password123 |
 | admin    | password456 |