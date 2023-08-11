package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.autofill.Autofill;
import androidx.compose.p002ui.autofill.AutofillTree;
import androidx.compose.p002ui.focus.FocusManager;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.input.InputModeManager;
import androidx.compose.p002ui.input.pointer.PointerIconService;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt */
/* compiled from: CompositionLocals.kt */
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
    private static final ProvidableCompositionLocal<PlatformTextInputPluginRegistry> LocalPlatformTextInputPluginRegistry = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPlatformTextInputPluginRegistry$1.INSTANCE);
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);

    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void ProvideCommonCompositionLocals(Owner owner, UriHandler uriHandler, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C12775o.m28639i(owner, "owner");
        C12775o.m28639i(uriHandler, "uriHandler");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) owner)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed((Object) uriHandler)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:188)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalPlatformTextInputPluginRegistry.provides(owner.getPlatformTextInputPluginRegistry()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, oVar, startRestartGroup, ((i2 >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, oVar, i));
        }
    }

    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    @ExperimentalTextApi
    public static final ProvidableCompositionLocal<PlatformTextInputPluginRegistry> getLocalPlatformTextInputPluginRegistry() {
        return LocalPlatformTextInputPluginRegistry;
    }

    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getLocalPlatformTextInputPluginRegistry$annotations() {
    }
}
