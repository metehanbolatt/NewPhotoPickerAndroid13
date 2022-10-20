package com.metehanbolat.newphotopickerandroid13

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.newphotopickerandroid13.ui.theme.NewPhotoPickerAndroid13Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewPhotoPickerAndroid13Theme {
                MainScreen()
            }
        }
    }
}
