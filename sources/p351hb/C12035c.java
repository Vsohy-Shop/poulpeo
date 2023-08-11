package p351hb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: hb.c */
/* compiled from: RatingDeactivatedStatus */
enum C12035c {
    DEFINITELY("definitely"),
    UNTIL_APP_UPDATE("until-app-update"),
    UNTIL_NEW_EARNINGS("until-new-earnings");
    
    @NonNull

    /* renamed from: b */
    public final String f18825b;

    private C12035c(@NonNull String str) {
        this.f18825b = str;
    }

    @Nullable
    /* renamed from: a */
    public static C12035c m26165a(@Nullable String str) {
        for (C12035c cVar : values()) {
            if (cVar.f18825b.equals(str)) {
                return cVar;
            }
        }
        return null;
    }
}
