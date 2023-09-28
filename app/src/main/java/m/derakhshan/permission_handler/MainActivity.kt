package m.derakhshan.permission_handler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import m.derakhshan.permission_handler.permission.domain.model.PermissionModel
import m.derakhshan.permission_handler.permission.presentation.composable.PermissionHandler
import m.derakhshan.permission_handler.ui.theme.PermissionHandlerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PermissionHandlerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
            }
        }
    }
}
