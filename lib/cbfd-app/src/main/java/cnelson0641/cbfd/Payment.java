package cnelson0641.cbfd;


public class Payment
{

    public Payment()
    {
    }

    public boolean makePayment(String bank_info, String card_info, Integer cost)
    {
        System.out.println(
            "Processing payment cost of $" + cost + " on card " + card_info);
        // Stubbed out.  Ideally use square api
        return true;
    }
}
