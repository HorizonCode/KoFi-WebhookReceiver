package net.horizoncode.kofireceiver.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@ToString
@Getter
public class KoFiData {
  @SerializedName("message_id")
  private String messageId;

  private Date timestamp;

  private KoFiType type;

  @SerializedName("is_public")
  private boolean isPublic;

  @SerializedName("from_name")
  private String fromName;

  private String message;

  private float amount;

  private String url;

  private String email;

  private String currency;

  @SerializedName("is_subscription_payment")
  private boolean isSubscriptionPayment;

  @SerializedName("is_first_subscription_payment")
  private boolean isFirstSubscriptionPayment;

  @SerializedName("kofi_transaction_id")
  private String kofiTransactionId;

  @SerializedName("verification_token")
  private String verificationToken;

  /*
  FIXME: fix deserialization
  @SerializedName("shop_items")
  private Map<String, String> shopItems;*/

  @SerializedName("tierName")
  private String tierName;
}
