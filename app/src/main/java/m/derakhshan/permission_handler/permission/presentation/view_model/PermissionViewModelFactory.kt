package m.derakhshan.permission_handler.permission.presentation.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import m.derakhshan.permission_handler.permission.domain.model.PermissionModel

class PermissionViewModelFactory(
    private val permissions: List<PermissionModel>,
    private val askPermission: Boolean
) :
    ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PermissionViewModel(permissions = permissions, askPermission = askPermission) as T
    }
}
