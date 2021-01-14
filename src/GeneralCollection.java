import java.util.ArrayList;
import java.util.List;

public class GeneralCollection {
    public List<PrivateCollection> privateCollectionList;
    public List<NetRecipe> netRecipes;
    public List<SetOfRecipes> listOfSets;
    public SetOfCriteria setOfCriteria;
    public List<ErrorMessage> errorMessages;

    public NetRecipe changeNetRecipe(NetRecipe netRecipe) {
        return null;
    }

    public void uploadNetRecipe(NetRecipe netRecipe) {
        netRecipe.setDownloadCount(netRecipe.getDownloadCount()+1);

    }

    public void addMessageError() {

    }

    public SetOfRecipes searchBySetOfCriteria(SetOfCriteria setOfCriteria) {
        for (SetOfRecipes recipes : listOfSets) {
            if (recipes.getSetOfCriteria().equals(setOfCriteria))
                return recipes;
        }
        return null;
    }

    public void chooseSet() {
        System.out.println("выбрали");
    }

    public SetOfRecipes setOfRecipesSelection() {
        return null;
    }

    public void calculationOfRecipeStatistics(NetRecipe netRecipe) {
        netRecipe.getDownloadCount();

    }


    public List<PrivateCollection> getPrivateCollectionList() {
        return privateCollectionList;
    }

    public void setPrivateCollectionList(List<PrivateCollection> privateCollectionList) {
        this.privateCollectionList = privateCollectionList;
    }

    public List<NetRecipe> getNetRecipes() {
        if( netRecipes==null)
            netRecipes = new ArrayList<>();

        return netRecipes;
    }

    public void setNetRecipes(List<NetRecipe> netRecipes) {
        this.netRecipes = netRecipes;
    }

    public List<SetOfRecipes> getListOfSets() {
        return listOfSets;
    }

    public void setListOfSets(List<SetOfRecipes> listOfSets) {
        this.listOfSets = listOfSets;
    }

    public SetOfCriteria getSetOfCriteria() {
        return setOfCriteria;
    }

    public void setSetOfCriteria(SetOfCriteria setOfCriteria) {
        this.setOfCriteria = setOfCriteria;
    }

    public List<ErrorMessage> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<ErrorMessage> errorMessages) {
        this.errorMessages = errorMessages;
    }
}
