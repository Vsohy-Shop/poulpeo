package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.p1 */
final /* synthetic */ class C6754p1 implements FilenameFilter {

    /* renamed from: a */
    private final String f8780a;

    C6754p1(String str) {
        this.f8780a = str;
    }

    public final boolean accept(File file, String str) {
        if (!str.startsWith(String.valueOf(this.f8780a).concat("-")) || !str.endsWith(".apk")) {
            return false;
        }
        return true;
    }
}
