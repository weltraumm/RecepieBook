public class Injector {
    public void createUI() {
        PrivateCollection privateCollection = new PrivateCollection();
        UploadNetRecipe uploadNetRecipe = new UploadNetRecipe("upload");
        ChangeNetRecipe changeNetRecipe = new ChangeNetRecipe("change");
        AddNetRecipe addNetRecipe = new AddNetRecipe("add");
        ManagerMenuUI managerMenuUI = new ManagerMenuUI();
        managerMenuUI.commands.add(uploadNetRecipe);
        managerMenuUI.commands.add(changeNetRecipe);
        managerMenuUI.commands.add(addNetRecipe);
        GeneralCollection generalCollection = new GeneralCollection();
        managerMenuUI.setGeneralCollection(generalCollection);
        managerMenuUI.setPrivateCollection(privateCollection);
        managerMenuUI.createGCWindow();




    }
}
