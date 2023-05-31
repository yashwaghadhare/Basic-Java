public class Jencapsule {
    
    private String name;
 
    // Getter
    public String getName() {
      return name;
    }
 
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

    public static void main(String[] args) {
      Jencapsule myObj = new Jencapsule();
      myObj.setName("name1");
      System.out.println(myObj.getName());

      Jencapsule myObj1 = new Jencapsule();
      myObj1.setName("name2");
      System.out.println(myObj1.getName());
    }
  }