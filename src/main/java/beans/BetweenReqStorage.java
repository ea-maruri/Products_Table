package beans;

import java.util.ArrayList;
import java.util.List;


/**
 * @author dfellig
 * @author EAMT on 23/11/2020
 */
public class BetweenReqStorage {

    private final List<Product> filteredDataList = new ArrayList<>();

    private static final BetweenReqStorage singleton = new BetweenReqStorage();

    public static BetweenReqStorage getSingleton() {
        return singleton;
    }

    public List<Product> getFilteredDataList() {
        return filteredDataList;
    }

    public void setFilteredDataList(List<Product> filteredDataList) {
        this.filteredDataList.clear();
        this.filteredDataList.addAll(filteredDataList);
    }

    public void clearAll() {
        filteredDataList.clear();
    }

}
