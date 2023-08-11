package p091fa;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionText;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p400ob.C13054j;
import p404of.C13088o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: fa.b */
/* compiled from: TextSectionViewHolder.kt */
public final class C7615b extends C14080a {

    /* renamed from: h */
    public static final int f10589h = ComposeView.$stable;

    /* renamed from: g */
    private final ComposeView f10590g;

    /* renamed from: fa.b$a */
    /* compiled from: TextSectionViewHolder.kt */
    static final class C7616a extends C12777p implements C13088o<Composer, Integer, C11921v> {

        /* renamed from: g */
        final /* synthetic */ PageSectionText f10591g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7616a(PageSectionText pageSectionText) {
            super(2);
            this.f10591g = pageSectionText;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C11921v.f18618a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1050559754, i, -1, "com.poulpeo.ui.cms.section.title.TextSectionViewHolder.updateItemView.<anonymous> (TextSectionViewHolder.kt:16)");
                }
                Modifier r5 = PaddingKt.m33269paddingVpY3zN4(Modifier.Companion, C1232Dp.m38468constructorimpl((float) 16), C1232Dp.m38468constructorimpl((float) 8));
                String content = this.f10591g.getContent();
                if (content == null) {
                    content = "";
                }
                C13054j.m29448a(r5, content, composer, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7615b(ComposeView composeView, C13867a.C13868a aVar) {
        super(composeView, aVar);
        C12775o.m28639i(composeView, "composeView");
        C12775o.m28639i(aVar, "listener");
        this.f10590g = composeView;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        PageSectionText pageSectionText;
        if (obj instanceof PageSectionText) {
            pageSectionText = (PageSectionText) obj;
        } else {
            pageSectionText = null;
        }
        if (pageSectionText != null) {
            this.f10590g.setContent(ComposableLambdaKt.composableLambdaInstance(-1050559754, true, new C7616a(pageSectionText)));
        }
    }
}
