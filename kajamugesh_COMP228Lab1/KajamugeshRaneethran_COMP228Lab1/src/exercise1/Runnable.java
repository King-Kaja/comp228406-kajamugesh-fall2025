package exercise1;

public class Runnable {

  public static void main(String[] args) {
    // Create instance of Singers
    Singers singer1 = new Singers();

    System.out.println(singer1.toString());

    singer1.setSinger(1, "John Singer", "1 Singer road", "2000-01-01", 1);

    System.out.println(singer1.toString());

    singer1.setId(2);
    System.out.println(singer1.getId());

    singer1.setName("Bluey");
    System.out.println(singer1.getName());

    singer1.setAddress("43 Progress Avenue");
    System.out.println(singer1.getAddress());

    singer1.setDate_of_birth("1900-02-31");
    System.out.println(singer1.getDate_of_birth());

    singer1.setAlbums(50);
    System.out.println(singer1.getAlbums());

  }

}
