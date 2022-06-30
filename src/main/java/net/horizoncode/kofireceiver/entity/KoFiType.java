package net.horizoncode.kofireceiver.entity;

import com.google.gson.annotations.SerializedName;

public enum KoFiType {
  @SerializedName("Donation")
  DONATION,
  @SerializedName("Subscription")
  SUBSCRIPTION,
  @SerializedName("Shop Order")
  SHOP_ORDER
}
