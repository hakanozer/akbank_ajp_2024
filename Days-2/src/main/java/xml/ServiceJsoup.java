package xml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ServiceJsoup {

    public List<Currency> result() {
        List<Currency> ls = new ArrayList<>();
        try {
            String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = doc.getElementsByTag("Currency");
            for (Element item : elements) {
                String currencyName = item.getElementsByTag("CurrencyName").text();
                String forexBuying = item.getElementsByTag("ForexBuying").text();
                String forexSelling = item.getElementsByTag("ForexSelling").text();
                Currency c = new Currency();
                c.setCurrencyName(currencyName);
                c.setForexBuying(forexBuying);
                c.setForexSelling(forexSelling);
                ls.add(c);
            }
        }catch (Exception ex) {
            System.err.println("result error : " + ex);
        }
        return ls;
     }

    public static void main(String[] args) {
        ServiceJsoup serviceJsoup = new ServiceJsoup();
        List<Currency> ls = serviceJsoup.result();
        for (Currency item : ls) {
            System.out.println(item);
        }
        String dolar = ls.get(0).getForexSelling();
        System.out.println("dolar: " + dolar);
    }

}
