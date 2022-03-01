package Unit9_Inheritance.Notes;

public class MenuItem {
    private String name;

    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "this is a menu item called" + name;
    }
}
