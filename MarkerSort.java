
class Marker {
    String brand;
    String type;
    double price;
    String color;

    // Parameterized Constructor
    public Marker(String brand, String type, double price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    // Copy Constructor
    public Marker(Marker m) {
        this.brand = m.brand;
        this.type = m.type;
        this.price = m.price;
        this.color = m.color;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Type: " + type + ", Price: " + price + ", Color: " + color);
    }
}

public class MarkerSort {
    public static void main(String[] args) {
        Marker[] markers = new Marker[5];

        markers[0] = new Marker("Camlin", "Permanent", 30.5, "Red");
        markers[1] = new Marker("Faber", "Whiteboard", 25.0, "Green");
        markers[2] = new Marker("Luxor", "Sketch", 15.5, "Blue");
        markers[3] = new Marker("Cello", "Gel", 20.0, "Black");
        markers[4] = new Marker("Reynolds", "Highlighter", 18.0, "Orange");

        Marker[] markerCopies = new Marker[5];
        for (int i = 0; i < markers.length; i++) {
            markerCopies[i] = new Marker(markers[i]);
        }

        for (int i = 1; i < markerCopies.length; i++) {
            Marker key = markerCopies[i];
            int j = i - 1;

            while (j >= 0 && markerCopies[j].color.compareToIgnoreCase(key.color) < 0) {
                markerCopies[j + 1] = markerCopies[j];
                j = j - 1;
            }
            markerCopies[j + 1] = key;
        }

        System.out.println("Markers sorted in descending order of color:");
        for (Marker m : markerCopies) {
            m.display();
        }
    }
}
