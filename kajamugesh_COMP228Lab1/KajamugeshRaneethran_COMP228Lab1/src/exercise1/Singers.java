package exercise1;

public class Singers {
  // Declaring Instance Variables
  private int id;
  private String name;
  private String address;
  private String date_of_birth;
  private int albums;

  // Constructors
  public Singers() {
    this.id = 0;
    this.name = "default";
    this.address = "default";
    this.date_of_birth = "default";
    this.albums = 0;
  }

  public Singers(int id, String name, String address, String date_of_birth,
      int albums) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.date_of_birth = date_of_birth;
    this.albums = albums;
  }

  // Getter and Setter methods
  public void setSinger(int id, String name, String address,
      String date_of_birth, int albums) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.date_of_birth = date_of_birth;
    this.albums = albums;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDate_of_birth() {
    return date_of_birth;
  }

  public void setDate_of_birth(String date_of_birth) {
    this.date_of_birth = date_of_birth;
  }

  public int getAlbums() {
    return albums;
  }

  public void setAlbums(int albums) {
    this.albums = albums;
  }

  @Override
  public String toString() {
    return "Singers [id=" + id + ", name=" + name + ", address=" + address
        + ", date_of_birth=" + date_of_birth + ", albums=" + albums + "]";
  }



}
