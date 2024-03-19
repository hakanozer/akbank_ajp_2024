package json;

import com.google.gson.Gson;
import org.jsoup.Jsoup;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class ServiceJson {

    public void result() {
        try {
            String url = "https://dummyjson.com/products";
            String stData = Jsoup.connect(url).timeout(15000).sslSocketFactory(socketFactory()).ignoreContentType(true).get().body().text();
            Gson gson = new Gson();
            Products products = gson.fromJson(stData, Products.class);
            for ( Product item : products.getProducts() ) {
                System.out.println(item.getTitle());
            }
        }catch (Exception ex) {
            System.err.println("result error: " + ex);
        }
    }

    static private SSLSocketFactory socketFactory() {
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        try {
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            SSLSocketFactory result = sslContext.getSocketFactory();

            return result;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create a SSL socket factory", e);
        }
    }

    public static void main(String[] args) {
        ServiceJson json = new ServiceJson();
        json.result();
    }

}
