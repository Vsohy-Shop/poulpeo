package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import com.facebook.applinks.AppLinkData;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* compiled from: ViewModelProvider.kt */
public class ViewModelProvider {
    private final CreationExtras defaultCreationExtras;
    private final Factory factory;
    private final ViewModelStore store;

    /* compiled from: ViewModelProvider.kt */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
                C12775o.m28639i(viewModelInitializerArr, "initializers");
                return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
            }
        }

        static Factory from(ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        <T extends ViewModel> T create(Class<T> cls) {
            C12775o.m28639i(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C12775o.m28639i(cls, "modelClass");
            C12775o.m28639i(creationExtras, AppLinkData.ARGUMENTS_EXTRAS_KEY);
            return create(cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* compiled from: ViewModelProvider.kt */
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            C12775o.m28639i(viewModel, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory2) {
        this(viewModelStore, factory2, (CreationExtras) null, 4, (DefaultConstructorMarker) null);
        C12775o.m28639i(viewModelStore, "store");
        C12775o.m28639i(factory2, "factory");
    }

    @MainThread
    public <T extends ViewModel> T get(Class<T> cls) {
        C12775o.m28639i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* compiled from: ViewModelProvider.kt */
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final CreationExtras.Key<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        /* access modifiers changed from: private */
        public static AndroidViewModelFactory sInstance;
        private final Application application;

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            private static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
                C12775o.m28639i(viewModelStoreOwner, "owner");
                if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                    return ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
                }
                return NewInstanceFactory.Companion.getInstance();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory access$getSInstance$cp = AndroidViewModelFactory.sInstance;
                C12775o.m28636f(access$getSInstance$cp);
                return access$getSInstance$cp;
            }
        }

        private AndroidViewModelFactory(Application application2, int i) {
            this.application = application2;
        }

        public static final AndroidViewModelFactory getInstance(Application application2) {
            return Companion.getInstance(application2);
        }

        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C12775o.m28639i(cls, "modelClass");
            C12775o.m28639i(creationExtras, AppLinkData.ARGUMENTS_EXTRAS_KEY);
            if (this.application != null) {
                return create(cls);
            }
            Application application2 = (Application) creationExtras.get(APPLICATION_KEY);
            if (application2 != null) {
                return create(cls, application2);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public AndroidViewModelFactory() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application2) {
            this(application2, 0);
            C12775o.m28639i(application2, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            C12775o.m28639i(cls, "modelClass");
            Application application2 = this.application;
            if (application2 != null) {
                return create(cls, application2);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application2) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                T t = (ViewModel) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application2});
                C12775o.m28638h(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory2, CreationExtras creationExtras) {
        C12775o.m28639i(viewModelStore, "store");
        C12775o.m28639i(factory2, "factory");
        C12775o.m28639i(creationExtras, "defaultCreationExtras");
        this.store = viewModelStore;
        this.factory = factory2;
        this.defaultCreationExtras = creationExtras;
    }

    @MainThread
    public <T extends ViewModel> T get(String str, Class<T> cls) {
        T t;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(cls, "modelClass");
        T t2 = this.store.get(str);
        if (cls.isInstance(t2)) {
            Factory factory2 = this.factory;
            OnRequeryFactory onRequeryFactory = factory2 instanceof OnRequeryFactory ? (OnRequeryFactory) factory2 : null;
            if (onRequeryFactory != null) {
                C12775o.m28636f(t2);
                onRequeryFactory.onRequery(t2);
            }
            C12775o.m28637g(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(NewInstanceFactory.VIEW_MODEL_KEY, str);
        try {
            t = this.factory.create(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = this.factory.create(cls);
        }
        this.store.put(str, t);
        return t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory2, CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory2, (i & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner), ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C12775o.m28639i(viewModelStoreOwner, "owner");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory2) {
        this(viewModelStoreOwner.getViewModelStore(), factory2, ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C12775o.m28639i(viewModelStoreOwner, "owner");
        C12775o.m28639i(factory2, "factory");
    }

    /* compiled from: ViewModelProvider.kt */
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;
        /* access modifiers changed from: private */
        public static NewInstanceFactory sInstance;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            C12775o.m28639i(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C12775o.m28638h(newInstance, "{\n                modelC…wInstance()\n            }");
                return (ViewModel) newInstance;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            private static final class ViewModelKeyImpl implements CreationExtras.Key<String> {
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory access$getSInstance$cp = NewInstanceFactory.sInstance;
                C12775o.m28636f(access$getSInstance$cp);
                return access$getSInstance$cp;
            }

            public static /* synthetic */ void getInstance$annotations() {
            }
        }
    }
}
