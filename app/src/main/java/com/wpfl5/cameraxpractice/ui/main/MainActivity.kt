package com.wpfl5.cameraxpractice.ui.main

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.wpfl5.cameraxpractice.R
import com.wpfl5.cameraxpractice.ext.toast
import com.wpfl5.cameraxpractice.ui.preview.PreviewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_preview.setOnClickListener { requestPermission() }

    }



    private fun requestPermission(){
        registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
            if(isGranted) {
                startActivity(Intent(this, PreviewActivity::class.java))
            }
            else{
                toast("퍼미션 거부됨")
            }
        }.launch(Manifest.permission.CAMERA)
    }



}