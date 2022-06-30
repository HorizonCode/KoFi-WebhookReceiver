package net.horizoncode.kofireceiver;

import com.google.gson.*;
import net.horizoncode.kofireceiver.entity.KoFiData;

public class KoFiWebhookReveiver {

  private static final Gson gson = new GsonBuilder().create();

  public static KoFiData readFromWebhook(String requestString) {
    JsonElement data = JsonParser.parseString(requestString);
    if (data.isJsonObject()) {
      JsonObject dataObject = data.getAsJsonObject();
      return gson.fromJson(dataObject.get("data").getAsJsonObject(), KoFiData.class);
    }
    return null;
  }
}
