# Builder Design Pattern - Car Example

This project demonstrates the **Builder Design Pattern** in Java, applied to building different types of cars.  
The implementation follows **Clean Code principles** for readability, maintainability, and immutability.

---

## Overview

The **Builder Pattern** is a creational design pattern that allows constructing complex objects step by step.  
Instead of passing all parameters into a large constructor, the Builder provides a flexible way to set properties and then create the object.

In this project, the `Car` class is built using the `CarBuilder`.  
Additionally, a `Director` class provides predefined car configurations such as **SportsCar** and **SUV**.

---

## 🔹 Classes Explanation

### `Car`
- Represents the product being built.
- Immutable (all fields are `final`).
- Fields: `engine`, `seats`, `gps`, `airConditioner`.

### `CarBuilder`
- Nested static class inside `Car`.
- Provides setter-like methods (`setEngine`, `setSeats`, etc.).
- Returns `Car` using the `build()` method.
- Allows **method chaining** for cleaner code.

### `Director`
- Encapsulates **predefined build processes**.
- Example: `createSportsCar()`, `createSUV()`.

### `Main`
- Demonstrates usage of both `Director` and manual `CarBuilder`.
