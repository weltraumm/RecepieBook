import java.util.ArrayList;
import java.util.List;

public class PrivateCollection {
    private String name;
    public List<Catalog> catalogList;
    public List<Recipe>recipeList;

    public void changeRecipe(Recipe recipe){

    }
    public void changeCatalog(Catalog catalog){

    }
    public void unloadRecipe(Recipe recipe){

    }







    public String getName() {
        return name;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<Recipe> getRecipeList() {
        if(recipeList==null)
            recipeList =new ArrayList<>();
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
