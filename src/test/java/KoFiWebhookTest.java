import net.horizoncode.kofireceiver.KoFiWebhookReveiver;
import net.horizoncode.kofireceiver.entity.KoFiData;
import org.junit.Test;

public class KoFiWebhookTest {

  @Test
  public void subscriptionTest() {
    String data =
        "{\"data\": {\n"
            + "\"message_id\":\"3a1fac0c-f960-4506-a60e-824979a74e74\",\n"
            + "\"timestamp\":\"2022-08-21T13:04:30Z\",\n"
            + "\"type\":\"Subscription\",\n"
            + "\"is_public\":true,\n"
            + "\"from_name\":\"Ko-fi Team\",\n"
            + "\"message\":\"\",\n"
            + "\"amount\":\"1000.00\",\n"
            + "\"url\":\"https://ko-fi.com/Home/CoffeeShop?txid=0a1fac0c-f960-4506-a60e-824979a74e71\",\n"
            + "\"email\":\"someone@example.com\",\n"
            + "\"currency\":\"JPY\",\n"
            + "\"is_subscription_payment\":true,\n"
            + "\"is_first_subscription_payment\":false,\n"
            + "\"kofi_transaction_id\":\"0a1fac0c-f960-4506-a60e-824979a74e71\",\n"
            + "\"verification_token\":\"8633b237-d11b-4863-96ff-826f1df83025\",\n"
            + "\"shop_items\":null,\n"
            + "\"tier_name\":\"Gold\"}"
            + "}";
    KoFiData KoFiData = KoFiWebhookReveiver.readFromWebhook(data);

    System.out.println(KoFiData);
  }

  @Test
  public void shopItemsTest() {
    // FIXME: Fix this
    String data =
        "{\"data\": {\n"
            + "\"message_id\":\"3a1fac0c-f960-4506-a60e-824979a74e74\",\n"
            + "\"timestamp\":\"2022-08-21T13:04:30Z\",\n"
            + "\"type\":\"Shop Order\",\n"
            + "\"is_public\":true,\n"
            + "\"from_name\":\"Ko-fi Team\",\n"
            + "\"message\":\"\",\n"
            + "\"amount\":\"27.95\",\n"
            + "\"url\":\"https://ko-fi.com/Home/CoffeeShop?txid=0a1fac0c-f960-4506-a60e-824979a74e71\",\n"
            + "\"email\":\"someone@example.com\",\n"
            + "\"currency\":\"EUR\",\n"
            + "\"is_subscription_payment\":false,\n"
            + "\"is_first_subscription_payment\":false,\n"
            + "\"kofi_transaction_id\":\"0a1fac0c-f960-4506-a60e-824979a74e71\",\n"
            + "\"verification_token\":\"8633b237-d11b-4863-96ff-826f1df83025\",\n"
            + "\"shop_items\":[\n"
            + "  {\"direct_link_code\":\"1a2b3c4d5e\"},\n"
            + "  {\"direct_link_code\":\"a1b2c3d4e5\"}\n"
            + "],\n"
            + "\"tier_name\":null}"
            + "}";
    KoFiData KoFiData = KoFiWebhookReveiver.readFromWebhook(data);
    System.out.println(KoFiData);
  }
}
