package com.example.openwikipage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun openWikiPage(view:View){
        val url:String?="https://en.wikipedia.org/wiki/${editText.text}"
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse(url)
        startActivity(intent)
    }
    fun seeGoogleResult(view:View){
        val url:String?="https://www.google.com/search?sxsrf=ALeKk03CyDa9u2XVP_zx2R66USvSFV7IeQ%3A1582370700599&source=hp&ei=jA9RXrTKIvSf4-EP-d2GwAU&q=${editText.text}&oq=${editText.text}&gs_l=psy-ab.3...1390.2058..2245...1.0..0.0.0.......0....1..gws-wiz.Z5gjnG7jAiw&ved=0ahUKEwi0wIqchuXnAhX0zzgGHfmuAVgQ4dUDCAY&uact=5"
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse(url)
        startActivity(intent)
    }
    fun seeYoutubeResult(view:View){
        val url:String?="https://www.youtube.com/results?search_query=${editText.text}"
        val intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse(url)
        startActivity(intent)
    }
    fun closeApp(view: View){
        exitProcess(0)
    }
}
