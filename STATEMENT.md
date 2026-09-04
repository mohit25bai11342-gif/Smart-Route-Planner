# 🚌 Smart Route Planner — Project Statement

## 📌 Project Title

**Smart Route Planner**

---

## 1. 📖 Introduction

Transportation systems consist of multiple stations connected through different routes. When the number of stations and connections increases, finding the shortest and most efficient route manually becomes difficult.

The **Smart Route Planner** is a Java-based command-line application designed to solve this problem using **Graph Data Structures** and **Dijkstra's Shortest Path Algorithm**.

The system represents stations as vertices and routes as weighted edges. Users can select a city, view its stations and routes, and find the shortest route between two selected stations.

The project currently supports:

- Bhopal
- Indore
- Ujjain
- Sehore

The system also provides estimated travel distance, travel time, fare, and transportation details.

---

# 2. ❗ Problem Statement

In a transportation network, there may be multiple routes between a starting station and a destination station.

Finding the shortest route manually becomes difficult because:

- There may be many interconnected stations.
- Multiple routes may exist between two locations.
- Routes may have different distances.
- Different transportation modes may be available.
- Users need quick route calculations.
- Comparing different routes manually can be time-consuming.

Therefore, there is a need for a system that can automatically determine the shortest route between two stations.

The proposed system uses a **weighted graph** and **Dijkstra's Shortest Path Algorithm** to calculate the shortest route efficiently.

---

# 3. 🎯 Aim of the Project

The main aim of this project is to develop a Java-based route-planning system that can calculate the shortest path between stations in multiple cities using graph algorithms.

The project also aims to demonstrate the practical implementation of:

- Java Programming
- Object-Oriented Programming
- Data Structures
- Graph Theory
- Dijkstra's Algorithm
- Java Collections Framework

---

# 4. 🎯 Objectives

The objectives of the project are:

1. To create a transportation network using graph data structures.
2. To support multiple cities.
3. To store stations and their connections.
4. To display available cities.
5. To display stations belonging to a selected city.
6. To display available routes.
7. To accept a source station from the user.
8. To accept a destination station from the user.
9. To find the shortest route between two stations.
10. To calculate the total route distance.
11. To estimate travel time.
12. To calculate estimated transportation fare.
13. To display transportation details.
14. To validate user input.
15. To demonstrate Dijkstra's Shortest Path Algorithm.
16. To demonstrate important Java OOP concepts.
17. To develop a simple command-line based route-planning application.

---

# 5. 💡 Proposed Solution

The proposed system represents the transportation network as a **weighted graph**.

Each station is represented as a:

```text
Vertex / Node
```

Each connection between two stations is represented as:

```text
Edge
```

The distance between stations is used as the:

```text
Edge Weight
```

The graph is represented using an **Adjacency List**.

When the user enters a source and destination station, the system applies **Dijkstra's Shortest Path Algorithm** to find the route with the minimum total distance.

The system then displays:

- Shortest route
- Total distance
- Estimated travel time
- Estimated fare
- Transportation mode

---

# 6. 🗺️ System Overview

The overall working of the system is:

```text
Start
  ↓
Create Transportation Network
  ↓
Display Cities
  ↓
Select City
  ↓
Display City Menu
  ↓
Select Operation
  ↓
 ┌─────────────────────────────┐
 │                             │
 ↓                             ↓
Show Stations              Show Routes
 │                             │
 └──────────────┬──────────────┘
                ↓
       Find Shortest Route
                ↓
       Enter Source Station
                ↓
     Enter Destination Station
                ↓
       Validate User Input
                ↓
       Run Dijkstra Algorithm
                ↓
       Find Shortest Path
                ↓
      Calculate Distance
                ↓
      Calculate Travel Time
                ↓
       Calculate Fare
                ↓
      Display Route Details
                ↓
         Return / Exit
```

---

# 7. 🌆 Supported Cities

The system currently supports the following cities:

| S.No. | City |
|---:|---|
| 1 | Bhopal |
| 2 | Indore |
| 3 | Ujjain |
| 4 | Sehore |

Each city contains a set of stations and routes used to demonstrate the route-planning process.

---

# 8. 🚉 Station Representation

Each station represents a location in the transportation network.

Conceptually:

```text
Station
│
├── Station ID
├── Station Name
└── City
```

The system maintains station information and uses it to determine whether a selected station belongs to the currently selected city.

---

# 9. 🛣️ Route Representation

A route represents a connection between two stations.

Conceptually:

```text
Connection
│
├── Source Station
├── Destination Station
├── Distance
└── Transportation Mode
```

Example:

```text
Station A → Station B
Distance: 5 km
Transport: Bus
```

---

# 10. 🧠 Algorithm Used

## Dijkstra's Shortest Path Algorithm

Dijkstra's algorithm is used to find the shortest path from a source station to other reachable stations in a weighted graph with non-negative edge weights.

### Working Steps

1. Select the source station.
2. Assign distance `0` to the source.
3. Assign infinity to other stations.
4. Add the source to the priority queue.
5. Select the station having the smallest current distance.
6. Check all connected stations.
7. Calculate the new possible distance.
8. Update the distance if the new distance is smaller.
9. Store the previous station for path reconstruction.
10. Continue until the required destination is reached.
11. Reconstruct and display the shortest path.

---

# 11. 📊 Graph Representation

The transportation network is represented using an adjacency list.

Conceptually:

```java
HashMap<Integer, ArrayList<Connection>>
```

The structure can be visualized as:

```text
Station A
   |
   +---- Station B
   |
   +---- Station C

Station B
   |
   +---- Station D
```

Each connection stores information about the route and its distance.

---

# 12. 🚌 Transportation Modes

The project supports transportation modes such as:

- City Bus
- Metro

The transportation mode is associated with a connection between stations.

---

# 13. 💰 Fare Calculation

The system calculates an estimated fare based on transportation mode and distance.

### City Bus

```text
Fare = 10 + (Distance × 2)
```

### Metro

```text
Fare = 15 + (Distance × 1.5)
```

### Example

For a 10 km Bus route:

```text
Fare = 10 + (10 × 2)

Fare = ₹30
```

> **Note:** These are simulated fare formulas created for academic demonstration. They do not represent actual transportation fares.

---

# 14. ⏱️ Travel Time Calculation

Estimated travel time is calculated based on the transportation mode.

### City Bus

```text
Time = Distance × 3 minutes
```

### Metro

```text
Time = Distance × 2 minutes
```

### Example

For a 10 km Metro route:

```text
Time = 10 × 2

Time = 20 minutes
```

> **Note:** These values are simulated for academic purposes.

---

# 15. 📥 Input

The system accepts input from the user through the command line.

Typical inputs include:

```text
City Selection
Station Selection
Source Station
Destination Station
Menu Options
```

Example:

```text
Enter city choice: 1

Enter source station: 3

Enter destination station: 8
```

---

# 16. 📤 Output

The system provides information such as:

```text
Source Station
Destination Station
Shortest Route
Total Distance
Estimated Travel Time
Estimated Fare
Transportation Details
```

Example:

```text
========================================
          SHORTEST ROUTE
========================================

Source      : Station A
Destination : Station D

Route:
Station A → Station B → Station D

Total Distance : 9 km
Estimated Time : 27 minutes
Estimated Fare : ₹28
```

---

# 17. 🧱 Object-Oriented Programming

The project demonstrates the following OOP concepts:

### Classes and Objects

Used to represent stations, routes, transportation types, and other system components.

### Encapsulation

Data is grouped inside classes and controlled using appropriate access modifiers and methods.

### Inheritance

Child transportation classes can inherit common properties and behavior from a parent transportation class.

### Abstraction

Abstract classes and interfaces can define common behavior while hiding implementation details.

### Polymorphism

Different transportation objects can be handled through common parent references.

### Method Overriding

Child classes can provide their own implementation of inherited methods.

### Interface

Interfaces can define common behavior for classes.

### Comparable

Used to compare route-related objects, particularly when working with the priority queue.

### Exception Handling

Used to handle invalid user input and prevent unexpected program termination.

---

# 18. 📦 Data Structures Used

| Data Structure | Purpose |
|---|---|
| Graph | Represents transportation network |
| Adjacency List | Stores station connections |
| `HashMap` | Stores and accesses station/network information |
| `ArrayList` | Stores route connections |
| `HashSet` | Maintains unique elements |
| `PriorityQueue` | Helps Dijkstra select the minimum-distance station |

---

# 19. ⚙️ Functional Requirements

The system must:

- Allow city selection.
- Display available cities.
- Display stations.
- Display routes.
- Accept source station.
- Accept destination station.
- Validate selected stations.
- Find the shortest route.
- Calculate route distance.
- Estimate travel time.
- Calculate estimated fare.
- Display transportation details.
- Allow users to return to city selection.
- Allow users to exit the application.

---

# 20. 🔧 Non-Functional Requirements

The system should provide:

- Simple user interface.
- Fast execution.
- Low memory requirements.
- Reliable shortest-path calculation.
- Easy-to-understand output.
- Command-line operation.
- No database dependency.
- No external libraries.
- Platform-independent Java execution.

---

# 21. 🔐 Input Validation

The system should handle invalid input such as:

```text
Invalid city selection
Invalid station selection
Invalid menu option
Invalid number input
Station not belonging to selected city
```

The validation prevents incorrect data from being passed to the route calculation algorithm.

---

# 22. 🏗️ Top-Down Design

The major functions of the system are:

```text
makeNetwork()
        ↓
Creates stations and routes

addStation()
        ↓
Adds a station to the network

connect()
        ↓
Connects two stations

showCities()
        ↓
Displays available cities

showStations()
        ↓
Displays stations of selected city

showRoutes()
        ↓
Displays routes of selected city

cityMenu()
        ↓
Displays city-specific operations

findRoute()
        ↓
Accepts source and destination

shortestPath()
        ↓
Calculates shortest route using Dijkstra

belongsToCity()
        ↓
Validates station and city

main()
        ↓
Controls complete application
```

---

# 23. 🧪 Test Cases

| Test Case | Input | Expected Result |
|---|---|---|
| TC01 | Valid city | Selected city menu is displayed |
| TC02 | Show stations | Stations are displayed |
| TC03 | Show routes | Routes are displayed |
| TC04 | Valid source and destination | Shortest route is displayed |
| TC05 | Invalid station | Error message displayed |
| TC06 | Invalid city | Error message displayed |
| TC07 | Invalid menu choice | Error message displayed |
| TC08 | Text instead of number | Input handled safely |
| TC09 | Same source and destination | Validation message displayed |
| TC10 | Exit option | Program terminates |

---

# 24. 📈 Complexity Analysis

For a graph represented using an adjacency list and a priority queue, Dijkstra's algorithm has an approximate time complexity of:

```text
O((V + E) log V)
```

Where:

```text
V = Number of stations / vertices

E = Number of routes / edges
```

The approximate space complexity is:

```text
O(V + E)
```

This includes the graph and supporting structures used by the algorithm.

---

# 25. 💻 Technology Requirements

### Programming Language

```text
Java
```

### Main Technologies / Concepts

```text
Java Collections Framework
Object-Oriented Programming
Graph Data Structure
Dijkstra's Algorithm
Command Line Interface
```

### Main Java Collections

```text
HashMap
ArrayList
HashSet
PriorityQueue
```

---

# 26. 🖥️ System Requirements

### Hardware

The project has minimal hardware requirements.

A basic computer capable of running Java is sufficient.

### Software

Required:

- Java Development Kit (JDK)
- Java Compiler
- Command Prompt / PowerShell / Terminal

Optional:

- Visual Studio Code
- IntelliJ IDEA
- Eclipse
- Git

---

# 27. ▶️ Execution

Compile the program using:

```bash
javac main.java
```

Run the program using:

```bash
java main
```

---

# 28. 📁 Project Structure

```text
Smart-Multi-City-Route-Planner/
│
├── main.java
│
└── README.md
```

Additional documentation may include:

```text
statement.md
```

where the project problem statement and system requirements are documented.

---

# 29. 🚀 Future Scope

The project can be extended with several advanced features.

### 🌍 More Cities

Additional cities can be added to create a larger transportation network.

### 🛣️ Inter-City Routing

Routes can be created between different cities.

### 📍 GPS Integration

The system could use the user's current location to find the nearest station.

### 🗺️ Interactive Maps

Routes could be displayed visually using a map interface.

### 🚦 Traffic-Based Routing

Real-time traffic information could be used to calculate better routes.

### 💰 Cheapest Route

The system could calculate routes based on minimum fare instead of minimum distance.

### ⚡ Fastest Route

The system could find routes based on minimum travel time.

### 🔀 Multiple Route Suggestions

The system could provide:

```text
Shortest Route
Fastest Route
Cheapest Route
```

### 🖥️ GUI

A graphical interface could be developed using JavaFX or Swing.

### 🌐 Web Application

The system could be converted into a web application using technologies such as Spring Boot.

### 📱 Mobile Application

The route planner could be developed as an Android application.

### 🗄️ Database

A database could be added to store stations, routes, fares, and transportation information dynamically.

---

# 30. 🌍 Applications

The concepts demonstrated by this project can be applied to:

- Public transportation
- Metro route planning
- Railway networks
- Navigation systems
- Logistics
- Delivery route optimization
- Fleet management
- Emergency route planning
- Smart city transportation
- GPS navigation systems

---

# 31. ⚠️ Limitations

The current version has some limitations:

- It is a command-line application.
- Transportation data is predefined.
- Station and route information is simulated.
- No real-time traffic data is used.
- No GPS integration is included.
- No database is connected.
- Fare and travel-time values are estimated.
- No graphical map is provided.
- Inter-city routing is not fully implemented.

---

# 32. 🎓 Academic Significance

This project provides practical implementation of theoretical concepts studied in:

- Java Programming
- Object-Oriented Programming
- Data Structures
- Algorithms
- Graph Theory

It demonstrates how a real-world transportation problem can be converted into a graph-based computational problem.

The project particularly demonstrates the practical use of:

```text
Weighted Graph
       +
Adjacency List
       +
Priority Queue
       +
Dijkstra's Algorithm
       =
Shortest Route Calculation
```

---

# 33. 📚 Learning Outcomes

After completing this project, the developer gains practical understanding of:

- Java programming
- Object-oriented design
- Graph representation
- Weighted graphs
- Adjacency lists
- Java Collections
- Priority queues
- Dijkstra's algorithm
- Path reconstruction
- Exception handling
- Input validation
- Algorithm complexity
- Problem-solving
- Command-line application development

---

# 34. ⚠️ Important Note

This project is designed primarily for **academic and educational purposes**.

The station names, routes, distances, transportation modes, travel times, and fare calculations are simulated data.

The following formulas are examples used for demonstration:

```text
Bus Fare:
Fare = 10 + (Distance × 2)

Metro Fare:
Fare = 15 + (Distance × 1.5)

Bus Time:
Time = Distance × 3 minutes

Metro Time:
Time = Distance × 2 minutes
```

These values should not be considered official transportation fares, schedules, or real-world travel times.

---

# 35. ✅ Expected Outcome

After successful implementation, the system should allow a user to:

```text
1. Select a city
        ↓
2. View available stations
        ↓
3. View available routes
        ↓
4. Select source station
        ↓
5. Select destination station
        ↓
6. Calculate shortest route
        ↓
7. View total distance
        ↓
8. View estimated travel time
        ↓
9. View estimated fare
        ↓
10. View transportation details
```

The final system should successfully demonstrate how graph algorithms can be used to solve a practical route-planning problem.

---

# 36. 📝 Final Project Statement

The **Smart Multi-City Route Planner** is a Java-based route-planning system that models transportation networks as weighted graphs and uses **Dijkstra's Shortest Path Algorithm** to determine the shortest route between stations.

The project combines **Java, Object-Oriented Programming, Data Structures, Graph Theory, and Algorithms** to provide a simple but practical transportation route-planning solution.

The system demonstrates how a complex real-world problem can be represented using appropriate data structures and solved efficiently using an algorithmic approach.

---

# 👨‍💻 Author

**Mohit Yadav**

B.Tech Computer Science and Engineering  
AI/ML Specialization  
VIT Bhopal University

---

# 📄 Project Information

| Field | Details |
|---|---|
| Project Name | Smart Multi-City Route Planner |
| Language | Java |
| Interface | Command Line |
| Algorithm | Dijkstra's Shortest Path |
| Graph | Weighted Graph |
| Graph Representation | Adjacency List |
| Cities | Bhopal, Indore, Ujjain, Sehore |
| Main Data Structures | HashMap, ArrayList, HashSet, PriorityQueue |
| Purpose | Academic / Educational |

---

# ⭐ Conclusion

The Smart Multi-City Route Planner provides a practical demonstration of shortest-path algorithms and Java programming concepts.

By representing transportation stations as vertices and routes as weighted edges, the system can efficiently determine the shortest route between two stations.

The project provides a strong foundation for future improvements such as real-time traffic, GPS integration, interactive maps, database connectivity, web applications, and mobile applications.

```text
Java
+
OOP
+
Data Structures
+
Graph Theory
+
Dijkstra's Algorithm
=
Smart Multi-City Route Planner
```
