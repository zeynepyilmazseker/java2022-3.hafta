public abstract class BaseCreditManager implements ICreditManager {
    public abstract void add();

    public void save() {
        System.out.println("kaydedildi.");
    };
}
