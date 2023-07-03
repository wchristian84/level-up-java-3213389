package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
  String name;
  double retailPrice;
  double discount;

  public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {
    if (items.size() == 0) {
      return Optional.empty();
    }
    else {
      StoreItem returnItem;
      ArrayList<StoreItem> itemList = new ArrayList<StoreItem>();
      ArrayList<Double> prices = new ArrayList<Double>();

      items.stream().forEach(item -> {
        itemList.add(item);
        prices.add(item.retailPrice * (1.0 - item.discount));
      });

      int min = 0;
      for (int i = 1; i < prices.size(); i++) {
        if (prices.get(i) < prices.get(min)) {
          min = i;
        }
      }
      returnItem = itemList.get(min);
      

      return Optional.of(returnItem);
    }
  }

  @Override
  public String toString() {
    return "Name: " + name + ", " + "Retail price: " + retailPrice + ", " + "Discount " + discount;
  }
}
