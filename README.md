# XE New Joiners Training with Microservice Concept

### Create 3 separated services/projects for: ​
- Wizard Info service
- Magic Wand catalogue service
- Order service

### Task:
Create Tables below in your local DB:
- Wizard Info – id, name, age, joined date, active​
- Magic Wand Catalogue – id, name, desc, age limit, stock​
- Order - consist of foreign keys, able to show existing order from which Wizard Info

Create new branch from master, name it as training-crud-api
*Add CRUD features for all microservice​
*Add RestTemplate feature in Order service to communicate with other services​
*Add validation if wizard is valid (active/not)​
*Add validation if magic wand is valid & is available​

**You are free to dd other required additional validation**

Bonus:
Create new branch from master, name it as training-authentication
Explore simple token authentication (sign in, sign up, login) and apply it in any microservice during API call
