package kg.geeks.recyclerpractice1;

public class Contact {

    private int image;
    private String title;
    private String subtitle;

    public Contact(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
