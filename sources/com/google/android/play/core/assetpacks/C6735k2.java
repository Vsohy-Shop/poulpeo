package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p037b6.C2893a0;

/* renamed from: com.google.android.play.core.assetpacks.k2 */
final class C6735k2 {

    /* renamed from: a */
    private static final Pattern f8697a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    static List<File> m11447a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C6731j2.f8691a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C6761r0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C6751o2 b = new C6725i0(fileInputStream).mo39298b();
                    if (b.mo39340d() != null) {
                        File file5 = new File(file, b.mo39340d());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new C6761r0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new C6761r0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    C2893a0.m2299a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
