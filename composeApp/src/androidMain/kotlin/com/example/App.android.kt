package com.example

import android.os.Bundle
import android.os.LocaleList
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.stringResource
import resourcesappkmp.composeapp.generated.resources.Res
import resourcesappkmp.composeapp.generated.resources.app_name
import java.util.Locale

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { App() }
    }
}

@Preview
@Composable
fun AppPreview() { App() }

@Composable
actual fun InfoPanel() {
    Text("appLocales = ${AppCompatDelegate.getApplicationLocales()}")
    Text("Locale.getDefault().language = ${Locale.getDefault().language}")
    Text("LocaleList.getDefault() = ${LocaleList.getDefault()}")
    Text(stringResource(Res.string.app_name))
}