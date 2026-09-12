# Robot Configuration System (Builder Pattern)

University project implementing the Builder Design Pattern in Java.

## Architecture
* **Robot**: Immutable product class with private final fields.
* **RobotBuilder**: Builder class with Fluent API and field validation in `build()`.
* **RobotDirector**: Director class providing preset configurations (`constructExplorerRobot`, `constructDeliveryRobot`).
* **RobotPatternsApplication**: Main entry point demonstrating builder and director usage.

## Features
* Fluent API with method chaining.
* Validation for required fields (`modelName` not null, `batteryCapacity > 0`).
* Pre-configured templates via Director.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Run `RobotPatternsApplication.java`.
3. Check the console output for generated robot configurations.