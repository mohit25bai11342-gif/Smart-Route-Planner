# 🚌 Smart Multi-City Route Planner

## →→→ Introduction

Transportation networks contain many stations and routes, making it difficult to manually determine the shortest and most efficient path between two locations.

This project presents a **Java-based Smart Multi-City Route Planner** that uses graph data structures and **Dijkstra's Shortest Path Algorithm** to find the shortest route between stations.

The system supports four cities:

- Bhopal
- Indore
- Ujjain
- Sehore

The application:

- Allows the user to select a city
- Displays stations of the selected city
- Displays available routes
- Finds the shortest route between two stations
- Calculates total distance
- Estimates travel time
- Calculates estimated fare
- Displays transport details

The goal is to build a simple command-line route planning system using Java, Object-Oriented Programming, data structures, and graph algorithms.

---

## Real-World Problem

Finding an efficient route between different stations can become difficult when a transportation network contains many interconnected stations.

Many problems include:

- Large number of stations
- Multiple routes between locations
- Different transportation modes
- Difficulty in manually finding the shortest route
- Need for quick route calculation
- Different travel times and fares

**Major Issue:**

- Difficulty in finding the shortest and most efficient route manually

An automated route planning system can calculate the best route quickly using graph algorithms.

---

## Objectives

- Find the shortest route between two stations
- Support multiple cities
- Display stations of the selected city
- Display available routes
- Calculate total route distance
- Estimate travel time
- Calculate estimated fare
- Display transportation details
- Apply Dijkstra's Shortest Path Algorithm
- Demonstrate Object-Oriented Programming concepts
- Implement graph data structures
- Provide a completely command-line based application

---

## Concepts Used (From Coursework)

- Classes and Objects
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Interface
- Abstract Class
- Method Overriding
- Data Structures
- Graph
- Adjacency List
- Priority Queue
- HashMap
- ArrayList
- HashSet
- Comparable
- Dijkstra's Algorithm
- Exception Handling
- Conditional Statements
- Loops
- Functions / Methods
- User Input using Scanner

---

## Tools & Technologies

- Java

### Data Structures:

- HashMap
- ArrayList
- HashSet
- PriorityQueue

### Java Concepts:

- Interface
- Abstract Class
- Inheritance
- Encapsulation
- Polymorphism
- Comparable
- Exception Handling

### Algorithm:

- Dijkstra's Shortest Path Algorithm

### User Interface:

- Console / Command Line Interface

---

## Problem Definition

- Users may have multiple possible routes between stations
- Manually finding the shortest route is difficult
- Different routes may have different distances
- Transportation modes may have different travel times and fares
- A route planning system is required to automatically calculate the best route

This system solves the problem using a **weighted graph and Dijkstra's shortest path algorithm**.

---

## Requirements Analysis

### Functional Requirements

- Select a city
- Display stations of the selected city
- Display routes of the selected city
- Accept starting station
- Accept destination station
- Find shortest route
- Calculate total route distance
- Calculate estimated travel time
- Calculate estimated fare
- Display transport details
- Allow users to return to city selection
- Exit the application

### Non-Functional Requirements

- Easy to use
- Fast execution
- Low memory usage
- Simple command-line interface
- No GUI required
- No database required
- No external libraries required
- Reliable route calculation

---

## Top-Down Design (Modules)

```text
makeNetwork()        → Creates stations and routes
addStation()         → Adds a station to the network
connect()            → Connects two stations
showCities()         → Displays available cities
showStations()       → Displays stations of selected city
showRoutes()         → Displays routes of selected city
cityMenu()           → Displays city-specific menu
findRoute()          → Takes source and destination
shortestPath()       → Finds shortest route using Dijkstra
belongsToCity()      → Validates station and city
main()               → Runs the complete system
