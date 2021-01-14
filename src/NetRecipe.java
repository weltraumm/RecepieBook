import java.util.Date;

public class NetRecipe extends Recipe {
    private Date addDate;
    private int downloadCount, energyValue;
    public Catalog catalog;

    public String view() {
        return addDate.toString() + downloadCount + energyValue;

    }

    public int change(String string) {
        this.name = string;
        return 4;
    }

    @Override
    public Catalog getCatalog() {
        return catalog;
    }

    @Override
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public int changeCatalog(Catalog inCatalog) {
        return 4;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(int energyValue) {
        this.energyValue = energyValue;
    }
}
