package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.p002ui.input.key.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1 */
/* compiled from: Clickable.kt */
final class C0362x6b176470 extends C12777p implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13995l0 $indicationScope;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Offset> $keyClickOffset;
    final /* synthetic */ C13074a<C11921v> $onClick;

    @C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", mo50610f = "Clickable.kt", mo50611l = {540}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1 */
    /* compiled from: Clickable.kt */
    static final class C03631 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C03631(mutableInteractionSource, press, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
                PressInteraction.Press press = press;
                this.label = 1;
                if (mutableInteractionSource.emit(press, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C03631) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0362x6b176470(boolean z, Map<Key, PressInteraction.Press> map, State<Offset> state, C13995l0 l0Var, C13074a<C11921v> aVar, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z;
        this.$currentKeyPressInteractions = map;
        this.$keyClickOffset = state;
        this.$indicationScope = l0Var;
        this.$onClick = aVar;
        this.$interactionSource = mutableInteractionSource;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32995invokeZmokQxo(((KeyEvent) obj).m37015unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m32995invokeZmokQxo(android.view.KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "keyEvent");
        boolean z = true;
        if (!this.$enabled || !Clickable_androidKt.m32998isPressZmokQxo(keyEvent)) {
            if (this.$enabled && Clickable_androidKt.m32996isClickZmokQxo(keyEvent)) {
                PressInteraction.Press remove = this.$currentKeyPressInteractions.remove(Key.m36428boximpl(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent)));
                if (remove != null) {
                    C14054y1 unused = C13985j.m32422d(this.$indicationScope, (C12079g) null, (C14004n0) null, new C0364x8f00ca0b(this.$interactionSource, remove, (C12074d<? super C0364x8f00ca0b>) null), 3, (Object) null);
                }
                this.$onClick.invoke();
                return Boolean.valueOf(z);
            }
        } else if (!this.$currentKeyPressInteractions.containsKey(Key.m36428boximpl(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent)))) {
            final PressInteraction.Press press = new PressInteraction.Press(this.$keyClickOffset.getValue().m35432unboximpl(), (DefaultConstructorMarker) null);
            this.$currentKeyPressInteractions.put(Key.m36428boximpl(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent)), press);
            C13995l0 l0Var = this.$indicationScope;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            C14054y1 unused2 = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C03631((C12074d<? super C03631>) null), 3, (Object) null);
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
