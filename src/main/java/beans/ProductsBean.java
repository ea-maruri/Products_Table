package beans;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

/**
 * @author EAMT on 23/11/2020
 * Used to create <strong>Product</strong> instances
 */
@Named("productsBean")
@ViewScoped
public class ProductsBean implements Serializable {
    HashSet<Product> dataHashSet = new HashSet<>();
    HashMap<String, Product> dataHashMap = new HashMap<>();
    List<Product> dataList = new ArrayList<>();

    private String serialNumberSortType = "asc";
    private String nameSortType = "asc";
    private String itemPriceSortType = "asc";
    private String stockSortType = "asc";


    /*Constructor*/
    public ProductsBean() {
        // For Hash Set
        dataHashSet.add(new Product("00000100", "brown shirts", 31.43, 300));
        dataHashSet.add(new Product("10000011", "green shorts", 32.41, 231));
        dataHashSet.add(new Product("02234344", "shaving cream", 14.23, 443));
        dataHashSet.add(new Product("12341233", "green beer", 4.43, 29));
        dataHashSet.add(new Product("12100222", "black shoes", 67.41, 94));
        dataHashSet.add(new Product("12231222", "coffee", 10.23, 99));
        dataHashSet.add(new Product("10001222", "black combs", 1.43, 23));
        dataHashSet.add(new Product("14311222", "printer red ink", 43.43, 745));
        dataHashSet.add(new Product("02111222", "scissors", 24.55, 12));
        dataHashSet.add(new Product("02111222", "scissors", 24.55, 12));
        dataHashSet.add(new Product("13111222", "red tape", 4.03, 45));
        dataHashSet.add(new Product("14111222", "black pens", 2.43, 32));
        dataHashSet.add(new Product("15111222", "red pens", 1.43, 134));
        dataHashSet.add(new Product("16111222", "pencils", 0.43, 231));
        dataHashSet.add(new Product("17111222", "hard drives", 50.54, 222));
        dataHashSet.add(new Product("18111222", "sofas", 400.43, 3));
        dataHashSet.add(new Product("19111222", "chairs", 314.43, 32));
        dataHashSet.add(new Product("12001222", "mp3 players", 20.43, 67));
        dataHashSet.add(new Product("12111222", "white shoes", 44.53, 62));
        dataHashSet.add(new Product("12121222", "pen drives", 19.43, 33));
        dataHashSet.add(new Product("12131222", "tooth paste", 4.43, 54));
        dataHashSet.add(new Product("12141222", "dental floss", 4.53, 12));
        dataHashSet.add(new Product("12151222", "hair brushes", 36.43, 44));
        dataHashSet.add(new Product("12161222", "alarm clocks", 9.43, 56));
        dataHashSet.add(new Product("12171222", "watches", 87.43, 11));
        dataHashSet.add(new Product("12181222", "tires", 78.98, 78));
        dataHashSet.add(new Product("12191222", "car oil", 34.32, 21));
        dataHashSet.add(new Product("12111223", "cooking oil", 19.88, 225));
        dataHashSet.add(new Product("12111224", "note books", 6.55, 21));
        dataHashSet.add(new Product("12111225", "vitamin A", 18.99, 4));
        dataHashSet.add(new Product("12111222", "vitamin C", 21.87, 55));
        dataHashSet.add(new Product("12119222", "vitamin B", 17.83, 3));
        dataHashSet.add(new Product("12111222", "vitamin d", 12.32, 12));
        dataHashSet.add(new Product("12118222", "zinc", 10.56, 56));
        dataHashSet.add(new Product("12711222", "coke", 1.23, 11));
        dataHashSet.add(new Product("12111292", "pepsi", 1.23, 76));
        dataHashSet.add(new Product("12511222", "scotch", 60.43, 33));
        dataHashSet.add(new Product("12311222", "bourbon", 40.44, 10));
        dataHashSet.add(new Product("12191222", "rum", 32.43, 30));
        dataHashSet.add(new Product("12181222", "dark beer", 10.43, 67));
        dataHashSet.add(new Product("12171222", "light beer", 7.43, 2));
        dataHashSet.add(new Product("12161222", "hats", 21.44, 12));
        dataHashSet.add(new Product("12151222", "capes", 34.78, 78));
        dataHashSet.add(new Product("12131222", "umbrellas", 4.21, 22));

        // For Hah Map
        for (Product prod :  dataHashSet) {
            dataHashMap.put(prod.getSerialNumber(), prod);
            dataList.add(prod);
        }
    }


    /*Bean methods*/
    /*Getters and Setters*/
    public HashSet<Product> getDataHashSet() {
        return dataHashSet;
    }

    public void setDataHashSet(HashSet<Product> dataHashSet) {
        this.dataHashSet = dataHashSet;
    }

    public HashMap<String, Product> getDataHashMap() {
        return dataHashMap;
    }

    public void setDataHashMap(HashMap<String, Product> dataHashMap) {
        this.dataHashMap = dataHashMap;
    }

    public List<Product> getDataList() {
        return dataList;
    }

    public void setDataList(List<Product> dataList) {
        this.dataList = dataList;
    }


    public String getSerialNumberSortType() {
        if (serialNumberSortType.equals("asc")) {
            return "dsc";
        }
        else {
            return "asc";
        }
    }

    public void setSerialNumberSortType(String serialNumberSortType) {
        this.serialNumberSortType = serialNumberSortType;
    }

    public String getNameSortType() {
        if (nameSortType.equals("asc")) {
            return "dsc";
        }
        else {
            return "asc";
        }
    }

    public void setNameSortType(String nameSortType) {
        this.nameSortType = nameSortType;
    }

    public String getItemPriceSortType() {
        if ( itemPriceSortType.equals("asc")) {
            return "dsc";
        }
        else {
            return "asc";
        }
    }

    public void setItemPriceSortType(String itemPriceSortType) {
        this.itemPriceSortType = itemPriceSortType;
    }

    public String getStockSortType() {
        if (stockSortType.equals("asc")) {
            return "dsc";
        }
        else {
            return "asc";
        }
    }

    public void setStockSortType(String stockSortType) {
        this.stockSortType = stockSortType;
    }

    /*Utility methods*/
    public void deleteRowHashSet(Product product) {
        dataHashSet.remove(product);
    }

    public void deleteRowHashMap(Object obj) {
        dataHashMap.remove(String.valueOf(obj));
    }


    /*Sortrings*/
    public String sortDataBySerialNumber() {
        dataList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (serialNumberSortType.equals("asc")) {
                    return o1.getSerialNumber().compareTo(o2.getSerialNumber());
                } else {
                    return (-1) * o1.getSerialNumber().compareTo(o2.getSerialNumber());
                }
            }
        });

        serialNumberSortType = (serialNumberSortType.equals("asc")) ? "dsc" : "asc";
        return null;
    }

    public String sortDataByProductName() {
        dataList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (nameSortType.equals("asc")) {
                    return o1.getProductName().compareTo(o2.getProductName());
                } else {
                    return (-1) * o1.getProductName().compareTo(o2.getProductName());
                }
            }
        });

        nameSortType = (nameSortType.equals("asc")) ? "dsc" : "asc";
        return null;
    }

    public String sortDataByItemPrice() {
        dataList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (itemPriceSortType.equals("asc")) {
                    return (int) (o1.getItemPrice() - o2.getItemPrice());
                }
                else {
                    return (int) ((-1) * (o1.getItemPrice() - o2.getItemPrice()));
                }
            }
        });

        itemPriceSortType = (itemPriceSortType.equals("asc")) ? "dsc" : "asc";
        return null;
    }

    public String sortDataByStock() {
        dataList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (stockSortType.equals("asc")) {
                    return (int) (o1.getStock() - o2.getStock());
                }
                else {
                    return (int) ((-1) * (o1.getStock() - o2.getStock()));
                }
            }
        });

        stockSortType = (stockSortType.equals("asc")) ? "dsc" : "asc";
        return null;
    }
}
