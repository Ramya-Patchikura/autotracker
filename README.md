# car-tracker-seed
seed for the Full-Stack IOT training project: car-tracker

## directory structure:

**`client`** [*module-client*]: contains ui app (HTML, CSS, JS, fonts, images)      
**`api`** [*module-api*]: contains REST API

## mock sensor: 
[http://mocker.egen.io](http://mocker.egen.io)

## requirements:
[https://learn.egen.io](https://learn.egen.io/courses/overview.html)

End points :
(1) http://localhost:8081/api/Vehicles: 
Method type: PUT 
Description: Displays the list of Vehicles with properties like vin, make, model, year etc,
Checks for Vehicles via vin number and updates existing vehcile with same vin and inserts new Vehicles

http://localhost:8081/api/Readings:
Method type: POST
Description: Displays the readings of the Vehicles like engineRPM, fuel volume and also checks for Checkengine light, Cruise control and Engine coolant.
