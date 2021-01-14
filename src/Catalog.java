import java.util.List;

public class Catalog {
    private String name, description;
    public List<Catalog> catalogList;
    public List<Recipe> recipeList;


    public String view() {
        return this.name + this.description;
    }

    public void addCatalog(Catalog innerCatalog) {
        this.catalogList.add(innerCatalog);
    }


    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
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
