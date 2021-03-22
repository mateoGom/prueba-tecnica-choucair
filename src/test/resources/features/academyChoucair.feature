#Author: Mateo Gómez Meneses

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline:  Search for a automation course
      Given than Mateo wants to learn automation at the academy Choucair
      |strUser   |strPassword|
      |<strUser>|<strPassword>|

      When he search for the course on the choucar academy platform
      |strCourse                       |
      |<strCourse>        |
      Then he finds the course called
        |strCourse                       |
        |<strCourse>        |

      Examples:

        |strUser   |strPassword  |strCourse|
        |1234988522|Choucair2021*|Metodología Bancolombia|
