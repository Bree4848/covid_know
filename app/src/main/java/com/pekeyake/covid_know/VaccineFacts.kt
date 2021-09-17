package com.pekeyake.covid_know

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.view.View
import java.io.File
import java.io.FileOutputStream
import java.lang.Exception


class VaccineFacts : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine_facts)
        val shareimage: ImageView = findViewById(R.id.shareImage)
        val shareButton: Button = findViewById(R.id.share)

        val myDrawable = shareimage.drawable
        val bitmap = (myDrawable as BitmapDrawable).bitmap

        shareButton.setOnClickListener{
            try {
                val file = File(externalCacheDir, "devofandroid.png")
                val fOut = FileOutputStream(file)
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fOut)
                fOut.flush()
                fOut.close()
                file.setReadable(true, false)
                val intent = Intent(android.content.Intent.ACTION_SEND)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file))
                intent.type = "image/png"
                startActivity(Intent.createChooser(intent, "Share image via"))
            }
            catch (e: Exception)
            {
                e.printStackTrace()

            }
        }
    }
}