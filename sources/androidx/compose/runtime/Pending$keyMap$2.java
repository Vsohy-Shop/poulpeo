package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Composer.kt */
final class Pending$keyMap$2 extends C12777p implements C13074a<HashMap<Object, LinkedHashSet<KeyInfo>>> {
    final /* synthetic */ Pending this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Pending$keyMap$2(Pending pending) {
        super(0);
        this.this$0 = pending;
    }

    public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
        HashMap<Object, LinkedHashSet<KeyInfo>> access$multiMap = ComposerKt.multiMap();
        Pending pending = this.this$0;
        int size = pending.getKeyInfos().size();
        for (int i = 0; i < size; i++) {
            KeyInfo keyInfo = pending.getKeyInfos().get(i);
            boolean unused = ComposerKt.put(access$multiMap, ComposerKt.getJoinedKey(keyInfo), keyInfo);
        }
        return access$multiMap;
    }
}
