package cnelson0641.cbfd;


public class Payment
{

    public Payment()
    {
    }

    // Stubbed out.  Ideally use square api
    public boolean makePayment(String bank_info, String card_info, Integer cost)
    {
        //TODO add error checking and update callers
        System.out.println(
            "Processing payment cost of $" + cost + " on card " + card_info);
        return true;
    }
}
