import java.util.List;

public class SetOfRecipes {
    public SetOfCriteria setOfCriteria;
    public List<NetRecipe>netRecipeList;

    public int selectionOfSets()
    {
        return 4;
    }


    public SetOfCriteria getSetOfCriteria() {
        return setOfCriteria;
    }

    public void setSetOfCriteria(SetOfCriteria setOfCriteria) {
        this.setOfCriteria = setOfCriteria;
    }

    public List<NetRecipe> getNetRecipeList() {
        return netRecipeList;
    }

    public void setNetRecipeList(List<NetRecipe> netRecipeList) {
        this.netRecipeList = netRecipeList;
    }
}
