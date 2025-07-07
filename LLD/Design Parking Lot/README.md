# Design Parking Lot System

## Problem Statement
Design a software system for a multi-level parking lot. The system should manage parking spaces, allow vehicles to enter and exit, and calculate parking fees. It should support different types of vehicles and parking spots, and provide information about availability.

## Key Functional Requirements

1. **Vehicle Entry**: Allow vehicles to enter the parking lot and assign them an available parking spot.

2. **Vehicle Exit**: Allow vehicles to exit the parking lot, calculate the parking fee, and free up the occupied parking spot.

3. **Parking Spot Allocation**:

- Allocate the most appropriate parking spot based on vehicle type (e.g., car, motorcycle, truck) and spot size.

- Support different types of parking spots (e.g., small, medium, large, handicapped).

4. **Parking Fee Calculation**: Calculate parking fees based on parking duration and potentially vehicle type or spot type.

5. **Parking Spot Availability**: Provide real-time information on available parking spots per level and per spot type.

6. **Ticket Generation**: Generate a parking ticket upon entry, containing relevant details (entry time, spot assigned, ticket ID).

7. **Payment Processing**: Handle payment for parking fees (though actual payment gateway integration might be out of scope for LLD, the system should account for it).

8. **Information Display**: Display parking lot information (e.g., available spots) at entry/exit points and possibly within the lot.

9. **Vehicle Types**: Support multiple vehicle types (e.g., Car, Motorcycle, Truck, Van).


