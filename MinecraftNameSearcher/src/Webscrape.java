import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class Webscrape {
    public static final String baseurl = "https://api.mojang.com/users/profiles/minecraft/";

    public boolean isUsernameTaken(String username) throws IOException {
        if(username.length() < 3 || username.length() > 16){
            return true;
        }
        Document pod = Jsoup.connect(baseurl + username).ignoreContentType(true).get();
        if(pod.body().toString().equals("<body></body>")){
            return false;
        }else{
            return true;
        }
    }
}
