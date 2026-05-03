# 🚗 Ride Sharing App - System Design (Java)

## 📌 Overview
This project demonstrates a basic **Object-Oriented System Design** for a Ride Sharing application (similar to Uber/Ola).  
The system is designed using core OOP principles to ensure scalability, maintainability, and flexibility.

---

## 🛠️ Tech Used
- Java
- Object-Oriented Programming (OOP)
- Basic System Design Principles

---

## 🧱 System Components

### App
- Entry point of the application
- Manages communication between all components

### Passenger
- Represents a user requesting a ride
- Can request and view ride details

### Driver
- Represents a driver in the system
- Can accept/reject ride requests
- Associated with a vehicle

### Vehicle (Interface)
- Defines common behavior for all vehicle types

---
### 🔄 System Flow
1. Passenger requests a ride
2. App searches for available drivers
3. Driver accepts or rejects the request
4. Vehicle is assigned to the ride
5. Fare is calculated based on distance
6. Ride is completed

---
### 📂 Design Structure
```java
   RideSharingApp/
│── App.java
│── Passenger.java
│── Driver.java
│── Vehicle.java
│── FareType.java
│── Car.java
│── Bike.java

```
### 👨‍💻 Author
Harsh
