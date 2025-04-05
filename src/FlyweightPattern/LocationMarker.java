package FlyweightPattern;

public class LocationMarker {
    private double latitude, longitude;
    private MarkerStyle markerStyle;

    public LocationMarker(double latitude, double longitude, MarkerStyle markerStyle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.markerStyle = markerStyle;
    }

    public void display() {
        System.out.println("Marker at (" + latitude + ", " + longitude + ") with style: " + markerStyle);
    }
}
