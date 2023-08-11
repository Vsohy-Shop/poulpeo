package androidx.compose.p002ui.platform;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.UiApplier;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/Wrapper_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* renamed from: androidx.compose.ui.platform.Wrapper_androidKt */
/* compiled from: Wrapper.android.kt */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    private static final String TAG = "Wrapper";

    @MainThread
    public static final Composition createSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        C12775o.m28639i(layoutNode, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(compositionContext, "parent");
        return CompositionKt.Composition(new UiApplier(layoutNode), compositionContext);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        WrappedComposition wrappedComposition;
        if (inspectionWanted(androidComposeView)) {
            androidComposeView.setTag(C0954R.C0956id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            enableDebugInspectorInfo();
        }
        Composition Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext);
        View view = androidComposeView.getView();
        int i = C0954R.C0956id.wrapped_composition_tag;
        Object tag = view.getTag(i);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, Composition);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.setContent(oVar);
        return wrappedComposition;
    }

    private static final void enableDebugInspectorInfo() {
        if (!InspectableValueKt.isDebugInspectorInfoEnabled()) {
            try {
                Field declaredField = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean((Object) null, true);
            } catch (Exception unused) {
                Log.w(TAG, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
    }

    private static final boolean inspectionWanted(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT < 29 || !(!WrapperVerificationHelperMethods.INSTANCE.attributeSourceResourceMap(androidComposeView).isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.Composition setContent(androidx.compose.p002ui.platform.AbstractComposeView r3, androidx.compose.runtime.CompositionContext r4, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.p002ui.platform.GlobalSnapshotManager.INSTANCE
            r0.ensureStarted()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.p002ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x002b
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p002ui.platform.AndroidComposeView) r1
            goto L_0x002b
        L_0x0028:
            r3.removeAllViews()
        L_0x002b:
            if (r1 != 0) goto L_0x0044
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C12775o.m28638h(r0, r2)
            r1.<init>(r0)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = DefaultLayoutParams
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0044:
            androidx.compose.runtime.Composition r3 = doSetContent(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.Wrapper_androidKt.setContent(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.CompositionContext, of.o):androidx.compose.runtime.Composition");
    }
}
