##{Allergy Number Game}

####{Enter a positive number and numbers between 1 and the specified number, and a list of allergies will appear depending on the criteria}

###{4/21/2016}

### By Cory Franks

## Description

###{Enter a positive number and based on what the number is like say 35 you would get a list of allergies back saying you are alergic to chocolate, peanuts and eggs. What happens first is it looks through our values and check for the allergy with the highest score puts that in and then rechecks for the next highest score and so. }

## Setup/Installation Requirements

* Clone repository
* Install Postgres and enter postgres in a terminal/command line
* In a new terminal tab enter psql
* CREATE DATABASE hair_salon;
* In another terminal tab enter psql hair_salon < hair_salon.SQL
* enter "gradle run" in the same terminal tab
* in your browser go to "localhost:4567"

## Known Bugs
None so far

## Technologies Used
* Velocity Template Engine
* Spark
* Java
* Gradle
* Postgres
* SQL
