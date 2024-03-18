**Automated Parking Lot System**

This project is a low-level design implementation of an Automated Parking Lot System. The system is designed to handle parking for cars, bikes, and handicapped vehicles, calculate parking costs, track parking duration, manage parking spot availability, and provide various functionalities related to parking management.

**Functional Requirements**

Vehicle Parking: The system allows vehicles to be parked in designated parking spots for cars, bikes, and Heavy vehicles.

Cost Calculation: The system calculates the parking cost based on the type of vehicle and the duration of parking.

Parking Duration Tracking: The system keeps track of the time a vehicle is parked to calculate the parking cost.

Vehicle Removal: The system provides functionality to remove a vehicle from a parking spot when it leaves.

Spot Availability: The system checks the availability of parking spots on a specific floor.

Parking Duration Calculation: The system calculates the number of hours a vehicle has been parked.

**Design Approach**

The Automated Parking Lot System is designed using SOLID design principles and object-oriented programming (OOP) concepts. The design emphasizes composition and delegation to decouple system components wherever possible, ensuring flexibility and maintainability.

**Implementation Details**

Vehicle Class Hierarchy: The system utilizes a class hierarchy to represent different types of vehicles, including cars, bikes, and handicapped vehicles.

Parking Spot Management: Parking spots are managed using composition, allowing for flexibility in adding new types of parking spots or modifying existing ones.

Cost Calculation Strategy: The system employs a strategy pattern to calculate parking costs dynamically based on the type of vehicle and parking duration.

Parking Duration Tracking: Parking duration is tracked using appropriate data structures and algorithms to ensure accurate calculation of parking costs.

Availability Checking: Parking spot availability is efficiently checked using appropriate data structures and algorithms, providing real-time information to users.

**How to Use**

Clone the repository to your local machine.
Compile and run the Client class Main program to interact with the Automated Parking Lot System.
Follow the prompts to park vehicles, calculate parking costs, check spot availability, and perform other functionalities.

**License**

This project is licensed under the MIT License. Feel free to use and distribute the code for your own purposes.
