# KODER UI Library

یک کتابخانه مدرن و حرفه‌ای Jetpack Compose برای اندروید با پشتیبانی از Java و XML.

## 🚀 راهنمای انتشار در گیت‌هاب (JitPack)

برای اینکه بتوانید این کتابخانه را مستقیم از گیت‌هاب در IDE (مانند Android Studio) دانلود و استفاده کنید، آسان‌ترین روش استفاده از **JitPack** است:

### گام ۱: آپلود کدها در گیت‌هاب
کدهای جدید پروژه را در ریپوزیتوری گیت‌هاب خود push کنید:
```bash
git add .
git commit -m "Release v1.0.0 of KODER UI"
git push origin main
```

### گام ۲: ساخت یک Release یا Tag در گیت‌هاب
1. وارد صفحه ریپوزیتوری خود در GitHub (`khodedad/koder-ui`) شوید.
2. از سمت راست روی **Releases** کلیک کنید و **Create a new release** را بزنید.
3. یک تگ به اسم `v1.0.0` بسازید و دکمه **Publish release** را بزنید.

---

## 📦 نحوه استفاده در پروژه‌های دیگر (IDE)

### ۱. اضافه کردن ریپوزیتوری JitPack

در پروژه مقصد، فایل `settings.gradle.kts` را باز کرده و `https://jitpack.io` را اضافه کنید:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### ۲. اضافه کردن وابستگی کتابخانه

در فایل `build.gradle.kts` ماژول app پروژه خود:

```kotlin
dependencies {
    implementation("com.github.khodedad:koder-ui:v1.0.0")
}
```

---

## 🎨 نحوه استفاده از کامپوننت‌ها

### در Jetpack Compose (Kotlin):
```kotlin
// دکمه مدرن
KoderButton(
    text = "شروع",
    onClick = { /* عمل مورد نظر */ }
)

// اسلایدر فوق مدرن با انحنای داینامیک
var sliderVal by remember { mutableFloatStateOf(0.5f) }
KoderSlider(
    value = sliderVal,
    onValueChange = { sliderVal = it }
)

// سویچ بار مدرن
var switchState by remember { mutableStateOf(true) }
KoderSwitch(
    checked = switchState,
    onCheckedChange = { switchState = it }
)
```

### در XML / Java (پروژه‌های کلاسیک):
```xml
<koder.ui.KoderButtonView
    android:id="@+id/koderBtn"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```
