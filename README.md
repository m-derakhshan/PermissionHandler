
# Jetpack Compose Permission Handler

This project implements an easy-to-use and ready-to-go permission handler for Android apps built with Jetpack Compose. It simplifies the process of requesting and managing permissions, making it hassle-free to integrate into your app.

## Features

- Request multiple permissions with a single function call.
- Handles permission requests, user responses, and rationale display.
- Opens app settings if the user denies permissions repeatedly.

## Usage

To use the Jetpack Compose Permission Handler, follow these steps:

1. Add the necessary dependencies to your project.

2. Import the `PermissionHandler` Composable function into your Jetpack Compose UI.

3. Use it to request permissions for your desired features.

Here's a basic example:

```kotlin
@Composable
fun MyComposable() {
  PermissionHandler(
           permissions = listOf(
               PermissionModel(
                   permission = "android.permission.READ_MEDIA_IMAGES",
                   maxSDKVersion = Int.MAX_VALUE,
                   minSDKVersion = 33,
                   rational = "Access to images is required"
               ),
               PermissionModel(
                   permission = "android.permission.READ_MEDIA_VIDEO",
                   maxSDKVersion = Int.MAX_VALUE,
                   minSDKVersion = 33,
                   rational = "Access to videos is required"
               ),
               PermissionModel(
                   permission = "android.permission.READ_MEDIA_AUDIO",
                   maxSDKVersion = Int.MAX_VALUE,
                   minSDKVersion = 33,
                   rational = "Access to audios is required"
               )
           ),
           askPermission = true
       )
}
```

## License

This project is open-source and available under the MIT License. You are free to use and modify it as needed. See the [LICENSE](LICENSE) file for details.

## Questions and Contributions

If you have questions or would like to contribute to this project, feel free to reach out. Your feedback and contributions are welcome.

Happy coding!
