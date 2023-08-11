package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

public class AdjustThirdPartySharing {
    Map<String, Map<String, String>> granularOptions = new HashMap();
    Boolean isEnabled;

    public AdjustThirdPartySharing(Boolean bool) {
        this.isEnabled = bool;
    }

    public void addGranularOption(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            AdjustFactory.getLogger().error("Cannot add granular option with any null value", new Object[0]);
            return;
        }
        Map map = this.granularOptions.get(str);
        if (map == null) {
            map = new HashMap();
            this.granularOptions.put(str, map);
        }
        map.put(str2, str3);
    }
}
