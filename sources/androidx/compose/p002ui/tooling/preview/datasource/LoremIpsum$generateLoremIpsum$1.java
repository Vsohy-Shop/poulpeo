package androidx.compose.p002ui.tooling.preview.datasource;

import java.util.List;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1 */
/* compiled from: LoremIpsum.kt */
final class LoremIpsum$generateLoremIpsum$1 extends C12777p implements C13074a<String> {
    final /* synthetic */ int $loremIpsumMaxSize;
    final /* synthetic */ C12760f0 $wordsUsed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoremIpsum$generateLoremIpsum$1(C12760f0 f0Var, int i) {
        super(0);
        this.$wordsUsed = f0Var;
        this.$loremIpsumMaxSize = i;
    }

    public final String invoke() {
        List access$getLOREM_IPSUM_SOURCE$p = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        C12760f0 f0Var = this.$wordsUsed;
        int i = f0Var.f20416b;
        f0Var.f20416b = i + 1;
        return (String) access$getLOREM_IPSUM_SOURCE$p.get(i % this.$loremIpsumMaxSize);
    }
}
