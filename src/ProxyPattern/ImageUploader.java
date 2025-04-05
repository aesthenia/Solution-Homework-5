package ProxyPattern;

public class ImageUploader {
    private boolean agentLoggedIn;

    public ImageUploader(boolean agentLoggedIn) {
        this.agentLoggedIn = agentLoggedIn;
    }

    public void uploadImage(String filename) {
        if (agentLoggedIn) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access Denied: Please log in to upload images.");
        }
    }
}
