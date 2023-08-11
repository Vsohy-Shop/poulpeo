package com.rmn.api.p322v2.main.sqlite;

/* renamed from: com.rmn.api.v2.main.sqlite.RMNDatabaseIdentifier */
public class RMNDatabaseIdentifier {
    public final String name;
    public final int version;

    public RMNDatabaseIdentifier(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (i > 0) {
            this.name = str;
            this.version = i;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
