public class Recipe {
    protected String name, description;
    public Catalog catalog;

    public String view() {
        return name + description;
    }

    public int change(String string) {
        return 4;
    }

    public int changeCatalog(Catalog catalog) {
        this.catalog = catalog;
        return 4;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
