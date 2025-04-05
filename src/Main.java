import FlyweightPattern.*;
import ProxyPattern.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Proxy Pattern Demo ---");
        ProxyImage img1 = new ProxyImage("house1.jpg");
        img1.displayThumbnail();
        img1.displayFullImage();

        ImageUploader agent = new ImageUploader(true);
        agent.uploadImage("new_house.jpg");

        System.out.println("\n--- Flyweight Pattern Demo ---");
        MarkerStyle hospitalStyle = MarkerStyle.getStyle("hospital", "red", "bold");
        MarkerStyle restaurantStyle = MarkerStyle.getStyle("restaurant", "blue", "italic");

        LocationMarker[] markers = {
                new LocationMarker(40.7128, -74.0060, hospitalStyle),
                new LocationMarker(34.0522, -118.2437, restaurantStyle),
                new LocationMarker(37.7749, -122.4194, hospitalStyle),
                new LocationMarker(51.5074, -0.1278, restaurantStyle)
        };

        for (LocationMarker marker : markers) {
            marker.display();
        }

        System.out.println("Unique styles used: " + MarkerStyle.styles.size());
        System.out.println("Total markers created: " + markers.length);
    }
}