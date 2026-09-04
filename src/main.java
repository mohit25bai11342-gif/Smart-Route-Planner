import java.util.*;

interface TravelMode {
    String type();
    double fare(double km);
    int time(double km);
}

abstract class Vehicle implements TravelMode {
    private final String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CityBus extends Vehicle {
    CityBus() {
        super("City Bus");
    }

    @Override
    public String type() {
        return "Bus";
    }

    @Override
    public double fare(double km) {
        return 10 + km * 2;
    }

    @Override
    public int time(double km) {
        return (int) Math.ceil(km * 3);
    }
}

class Metro extends Vehicle {
    Metro() {
        super("Metro");
    }

    @Override
    public String type() {
        return "Metro";
    }

    @Override
    public double fare(double km) {
        return 15 + km * 1.5;
    }

    @Override
    public int time(double km) {
        return (int) Math.ceil(km * 2);
    }
}

class Station {
    private final int number;
    private final String name;
    private final String city;

    Station(int number, String name, String city) {
        this.number = number;
        this.name = name;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Connection {
    private final Station station;
    private final double distance;
    private final Vehicle vehicle;

    Connection(Station station, double distance, Vehicle vehicle) {
        this.station = station;
        this.distance = distance;
        this.vehicle = vehicle;
    }

    public Station getStation() {
        return station;
    }

    public double getDistance() {
        return distance;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

class Point implements Comparable<Point> {
    final Station station;
    final double distance;

    Point(Station station, double distance) {
        this.station = station;
        this.distance = distance;
    }

    @Override
    public int compareTo(Point other) {
        return Double.compare(distance, other.distance);
    }
}

public class main {
    private static final Map<Integer, Station> stations = new HashMap<>();
    private static final Map<Integer, ArrayList<Connection>> routes = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);

    private static void addStation(int number, String name, String city) {
        stations.put(number, new Station(number, name, city));
        routes.put(number, new ArrayList<>());
    }

    private static void connect(int from, int to, double km, Vehicle vehicle) {
        if (!stations.containsKey(from) || !stations.containsKey(to)) {
            return;
        }

        routes.get(from).add(new Connection(stations.get(to), km, vehicle));
        routes.get(to).add(new Connection(stations.get(from), km, vehicle));
    }

    private static void makeNetwork() {
        Vehicle bus = new CityBus();
        Vehicle metro = new Metro();

        // Bhopal
        addStation(1, "Bhopal Junction", "Bhopal");
        addStation(2, "Nadra Bus Stand", "Bhopal");
        addStation(3, "Habibganj Railway Station", "Bhopal");
        addStation(4, "MP Nagar", "Bhopal");
        addStation(5, "Kolar Road", "Bhopal");
        addStation(6, "Lalghati", "Bhopal");
        addStation(7, "New Market", "Bhopal");
        addStation(8, "Roshanpura", "Bhopal");
        addStation(9, "Board Office", "Bhopal");
        addStation(10, "AIIMS Bhopal", "Bhopal");
        addStation(11, "Berasia Road", "Bhopal");
        addStation(12, "Karond", "Bhopal");
        addStation(13, "Ayodhya Bypass", "Bhopal");
        addStation(14, "Raisen Road", "Bhopal");
        addStation(15, "BHEL", "Bhopal");
        addStation(16, "Govindpura", "Bhopal");
        addStation(17, "Arera Colony", "Bhopal");
        addStation(18, "Shahpura", "Bhopal");
        addStation(19, "Misrod", "Bhopal");
        addStation(20, "Bairagarh", "Bhopal");

        // Routes
        connect(1, 2, 3, bus);
        connect(1, 7, 4, bus);
        connect(1, 6, 5, bus);
        connect(2, 11, 4, bus);
        connect(2, 12, 5, bus);
        connect(7, 8, 1.5, bus);
        connect(7, 9, 2, metro);
        connect(8, 9, 2, bus);
        connect(8, 17, 3, bus);
        connect(9, 4, 2, metro);
        connect(9, 16, 4, bus);
        connect(4, 3, 4, metro);
        connect(4, 17, 3, bus);
        connect(3, 10, 4, bus);
        connect(3, 18, 3, bus);
        connect(17, 18, 3, bus);
        connect(18, 5, 4, bus);
        connect(18, 19, 4, bus);
        connect(19, 5, 5, bus);
        connect(6, 20, 7, bus);
        connect(6, 7, 4, bus);
        connect(11, 12, 4, bus);
        connect(12, 13, 5, bus);
        connect(13, 14, 5, bus);
        connect(14, 15, 6, bus);
        connect(15, 16, 3, bus);
        connect(16, 4, 5, bus);
        connect(20, 6, 6, bus);


        // Indore
        addStation(21, "Indore Junction", "Indore");
        addStation(22, "Sarwate Bus Stand", "Indore");
        addStation(23, "Rajwada", "Indore");
        addStation(24, "Palasia", "Indore");
        addStation(25, "Vijay Nagar", "Indore");
        addStation(26, "Bhawarkua", "Indore");
        addStation(27, "Rau", "Indore");
        addStation(28, "Bengali Square", "Indore");
        addStation(29, "Airport Road", "Indore");
        addStation(30, "MR 10", "Indore");
        addStation(31, "Scheme No. 54", "Indore");
        addStation(32, "LIG Square", "Indore");
        addStation(33, "Geeta Bhawan", "Indore");
        addStation(34, "Choithram Square", "Indore");
        addStation(35, "Silicon City", "Indore");
        addStation(36, "Vijay Nagar Square", "Indore");
        addStation(37, "Rau Circle", "Indore");
        addStation(38, "Khajrana", "Indore");
        addStation(39, "Bicholi Mardana", "Indore");
        addStation(40, "Bapat Square", "Indore");

        // Routes
        connect(21, 22, 2, bus);
        connect(22, 23, 2.5, bus);
        connect(23, 24, 3, bus);
        connect(24, 25, 4, metro);
        connect(25, 31, 2, metro);
        connect(24, 33, 2, bus);
        connect(33, 32, 2.5, bus);
        connect(32, 26, 3, bus);
        connect(26, 27, 5, bus);
        connect(26, 28, 4, bus);
        connect(28, 34, 3, bus);
        connect(34, 35, 5, bus);
        connect(25, 30, 5, bus);
        connect(30, 29, 7, bus);
        connect(25, 36, 2, bus);
        connect(36, 38, 4, bus);
        connect(38, 39, 4, bus);
        connect(39, 40, 3, bus);
        connect(40, 34, 4, bus);
        connect(37, 27, 3, bus);
        connect(37, 35, 5, bus);


        // Ujjain
        addStation(41, "Ujjain Junction", "Ujjain");
        addStation(42, "Freeganj", "Ujjain");
        addStation(43, "Tower Chowk", "Ujjain");
        addStation(44, "Mahakal Temple", "Ujjain");
        addStation(45, "Ramghat", "Ujjain");
        addStation(46, "Dewas Gate", "Ujjain");
        addStation(47, "Nanakheda", "Ujjain");
        addStation(48, "Madhav Nagar", "Ujjain");
        addStation(49, "Indore Road", "Ujjain");
        addStation(50, "Agar Road", "Ujjain");
        addStation(51, "Maxi Road", "Ujjain");
        addStation(52, "Engineering College", "Ujjain");
        addStation(53, "Chimanganj Mandi", "Ujjain");
        addStation(54, "Vikram Nagar", "Ujjain");
        addStation(55, "Nagda Road", "Ujjain");
        addStation(56, "Triveni Museum", "Ujjain");
        addStation(57, "Harsiddhi", "Ujjain");
        addStation(58, "Muni Nagar", "Ujjain");
        addStation(59, "Anand Nagar", "Ujjain");
        addStation(60, "Sanwer Road", "Ujjain");

        // Routes
        connect(41, 42, 2, bus);
        connect(42, 43, 2, bus);
        connect(43, 44, 2.5, bus);
        connect(44, 45, 1.5, bus);
        connect(45, 57, 2, bus);
        connect(43, 46, 2, metro);
        connect(46, 48, 3, bus);
        connect(48, 47, 4, bus);
        connect(47, 49, 3, bus);
        connect(49, 52, 4, bus);
        connect(52, 54, 3, bus);
        connect(54, 55, 5, bus);
        connect(55, 53, 4, bus);
        connect(53, 51, 3, bus);
        connect(51, 50, 5, bus);
        connect(50, 60, 4, bus);
        connect(60, 59, 5, bus);
        connect(59, 58, 3, bus);
        connect(58, 56, 3, bus);
        connect(56, 57, 2, bus);
        connect(57, 44, 2, bus);


        // Sehore
        addStation(61, "Sehore Railway Station", "Sehore");
        addStation(62, "Sehore Bus Stand", "Sehore");
        addStation(63, "Town Hall", "Sehore");
        addStation(64, "Mandi Road", "Sehore");
        addStation(65, "Bada Bazaar", "Sehore");
        addStation(66, "Gandhi Chowk", "Sehore");
        addStation(67, "Collectorate", "Sehore");
        addStation(68, "Civil Hospital", "Sehore");
        addStation(69, "Bilqisganj Road", "Sehore");
        addStation(70, "Indore Naka", "Sehore");
        addStation(71, "Bhopal Naka", "Sehore");
        addStation(72, "Ashta Road", "Sehore");
        addStation(73, "Shyampur Road", "Sehore");
        addStation(74, "Ichhawar Road", "Sehore");
        addStation(75, "Rehti Road", "Sehore");
        addStation(76, "Police Line", "Sehore");
        addStation(77, "Industrial Area", "Sehore");
        addStation(78, "New Sehore", "Sehore");
        addStation(79, "Housing Board", "Sehore");
        addStation(80, "Kisan Nagar", "Sehore");

        // Routes
        connect(61, 62, 2, bus);
        connect(62, 63, 2, bus);
        connect(63, 64, 2.5, bus);
        connect(64, 65, 2, bus);
        connect(65, 66, 1.5, bus);
        connect(66, 67, 2, bus);
        connect(67, 68, 2, bus);
        connect(68, 69, 3, bus);
        connect(69, 70, 4, bus);
        connect(70, 71, 3, bus);
        connect(71, 72, 4, bus);
        connect(72, 73, 5, bus);
        connect(73, 74, 4, bus);
        connect(74, 75, 5, bus);
        connect(75, 76, 4, bus);
        connect(76, 77, 3, bus);
        connect(77, 78, 3, bus);
        connect(78, 79, 2, bus);
        connect(79, 80, 3, bus);
        connect(80, 61, 6, bus);
        connect(63, 67, 3, bus);
        connect(66, 71, 4, bus);

    }

    private static void showCities() {
        System.out.println("\n========================================");
        System.out.println("           SMART ROUTE PLANNER");
        System.out.println("========================================");
        System.out.println("1. Bhopal");
        System.out.println("2. Indore");
        System.out.println("3. Ujjain");
        System.out.println("4. Sehore");
        System.out.println("5. Exit");
        System.out.println("========================================");
    }

    private static String getCityName(int choice) {
        switch (choice) {
            case 1: return "Bhopal";
            case 2: return "Indore";
            case 3: return "Ujjain";
            case 4: return "Sehore";
            default: return "";
        }
    }

    private static void showStations(String city) {
        System.out.println("\n----------- " + city + " Stations -----------");

        ArrayList<Integer> ids = new ArrayList<>();
        for (Station station : stations.values()) {
            if (station.getCity().equals(city)) {
                ids.add(station.getNumber());
            }
        }

        Collections.sort(ids);
        for (int id : ids) {
            System.out.println(id + ". " + stations.get(id).getName());
        }
    }

    private static boolean belongsToCity(int stationNumber, String city) {
        Station station = stations.get(stationNumber);
        return station != null && station.getCity().equals(city);
    }

    private static void showRoutes(String city) {
        System.out.println("\n------------- " + city + " Routes -------------");

        HashSet<String> shown = new HashSet<>();

        for (Station from : stations.values()) {
            if (!from.getCity().equals(city)) {
                continue;
            }

            for (Connection route : routes.get(from.getNumber())) {
                Station to = route.getStation();
                if (!to.getCity().equals(city)) {
                    continue;
                }

                int first = Math.min(from.getNumber(), to.getNumber());
                int second = Math.max(from.getNumber(), to.getNumber());
                String key = first + "-" + second;

                if (shown.add(key)) {
                    System.out.println(
                        from.getName() + " <-> " + to.getName()
                        + " | " + route.getDistance() + " km | "
                        + route.getVehicle().type()
                    );
                }
            }
        }
    }

    private static void shortestPath(int start, int end, String city) {
        if (!belongsToCity(start, city) || !belongsToCity(end, city)) {
            System.out.println("\nPlease select stations from " + city + " only.");
            return;
        }

        Map<Integer, Double> distance = new HashMap<>();
        Map<Integer, Integer> previous = new HashMap<>();
        Map<Integer, Connection> usedRoute = new HashMap<>();

        for (Station station : stations.values()) {
            if (station.getCity().equals(city)) {
                distance.put(station.getNumber(), Double.MAX_VALUE);
            }
        }

        distance.put(start, 0.0);

        PriorityQueue<Point> queue = new PriorityQueue<>();
        queue.add(new Point(stations.get(start), 0));

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int currentId = current.station.getNumber();

            // Ignore an older entry if a shorter distance is already known.
            if (current.distance > distance.get(currentId)) {
                continue;
            }

            for (Connection route : routes.get(currentId)) {
                Station next = route.getStation();

                if (!next.getCity().equals(city)) {
                    continue;
                }

                int nextId = next.getNumber();
                double newDistance = current.distance + route.getDistance();

                if (newDistance < distance.get(nextId)) {
                    distance.put(nextId, newDistance);
                    previous.put(nextId, currentId);
                    usedRoute.put(nextId, route);
                    queue.add(new Point(next, newDistance));
                }
            }
        }

        if (distance.get(end) == Double.MAX_VALUE) {
            System.out.println("\nNo route was found.");
            return;
        }

        ArrayList<Integer> path = new ArrayList<>();
        int current = end;

        while (current != start) {
            path.add(current);
            current = previous.get(current);
        }

        path.add(start);
        Collections.reverse(path);

        System.out.println("\n========================================");
        System.out.println("              BEST ROUTE");
        System.out.println("========================================");

        for (int i = 0; i < path.size(); i++) {
            System.out.print(stations.get(path.get(i)).getName());
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();

        double totalDistance = distance.get(end);
        double totalFare = 0;
        int totalTime = 0;

        for (int i = 1; i < path.size(); i++) {
            Connection route = usedRoute.get(path.get(i));
            totalFare += route.getVehicle().fare(route.getDistance());
            totalTime += route.getVehicle().time(route.getDistance());
        }

        System.out.printf("Distance : %.2f km%n", totalDistance);
        System.out.println("Time     : " + totalTime + " minutes");
        System.out.printf("Fare     : Rs. %.2f%n", totalFare);

        System.out.println("\nTransport Details:");
        for (int i = 1; i < path.size(); i++) {
            Connection route = usedRoute.get(path.get(i));
            String from = stations.get(path.get(i - 1)).getName();
            String to = stations.get(path.get(i)).getName();

            System.out.println("  " + from + " -> " + to
                    + " : " + route.getVehicle().type());
        }

        System.out.println("========================================");
    }

    private static void findRoute(String city) {
        showStations(city);

        try {
            System.out.print("\nEnter starting station number: ");
            int start = Integer.parseInt(input.nextLine());

            System.out.print("Enter destination station number: ");
            int end = Integer.parseInt(input.nextLine());

            shortestPath(start, end, city);
        } catch (NumberFormatException e) {
            System.out.println("\nPlease enter numbers only.");
        }
    }

    private static void cityMenu(String city) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("          " + city.toUpperCase() + " ROUTE PLANNER");
            System.out.println("========================================");
            System.out.println("1. Show stations");
            System.out.println("2. Show routes");
            System.out.println("3. Find shortest route");
            System.out.println("4. Back to city selection");
            System.out.println("========================================");

            System.out.print("Enter choice: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                showStations(city);
            } else if (choice.equals("2")) {
                showRoutes(city);
            } else if (choice.equals("3")) {
                findRoute(city);
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("\nInvalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        makeNetwork();

        while (true) {
            showCities();
            System.out.print("Enter choice: ");
            String choice = input.nextLine();

            try {
                int cityChoice = Integer.parseInt(choice);

                if (cityChoice == 5) {
                    System.out.println("\nThank you for using Smart Multi-City Route Planner.");
                    break;
                }

                if (cityChoice >= 1 && cityChoice <= 4) {
                    cityMenu(getCityName(cityChoice));
                } else {
                    System.out.println("\nInvalid city choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter numbers only.");
            }
        }

        input.close();
    }
}
