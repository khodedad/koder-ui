# Koder UI

Professional UI Components Library for Android — Supporting Jetpack Compose, Java & XML Views.

## 🚀 Features & Components
- **`KoderButton` / `KoderButtonView`**: Modern Material 3 rounded button (Compose & XML/Java View).
- **`KoderSlider` / `KoderSliderView`**: Ultra-modern track-only slider with dynamic 1.5x thickness and circular minimum state.
- **`KoderSwitch` / `KoderSwitchView`**: Clean, smooth-animated toggle switch.

---

## 📱 Java & XML Layout Support (Sketchware Pro / AIDE / Traditional Android)

You can use all components directly in **XML Layouts** and **Java Code**:

### XML Layout (`res/layout/activity_main.xml`):

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <koder.ui.KoderButtonView
        android:id="@+id/koderBtn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <koder.ui.KoderSliderView
        android:id="@+id/koderSlider"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <koder.ui.KoderSwitchView
        android:id="@+id/koderSwitch"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</LinearLayout>
```

### Java Code:

```java
import koder.ui.KoderButtonView;
import koder.ui.KoderSliderView;
import koder.ui.KoderSwitchView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        KoderButtonView btn = findViewById(R.id.koderBtn);
        btn.setKoderText("Submit");
        btn.setOnKoderClickListener(() -> {
            Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();
        });

        KoderSliderView slider = findViewById(R.id.koderSlider);
        slider.setSliderValue(0.5f);

        KoderSwitchView switchView = findViewById(R.id.koderSwitch);
        switchView.setCheckedState(true);
    }
}
```

---

## 📦 How to Resolve in Sketchware Pro / AIDE / Gradle

Set `packaging = "aar"` and use dependency format:

```
com.github.khodedad:koder-ui:1.0.1
```
*(Ensure release tag matches `1.0.1` without conflicting `v` prefix mismatch in JitPack)*.
