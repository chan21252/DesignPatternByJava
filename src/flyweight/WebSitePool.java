package flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSitePool {
    private Map<String, WebSite> webSiteMap = new HashMap<String, WebSite>();

    public WebSite getWebSite(String type) {
        if (!webSiteMap.containsKey(type)) {
            webSiteMap.put(type, new FlyWeightWebSite(type));
        }

        return webSiteMap.get(type);
    }
}
