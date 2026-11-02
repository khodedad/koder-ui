# Koder UI

Professional Jetpack Compose UI Components Library for KODER Browser & Modern Android Applications.

## 🚀 Features & Components
- **`KoderButton`**: Modern, highly customizable Material 3 rounded button.
- **`KoderSlider`**: Ultra-modern track-only slider with dynamic 1.5x thickness and circular minimum state.
- **`KoderSwitch`**: Clean, smooth-animated toggle switch.

---

## 📦 How to Publish on JitPack (Private Repository)

1. **Push your code to GitHub**:
   Ensure all changes are pushed to your private GitHub repository (e.g. `khodedad/koder-ui`).

2. **Create a Tag / Release**:
   Create a new release or git tag on GitHub, for example: `v1.0.0`.

3. **Get a JitPack Auth Token**:
   - Log in to [JitPack.io](https://jitpack.io).
   - Go to **Account** -> **Tokens** and copy your Personal Access Token.

---

## 🔧 How to Use in Another Project

### 1. Configure Repositories (`settings.gradle.kts`)

Add the JitPack repository with your authentication token:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = java.net.URI("https://jitpack.io")
            credentials {
                username = "jp_your_jitpack_token_here" // Your JitPack token
            }
        }
    }
}
```

Or using `authToken` in `authToken` parameter:

```kotlin
maven {
    url = java.net.URI("https://jitpack.io")
    credentials {
        username = "YOUR_JITPACK_TOKEN"
    }
}
```

### 2. Add Dependency (`build.gradle.kts`)

In your app or module level `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.khodedad:koder-ui:v1.0.0")
}
```

### 3. Usage in Code

```kotlin
import koder.ui.KoderButton
import koder.ui.KoderSlider
import koder.ui.KoderSwitch

@Composable
fun DemoScreen() {
    var sliderValue by remember { mutableFloatStateOf(0f) }
    var switchValue by remember { mutableStateOf(true) }

    Column {
        KoderButton(
            text = "Click Me",
            onClick = { /* Action */ }
        )

        KoderSlider(
            value = sliderValue,
            onValueChange = { sliderValue = it }
        )

        KoderSwitch(
            checked = switchValue,
            onCheckedChange = { switchValue = it }
        )
    }
}
```
