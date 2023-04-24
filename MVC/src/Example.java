// Model class
class WeaponModel {
    private String type;
    private int ammo;
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }
}

// View class
class WeaponView {
    public void displayWeaponDetails(String type, int ammo) {
        System.out.println("Weapon Type: " + type + ", Ammo: " + ammo);
    }
}

// Controller class
class WeaponController {
    private WeaponModel model;
    private WeaponView view;
    public WeaponController(WeaponModel model, WeaponView view) {
        this.model = model;
        this.view = view;
    }

    public void setWeaponType(String type) {
        model.setType(type);
    }

    public void setWeaponAmmo(int ammo) {
        model.setAmmo(ammo);
    }

    public String getWeaponType() {
        return model.getType();
    }

    public int getWeaponAmmo() {
        return model.getAmmo();
    }

    public void updateView() {
        view.displayWeaponDetails(model.getType(), model.getAmmo());
    }

}

// Example usage
public class Example {
    public static void main(String[] args) {
// Create a model, view, and controller
        WeaponModel model = new WeaponModel();
        WeaponView view = new WeaponView();
        WeaponController controller = new WeaponController(model, view);
        // Set the weapon type and ammo
        controller.setWeaponType("Pistol");
        controller.setWeaponAmmo(10);

        // Update the view
        controller.updateView();
    }
}