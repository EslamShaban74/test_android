package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_camera.*
import kotlinx.android.synthetic.main.activity_camera.view.*

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        recordBtn.setOnClickListener{
            val  intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivityForResult(intent,100)
        }

        videoView.setOnCompletionListener {
            videoView.visibility= View.GONE
            recordBtn.visibility = View.VISIBLE
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode==Activity.RESULT_OK &&data != null){
            videoView.setVideoURI(data.data)
            recordBtn.visibility= View.GONE
            videoView.visibility = View.VISIBLE
            videoView.start()
        }else{
            Toast.makeText(this,"$data",Toast.LENGTH_LONG).show()
        }
    }
}