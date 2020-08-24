package kr.co.jeonji0628.jeonjiPjt.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final String name;
    private final String address;
    private final Long id;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Restaurant(Long id,String name, String address ) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getInfomation() {

        return name+" in "+ address;
    }

    public List<MenuItem> getMenuItmes(){
        return menuItems;
    }

    public String getAddress() {
        return address;
    }

    public Long getId(){
        return id;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for( MenuItem menuItem : menuItems ){
            addMenuItem(menuItem);
        }
    }
}
