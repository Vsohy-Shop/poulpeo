package com.rmn.api.p322v2.main.json;

/* renamed from: com.rmn.api.v2.main.json.IJsonCacheSerialisable */
public interface IJsonCacheSerialisable {
    boolean isModelValidAfterParsing();

    String serializeToCacheData();

    void unserializeFromCacheData(String str);
}
