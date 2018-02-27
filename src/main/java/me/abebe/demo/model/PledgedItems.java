package me.abebe.demo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "pledged_items")
public class PledgedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name ="item_name")
    private String itemName;

    @Column(name ="item_detail")
    private String itemDetail;

    @Column(name = "item_type")
    private String itemType;

    @ManyToMany(mappedBy = "plegeditems",fetch = FetchType.LAZY)
    private Collection<Potluckers> potluckers;

    public PledgedItems() {
    }

    public PledgedItems(String itemName, String itemDetail, String itemType, Collection<Potluckers> potluckers) {
        this.itemName = itemName;
        this.itemDetail = itemDetail;
        this.itemType = itemType;
        this.potluckers = potluckers;
    }


    @Override
    public String toString() {
        return "PledgedItems{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemDetail='" + itemDetail + '\'' +
                ", itemType='" + itemType + '\'' +
                ", potluckers=" + potluckers +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Collection<Potluckers> getPotluckers() {
        return potluckers;
    }

    public void setPotluckers(Collection<Potluckers> potluckers) {
        this.potluckers = potluckers;
    }
}
